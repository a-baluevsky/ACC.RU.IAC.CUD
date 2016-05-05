package ru.spb.iac.cud.core;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javaw.lang.Strings;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.spb.iac.cud.core.util.CUDConstants;
import ru.spb.iac.cud.exceptions.GeneralFailure;
import ru.spb.iac.cud.items.Function;
import ru.spb.iac.cud.items.Group;
import ru.spb.iac.cud.items.Resource;
import ru.spb.iac.cud.items.Role;

/**
 * EJB для задач синхронизации и списков по системаи
 * 
 * @author bubnov
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
@TransactionManagement(TransactionManagementType.BEAN)
 public class SyncManager implements SyncManagerLocal, SyncManagerRemote {

	@PersistenceContext(unitName = "AuthServices")
	EntityManager em;

	@javax.annotation.Resource
	UserTransaction utx;

	private static final Logger LOGGER = LoggerFactory.getLogger(SyncManager.class);

	public SyncManager() {
	}

	private static void assertNonNull(String loggerMsg, Object o, String xMsg) throws GeneralFailure {
		if(o==null){
			LOGGER.debug(loggerMsg);
			throw new GeneralFailure(xMsg);
		}
	}
	private static void assertTrue(String loggerMsg, String xMsg, boolean value) throws GeneralFailure {
		if(!value) {
			LOGGER.debug(loggerMsg);
			throw new GeneralFailure(xMsg);
		}		
	}
	private static void assertFalse(String loggerMsg, String xMsg, boolean value) throws GeneralFailure {
		if(value) {
			LOGGER.debug(loggerMsg);
			throw new GeneralFailure(xMsg);
		}		
	}	
	
	private static String sync_roles_query() {
		return (new StringBuilder("select rls.SIGN_OBJECT, rls.ID_SRV "))
		  .append("from AC_ROLES_BSS_T rls, ")
		  .append("AC_IS_BSS_T app ")
		  .append("where APP.ID_SRV = rls.UP_IS ")
		  .append("and APP.SIGN_OBJECT=?")
		 .toString();		
	}
	
	private static enum ModeExec {
		REPLACE(0), ADD(1), REMOVE(2);
		int i;
		ModeExec(int i) { this.i = i; }
		public int toInt() { return this.i; }
		public static ModeExec valueOf(String value, ModeExec defaultValue) {
			try {
				return ModeExec.valueOf(value.trim().toUpperCase());
			} catch (Exception e) {
				//e.printStackTrace();
				return defaultValue;
			}
		}		
	}
	private abstract class ListSyncTX2<TARGET> extends ListSyncTX<TARGET> {
		public ListSyncTX2(Long auditCode, String idIS, String modeExec,
				Long idUserAuth, String IPAddress) throws GeneralFailure {
			super(auditCode, idIS, modeExec, idUserAuth, IPAddress);
		}
		protected void onAdd(List<TARGET> targetList) throws GeneralFailure {
			Map<String, Long> targetCodes = new HashMap<String, Long>();
			listExistingCodes(idIS, targetCodes);					
			for (TARGET target : targetList) {
				check(target);
				if (targetCodes.containsKey(getCode(target))) { // ADD - это ADD или UPDATE
					sync_ADDupd(idIS, target);
				} else {
					sync_ADD(idIS, target);
				}
			}
		}		
		protected void onRemove(List<TARGET> targetList) throws GeneralFailure {
			LOGGER.debug("sync:03");
			for (TARGET target : targetList) {
				LOGGER.debug("sync:04:" + getCode(target));
				check(target);
				sync_REMOVE(idIS, target);				
			}
		}
		protected void onReplace(List<TARGET> targetList) throws GeneralFailure {
			LOGGER.debug("sync:07");
			// 1. REMOVE ALL
			sync_REMOVEALL(idIS); //
			// 2.ADD
			for (TARGET target : targetList) {
				LOGGER.debug("sync:011:" + getCode(target));
				check(target);
				sync_ADD(idIS, target);
			}
		}		
		public abstract void listExistingCodes(String idIS, Map<String, Long> codes) throws GeneralFailure;
		public abstract void check(TARGET target) throws GeneralFailure;
		public abstract String getCode(TARGET target) throws GeneralFailure;
		public abstract void sync_ADDupd(String idIS, TARGET target) throws GeneralFailure ;
		public abstract void sync_ADD(String idIS, TARGET target) throws GeneralFailure ;
		public abstract void sync_REMOVE(String idIS, TARGET target) throws GeneralFailure;
		public abstract void sync_REMOVEALL(String idIS) throws GeneralFailure;
	}
	
	private abstract class ListSyncTX<TARGET> {
		ModeExec modeExec;
		String idIS;
		final boolean validated;
		Long auditCode;
		String IPAddress;
		public ListSyncTX(Long auditCode, String idIS, String modeExec,
						  Long idUserAuth, String IPAddress) throws GeneralFailure{
			this.auditCode = auditCode;
			this.IPAddress = IPAddress;
			assertNonNull("sync:return", utx, "utx==null");			
			assertNonNull("sync:return", idIS, "idIS is null");
			this.idIS = idIS;
			this.modeExec = ModeExec.valueOf(modeExec, null);
			assertFalse("sync:return", "Некорректные данные [modeExec]", this.modeExec == null);
			validated = init();
		};
		public boolean init() throws GeneralFailure {
			return true;
		};
		protected abstract void onRemove(List<TARGET> targetList) throws GeneralFailure;
		protected abstract void onReplace(List<TARGET> targetList) throws GeneralFailure;
		protected abstract void onAdd(List<TARGET> targetList) throws GeneralFailure;
		
		public void sync(List<TARGET> targetList) throws GeneralFailure  {
			if(!validated) throw new GeneralFailure("validation failed!");
			assertFalse("sync:return",  "Отсутствует список целевых объектов!", targetList == null || targetList.isEmpty());
			
			LOGGER.debug("sync:01");			
			// go!
			try {
				utx.begin();
				switch (modeExec) {
				case ADD:
					onAdd(targetList);				
					break; //case ADD:					
				case REMOVE:
					onRemove(targetList);
					break; //case REMOVE:
				case REPLACE:
					// REPLACE = ALL REMOVE + ADD
					onReplace(targetList);				
					break; //case REPLACE:		
				//default:	//	break;
				} // switch (_modeExec)
				
				sys_audit(auditCode, "idIS:" + idIS, "true", IPAddress, null);

				utx.commit();

			} catch (Exception eSr) {
				try {
					utx.rollback();
					utx.begin();
					sys_audit(auditCode, "idIS:" + idIS, "error", IPAddress, null);
					utx.commit();

				} catch (Exception erSr) {
					try {
						utx.rollback();
					} catch (Exception errSr) {
						LOGGER.error("rollback:Error2:", errSr);
					}
					LOGGER.error("rollback:Error10:", erSr);
				}
				throw new GeneralFailure(eSr.getMessage());
			}			
		}
	}
	
	/**
	 * синхронизация систем
	 */
	public void sync_roles(String idIS, List<Role> roles, String modeExec,
			Long idUserAuth, String IPAddress) throws GeneralFailure {
		// для систем и подсистем
		// при REPLACE и REMOVE, если у роли есть пользователи или группы,
		// то выдаём исключение
		// ADD - это ADD или UPDATE
		(new ListSyncTX2<Role>(12L, idIS, modeExec, idUserAuth, IPAddress) {
			@Override
			public boolean init() throws GeneralFailure {
				idIS = get_code_is(idIS); // !!!
				return true;
			}
			@Override
			public void listExistingCodes(String idIS, Map<String, Long> codes) {
				sync_roles_existing(idIS, codes);				
			}
			@Override
			public void check(Role target) throws GeneralFailure {
				checkRole(target);
			}
			@Override
			public String getCode(Role target) throws GeneralFailure {
				return target.getCode();
			}
			@Override
			public void sync_ADDupd(String idIS, Role role) throws GeneralFailure  {
				sync_roles_ADDupd(idIS, role);
			}
			@Override
			public void sync_ADD(String idIS, Role role) throws GeneralFailure  {
				sync_roles_ADD(idIS, role);				
			}
			@Override
			public void sync_REMOVE(String idIS, Role role) throws GeneralFailure {
				sync_roles_REMOVE(idIS, role);				
			}
			@Override
			public void sync_REMOVEALL(String idIS) throws GeneralFailure {
				sync_roles_REMOVEALL(idIS);
			}			
		}).sync(roles);
	}

	private void sync_roles_existing(String idIS, Map<String, Long> rolescl)
			throws NumberFormatException {
		// имеющиеся роли
		List<Object[]> lo = em
				.createNativeQuery(sync_roles_query())
				.setParameter(1, idIS).getResultList();
		LOGGER.debug("sync_roles:02");
		for (Object[] objectArray : lo) {
			rolescl.put(
					objectArray[0] != null ? objectArray[0].toString()
							: "", objectArray[1] != null ? Long.parseLong(
							objectArray[1].toString()) : -1L);
		}
	}

	private void sync_roles_REMOVEALL(String idIS) throws GeneralFailure {
		try {
			LOGGER.debug("sync_roles:09");
			em.createNativeQuery(
					sync_roles_REMOVEALL_query())
					.setParameter(1, idIS).executeUpdate();
		} catch (Exception e) {
			LOGGER.error("sync_roles:010");
			// sys_audit тут не будет работать, т.к. транзакция
			// завершилась неудачно,
			// и он требует новую транзакцию
			// надо подумать - может ввести ручное управление
			// транзакцией,
			// чтобы заносить в аудит эти случаи
			throw new GeneralFailure(
					"Replacement roles is not possible: dependent records found ! ");
		}
	}

	private void sync_roles_REMOVE(String idIS, Role role)
			throws GeneralFailure {
		// rolescl устанавливается только в ADD
		// роль есть в базе
		try {
			LOGGER.debug("sync_roles:05");
			em.createNativeQuery(
					sync_roles_REMOVE_query())
					.setParameter(1, role.getCode())
					.setParameter(2, idIS).executeUpdate();

		} catch (Exception e) {
			LOGGER.error("sync_roles:error:", e);
			// sys_audit тут не будет работать, т.к. транзакция
			// завершилась неудачно,
			// и он требует новую транзакцию
			// надо подумать - может ввести ручное управление
			// транзакцией,
			// чтобы заносить в аудит эти случаи						
			throw new GeneralFailure(
					"Removal role ['"
							+ role.getCode()
							+ "'] is not possible: dependent records found ! ");
		}
	}

	private void sync_roles_ADD(String idIS, Role role) {
		em.createNativeQuery(
				sync_roles_ADD_query())
				.setParameter(1, idIS)
				.setParameter(2, role.getCode())
				.setParameter(3, role.getName())
				.setParameter(4, role.getDescription())
				.executeUpdate();
	}
	private void sync_roles_ADDupd(String idIS, Role role) {
		em.createNativeQuery(
				sync_roles_ADDupd_query())
				.setParameter(1, role.getName())
				.setParameter(2, role.getDescription())
				.setParameter(3, role.getCode())
				.setParameter(4, idIS)
				.executeUpdate();
	}
	
	private String sync_roles_REMOVEALL_query;
	private String sync_roles_REMOVEALL_query() {
		return sync_roles_REMOVEALL_query==null?
				sync_roles_REMOVEALL_query =
				(new StringBuilder("DELETE FROM AC_ROLES_BSS_T rls "))
					  .append("where rls.UP_IS=( ")
					  .append("SELECT APP.ID_SRV ")
					  .append("FROM AC_IS_BSS_T app ")
					  .append("WHERE APP.SIGN_OBJECT=? ) ")
				  .toString():
				sync_roles_REMOVEALL_query;
	}

	private String sync_roles_REMOVE_query;
	private String sync_roles_REMOVE_query() {
		return sync_roles_REMOVE_query==null? 
				sync_roles_REMOVE_query =
				(new StringBuilder("DELETE FROM AC_ROLES_BSS_T rls "))
				  .append("where rls.SIGN_OBJECT = ? ")
				  .append("and rls.UP_IS=( ")
				  .append("SELECT APP.ID_SRV ")
				  .append("FROM AC_IS_BSS_T app ")
				  .append("WHERE APP.SIGN_OBJECT=? ) ")
				  .toString(): 
			  sync_roles_REMOVE_query;
	}

	private String sync_roles_ADD_query;
	private String sync_roles_ADD_query() {
		return sync_roles_ADD_query==null? 
				sync_roles_ADD_query=
				(new StringBuilder("insert into AC_ROLES_BSS_T(ID_SRV, UP_IS, SIGN_OBJECT, FULL_ , DESCRIPTION, CREATOR,  created) "))
			  .append("values(AC_ROLES_BSS_SEQ.nextval, (select APP.ID_SRV FROM AC_IS_BSS_T app WHERE APP.SIGN_OBJECT=?), ")
			  .append("?, ?, ?, 1, sysdate) ")
			  .toString(): 
			  sync_roles_ADD_query;
	}

	private String sync_roles_ADDupd_query;
	private String sync_roles_ADDupd_query() {
		return sync_roles_ADDupd_query==null? 
				sync_roles_ADDupd_query=
				(new StringBuilder("UPDATE AC_ROLES_BSS_T rls "))
				  .append("set rls.FULL_=?, rls.DESCRIPTION=? ")
				  .append("where rls.SIGN_OBJECT = ? ")
				  .append("and rls.UP_IS=( ")
				  .append("SELECT APP.ID_SRV ")
				  .append("FROM AC_IS_BSS_T app ")
				  .append("WHERE APP.SIGN_OBJECT=? ) ")
				  .toString():
			  sync_roles_ADDupd_query;
	}

	private void checkRole(Role role) throws GeneralFailure {
		if (role.getCode() == null
				|| "".equals(role.getCode().trim())) {
			throw new GeneralFailure("Отсутствует код роли!");
		} else if (role.getName() == null
				|| "".equals(role.getName().trim())) {
			throw new GeneralFailure("Отсутствует название роли!");
		}
	}

	/**
	 * синхронизация функций аудита
	 */
	public void sync_functions(String idIS, List<Function> functions,
			String modeExec, Long idUserAuth, String IPAddress)
			throws GeneralFailure {		
		// для систем и подсистем
		// при REPLACE и REMOVE, если у функции есть уже аудит,
		// то выдаём исключение
		// ADD - это ADD или UPDATE		
		(new ListSyncTX2<Function>(13L, idIS, modeExec, idUserAuth, IPAddress) {
			@Override
			public boolean init() throws GeneralFailure {
				idIS = get_code_is(idIS); // !!!
				return true;
			}
			@Override
			public void listExistingCodes(String idIS, Map<String, Long> codes) {
				sync_functions_existCodes(idIS, codes);
			}
			@Override
			public void check(Function target) throws GeneralFailure {
				checkFunction(target);
			}
			@Override
			public String getCode(Function target) throws GeneralFailure {
				return target.getCode();
			}
			@Override
			public void sync_ADDupd(String idIS, Function func)
					throws GeneralFailure {
				sync_functions_ADDupd(idIS, func);
			}
			@Override
			public void sync_ADD(String idIS, Function func)
					throws GeneralFailure {
				sync_functions_ADD(idIS, func);
			}
			@Override
			public void sync_REMOVE(String idIS, Function func)
					throws GeneralFailure {
				sync_functions_DELETE(idIS, func);
			}
			@Override
			public void sync_REMOVEALL(String idIS) throws GeneralFailure {
				sync_functions_REMOVEALL(idIS);				
			}			
		}).sync(functions);
		

	}

	private void sync_functions_existCodes(String idIS, Map<String, Long> actcl)
			throws NumberFormatException {
		// имеющиеся роли
		List<Object[]> lo = em
				.createNativeQuery(
						sync_functions_ADDupd_query())
				.setParameter(1, idIS).getResultList();
		LOGGER.debug("sync_functions:03");

		for (Object[] objectArray : lo) {
			actcl.put(
					objectArray[0] != null ? objectArray[0].toString()
							: "", objectArray[1] != null ? Long.parseLong(
							objectArray[1].toString()) : -1L);
		}
	}

	private String sync_functions_ADDupd_query() {
		return (new StringBuilder("select ACT.SIGN_OBJECT, ACT.ID_SRV "))
		  .append("from ACTIONS_BSS_T act, ")
		  .append("AC_IS_BSS_T app ")
		  .append("where APP.ID_SRV = ACT.UP_IS ")
		  .append("and APP.SIGN_OBJECT=?")
		  .toString();
	}

	private void sync_functions_ADDupd(String idIS, Function func) {
		em.createNativeQuery(
				sync_functions_ADD_upd_query())
				.setParameter(1, func.getName())
				.setParameter(2, func.getDescription())
				.setParameter(3, func.getCode())
				.setParameter(4, idIS)
				.executeUpdate();
	}

	private String sync_functions_ADD_upd_query() {
		return (new StringBuilder("UPDATE ACTIONS_BSS_T act "))
		  .append("set act.FULL_=?, act.DESCRIPTIONS=? ")
		  .append("where act.SIGN_OBJECT = ? ")
		  .append("and act.UP_IS=( ")
		  .append("SELECT APP.ID_SRV ")
		  .append("FROM AC_IS_BSS_T app ")
		  .append("WHERE APP.SIGN_OBJECT=? ) ")
		  .toString();
	}

	private void sync_functions_DELETE(String idIS, Function func)
			throws GeneralFailure {
		// rolescl устанавливается только в ADD

		// функция есть в базе

		try {
			LOGGER.debug("sync_functions:05");

			em.createNativeQuery(
					sync_functions_DELETE_query())
					.setParameter(1, func.getCode())
					.setParameter(2, idIS).executeUpdate();

		} catch (Exception e) {
			LOGGER.error("sync_functions:06");
			// sys_audit тут не будет работать, т.к. транзакция
			// завершилась неудачно,
			// и он требует новую транзакцию
			// надо подумать - может ввести ручное управление
			// транзакцией,
			// чтобы заносить в аудит эти случаи

			throw new GeneralFailure(
					"Removal role ['"
							+ func.getCode()
							+ "'] is not possible: dependent records found ! ");
		}
	}

	private String sync_functions_DELETE_query() {
		return (new StringBuilder("DELETE FROM ACTIONS_BSS_T act "))
		  .append("where act.SIGN_OBJECT = ? ")
		  .append("and act.UP_IS=( ")
		  .append("SELECT APP.ID_SRV ")
		  .append("FROM AC_IS_BSS_T app ")
		  .append("WHERE APP.SIGN_OBJECT=? ) ")
		  .toString();
	}

	private void sync_functions_REMOVEALL(String idIS) throws GeneralFailure {
		try {
			LOGGER.debug("sync_functions:09");
			em.createNativeQuery(
					sync_functions_REMOVEALL_query())
					.setParameter(1, idIS).executeUpdate();
		} catch (Exception e) {
			LOGGER.error("sync_functions:010");
			// sys_audit тут не будет работать, т.к. транзакция
			// завершилась неудачно,
			// и он требует новую транзакцию
			// надо подумать - может ввести ручное управление
			// транзакцией,
			// чтобы заносить в аудит эти случаи
			throw new GeneralFailure(
					"Replacement roles is not possible: dependent records found ! ");
		}
	}

	private String sync_functions_REMOVEALL_query() {
		return (new StringBuilder("DELETE FROM ACTIONS_BSS_T act "))
		  .append("where act.UP_IS=( ")
		  .append("SELECT APP.ID_SRV ")
		  .append("FROM AC_IS_BSS_T app ")
		  .append("WHERE APP.SIGN_OBJECT=? ) ")
		  .toString();
	}

	private void sync_functions_ADD(String idIS, Function func) {
		em.createNativeQuery(
				sync_functions_ADD_query())
				.setParameter(1, idIS)
				.setParameter(2, func.getCode())
				.setParameter(3, func.getName())
				.setParameter(4, func.getDescription())
				.executeUpdate();
	}

	private String sync_functions_ADD_query() {
		return (new StringBuilder("insert into ACTIONS_BSS_T(ID_SRV, UP_IS, SIGN_OBJECT, FULL_ , DESCRIPTIONS, CREATOR,  created) "))
		  .append("values(ACTIONS_BSS_SEQ.nextval, (select APP.ID_SRV FROM AC_IS_BSS_T app WHERE APP.SIGN_OBJECT=?), ")
		  .append("?, ?, ?, 1, sysdate) ")
		  .toString();
	}

	private void checkFunction(Function func) throws GeneralFailure {
		if (func.getCode() == null
				|| "".equals(func.getCode().trim())) {
			throw new GeneralFailure("Отсутствует код функции!");
		} else if (func.getName() == null
				|| "".equals(func.getName().trim())) {
			throw new GeneralFailure(
					"Отсутствует название функции!");
		}
	}

	/**
	 * список ролей системы
	 */
	public List<Role> is_roles(String idIS, Long idUserAuth, String IPAddress)
			throws GeneralFailure {
		// для групп систем, систем и подсистем
		LOGGER.debug("is_roles:01");
		List<Role> resultIr = new ArrayList<Role>();
		List<String> keyList = new ArrayList<String>();
		try {

			if (idIS == null || idIS.trim().isEmpty()) {
				LOGGER.debug("is_roles:01");
				throw new GeneralFailure("idIS is null!");
			}

			if (isGroupSys(idIS)) { // группа ИС
				is_roles_grpsys(idIS, resultIr, keyList);
			} else if (isSysOrSubsys(idIS)) {
				idIS = get_code_is(idIS);// !!!
				is_roles_sysOrsubsys(idIS, resultIr, keyList); // система или подсистема
			}

			sys_audit(80L, "idIS:" + idIS, "true", IPAddress, null);

			return resultIr;

		} catch (Exception eIr) {
			sys_audit(80L, "idIS:" + idIS, "error", IPAddress, null);
			throw new GeneralFailure(eIr.getMessage());
		}
	}

	private boolean isGroupSys(String idIS) {
		return idIS.startsWith(CUDConstants.groupArmPrefix);
	}

	private void is_roles_grpsys(String idIS, List<Role> resultIr,
			List<String> keyList) {
		// группа ИС

		LOGGER.debug("is_roles:02");

		List<Object[]> loIr = em
				.createNativeQuery(
						is_roles_grpsys_query())
				.setParameter(1, idIS).getResultList();

		for (Object[] objectArray : loIr) {
			LOGGER.debug("IdRole:" + objectArray[0].toString());

			Role role = new Role();

			role.setCode(objectArray[0].toString());
			role.setName(objectArray[1].toString());
			role.setDescription (objectArray[2] != null ? objectArray[2]
					.toString() : null);

			resultIr.add(role);

			keyList.add(objectArray[0].toString());

		}

		LOGGER.debug("is_roles:03");
	}

	private String is_roles_grpsys_query() {
		return (new StringBuilder("  SELECT '[' || sys_code || ']' || role_full.SIGN_OBJECT role_is_code, "))
		  .append(" role_full.FULL_, ")
		  .append(" role_full.DESCRIPTION ")
		  .append(" FROM (  SELECT SYS.SIGN_OBJECT sys_code, ROL.ID_SRV role_id ")
		  .append(" FROM GROUP_SYSTEMS_KNL_T gsys, ")
		  .append(" AC_IS_BSS_T sys, ")
		  .append(" AC_ROLES_BSS_T rol, ")
		  .append(" LINK_GROUP_SYS_SYS_KNL_T lgr ")
		  .append(" WHERE     GSYS.GROUP_CODE = ? ")
		  .append(" AND GSYS.ID_SRV = LGR.UP_GROUP_SYSTEMS ")
		  .append(" AND LGR.UP_SYSTEMS = SYS.ID_SRV ")
		  .append(" AND ROL.UP_IS = SYS.ID_SRV ")
		  .append(" GROUP BY SYS.SIGN_OBJECT, ROL.ID_SRV), ")
		  .append(" AC_ROLES_BSS_T role_full ")
		  .append(" WHERE role_full.ID_SRV = role_id ")
		  .append("ORDER BY sys_code ")
.toString();
	}

	private boolean isSysOrSubsys(String idIS) {
		return idIS.startsWith(CUDConstants.armPrefix)
				|| idIS.startsWith(CUDConstants.subArmPrefix);
	}

	private void is_roles_sysOrsubsys(String idIS, List<Role> resultIr,
			List<String> keyList) {
		// система или подсистема
		List<Object[]> loIr = em
				.createNativeQuery(is_roles_sysOrSubsys_query())
				.setParameter(1, idIS).getResultList();

		for (Object[] objectArray : loIr) {

			Role roleIr = new Role();

			roleIr.setCode(objectArray[0].toString());
			roleIr.setName(objectArray[1].toString());
			roleIr.setDescription (objectArray[2] != null ? objectArray[2]
					.toString() : null);

			resultIr.add(roleIr);

			keyList.add(objectArray[0].toString());

		}

		LOGGER.debug("is_roles:04");
	}

	private String is_roles_sysOrSubsys_query() {
		return (new StringBuilder("SELECT ROL.SIGN_OBJECT, ROL.FULL_, ROL.DESCRIPTION "))
		  .append(" FROM AC_IS_BSS_T app, AC_ROLES_BSS_T rol ")
		  .append(" WHERE APP.SIGN_OBJECT = ? AND ROL.UP_IS = APP.ID_SRV ")
.toString();
	}

	/**
	 * список функций аудита
	 */
	public List<Function> is_functions(String idIS, Long idUserAuth,
			String IPAddress) throws GeneralFailure {

		// для групп систем, систем и подсистем

		LOGGER.debug("is_functions:01");

		List<Function> result = new ArrayList<Function>();
		List<String> keyList = new ArrayList<String>();

		try {
			if (idIS == null || idIS.trim().isEmpty()) {
				LOGGER.debug("is_functions:01");
				throw new GeneralFailure("idIS is null!");
			}

			if (isGroupSys(idIS)) {
				is_functions_selectISgroup(idIS, result, keyList);
			} else if (isSysOrSubsys(idIS)) {
				idIS = get_code_is(idIS);// !!!
				is_functions_selectISorSubsys(idIS, result, keyList);
			}

			utx.begin();
			sys_audit(81L, "idIS:" + idIS, "true", IPAddress, null); // tx required!
			utx.commit();

			return result;

		} catch (Exception e) {
			try {
				utx.begin();
				sys_audit(81L, "idIS:" + idIS, "error", IPAddress, null); // tx required!
				utx.commit();				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			throw new GeneralFailure(e.getMessage());
		}

	}

	private void is_functions_selectISorSubsys(String idIS,
			List<Function> result, List<String> keyList) {
		// система или подсистема
		List<Object[]> lo = em
				.createNativeQuery(
						(new StringBuilder("SELECT act.SIGN_OBJECT,act.FULL_, ACT.DESCRIPTIONS "))
						  .append("FROM AC_IS_BSS_T app, ACTIONS_BSS_T act ")
						  .append("WHERE APP.SIGN_OBJECT = ? AND act.UP_IS = APP.ID_SRV ")
				.toString())
				.setParameter(1, idIS).getResultList();

		for (Object[] objectArray : lo) {
			Function func = new Function();

			func.setCode(objectArray[0].toString());
			func.setName(objectArray[1].toString());
			func.setDescription (objectArray[2] != null ? objectArray[2]
					.toString() : null);

			result.add(func);

			keyList.add(objectArray[0].toString());

		}
		LOGGER.debug("is_functions:04");
	}

	private void is_functions_selectISgroup(String idIS, List<Function> result,
			List<String> keyList) {
		// группа ИС
		LOGGER.debug("is_functions:02");
		List<Object[]> lo = em
				.createNativeQuery(is_functions_selectISgroup_query())
				.setParameter(1, idIS).getResultList();

		for (Object[] objectArray : lo) {
			LOGGER.debug("IdRole:" + objectArray[0].toString());

			Function func = new Function();

			func.setCode(objectArray[0].toString());
			func.setName(objectArray[1].toString());
			func.setDescription (objectArray[2] != null ? objectArray[2]
					.toString() : null);

			result.add(func);

			keyList.add(objectArray[0].toString());

		}
		LOGGER.debug("is_functions:03");
	}

	private String is_functions_selectISgroup_query() {
		return (new StringBuilder(" SELECT '[' || sys_code || ']' || act_full.SIGN_OBJECT act_is_code, "))
		  .append(" act_full.FULL_, ")
		  .append(" act_full.DESCRIPTIONS ")
		  .append(" FROM (  SELECT SYS.SIGN_OBJECT sys_code, act.ID_SRV act_id ")
		  .append(" FROM GROUP_SYSTEMS_KNL_T gsys, ")
		  .append(" AC_IS_BSS_T sys, ")
		  .append(" ACTIONS_BSS_T act, ")
		  .append(" LINK_GROUP_SYS_SYS_KNL_T lgr ")
		  .append(" WHERE     GSYS.GROUP_CODE = ? ")
		  .append(" AND GSYS.ID_SRV = LGR.UP_GROUP_SYSTEMS ")
		  .append(" AND LGR.UP_SYSTEMS = SYS.ID_SRV ")
		  .append(" AND act.UP_IS = SYS.ID_SRV ")
		  .append(" GROUP BY SYS.SIGN_OBJECT, act.ID_SRV), ")
		  .append(" ACTIONS_BSS_T act_full ")
		  .append(" WHERE act_full.ID_SRV = act_id ")
		  .append("ORDER BY sys_code")
		  .toString();
	}

	/**
	 * синхронизация групп пользователей
	 */
	public void sync_groups(String idIS, List<Group> groups, String modeExec,
			Long idUserAuth, String IPAddress) throws GeneralFailure {

		// для систем и подсистем
		// !!!
		// REPLACE нет!!!

		// !!!
		// привязка ролей происходит попринципу ADD

		// modeExec:
		// 1 - ADD
		// 2 - REMOVE

		// при REMOVE, если у роли есть пользователи или группы,
		// то выдаём исключение

		// ADD - это ADD или UPDATE
		LOGGER.debug("sync_groups:01");
		
		(new ListSyncTX2<Group>(12L, idIS, modeExec, idUserAuth, IPAddress) {
			Map<String, Long> group_cl = null;
			@Override
			public boolean init() throws GeneralFailure {
				if(ModeExec.REPLACE.equals(this.modeExec))
					throw new GeneralFailure("REPLACE нет!!!");
				return true;
			}
			@Override
			public void listExistingCodes(String idIS, Map<String, Long> codes) {
				listExistingCodes_group(codes);				
				group_cl = codes;				
			}
			@Override
			public void check(Group group) throws GeneralFailure {
				checkGroup(group);
			}
			@Override
			public String getCode(Group group) throws GeneralFailure {
				return group.getCode();
			}
			@Override
			public void sync_ADDupd(String idIS, Group group)
					throws GeneralFailure {
				em.createNativeQuery(
						(new StringBuilder("UPDATE GROUP_USERS_KNL_T rls "))
						  .append("set rls.FULL_=?, rls.DESCRIPTION=? ")
						  .append("where rls.SIGN_OBJECT = ? ")
				.toString())
						.setParameter(1, group.getName())
						.setParameter(2, group.getDescription())
						.setParameter(3, group.getCode())
						.executeUpdate();
				linkGroupUsersRoles(idIS, group_cl, group);				
			}
			@Override
			public void sync_ADD(String idIS, Group group) throws GeneralFailure {
				List results = em
						.createNativeQuery(
								"select GROUP_USERS_KNL_SEQ.nextval from dual ")
						.getResultList();
				Long newIdGroup = ((BigDecimal) results.get(0)).longValue();
				em.createNativeQuery(
						(new StringBuilder("insert into GROUP_USERS_KNL_T(ID_SRV, SIGN_OBJECT, FULL_ , DESCRIPTION, CREATOR,  created) "))
						  .append("values(?, ")
						  .append("?, ?, ?, ?, sysdate) ")
						  .toString())
						.setParameter(1, newIdGroup)
						.setParameter(2, group.getCode())
						.setParameter(3, group.getName())
						.setParameter(4, group.getDescription())
						.setParameter(5, 1L).executeUpdate();
				linkGroupUsersRoles2(idIS, group, newIdGroup);				
			}
			@Override
			public void sync_REMOVE(String idIS, Group group)
					throws GeneralFailure {
				// rolescl устанавливается только в ADD
				// роль есть в базе
				try {
					LOGGER.debug("sync_group:05");
					em.createNativeQuery(
							"DELETE FROM GROUP_USERS_KNL_T rls "
									+ "where rls.SIGN_OBJECT = ? ")
							.setParameter(1, group.getCode())
							.executeUpdate();

				} catch (Exception e) {
					LOGGER.error("sync_group:06");
					// sys_audit тут не будет работать, т.к. транзакция
					// завершилась неудачно,
					// и он требует новую транзакцию
					// надо подумать - может ввести ручное управление
					// транзакцией,
					// чтобы заносить в аудит эти случаи
					throw new GeneralFailure(
							"Removal group ['"
									+ group.getCode()
									+ "'] is not possible: dependent records found ! ");
				}				
			}
			@Override
			public void sync_REMOVEALL(String idIS) throws GeneralFailure {
				not_implemented();
			}			
		}).sync(groups);

	}

	private void linkGroupUsersRoles2(String idIS, Group group, Long newIdGroup) {
		// привязка ролей к группе
		if (group.getCodesRoles() != null) {
			final List<String> role_cl = new ArrayList<String>();							
			existingRolesInGroup2(idIS, group, role_cl);
			insertGroupUsersRoles2(idIS, group, newIdGroup, role_cl);
		}
	}

	private void insertGroupUsersRoles2(String idIS, Group group,
			Long newIdGroup, final List<String> role_cl) {
		for (String role_code : group.getCodesRoles()) {

			if (!role_cl.contains(role_code)) {

				em.createNativeQuery(
						(new StringBuilder("insert into LINK_GROUP_USERS_ROLES_KNL_T(UP_ROLES, UP_GROUP_USERS, CREATOR,  created) "))
						  .append("values (")
						  .append("(select role.ID_SRV from AC_ROLES_BSS_T role, AC_IS_BSS_T sys ")
						  .append("where SYS.ID_SRV= ROLE.UP_IS and  SYS.SIGN_OBJECT = ? ")
						  .append("and role.SIGN_OBJECT = ? ), ?, ?, sysdate) ")
				.toString())
						.setParameter(1, idIS)
						.setParameter(2, role_code)
						.setParameter(3, newIdGroup)
						.setParameter(4, 1L)
						.executeUpdate();
			}
		}
	}

	private void existingRolesInGroup2(String idIS, Group group,
			final List<String> role_cl) {
		// имеющиеся роли в группе по данной системе
		List<Object[]> lo_roles = em
				.createNativeQuery(
						(new StringBuilder("select ROL.SIGN_OBJECT, ROL.ID_SRV "))
						  .append("from GROUP_USERS_KNL_T gr, ")
						  .append("LINK_GROUP_USERS_ROLES_KNL_T lgr, ")
						  .append("AC_ROLES_BSS_T rol, ")
						  .append("AC_IS_BSS_T sys ")
						  .append("where GR.ID_SRV=LGR.UP_GROUP_USERS ")
						  .append("and LGR.UP_ROLES=ROL.ID_SRV ")
						  .append("and SYS.SIGN_OBJECT = ? ")
						  .append("and SYS.ID_SRV= ROL.UP_IS ")
						  .append("and GR.SIGN_OBJECT = ? ")
						  .append("group by  ROL.SIGN_OBJECT, ROL.ID_SRV ")
				.toString())
				.setParameter(1, idIS)
				.setParameter(2, group.getCode())
				.getResultList();

		for (Object[] objectArray : lo_roles) {
			role_cl.add(objectArray[0] != null ? objectArray[0]
					.toString() : "");
		}
	}

	private void linkGroupUsersRoles(String idIS, Map<String, Long> group_cl,
			Group group) {
		// привязка ролей к группе
		if (group.getCodesRoles() != null) {
			final List<String> role_cl = new ArrayList<String>();
			LOGGER.debug("sync_groups:03");							
			existingRolesInGroup(idIS, group, role_cl);
			insertGroupUsersRoles(idIS, group_cl, group, role_cl);
		}
	}

	private void insertGroupUsersRoles(String idIS, Map<String, Long> group_cl,
			Group group, final List<String> role_cl) {
		for (String role_code : group.getCodesRoles()) {
			LOGGER.debug("sync_groups:05:" + role_code);
			if (!role_cl.contains(role_code)) {
				LOGGER.debug("sync_groups:06");
				em.createNativeQuery(
						(new StringBuilder("insert into LINK_GROUP_USERS_ROLES_KNL_T(UP_ROLES, UP_GROUP_USERS, CREATOR,  created) "))
						  .append("values (")
						  .append("(select role.ID_SRV from AC_ROLES_BSS_T role, AC_IS_BSS_T sys  ")
						  .append("where SYS.ID_SRV= ROLE.UP_IS and  SYS.SIGN_OBJECT = ? ")
						  .append("and role.SIGN_OBJECT = ? ), ?, ?, sysdate) ")
				.toString())
						.setParameter(1, idIS)
						.setParameter(2, role_code)
						.setParameter(
								3,
								group_cl.get(group
										.getCode()))
						.setParameter(4, 1L)
						.executeUpdate();
			}
		}
	}

	private void existingRolesInGroup(String idIS, Group group,
			final List<String> role_cl) {
		// имеющиеся роли в группе по данной системе

		List<Object[]> lo_roles = em
				.createNativeQuery(
						(new StringBuilder("select ROL.SIGN_OBJECT, ROL.ID_SRV "))
						  .append("from GROUP_USERS_KNL_T gr, ")
						  .append("LINK_GROUP_USERS_ROLES_KNL_T lgr, ")
						  .append("AC_ROLES_BSS_T rol, ")
						  .append("AC_IS_BSS_T sys ")
						  .append("where GR.ID_SRV=LGR.UP_GROUP_USERS ")
						  .append("and LGR.UP_ROLES=ROL.ID_SRV ")
						  .append("and SYS.SIGN_OBJECT = ? ")
						  .append("and SYS.ID_SRV= ROL.UP_IS ")
						  .append("and GR.SIGN_OBJECT = ? ")
						  .append("group by  ROL.SIGN_OBJECT, ROL.ID_SRV ")
				.toString())
				.setParameter(1, idIS)
				.setParameter(2, group.getCode())
				.getResultList();

		for (Object[] objectArray : lo_roles) {
			role_cl.add(objectArray[0] != null ? objectArray[0]
					.toString() : "");
			LOGGER.debug("sync_groups:04:" + objectArray[0]);
		}
	}

	private void listExistingCodes_group(Map<String, Long> group_cl)
			throws NumberFormatException {
		// имеющиеся группы
		List<Object[]> lo = em.createNativeQuery(
				"select gr.SIGN_OBJECT, GR.ID_SRV "
						+ "from GROUP_USERS_KNL_T gr ").getResultList();

		LOGGER.debug("sync_groups:02");

		for (Object[] objectArray : lo) {
			group_cl.put(
					objectArray[0] != null ? objectArray[0].toString()
							: "", objectArray[1] != null ? Long.parseLong(
							objectArray[1].toString()) : -1L);
		}
	}

	private void checkGroup(Group group) throws GeneralFailure {
		checkGroupCode(group);
		if (group.getName() == null
				|| "".equals(group.getName().trim())) {
			throw new GeneralFailure("Отсутствует название группы!");
		}
	}
	private void checkGroupCode(Group group) throws GeneralFailure {
		if (group.getCode() == null
				|| "".equals(group.getCode().trim())) {
			throw new GeneralFailure("Отсутствует код группы!");
		}
	}

	/**
	 * синхронизация ролей групп
	 */
	public void sync_groups_roles(String idIS, List<String> codesGroups,
			List<String> codesRoles, String modeExec, Long idUserAuth,
			String IPAddress) throws GeneralFailure {
		// для систем и подсистем
		// !!!
		// привязка ролей происходит попринципу ADD
		// при REMOVE, если у роли есть пользователи или группы,
		// то выдаём исключение
		// ADD - это ADD или UPDATE
		LOGGER.debug("sync_groups_roles:01");
		(new ListSyncTX<String>(12L, idIS, modeExec, idUserAuth, IPAddress) {
			List<String> codesRoles;
			@Override
			public boolean init() throws GeneralFailure {
				idIS = get_code_is(idIS);	// !!!
				return true;
			}
			public void sync(List<String> codesGroups, List<String> codesRoles) throws GeneralFailure {
				assertFalse("sync_groups_roles", "Отсутствует список ролей!",
						codesRoles == null || codesRoles.isEmpty());				
				this.codesRoles = codesRoles;
				sync(codesGroups);
			}		
			@Override
			protected void onAdd(List<String> codesGroups) throws GeneralFailure {
				List<String> role_cl = null;
				for (String group : codesGroups) {
					role_cl = new ArrayList<String>();
					// привязка ролей к группе
					LOGGER.debug("sync_groups_roles:03");
					existingRolesGroupIS(idIS, role_cl, group);
					insertLinkRolesGroup(idIS, codesRoles, role_cl, group);
				}
			}
			@Override
			protected void onRemove(List<String> codesGroups)
					throws GeneralFailure {
				for (String groupCode: codesGroups) {
					checkGroupCode(groupCode);
					LOGGER.debug("sync_groups_roles:03");
					sync_grpRoles_REMOVE(idIS, codesRoles, groupCode);									
				}				
				
			}			
			@Override
			protected void onReplace(List<String> codesGroups)
					throws GeneralFailure {
				// REPLACE = ALL REMOVE + ADD
				LOGGER.debug("sync_groups_roles:07");
				for (String groupCode : codesGroups) {					
					checkGroupCode(groupCode);
					// 1. REMOVE ALL
					sync_grpRoles_REMOVEALL(groupCode);
					// 2.ADD
					for (String role_code : codesRoles) {
						LOGGER.debug("sync_groups_roles:05:" + role_code);
						checkRoleCode(role_code);
						sync_grpRoles_LINK_GROUP_USERS_ROLES(idIS, groupCode, role_code);
					}
				}
			}
		}).sync(codesGroups, codesRoles);

	}

	private void checkGroupCode(String groupCode) throws GeneralFailure {
		if (Strings.isNullOrEmptyTrim(groupCode)) {
			throw new GeneralFailure("Отсутствует код группы!");
		}				
	}
	private void checkRoleCode(String role_code) throws GeneralFailure {
		if (Strings.isNullOrEmptyTrim(role_code)) {
			throw new GeneralFailure("Отсутствует код роли!");
		}
	}

	private void sync_grpRoles_LINK_GROUP_USERS_ROLES(String idIS,
			String group, String role_code) {
		em.createNativeQuery(
				(new StringBuilder("insert into LINK_GROUP_USERS_ROLES_KNL_T(UP_ROLES, UP_GROUP_USERS, CREATOR,  created) "))
				  .append("values (")
				  .append("(select role.ID_SRV from AC_ROLES_BSS_T role, AC_IS_BSS_T sys  ")
				  .append("where SYS.ID_SRV= ROLE.UP_IS and  SYS.SIGN_OBJECT = ? ")
				  .append("and role.SIGN_OBJECT = ? ), ")
				  .append("(select lgu.ID_SRV from GROUP_USERS_KNL_T lgu ")
				  .append("where lgu.SIGN_OBJECT = ? ), ?, sysdate) ")
		.toString())
				.setParameter(1, idIS)
				.setParameter(2, role_code)
				.setParameter(3, group).setParameter(4, 1L)
				.executeUpdate();
	}

	protected void sync_grpRoles_REMOVEALL(String group) {
		try {
			LOGGER.debug("sync_groups_roles:09");

			em.createNativeQuery(
					(new StringBuilder("DELETE FROM LINK_GROUP_USERS_ROLES_KNL_T rls "))
					  .append("where rls.UP_GROUP_USERS = ")
					  .append("(select lgu.ID_SRV from GROUP_USERS_KNL_T lgu ")
					  .append("where lgu.SIGN_OBJECT = ? )")
					  .toString())
					.setParameter(1, group).executeUpdate();

		} catch (Exception e) {
			LOGGER.debug("sync_groups_roles:010");
		}
	}

	private void sync_grpRoles_REMOVE(String idIS, List<String> codesRoles,
			String group) {
		try {
			LOGGER.debug("sync_group_roles:05");
			for (String role_code : codesRoles) {
				em.createNativeQuery(
						(new StringBuilder("DELETE FROM LINK_GROUP_USERS_ROLES_KNL_T rls "))
						  .append("where rls.UP_ROLES = ")
						  .append("(select role.ID_SRV from AC_ROLES_BSS_T role, AC_IS_BSS_T sys  ")
						  .append("where SYS.ID_SRV= ROLE.UP_IS and  SYS.SIGN_OBJECT = ? ")
						  .append("and role.SIGN_OBJECT = ? ) ")
						  .append("and rls.UP_GROUP_USERS = (select lgu.ID_SRV from GROUP_USERS_KNL_T lgu ")
						  .append("where lgu.SIGN_OBJECT = ? )")
						  .toString())
						.setParameter(1, idIS)
						.setParameter(2, role_code)
						.setParameter(3, group).executeUpdate();

			}
		} catch (Exception e) {
			LOGGER.debug("sync_group_roles:06");
		}
	}

	private void insertLinkRolesGroup(String idIS, List<String> codesRoles,
			List<String> role_cl, String group) {
		for (String role_code : codesRoles) {
			LOGGER.debug("sync_groups_roles:05:" + role_code);
			if (!role_cl.contains(role_code)) {
				LOGGER.debug("sync_groups_roles:06");
				sync_grpRoles_LINK_GROUP_USERS_ROLES(idIS, group, role_code);
			}
		}
	}

	private void existingRolesGroupIS(String idIS, List<String> role_cl,
			String group) {
		// имеющиеся роли в группе по данной системе
		List<Object[]> lo_roles = em
				.createNativeQuery(
						(new StringBuilder("select ROL.SIGN_OBJECT, ROL.ID_SRV "))
						  .append("from GROUP_USERS_KNL_T gr, ")
						  .append("LINK_GROUP_USERS_ROLES_KNL_T lgr, ")
						  .append("AC_ROLES_BSS_T rol, ")
						  .append("AC_IS_BSS_T sys ")
						  .append("where GR.ID_SRV=LGR.UP_GROUP_USERS ")
						  .append("and LGR.UP_ROLES=ROL.ID_SRV ")
						  .append("and SYS.SIGN_OBJECT = ? ")
						  .append("and SYS.ID_SRV= ROL.UP_IS ")
						  .append("and GR.SIGN_OBJECT = ? ")
						  .append("group by  ROL.SIGN_OBJECT, ROL.ID_SRV ")
				.toString())
				.setParameter(1, idIS).setParameter(2, group)
				.getResultList();

		for (Object[] objectArray : lo_roles) {
			role_cl.add(objectArray[0] != null ? objectArray[0]
					.toString() : "");
			LOGGER.debug("sync_groups_roles:04:" + objectArray[0]);
		}
	}

		
	/**
	 * синхронизация ресурсов
	 */
	public void sync_resources(
			 String idIS, 
			 List<Resource> resources,
			 String modeExec,
			 Long idUserAuth,
			 String IPAddress) throws GeneralFailure{
		 
		 //ADD - это ADD или UPDATE
		 
		 //для систем - это UPDATE
		 //для систем данные для обновления берутся из resources.get(0)
		 //для систем код систем берётся idIS, а не resources.get(0).resource.getCode()		
		 LOGGER.debug("sync_resources:01");
		 
		 (new ListSyncTX<Resource>(101L, idIS, modeExec, idUserAuth, IPAddress) {
			@Override protected void onRemove(List<Resource> targetList) throws GeneralFailure {
				not_implemented();				
			}
			@Override protected void onReplace(List<Resource> targetList) throws GeneralFailure {
				not_implemented();
			}
			@Override
			public boolean init() throws GeneralFailure {
				if(!ModeExec.ADD.equals(modeExec))
					throw new GeneralFailure("Only ADD method supported!");				
				if(isSysOrSubsys(idIS))
					idIS =  get_code_is(idIS);	//!!!			
				return true;
			}			
			@Override
			protected void onAdd(List<Resource> resources) throws GeneralFailure {				
				 if(isSysOrSubsys(idIS)){
					LOGGER.debug("sync_resources:idIS2:"+idIS);
					sync_resources_SysOrSubsys_add(idIS, resources);
				 } else if(isGroupSys(idIS)) {
						//группа ИС
					   final Map<String, Long> res_cl=new HashMap<String, Long>();
			    	   sync_resources_GroupSys_add(idIS, resources, res_cl);
				 }		
			}			
		 }).sync(resources);
		 
	 }

	private void sync_resources_GroupSys_add(String idIS,
			List<Resource> resources, Map<String, Long> res_cl)
			throws NumberFormatException, GeneralFailure {
		//имеющиеся ресурсы (подсистемы) у группы систем
		   List<Object[]> lo=
					em.createNativeQuery(
							(new StringBuilder(" select  SYS.SIGN_OBJECT, SYS.ID_SRV, SYS.FULL_, SYS.DESCRIPTION, sys.LINKS from "))
							  .append(" GROUP_SYSTEMS_KNL_T gsys, ") 
							  .append(" AC_IS_BSS_T sys, ") 
							  .append(" LINK_GROUP_SYS_SYS_KNL_T lgr ") 
							  .append(" where GSYS.ID_SRV=LGR.UP_GROUP_SYSTEMS ") 
							  .append(" and LGR.UP_SYSTEMS= SYS.ID_SRV ") 
							  .append(" and GSYS.GROUP_CODE=:idIS ")
					.toString())
		            .setParameter("idIS", idIS)
		   	      	.getResultList();
		   LOGGER.debug("sync_resources:02");
		   
		   for(Object[] objectArray :lo){
			   res_cl.put(objectArray[0]!=null?objectArray[0].toString():"", 
		    			   objectArray[1]!=null? Long.parseLong(objectArray[1].toString()):-1L);
		   }
		   
		   
			 for(Resource resource :resources){
				 
			   if(resource.getCode()==null||"".equals(resource.getCode().trim())){
				   throw new GeneralFailure("Отсутствует код ресурса!");
			   } else
				checkResource(resource);
				 
				 
			   String linksLine=null;
			   
			   if(resource.getLinks()!=null&&!resource.getLinks().isEmpty()){
		        	
		            for(String link :resource.getLinks()){
		    		 if(linksLine==null){
		    			 linksLine=link;
		    		 }else{
		    			 linksLine=linksLine+","+link;
		    		 }
		    		}
			   }
			   
			   if(res_cl.containsKey(resource.getCode())){
				
				   em.createNativeQuery(
						"UPDATE AC_IS_BSS_T sys "
		                 + "set sys.FULL_=?, sys.DESCRIPTION=?, sys.LINKS=?  "
		                 + "where sys.SIGN_OBJECT = ?  ")
			         .setParameter(1, resource.getName())
		             .setParameter(2, resource.getDescription())
		             .setParameter(3, linksLine)
		             .setParameter(4, resource.getCode())
		            
		            .executeUpdate();	 
				   
										   
			   }else{
				   
				 List<?> results = em.createNativeQuery("select AC_IS_BSS_SEQ.nextval from dual ").getResultList();
		            
		         Long newIdRes = ((BigDecimal)results.get(0)).longValue();
		            
				 em.createNativeQuery(
					     "insert into AC_IS_BSS_T(ID_SRV, SIGN_OBJECT, FULL_ , DESCRIPTION, LINKS, CREATOR,  created ) "
		                 + "values(?, ?, ?, ?, ?, 1, sysdate) ")
		         .setParameter(1, newIdRes)
		         .setParameter(2, resource.getCode())
		         .setParameter(3, resource.getName())
		         .setParameter(4, resource.getDescription())
		         .setParameter(5, linksLine)
		         .executeUpdate();
				 
				 
				 em.createNativeQuery(
					     "insert into LINK_GROUP_SYS_SYS_KNL_T(UP_SYSTEMS, UP_GROUP_SYSTEMS, CREATOR, CREATED  ) "
		                 + "values(?, (select gr_sys.ID_SRV from GROUP_SYSTEMS_KNL_T gr_sys where gr_sys.GROUP_CODE = ? ), 1, sysdate) ")
		         .setParameter(1, newIdRes)
		         .setParameter(2, idIS)
		         .executeUpdate();
				 
			  }
			 }
	}

	private void sync_resources_SysOrSubsys_add(String idIS,
			List<Resource> resources) throws GeneralFailure {
		final Resource resource;
		if (resources!=null && (resource = resources.get(0))!=null) {				
		   checkResource(resource);								 
		   final String linksLine = Strings.join(resource.getLinks());							   
			   em.createNativeQuery(
					"UPDATE AC_IS_BSS_T sys "
		              + "set sys.FULL_=?, sys.DESCRIPTION=?, sys.LINKS=?  "
		              + "where sys.SIGN_OBJECT = ?  ")
		         .setParameter(1, resource.getName())
		         .setParameter(2, resource.getDescription())
		         .setParameter(3, linksLine)
		         .setParameter(4, idIS)
		        //!!! .setPara/meter(/4, resourc/e.getCode())				            
		        .executeUpdate();	
		}
	}

	private void checkResource(Resource resource) throws GeneralFailure {
		// закомментировано, т.к. для систем код систем берётся idIS
  /* if(re/source.getCode()==nul/l||reso/urce.getCode().trim().equals("")){
		   throw/ new GeneralFa/ilure("Отсутствует код ресурса!");
   }els/e */
		if(resource.getName()==null||"".equals(resource.getName().trim())){
		   throw new GeneralFailure("Отсутствует название ресурса!");
   }
	}
	
	/**
	 * синхронизация ролей ресурсов
	 */
	public void sync_resources_roles(String idIS, List<String> codesResources,
			List<String> codesRoles, String modeExec, Long idUserAuth,
			String IPAddress) throws GeneralFailure {

		// для систем и подсистем

		// !!!
		// привязка ролей происходит попринципу ADD

		// modeExec:
		// 0 - REPLACE
		// 1 - ADD
		// 2 - REMOVE

		// при REMOVE, если у роли есть пользователи или группы,
		// то выдаём исключение

		// ADD - это ADD или UPDATE

		LOGGER.debug("sync_groups_roles:01");		
		(new ListSyncTX<String>(12L, idIS, modeExec, idUserAuth, IPAddress) {
			List<String> codesRoles;
			@Override
			public boolean init() throws GeneralFailure {
				idIS = get_code_is(idIS); // !!!
				return true;
			}
			public void sync(List<String> codesResources,
					List<String> codesRoles) throws GeneralFailure {
				assertFalse("sync_resources_roles", "Отсутствует список ролей!",
						codesRoles == null || codesRoles.isEmpty());				
				this.codesRoles = codesRoles;
				super.sync(codesResources);
			}
			@Override
			protected void onRemove(List<String> codesResources)
					throws GeneralFailure {
				LOGGER.debug("sync_resources_roles:03");
				for (String resource : codesResources) {
					LOGGER.debug("sync_resources_roles:04:" + resource);
					checkGroupCode(resource);
					try {
						LOGGER.debug("sync_resources_roles:05");
						for (String role_code : codesRoles) {
							em.createNativeQuery(
									(new StringBuilder("DELETE FROM AC_LINK_ROLE_RESOURCE_KNL_T lrr "))
											  .append("where LRR.UP_RESOURCE = ")
											  .append("(select RES.ID_SRV ")
											  .append("from AC_RESOURCES_BSS_T res ")
											  .append("AC_IS_BSS_T app ")
											  .append("where res.UP_IS=APP.ID_SRV ")
											  .append("and APP.SIGN_OBJECT = :sysCode ")
											  .append("and RES.SIGN_OBJECT = :resCode ) ")
											  .append("and lrr.UP_ROLE = ")
											  .append("(select role.ID_SRV from AC_ROLES_BSS_T role, AC_IS_BSS_T sys  ")
											  .append("where SYS.ID_SRV= ROLE.UP_IS and  SYS.SIGN_OBJECT = :sysCode ")
											  .append("and role.SIGN_OBJECT = :roleCode ) ")

									.toString()
									)
									.setParameter("sysCode", idIS)
									.setParameter("roleCode", role_code)
									.setParameter("resCode", resource)
									.executeUpdate();
						}
					} catch (Exception e) {
						LOGGER.error("sync_resources_roles:06");
					}
					 
				}				
			} // onRemove
			@Override
			protected void onReplace(List<String> codesResources) throws GeneralFailure {
				// REPLACE = ALL REMOVE + ADD
				LOGGER.debug("sync_resources_roles:07");
				for (String resource : codesResources) {
					checkGroupCode(resource);
					// 1. REMOVE ALL
					try {
						LOGGER.debug("sync_resources_roles:09");
						em.createNativeQuery(
								(new StringBuilder("DELETE FROM AC_LINK_ROLE_RESOURCE_KNL_T lrr "))
								  .append("where LRR.UP_RESOURCE = ( ")
								  .append("select RES.ID_SRV ")
								  .append("from AC_RESOURCES_BSS_T res, ")
								  .append("AC_IS_BSS_T app ")
								  .append("where res.UP_IS=APP.ID_SRV ")
								  .append("and APP.SIGN_OBJECT = ? ")
								  .append("and  RES.SIGN_OBJECT = ? ) ")
						.toString())
								.setParameter(1, resource)
								.setParameter(2, idIS).executeUpdate();

					} catch (Exception e) {
						LOGGER.error("sync_resources_roles:010");
					}

					// 2.ADD
					for (String role_code : codesRoles) {
						LOGGER.debug("sync_resources_roles:05:" + role_code);
						checkRoleCode(role_code);
						em.createNativeQuery(
								(new StringBuilder("insert into AC_LINK_ROLE_RESOURCE_KNL_T(UP_ROLE, UP_RESOURCE, CREATOR,  created) "))
								  .append("values (")
								  .append("(select role.ID_SRV from AC_ROLES_BSS_T role, AC_IS_BSS_T sys  ")
								  .append("where SYS.ID_SRV= ROLE.UP_IS and  SYS.SIGN_OBJECT = ? ")
								  .append("and role.SIGN_OBJECT = ? ), ")
								  .append("(select ROL.ID_SRV from AC_ROLES_BSS_T rol ")
								  .append("where rol.SIGN_OBJECT = ? ), ?, sysdate) ")
						.toString())
								.setParameter(1, idIS)
								.setParameter(2, role_code)
								.setParameter(3, resource).setParameter(4, 1L)
								.executeUpdate();

					}
				}				
			} // onReplace
			@Override
			protected void onAdd(List<String> codesResources) throws GeneralFailure {
				for (String resource : codesResources) {
					if (resource == null || resource.trim().equals("")) {
						throw new GeneralFailure("Отсутствует код ресурса!");
					}
					List<String> role_cl = new ArrayList<String>();

					// привязка ролей к ресурсу
					LOGGER.debug("sync_resources_roles:03");

					// имеющиеся роли в ресурсе по данной системе
					List<Object[]> lo_roles = em
							.createNativeQuery(
									(new StringBuilder("  SELECT ROL.SIGN_OBJECT, ROL.ID_SRV "))
									  .append("FROM AC_RESOURCES_BSS_T res, ")
									  .append("AC_LINK_ROLE_RESOURCE_KNL_T lgr, ")
									  .append("AC_ROLES_BSS_T rol, ")
									  .append("AC_IS_BSS_T sys ")
									  .append("WHERE  res.ID_SRV = LGR.UP_RESOURCE ")
									  .append("AND LGR.UP_ROLE = ROL.ID_SRV ")
									  .append("AND SYS.SIGN_OBJECT = ? ")
									  .append("AND SYS.ID_SRV = ROL.UP_IS ")
									  .append("AND res.SIGN_OBJECT = ? ")
									  .append("GROUP BY ROL.SIGN_OBJECT, ROL.ID_SRV")
							.toString())
							.setParameter(1, idIS).setParameter(2, resource)
							.getResultList();

					for (Object[] objectArray : lo_roles) {
						role_cl.add(objectArray[0] != null ? objectArray[0]
								.toString() : "");
						LOGGER.debug("sync_resources_roles:04:" + objectArray[0]);

					}

					for (String role_code : codesRoles) {
						LOGGER.debug("sync_resources_roles:05:" + role_code);
						if (!role_cl.contains(role_code)) {
							LOGGER.debug("sync_resources_roles:06");

							em.createNativeQuery(
									(new StringBuilder("insert into AC_LINK_ROLE_RESOURCE_KNL_T(UP_ROLE, UP_RESOURCE, CREATOR,  created) "))
									  .append("values (")
									  .append("(select role.ID_SRV from AC_ROLES_BSS_T role, AC_IS_BSS_T sys  ")
									  .append("where SYS.ID_SRV= ROLE.UP_IS and  SYS.SIGN_OBJECT = ? ")
									  .append("and role.SIGN_OBJECT = ? ), ")
									  .append("(select ROL.ID_SRV from AC_ROLES_BSS_T rol ")
									  .append("where rol.SIGN_OBJECT = ? ), ?, sysdate) ")
							.toString())
									.setParameter(1, idIS)
									.setParameter(2, role_code)
									.setParameter(3, resource)
									.setParameter(4, 1L).executeUpdate();
						}
					}
				}
			} // add			
		}).sync(codesResources, codesRoles);
	}

	/**
	 * проверка наличия системы
	 */
	public void is_exist(String idIS) throws GeneralFailure {
		LOGGER.debug(":is_exist:01");
		try {

			em.createNativeQuery(
					"select APP.ID_SRV " + "from AC_IS_BSS_T app "
							+ "where APP.SIGN_OBJECT=?").setParameter(1, idIS)
					.getSingleResult();

		} catch (NoResultException ex) {
			LOGGER.error("is_exist:NoResultException");
			throw new GeneralFailure("Информационная система не определёна!");
		} catch (Exception e) {
			LOGGER.error("is_exist:Error:", e);
			throw new GeneralFailure(e.getMessage());
		}
	}

	/**
	 * получение кода системы по коду подсистемы
	 */
	private String get_code_is(String codeSys) throws GeneralFailure {

		// позволяет съесть ситуацию, когда имеем код подсистемы,
		// на выходе получаем код системы

		String resultSync = null;

		try {
			resultSync = (String) em
					.createNativeQuery(
							(new StringBuilder("select SYS.SIGN_OBJECT "))
							  .append("from  AC_IS_BSS_T sys, ")
							  .append("AC_SUBSYSTEM_CERT_BSS_T subsys ")
							  .append("where (SYS.SIGN_OBJECT= :codeSys or  SUBSYS.SUBSYSTEM_CODE= :codeSys) ")
							  .append("and  SUBSYS.UP_IS(+) =SYS.ID_SRV ")
							  .append("group by SYS.SIGN_OBJECT ")
					.toString())
					.setParameter("codeSys", codeSys).getSingleResult();

		} catch (NoResultException exSync) {
			LOGGER.error("get_id_is:NoResultException");
			throw new GeneralFailure("System is not defined");
		} catch (Exception eSync) {
			throw new GeneralFailure(eSync.getMessage());
		}
		return resultSync;

	}

	/**
	 * протоколирование действий
	 */
	private void sys_audit(Long idServ, String inp_param, String result,
			String ip_adr, Long idUser) {
		LOGGER.debug("sys_audit:01");
		try {

			if (idUser != null && !idUser.equals(-1L)) {
				em.createNativeQuery(
						(new StringBuilder("insert into SERVICES_LOG_KNL_T( "))
						  .append("ID_SRV,  UP_SERVICES, DATE_ACTION, CREATED, ")
						  .append("input_param, result_value, ip_address, UP_USERS ) ")
						  .append("values(SERVICES_LOG_KNL_SEQ.nextval , ?, sysdate, sysdate, ")
						  .append("?, ?, ?, ? ) ")
				.toString()).setParameter(1, idServ)
						.setParameter(2, inp_param).setParameter(3, result)
						.setParameter(4, ip_adr).setParameter(5, idUser)
						.executeUpdate();
			} else {
				em.createNativeQuery(
						(new StringBuilder("insert into SERVICES_LOG_KNL_T( "))
						  .append("ID_SRV,  UP_SERVICES, DATE_ACTION, CREATED, ")
						  .append("input_param, result_value, ip_address ) ")
						  .append("values(SERVICES_LOG_KNL_SEQ.nextval , ?, sysdate, sysdate, ")
						  .append("?, ?, ? ) ")
				.toString()).setParameter(1, idServ)
						.setParameter(2, inp_param).setParameter(3, result)
						.setParameter(4, ip_adr).executeUpdate();
			}
		} catch (Exception e) {
			LOGGER.error("is_exist:Error:", e);
		}
	}
	private void not_implemented() throws GeneralFailure {
		throw new GeneralFailure("not implemented!");
	}
}
