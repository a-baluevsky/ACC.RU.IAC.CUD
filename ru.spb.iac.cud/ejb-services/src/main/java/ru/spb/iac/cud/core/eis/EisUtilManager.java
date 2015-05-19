package ru.spb.iac.cud.core.eis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.spb.iac.cud.core.UtilManagerLocal;
import ru.spb.iac.cud.core.UtilManagerRemote;
import ru.spb.iac.cud.core.util.CUDConstants;
import ru.spb.iac.cud.exceptions.GeneralFailure;
import ru.spb.iac.cud.items.Group;
import ru.spb.iac.cud.items.GroupsData;
import ru.spb.iac.cud.items.ISOrganisations;
import ru.spb.iac.cud.items.Resource;
import ru.spb.iac.cud.items.ResourceNU;
import ru.spb.iac.cud.items.ResourcesData;
import ru.spb.iac.cud.items.Role;
import ru.spb.iac.cud.items.User;
import ru.spb.iac.cud.items.UsersData;
import ru.spb.iac.cud.util.CommonUtil;

/**
 * EJB для справочного сервиса
 * 
 * @author bubnov
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
 public class EisUtilManager implements UtilManagerLocal, UtilManagerRemote {

	@PersistenceContext(unitName = "AuthServices")
	EntityManager em;

	private static final Integer MAX_CONT_USERS = 50;

	private static final Integer MAX_CONT_USERS_ACCOUNTS = 500;
	
	private static final Integer MAX_CONT_GROUPS = 50;

	private static final Integer MAX_CONT_RES = 50;

	private static final String LINKS_SEPARATOR = ",";

	private static final Logger LOGGER = LoggerFactory.getLogger(EisUtilManager.class);

	private static final String SELECT_ROLE_START =
			(new StringBuilder(" SELECT gr_id, '[' || sys_code || ']' || role_code role_full_code "))
			.append(" FROM ( ")
			.append(" SELECT gr.ID_SRV gr_id, SYS.SIGN_OBJECT sys_code, ROL.SIGN_OBJECT role_code ")
			.append(" FROM AC_IS_BSS_T sys, ")
			.append(" AC_ROLES_BSS_T rol, ")
			.append(" GROUP_USERS_KNL_T gr, ")
			.append(" LINK_GROUP_USERS_ROLES_KNL_T lugr, ")
			.append(" GROUP_SYSTEMS_KNL_T gsys, ")
			.append(" LINK_GROUP_SYS_SYS_KNL_T lgr ")
			.append(" WHERE  ROL.ID_SRV = LUGR.UP_ROLES ")
			.append(" AND LUGR.UP_GROUP_USERS = gr.ID_SRV ")
			.append(" AND ROL.UP_IS = sys.ID_SRV ")
			.append(" AND gr.ID_SRV IN (")
			.toString();
	
	private static final String SELECT_ROLE_END =
						        (new StringBuilder(") "))
								.append(" AND GSYS.GROUP_CODE = :idIS ")
								.append(" AND GSYS.ID_SRV = LGR.UP_GROUP_SYSTEMS ")
								.append(" AND LGR.UP_SYSTEMS = SYS.ID_SRV ")
								.append("GROUP BY gr.ID_SRV, SYS.SIGN_OBJECT, ROL.SIGN_OBJECT ) ")
								.append("ORDER BY gr_id, sys_code ")
						        .toString();
			
	public EisUtilManager() {
	}

	/**
	 * данные по пользователям
	 */
	public UsersData users_data(String idIS, List<String> uidsUsers,
			String category, List<String> rolesCodes, List<String> groupsCodes,
			Integer start, Integer count, List<String> settings,
			Long idUserAuth, String IPAddress) throws GeneralFailure {

		LOGGER.debug("users_data:01");

		// onlyISUsers условие сильнее, чем rolesCodes
		// то есть, если стоит onlyISUsers = false [все пользователи],
		// то rolesCodes уже не учитывается

		Integer resultCount = 0;
		List<User> result = new ArrayList<User>();
		Map<String, User> resultIds = new HashMap<String, User>();
		
		List<Object[]> lo = null;
		
		UsersData isu = new UsersData();

		String rolesLine = null;
		String groupsLine = null;
		String usersIdsLine = null;
	
		try {

			Map<String,String> settingsMap = getSettingsMap(settings);
			
			if (idIS == null) {
				LOGGER.debug("users_data:return:1");
				throw new GeneralFailure("idIS is null!");
			}

			if (count == null ) {				
				count = MAX_CONT_USERS;				
				if("TRUE".equals(settingsMap.get("ACCOUNTS_ONLY"))){
					count = MAX_CONT_USERS_ACCOUNTS;
				}				
			}
			if (start == null) {
				start = 0;
			}

			if (MAX_CONT_USERS < count
					&& !"TRUE".equals(settingsMap.get("ACCOUNTS_ONLY"))) {
				LOGGER.debug("users_data:return:2");
				throw new GeneralFailure(csCountUBoundMsg + MAX_CONT_USERS);
			}

			if (MAX_CONT_USERS_ACCOUNTS < count
					&& "TRUE".equals(settingsMap.get("ACCOUNTS_ONLY"))) {
				LOGGER.debug("users_data:return:32");
				throw new GeneralFailure("'count' with 'ACCOUNTS_ONLY' should be less than "
						+ MAX_CONT_USERS_ACCOUNTS);
			}
			
			LOGGER.debug("users_data:idIS1:" + idIS);

			String uidsLine = null;

            uidsLine = CommonUtil.createLine(uidsUsers);
			

			if (CUDConstants.categorySYS.equals(category) && rolesCodes != null
					&& !rolesCodes.isEmpty()) {

				rolesLine = CommonUtil.createLine(rolesCodes);
			
			}

			if (
			groupsCodes != null && !groupsCodes.isEmpty()) {

				groupsLine = CommonUtil.createLine(groupsCodes);
				
			
			}

			if (idIS.startsWith(CUDConstants.armPrefix)
					|| idIS.startsWith(CUDConstants.subArmPrefix)) {

				
				// !!!
				idIS = getCodeIs(idIS);

				LOGGER.debug("is_users:idIS2:" + idIS);

				String filterSt = null;

				if (rolesLine != null && groupsLine != null) {
					filterSt = "and( " + "((ROL.SIGN_OBJECT IN (" 
							+ rolesLine
							+ ") and ais.SIGN_OBJECT = :idIS)  "
							+ "   or (ROL_group.SIGN_OBJECT IN (" 
							+ rolesLine
							+ " )  and ais_group.SIGN_OBJECT = :idIS) ) "
							+ "or (GR.SIGN_OBJECT IN (" 
							+ groupsLine 
							+ ") ) "
							+ ") ";
				} else if (rolesLine != null) {

					filterSt = "and " + "((ROL.SIGN_OBJECT IN (" + rolesLine
							+ ") and ais.SIGN_OBJECT = :idIS) "
							+ "   or (ROL_group.SIGN_OBJECT IN (" + rolesLine
							+ " )  and ais_group.SIGN_OBJECT = :idIS) ) ";
				} else if (groupsLine != null) {
					filterSt = "and " + "GR.SIGN_OBJECT IN (" + groupsLine
							+ ") ";
				}

				// системы и подсистемы
				// 1.пользователи

				lo = em.createNativeQuery(
						(new StringBuilder("select t1.t1_id, t1.t1_login, t1.t1_cert, t1.t1_usr_code, t1.t1_fio, t1.t1_tel, t1.t1_email,t1.t1_pos, t1.t1_dep_name, "))
						  .append("t1.t1_org_code, t1.t1_org_name, t1.t1_org_adr, t1.t1_org_tel, t1.t1_start, t1.t1_end, t1.t1_status, ")
						  .append("t1.t1_crt_date, t1.t1_crt_usr_login, t1.t1_upd_date, t1.t1_upd_usr_login, ")
						  .append("t1.t1_dep_code, t1.t1_org_status, t1.t1_usr_status, t1.t1_dep_status, t1.t1_org_okato, t1.t1_dep_adr ")
						  .append("from( ")
						  .append("select AU_FULL.ID_SRV t1_id, AU_FULL.login t1_login, AU_FULL.CERTIFICATE t1_cert, t2.CL_USR_CODE t1_usr_code, ")
						  .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.SURNAME||' '||AU_FULL.NAME_ ||' '|| AU_FULL.PATRONYMIC,  CL_USR_FULL.FIO ) t1_fio, ")
						  .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.PHONE, CL_USR_FULL.PHONE ) t1_tel, ")
						  .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.E_MAIL, CL_USR_FULL.EMAIL) t1_email, ")
						  .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.POSITION, CL_USR_FULL.POSITION)t1_pos, ")
						  .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.DEPARTMENT, decode(substr(CL_DEP_FULL.sign_object,4,2), '00', null, CL_DEP_FULL.FULL_)) t1_dep_name, ")
						  .append("t1.CL_ORG_CODE t1_org_code, CL_ORG_FULL.FULL_ t1_org_name, ")
						  .append("CL_ORG_FULL.PREFIX || decode(CL_ORG_FULL.HOUSE, null, null, ','  ||CL_ORG_FULL.HOUSE  ) t1_org_adr, ")
						  .append("CL_ORG_FULL.PHONE t1_org_tel, ")
						  .append("to_char(AU_FULL.START_ACCOUNT, 'DD.MM.YY HH24:MI:SS') t1_start, ")
						  .append("to_char(AU_FULL.END_ACCOUNT, 'DD.MM.YY HH24:MI:SS') t1_end, ")
						  .append("AU_FULL.STATUS t1_status, ")
						  .append("AU_FULL.CREATED t1_crt_date, ")
						  .append("USR_CRT.LOGIN t1_crt_usr_login, ")
						  .append("to_char(AU_FULL.MODIFIED, 'DD.MM.YY HH24:MI:SS') t1_upd_date, ")
						  .append("USR_UPD.LOGIN t1_upd_usr_login, ")
						  .append("decode(AU_FULL.UP_SIGN_USER, null, null, decode(substr(CL_DEP_FULL.sign_object,4,2), '00', null, CL_DEP_FULL.sign_object)) t1_dep_code, ")
						  .append("CL_ORG_FULL.STATUS t1_org_status,  CL_usr_FULL.STATUS t1_usr_status, ")
						  .append("decode(AU_FULL.UP_SIGN_USER, null, null, decode(substr(CL_DEP_FULL.sign_object,4,2), '00', null, CL_DEP_FULL.STATUS)) t1_dep_status, ")
						  .append("CL_ORG_FULL.SIGN_OKATO t1_org_okato, CL_DEP_FULL.PREFIX || decode(CL_DEP_FULL.HOUSE, null, null, ','  ||CL_DEP_FULL.HOUSE  ) t1_dep_adr  ")
						  .append("from ")
						  .append("(select max(CL_ORG.ID_SRV) CL_ORG_ID,  CL_ORG.SIGN_OBJECT  CL_ORG_CODE ")
						  .append("from ISP_BSS_T cl_org, ")
						  .append("AC_USERS_KNL_T au ")
						  .append("where AU.UP_SIGN = CL_ORG.SIGN_OBJECT ")
						  .append("group by CL_ORG.SIGN_OBJECT) t1, ")
						  .append("(select max(CL_usr.ID_SRV) CL_USR_ID,  CL_USR.SIGN_OBJECT  CL_USR_CODE ")
						  .append("from ISP_BSS_T cl_usr, ")
						  .append("AC_USERS_KNL_T au ")
						  .append("where AU.UP_SIGN_USER  = CL_usr.SIGN_OBJECT ")
						  .append("group by CL_usr.SIGN_OBJECT) t2, ")
						  .append("(select max(CL_dep.ID_SRV) CL_DEP_ID,  CL_DEP.SIGN_OBJECT  CL_DEP_CODE ")
						  .append("from ISP_BSS_T cl_dep, ")
						  .append("AC_USERS_KNL_T au  ")
						  .append("where substr(au.UP_SIGN_USER,1,5)||'000'  =cl_dep.SIGN_OBJECT(+) ")
						  .append("group by CL_DEP.SIGN_OBJECT) t3, ")
						  .append("( ")
						  // core-1-
						  .append("select t_core.t_core_id ")
						  .append("from( ")
						  .append("select AU_FULL.ID_SRV t_core_id ")
						  .append("from ")
						  .append("AC_USERS_KNL_T au_full, ")
						  .append("LINK_GROUP_USERS_USERS_KNL_T lgu, ")
						  .append("AC_USERS_LINK_KNL_T lur, ")
						  .append("AC_ROLES_BSS_T rol, ")
						  .append("AC_ROLES_BSS_T rol_group, ")
						  .append("LINK_GROUP_USERS_ROLES_KNL_T lgr, ")
						  .append("AC_IS_BSS_T ais, ")
						  .append("AC_IS_BSS_T ais_group, ")
						  .append("GROUP_USERS_KNL_T gr ")
						  .append("where ")
						  .append("lur.UP_USERS(+)=AU_FULL.ID_SRV and ")
						  .append("lgu.UP_USERS(+)=AU_FULL.ID_SRV ")
						  .append("and ROL.ID_SRV(+)=LUR.UP_ROLES ")
						  .append("and lgr.UP_GROUP_USERS(+)=GR.ID_SRV ")
						  .append("and lgu.UP_GROUP_USERS=GR.ID_SRV(+) ")
						  .append("and rol_group.ID_SRV(+) =LGR.UP_ROLES ")
						  .append("and ROL.UP_IS=ais.ID_SRV(+) ")
						  .append("and ROL_group.UP_IS=ais_group.ID_SRV(+) ")
						  .append("and (ais.SIGN_OBJECT  = :idIS ")
						  .append("or ais_group.SIGN_OBJECT = :idIS ")
						  .append("or -1 = :onlyISUsers ) ")
						  .append("and to_char(au_full.ID_SRV) in ("+ uidsLine + ") ")
						  .append(filterSt != null ? filterSt : " ")

						  .append("order by t_core_id ")
						  .append(")t_core ")
						  .append("group by t_core_id ")
						  .append("order by t_core.t_core_id ")
								// core-2-
								  .append("ISP_BSS_T cl_org_full, ")
								  .append("ISP_BSS_T cl_usr_full, ")
								  .append("ISP_BSS_T cl_dep_full, ")
								  .append("AC_USERS_KNL_T au_full, ")
								  .append("AC_USERS_KNL_T usr_crt, ")
								  .append("AC_USERS_KNL_T usr_upd ")
								  .append("where cl_org_full.ID_SRV= CL_ORG_ID ")
								  .append("and cl_usr_full.ID_SRV(+)=CL_USR_ID ")
								  .append("and cl_DEP_full.ID_SRV(+)=CL_DEP_ID ")
								  .append("and au_full.UP_SIGN = CL_ORG_CODE ")
								  .append("and au_full.UP_SIGN_USER  =  CL_USR_CODE(+) ")
								  .append("and substr(au_full.UP_SIGN_USER,1,5)||'000'  =  CL_DEP_CODE(+) ")
								  .append("and au_full.CREATOR=USR_CRT.ID_SRV ")
								  .append("and au_full.MODIFICATOR=USR_UPD.ID_SRV(+) ")
								  .append("and AU_FULL.ID_SRV=t4.t_core_id ")
								  .append(")t1 ")
								  .append("where 1=1 ")
								  .append(settingsMap.containsKey("FILTER_FIO") ? 
										 " and upper(t1_fio) LIKE  upper('%"+settingsMap.get("FILTER_FIO")+"%')" : "")
								  .append(settingsMap.containsKey("FILTER_ORG") ? 
										 " and upper(t1_org_name) LIKE  upper('%"+settingsMap.get("FILTER_ORG")+"%')" : "")
								.append("order by t1_fio ")
								.toString())
						.setParameter("idIS", idIS)
						.setParameter(
								"onlyISUsers",
								CUDConstants.categorySYS.equals(category) ? 1
										: -1)
						.setFirstResult(start.intValue())
						.setMaxResults(count.intValue())
						.getResultList();

				usersIdsLine = CommonUtil.createAttributes(lo,  result, resultIds);
			
				

				LOGGER.debug("users_data:02");

				// 2.роли

			if(!"TRUE".equals(settingsMap.get("ACCOUNTS_ONLY"))){
				
				lo = em.createNativeQuery(
						(new StringBuilder("select AU.ID_SRV, ROL.SIGN_OBJECT "))
						  .append("from  AC_IS_BSS_T sys, ")
						  .append(" AC_ROLES_BSS_T rol, ")
						  .append(" AC_USERS_LINK_KNL_T url, ")
						  .append(" AC_USERS_KNL_T AU, ")
						  .append(" AC_SUBSYSTEM_CERT_BSS_T subsys, ")
						  .append(" LINK_GROUP_USERS_ROLES_KNL_T lugr, ")
						  .append(" LINK_GROUP_USERS_USERS_KNL_T lugu ")
						  .append("where (SYS.SIGN_OBJECT= :idIS or  SUBSYS.SUBSYSTEM_CODE=:idIS) ")
						  .append(" and (ROL.ID_SRV = URL.UP_ROLES or ROL.ID_SRV = LUGR.UP_ROLES )  ")
						  .append(" and LUGU.UP_GROUP_USERS= LUGR.UP_GROUP_USERS(+)  ")
						  .append(" and LUGU.UP_USERS(+)  = AU.ID_SRV  ")
						  .append(" and URL.UP_USERS(+)  = AU.ID_SRV ")
						  .append(" and ROL.UP_IS=sys.ID_SRV   ")
						  .append(" and AU.ID_SRV IN(")
						  .append(usersIdsLine)
						  .append(")  ")
						  .append(" and  SUBSYS.UP_IS(+) =SYS.ID_SRV  ")
						  .append("group by AU.ID_SRV, ROL.SIGN_OBJECT  ")
						  .append("order by AU.ID_SRV, ROL.SIGN_OBJECT ")						  
						  .toString()
						)
						.setParameter("idIS", idIS).getResultList();

				for (Object[] objectArrayRoles : lo) {

					if (resultIds.get(objectArrayRoles[0].toString()).getCodesRoles() == null) {
						resultIds.get(objectArrayRoles[0].toString()).setCodesRoles(new ArrayList<String>());
					}

					resultIds.get(objectArrayRoles[0].toString()).getCodesRoles().add(objectArrayRoles[1].toString());
				}

				// 3 .группы
				lo = em.createNativeQuery(
						(new StringBuilder("select LGU.UP_USERS, GR.SIGN_OBJECT "))
						  .append(" from  GROUP_USERS_KNL_T gr, ")
						  .append(" LINK_GROUP_USERS_USERS_KNL_T lgu ")
						  .append(" where LGU.UP_GROUP_USERS=GR.ID_SRV ")
						  .append(" and  LGU.UP_USERS in (")
						  .append(usersIdsLine)
						  .append(") ")
						  .append(" order by LGU.UP_USERS, GR.SIGN_OBJECT ")						  
						  .toString()
						).getResultList();

				for (Object[] objectArrayGroups : lo) {

					if (resultIds.get(objectArrayGroups[0].toString()).getCodesGroups() == null) {
						resultIds.get(objectArrayGroups[0].toString()).setCodesGroups(new ArrayList<String>());
					}

					if(objectArrayGroups[1]!=null){
					  resultIds.get(objectArrayGroups[0].toString()).getCodesGroups().add(objectArrayGroups[1].toString());
					}

				}

			}
				
				
				// 4.количество

				LOGGER.debug("users_data:03");

			if(!"TRUE".equals(settingsMap.get("ACCOUNTS_ONLY"))){	
				resultCount = ((java.math.BigDecimal) em
						.createNativeQuery(
						 (new StringBuilder("select count(*) from ( "))
									.append("select t_core.t_core_id ")
									.append("from( ")
									.append("select AU_FULL.ID_SRV t_core_id ")
									.append("from ")
									.append("AC_USERS_KNL_T au_full, ")
									.append("LINK_GROUP_USERS_USERS_KNL_T lgu, ")
									.append("AC_USERS_LINK_KNL_T lur, ")
									.append("AC_ROLES_BSS_T rol, ")
									.append("AC_ROLES_BSS_T rol_group, ")
									.append("LINK_GROUP_USERS_ROLES_KNL_T lgr, ")
									.append("AC_IS_BSS_T ais, ")
									.append("AC_IS_BSS_T ais_group, ")
									.append("GROUP_USERS_KNL_T gr ")
									.append("where ")
									.append("lur.UP_USERS(+)=AU_FULL.ID_SRV and ")
									.append("lgu.UP_USERS(+)=AU_FULL.ID_SRV ")
									.append("and ROL.ID_SRV(+)=LUR.UP_ROLES ")
									.append("and lgr.UP_GROUP_USERS(+)=GR.ID_SRV ")
									.append("and lgu.UP_GROUP_USERS=GR.ID_SRV(+) ")
									.append("and rol_group.ID_SRV(+) =LGR.UP_ROLES ")
									.append("and ROL.UP_IS=ais.ID_SRV(+) ")
									.append("and ROL_group.UP_IS=ais_group.ID_SRV(+) ")
									.append("and (ais.SIGN_OBJECT  = :idIS ")
									.append("or ais_group.SIGN_OBJECT = :idIS ")
									.append("or -1 = :onlyISUsers ) ")
									.append("and to_char(au_full.ID_SRV) in (").append(uidsLine).append(") ")
									.append(filterSt != null ? filterSt : " ")
									.append("order by t_core_id " + ")t_core ")
									.append("group by t_core_id ")
									.append("order by t_core.t_core_id ")
									.append(" )").toString()												
							)
						.setParameter("idIS", idIS)
						.setParameter("onlyISUsers",
								CUDConstants.categorySYS.equals(category) ? 1: -1).getSingleResult()).intValue();
			   }else{
				   
				   resultCount =  result.size();
				   
				   LOGGER.debug("users_data:count:01_1:"+resultCount);
				   LOGGER.debug("users_data:count:01_2:"+count);
				   
				   if (resultCount.intValue()==count.intValue()){
					   //записей на самом деле больше чем count
					   //поэтому нужен подсчёт через запрос
				   
				   resultCount = ((java.math.BigDecimal) em
							.createNativeQuery(
									(new StringBuilder("SELECT COUNT (*) "))
									  .append(" FROM (  SELECT t1.t1_fio, t1.t1_org_name ") 
									  .append("  FROM (SELECT DECODE ( ") 
									     .append("   AU_FULL.UP_SIGN_USER, ") 
									     .append("   NULL,    AU_FULL.SURNAME ") 
									           .append("   || ' ' ") 
									           .append("   || AU_FULL.NAME_ ") 
									           .append("   || ' ' ") 
									           .append("   || AU_FULL.PATRONYMIC, ") 
									     .append("   CL_USR_FULL.FIO) ") 
									     .append("   t1_fio, ") 
									  .append("   t1.CL_ORG_CODE t1_org_code, ") 
									  .append("   CL_ORG_FULL.FULL_ t1_org_name ") 
									  .append("  FROM (  SELECT MAX (CL_ORG.ID_SRV) CL_ORG_ID, ") 
									              .append(" CL_ORG.SIGN_OBJECT CL_ORG_CODE ") 
									        .append("  FROM ISP_BSS_T cl_org, AC_USERS_KNL_T au ") 
									        .append(" WHERE AU.UP_SIGN = CL_ORG.SIGN_OBJECT ") 
									     .append(" GROUP BY CL_ORG.SIGN_OBJECT) t1, ") 
									  .append("   (  SELECT MAX (CL_usr.ID_SRV) CL_USR_ID, ") 
									              .append(" CL_USR.SIGN_OBJECT CL_USR_CODE ") 
									        .append("  FROM ISP_BSS_T cl_usr, AC_USERS_KNL_T au ") 
									        .append(" WHERE AU.UP_SIGN_USER = CL_usr.SIGN_OBJECT ") 
									     .append(" GROUP BY CL_usr.SIGN_OBJECT) t2, ") 
									  .append("   (  SELECT t_core.t_core_id ") 
									        .append("  FROM (  SELECT AU_FULL.ID_SRV t_core_id ") 
									                 .append("   FROM AC_USERS_KNL_T au_full, ") 
									                       .append("  LINK_GROUP_USERS_USERS_KNL_T lgu, ") 
									                       .append("  AC_USERS_LINK_KNL_T lur, ") 
									                       .append("  AC_ROLES_BSS_T rol, ") 
									                       .append("  AC_ROLES_BSS_T rol_group, ") 
									                       .append("  LINK_GROUP_USERS_ROLES_KNL_T lgr, ") 
									                       .append("  AC_IS_BSS_T ais, ") 
									                       .append("  AC_IS_BSS_T ais_group, ") 
									                       .append("  GROUP_USERS_KNL_T gr ") 
									                 .append("  WHERE     lur.UP_USERS(+) = AU_FULL.ID_SRV ") 
									                       .append("  AND lgu.UP_USERS(+) = AU_FULL.ID_SRV ") 
									                       .append("  AND ROL.ID_SRV(+) = LUR.UP_ROLES ") 
									                       .append("  AND lgr.UP_GROUP_USERS(+) = GR.ID_SRV ") 
									                       .append("  AND lgu.UP_GROUP_USERS = GR.ID_SRV(+) ") 
									                       .append("  AND rol_group.ID_SRV(+) = LGR.UP_ROLES ") 
									                       .append("  AND ROL.UP_IS = ais.ID_SRV(+) ") 
									                       .append("  AND ROL_group.UP_IS = ") 
									                       .append("         ais_group.ID_SRV(+) ") 
									                 .append(" and (ais.SIGN_OBJECT  = :idIS ") 
									                 .append(" or ais_group.SIGN_OBJECT = :idIS ") 
									                 .append(" or -1 = :onlyISUsers )  ")
									 .append(uidsLine != null ? "and to_char(au_full.ID_SRV) in ("
											+ uidsLine + ") "
											: " ")
											.append(filterSt != null ? filterSt : " ")
									  .append("   ORDER BY t_core_id) t_core ") 
									     .append(" GROUP BY t_core_id ") 
									     .append(" ORDER BY t_core.t_core_id) t4, ") 
									  .append("   ISP_BSS_T cl_org_full, ") 
									  .append("   ISP_BSS_T cl_usr_full, ") 
									  .append("   AC_USERS_KNL_T au_full, ") 
									  .append("   AC_USERS_KNL_T usr_crt, ") 
									  .append("   AC_USERS_KNL_T usr_upd ") 
									  .append(" WHERE     cl_org_full.ID_SRV = CL_ORG_ID ") 
									  .append("   AND cl_usr_full.ID_SRV(+) = CL_USR_ID ") 
									  .append("   AND au_full.UP_SIGN = CL_ORG_CODE ") 
									  .append("   AND au_full.UP_SIGN_USER = CL_USR_CODE(+) ") 
									  .append("   AND au_full.CREATOR = USR_CRT.ID_SRV ") 
									  .append("   AND au_full.MODIFICATOR = USR_UPD.ID_SRV(+) ") 
									  .append("   AND AU_FULL.ID_SRV = t4.t_core_id) t1 ") 
									  .append(" WHERE 1 = 1 ")
									.append(settingsMap.containsKey("FILTER_FIO") ? 
											 " and upper(t1_fio) LIKE  upper('%"+settingsMap.get("FILTER_FIO")+"%')" : "")
									.append(settingsMap.containsKey("FILTER_ORG") ? 
											 " and upper(t1_org_name) LIKE  upper('%"+settingsMap.get("FILTER_ORG")+"%')" : "") 
									.append(" ) ")
									.toString()
									)
							.setParameter("idIS", idIS)
							.setParameter("onlyISUsers",
									CUDConstants.categorySYS.equals(category) ? 1: -1).getSingleResult()).intValue();
				   }
				   
			   }
			
			} else if (idIS.startsWith(CUDConstants.groupArmPrefix)) {

				String filterSt = null;

				if (rolesLine != null && groupsLine != null) {
					filterSt = "and( " + "((ROL.SIGN_OBJECT IN (" + rolesLine
							+ ") and ais.SIGN_OBJECT = :idIS)  "
							+ "   or (ROL_group.SIGN_OBJECT IN (" + rolesLine
							+ " )  and LINKSYSGROUP.UP_SYSTEMS=AIS.ID_SRV) ) "
							+ "or (GR.SIGN_OBJECT IN (" + groupsLine + ") ) ) "
							;
				} else if (rolesLine != null) {

					filterSt = "and " + "((ROL.SIGN_OBJECT IN (" + rolesLine
							+ ") and LINKSYSGROUP.UP_SYSTEMS=AIS.ID_SRV) "
							+ "   or (ROL_group.SIGN_OBJECT IN (" + rolesLine
							+ " ) and  LINKSYSGROUP.UP_SYSTEMS=AIS.ID_SRV) ) ";
				} else if (groupsLine != null) {
					filterSt = "and " + "GR.SIGN_OBJECT IN (" + groupsLine + ") ";
				}

				// группы
				// 1. пользователи

				LOGGER.debug("users_data:05+");

				lo = em.createNativeQuery(
						(new StringBuilder("select t1.t1_id, t1.t1_login, t1.t1_cert, t1.t1_usr_code, t1.t1_fio, t1.t1_tel, t1.t1_email,t1.t1_pos, t1.t1_dep_name,  "))
						  .append(" t1.t1_org_code, t1.t1_org_name, t1.t1_org_adr, t1.t1_org_tel, t1.t1_start, t1.t1_end, t1.t1_status,  ")
						  .append(" t1.t1_crt_date, t1.t1_crt_usr_login, t1.t1_upd_date, t1.t1_upd_usr_login,  ")
						  .append(" t1.t1_dep_code, t1.t1_org_status, t1.t1_usr_status, t1.t1_dep_status, t1.t1_org_okato, t1.t1_dep_adr   ")
						  .append(" from( ")
						  .append(" select AU_FULL.ID_SRV t1_id, AU_FULL.login t1_login, AU_FULL.CERTIFICATE t1_cert, t2.CL_USR_CODE t1_usr_code,  ")
						  .append(" decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.SURNAME||' '||AU_FULL.NAME_ ||' '|| AU_FULL.PATRONYMIC,  CL_USR_FULL.FIO ) t1_fio,    ")
						  .append(" decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.PHONE, CL_USR_FULL.PHONE ) t1_tel,     ")
						  .append(" decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.E_MAIL, CL_USR_FULL.EMAIL) t1_email,    ")
						  .append(" decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.POSITION, CL_USR_FULL.POSITION)t1_pos,    ")
						  .append(" decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.DEPARTMENT, decode(substr(CL_DEP_FULL.sign_object,4,2), '00', null, CL_DEP_FULL.FULL_)) t1_dep_name,   ")
						  .append(" t1.CL_ORG_CODE t1_org_code, CL_ORG_FULL.FULL_ t1_org_name,  ")
						  .append(" CL_ORG_FULL.PREFIX || decode(CL_ORG_FULL.HOUSE, null, null, ','  ||CL_ORG_FULL.HOUSE  ) t1_org_adr,  ")
						  .append(" CL_ORG_FULL.PHONE t1_org_tel,  ")
						  .append(" to_char(AU_FULL.START_ACCOUNT, 'DD.MM.YY HH24:MI:SS') t1_start,   ")
						  .append(" to_char(AU_FULL.END_ACCOUNT, 'DD.MM.YY HH24:MI:SS') t1_end,    ")
						  .append(" AU_FULL.STATUS t1_status,    ")
						  .append(" AU_FULL.CREATED t1_crt_date,   ")
						  .append(" USR_CRT.LOGIN t1_crt_usr_login,   ")
						  .append(" to_char(AU_FULL.MODIFIED, 'DD.MM.YY HH24:MI:SS') t1_upd_date,   ")
						  .append(" USR_UPD.LOGIN t1_upd_usr_login,   ")
						  .append(" decode(AU_FULL.UP_SIGN_USER, null, null, decode(substr(CL_DEP_FULL.sign_object,4,2), '00', null, CL_DEP_FULL.sign_object)) t1_dep_code,   ")
						  .append(" CL_ORG_FULL.STATUS t1_org_status,  CL_usr_FULL.STATUS t1_usr_status,   ")
						  .append(" decode(AU_FULL.UP_SIGN_USER, null, null, decode(substr(CL_DEP_FULL.sign_object,4,2), '00', null, CL_DEP_FULL.STATUS)) t1_dep_status,  ")
						  .append(" CL_ORG_FULL.SIGN_OKATO t1_org_okato, CL_DEP_FULL.PREFIX || decode(CL_DEP_FULL.HOUSE, null, null, ','  ||CL_DEP_FULL.HOUSE  ) t1_dep_adr        ")
						  .append(" from  ")
						  .append(" (select max(CL_ORG.ID_SRV) CL_ORG_ID,  CL_ORG.SIGN_OBJECT  CL_ORG_CODE  ")
						  .append(" from ISP_BSS_T cl_org,  ")
						  .append(" AC_USERS_KNL_T au  ")
						  .append(" where AU.UP_SIGN = CL_ORG.SIGN_OBJECT  ")
						  .append(" group by CL_ORG.SIGN_OBJECT) t1,  ")
						  .append(" (select max(CL_usr.ID_SRV) CL_USR_ID,  CL_USR.SIGN_OBJECT  CL_USR_CODE  ")
						  .append(" from ISP_BSS_T cl_usr,  ")
						  .append(" AC_USERS_KNL_T au  ")
						  .append(" where AU.UP_SIGN_USER  = CL_usr.SIGN_OBJECT  ")
						  .append(" group by CL_usr.SIGN_OBJECT) t2,  ")
						  .append(" (select max(CL_dep.ID_SRV) CL_DEP_ID,  CL_DEP.SIGN_OBJECT  CL_DEP_CODE  ")
						  .append(" from ISP_BSS_T cl_dep,  ")
						  .append(" AC_USERS_KNL_T au  ")
						  .append(" where substr(au.UP_SIGN_USER,1,5)||'000'  =cl_dep.SIGN_OBJECT(+)  ")
						  .append(" group by CL_DEP.SIGN_OBJECT) t3,  ")
						  .append(" (  ")
						  .append(" ")
						  .append(" select t_core.t_core_id  ")
						  .append(" from(   ")
						  .append(" select AU_FULL.ID_SRV t_core_id   ")
						  .append(" from   ")
						  .append(" AC_USERS_KNL_T au_full,   ")
						  .append(" LINK_GROUP_USERS_USERS_KNL_T lgu,   ")
						  .append(" AC_USERS_LINK_KNL_T lur,  ")
						  .append(" AC_ROLES_BSS_T rol,  ")
						  .append(" AC_ROLES_BSS_T rol_group,  ")
						  .append(" LINK_GROUP_USERS_ROLES_KNL_T lgr,  ")
						  .append(" AC_IS_BSS_T ais,  ")
						  .append(" AC_IS_BSS_T ais_group, ")
						  .append(" GROUP_SYSTEMS_KNL_T sysgroup, ")
						  .append(" LINK_GROUP_SYS_SYS_KNL_T linksysgroup, ")
						  .append(" GROUP_USERS_KNL_T gr ")
						  .append(" where  ")
						  .append(" lur.UP_USERS(+)=AU_FULL.ID_SRV and  ")
						  .append(" lgu.UP_USERS(+)=AU_FULL.ID_SRV  ")
						  .append(" and ROL.ID_SRV(+)=LUR.UP_ROLES  ")
								// "                        and lgr.UP_GROUP_USERS(+)=lgu.UP_GROUP_USERS  "
								// +				
							  .append("and lgr.UP_GROUP_USERS(+)=GR.ID_SRV ")
							  .append("and lgu.UP_GROUP_USERS=GR.ID_SRV(+) ")
							  .append(" and rol_group.ID_SRV(+) =LGR.UP_ROLES  ")
							  .append(" and ROL.UP_IS=ais.ID_SRV(+)   ")
							  .append(" and ROL_group.UP_IS=ais_group.ID_SRV(+)   ")
							  .append(" and SYSGROUP.ID_SRV = LINKSYSGROUP.UP_GROUP_SYSTEMS ")
							  .append(" and ( ")
							  .append(" (LINKSYSGROUP.UP_SYSTEMS=AIS.ID_SRV ")
							  .append(" or LINKSYSGROUP.UP_SYSTEMS=AIS_GROUP.ID_SRV) ")
							  .append(" and SYSGROUP.GROUP_CODE = :idIS ")
							  .append(" or -1 = :onlyISUsers   ")
							  .append(" ) ")		
							  .append(uidsLine != null ? "and to_char(au_full.ID_SRV) in ("
										+ uidsLine + ") "
										: " ")
							  .append(filterSt != null ? filterSt : " ")						  
								  .append(" order by t_core_id  ")
								  .append(" )t_core   ")
								  .append(" group by t_core_id  ")
								  .append(" order by t_core.t_core_id  ")
								  .append(" ")
								  .append(" ) t4, ")
								  .append(" ")
								  .append(" ISP_BSS_T cl_org_full,  ")
								  .append(" ISP_BSS_T cl_usr_full,  ")
								  .append(" ISP_BSS_T cl_dep_full,  ")
								  .append(" AC_USERS_KNL_T au_full,  ")
								  .append(" AC_USERS_KNL_T usr_crt,    ")
								  .append(" AC_USERS_KNL_T usr_upd ")
								  .append(" where cl_org_full.ID_SRV= CL_ORG_ID  ")
								  .append(" and cl_usr_full.ID_SRV(+)=CL_USR_ID ")
								  .append(" and cl_DEP_full.ID_SRV(+)=CL_DEP_ID  ")
								  .append(" and au_full.UP_SIGN = CL_ORG_CODE  ")
								  .append(" and au_full.UP_SIGN_USER  =  CL_USR_CODE(+)  ")
								  .append(" and substr(au_full.UP_SIGN_USER,1,5)||'000'  =  CL_DEP_CODE(+)  ")
								  .append(" and au_full.CREATOR=USR_CRT.ID_SRV   ")
								  .append(" and au_full.MODIFICATOR=USR_UPD.ID_SRV(+)   ")
								  .append(" and AU_FULL.ID_SRV=t4.t_core_id ")
								  .append(" )t1  ")
								  .append("where 1=1 ")
								  .append(settingsMap.containsKey("FILTER_FIO") ? 
										  " and upper(t1_fio) LIKE  upper('%"+settingsMap.get("FILTER_FIO")+"%')" : "")									
								  .append(settingsMap.containsKey("FILTER_ORG") ? 
										  " and upper(t1_org_name) LIKE  upper('%"+settingsMap.get("FILTER_ORG")+"%')" : "")
								  .append(" order by t1_fio   ")
								  .toString()								
						 )
						.setParameter("idIS", idIS)
						.setParameter(
								"onlyISUsers",
								CUDConstants.categorySYS.equals(category) ? 1
										: -1)
						.setFirstResult(start != null ? start.intValue() : 0)
						.setMaxResults(count.intValue())
						.getResultList();

				usersIdsLine = CommonUtil.createAttributes(lo,  result, resultIds);
				
				LOGGER.debug("users_data:04");

				// 2. роли
			if(!"TRUE".equals(settingsMap.get("ACCOUNTS_ONLY"))){
				lo = em.createNativeQuery(
						(new StringBuilder("SELECT user_id, '[' || sys_code || ']' || role_code role_full_code "))
						  .append("FROM (  SELECT AU.ID_SRV user_id, SYS.SIGN_OBJECT sys_code, ROL.SIGN_OBJECT role_code ")
						  .append("FROM GROUP_SYSTEMS_KNL_T gsys, ")
						  .append(" AC_IS_BSS_T sys, ")
						  .append(" AC_ROLES_BSS_T rol, ")
						  .append(" LINK_GROUP_SYS_SYS_KNL_T lgr, ")
						  .append(" LINK_GROUP_USERS_ROLES_KNL_T lugr, ")
						  .append(" LINK_GROUP_USERS_USERS_KNL_T lugu, ")
						  .append(" AC_USERS_LINK_KNL_T url, ")
						  .append(" AC_USERS_KNL_T AU ")
						  .append("WHERE     GSYS.GROUP_CODE = :idIS ")
						  .append(" AND GSYS.ID_SRV = LGR.UP_GROUP_SYSTEMS ")
						  .append(" AND LGR.UP_SYSTEMS = SYS.ID_SRV ")
						  .append(" AND ROL.UP_IS = SYS.ID_SRV ")
						  .append(" AND (ROL.ID_SRV = URL.UP_ROLES OR ROL.ID_SRV = LUGR.UP_ROLES) ")
						  .append(" AND LUGU.UP_GROUP_USERS = LUGR.UP_GROUP_USERS(+) ")
						  .append(" AND LUGU.UP_USERS(+) = AU.ID_SRV ")
						  .append(" AND URL.UP_USERS(+) = AU.ID_SRV ")
						  .append(" and AU.ID_SRV IN(")
						  .append(usersIdsLine)
						  .append(")  ")
						  .append("GROUP BY AU.ID_SRV, SYS.SIGN_OBJECT, ROL.SIGN_OBJECT) ")
						  .append("ORDER BY user_id, sys_code ")
						  .toString()	
						)
						.setParameter("idIS", idIS).getResultList();

				for (Object[] objectArray : lo) {

					if (resultIds.get(objectArray[0].toString())
							.getCodesRoles() == null) {
						resultIds.get(objectArray[0].toString())
								.setCodesRoles(new ArrayList<String>());
					}

					resultIds.get(objectArray[0].toString()).getCodesRoles()
							.add(objectArray[1].toString());
				}

				// 3.группы

				lo = em.createNativeQuery(
						(new StringBuilder("select LGU.UP_USERS, GR.SIGN_OBJECT "))
						  .append("from  GROUP_USERS_KNL_T gr, ")
						  .append(" LINK_GROUP_USERS_USERS_KNL_T lgu ")
						  .append(" where LGU.UP_GROUP_USERS=GR.ID_SRV ")
						  .append(" and  LGU.UP_USERS in (")
						  .append(usersIdsLine)
						  .append(") ")
						  .append(" order by LGU.UP_USERS, GR.SIGN_OBJECT ")
						.toString())
						.getResultList();

				for (Object[] objectArray : lo) {

					if (resultIds.get(objectArray[0].toString())
							.getCodesGroups() == null) {
						resultIds.get(objectArray[0].toString())
								.setCodesGroups(new ArrayList<String>());
					}
					
					if(objectArray[1]!=null){
					  resultIds.get(objectArray[0].toString()).getCodesGroups()
							.add(objectArray[1].toString());
					}
				}
			}
				// 4. количество

				LOGGER.debug("users_data:05");

			if(!"TRUE".equals(settingsMap.get("ACCOUNTS_ONLY"))){	
				resultCount = ((java.math.BigDecimal) em
						.createNativeQuery(
								(new StringBuilder("select count(*) from ( "))
								  .append("select t_core.t_core_id ")
								  .append("from( ")
								  .append("select AU_FULL.ID_SRV t_core_id ")
								  .append("from ")
								  .append("AC_USERS_KNL_T au_full, ")
								  .append("LINK_GROUP_USERS_USERS_KNL_T lgu, ")
								  .append("AC_USERS_LINK_KNL_T lur, ")
								  .append("AC_ROLES_BSS_T rol, ")
								  .append("AC_ROLES_BSS_T rol_group, ")
								  .append("LINK_GROUP_USERS_ROLES_KNL_T lgr, ")
								  .append("AC_IS_BSS_T ais, ")
								  .append("AC_IS_BSS_T ais_group, ")
								  .append("GROUP_SYSTEMS_KNL_T sysgroup, ")
								  .append("LINK_GROUP_SYS_SYS_KNL_T linksysgroup, ")
								  .append("GROUP_USERS_KNL_T gr ")
								  .append("where ")
								  .append("lur.UP_USERS(+)=AU_FULL.ID_SRV and ")
								  .append("lgu.UP_USERS(+)=AU_FULL.ID_SRV ")
								  .append("and ROL.ID_SRV(+)=LUR.UP_ROLES ")
								  .append("and lgr.UP_GROUP_USERS(+)=GR.ID_SRV ")
								  .append("and lgu.UP_GROUP_USERS=GR.ID_SRV(+) ")
								  .append("and rol_group.ID_SRV(+) =LGR.UP_ROLES ")
								  .append("and ROL.UP_IS=ais.ID_SRV(+) ")
								  .append("and ROL_group.UP_IS=ais_group.ID_SRV(+) ")
								  .append("and SYSGROUP.ID_SRV = LINKSYSGROUP.UP_GROUP_SYSTEMS ")
								  .append("and ( ")
								  .append("(LINKSYSGROUP.UP_SYSTEMS=AIS.ID_SRV ")
								  .append("or LINKSYSGROUP.UP_SYSTEMS=AIS_GROUP.ID_SRV) ")
								  .append("and SYSGROUP.GROUP_CODE = :idIS ")
								  .append("or -1 = :onlyISUsers   ")
								  .append(") ")
								  .append("and to_char(au_full.ID_SRV) in ("+ uidsLine + ") ")											
								  .append(filterSt != null ? filterSt : " ")
								  .append("order by t_core_id ") 
								  .append(")t_core ")
								  .append("group by t_core_id ")
								  .append("order by t_core.t_core_id )")
								  .toString()
								)
						.setParameter("idIS", idIS)
						.setParameter(
								"onlyISUsers",
								CUDConstants.categorySYS.equals(category) ? 1
										: -1).getSingleResult()).intValue();
			 }else{
				 resultCount =  result.size();
				   
				   LOGGER.debug("users_data:count:02_1:"+resultCount);
				   LOGGER.debug("users_data:count:02_2:"+count);
				   
				   if (resultCount.intValue()==count.intValue()){
					   //записей на самом деле больше чем count
					   //поэтому нужен подсчёт через запрос
				   
				   resultCount = ((java.math.BigDecimal) em
							.createNativeQuery(
									(new StringBuilder("SELECT COUNT (*) "))
									  .append(" FROM (SELECT t1.t1_fio, t1.t1_org_name ") 
									  .append(" FROM (SELECT DECODE ( ") 
									     .append(" AU_FULL.UP_SIGN_USER, ") 
									     .append(" NULL,    AU_FULL.SURNAME ") 
									           .append(" || ' ' ") 
									           .append(" || AU_FULL.NAME_ ") 
									           .append(" || ' ' ") 
									           .append(" || AU_FULL.PATRONYMIC, ") 
									     .append(" CL_USR_FULL.FIO) ") 
									     .append(" t1_fio, ") 
									  .append(" CL_ORG_FULL.FULL_ t1_org_name ") 
									  .append(" FROM (  SELECT MAX (CL_ORG.ID_SRV) CL_ORG_ID, ") 
									           .append("  CL_ORG.SIGN_OBJECT CL_ORG_CODE ") 
									     .append("   FROM ISP_BSS_T cl_org, AC_USERS_KNL_T au ") 
									     .append("  WHERE AU.UP_SIGN = CL_ORG.SIGN_OBJECT ") 
									  .append("  GROUP BY CL_ORG.SIGN_OBJECT) t1, ") 
									  .append(" (  SELECT MAX (CL_usr.ID_SRV) CL_USR_ID, ") 
									           .append("  CL_USR.SIGN_OBJECT CL_USR_CODE ") 
									     .append("   FROM ISP_BSS_T cl_usr, AC_USERS_KNL_T au ") 
									     .append("  WHERE AU.UP_SIGN_USER = CL_usr.SIGN_OBJECT ") 
									  .append("  GROUP BY CL_usr.SIGN_OBJECT) t2, ") 
									  .append(" (  SELECT t_core.t_core_id ") 
									     .append("   FROM (  SELECT AU_FULL.ID_SRV t_core_id ") 
									                 .append(" FROM AC_USERS_KNL_T au_full, ") 
									                    .append("   LINK_GROUP_USERS_USERS_KNL_T lgu, ") 
									                    .append("   AC_USERS_LINK_KNL_T lur, ") 
									                    .append("   AC_ROLES_BSS_T rol, ") 
									                    .append("   AC_ROLES_BSS_T rol_group, ") 
									                    .append("   LINK_GROUP_USERS_ROLES_KNL_T lgr, ") 
									                    .append("   AC_IS_BSS_T ais, ") 
									                    .append("   AC_IS_BSS_T ais_group, ") 
									                    .append("   GROUP_SYSTEMS_KNL_T sysgroup, ") 
									                    .append("   LINK_GROUP_SYS_SYS_KNL_T linksysgroup, ") 
									                    .append("   GROUP_USERS_KNL_T gr ") 
									              .append("   WHERE     lur.UP_USERS(+) = AU_FULL.ID_SRV ") 
									                    .append("   AND lgu.UP_USERS(+) = AU_FULL.ID_SRV ") 
									                    .append("   AND ROL.ID_SRV(+) = LUR.UP_ROLES ") 
									                    .append("   AND lgr.UP_GROUP_USERS(+) = GR.ID_SRV ") 
									                    .append("   AND lgu.UP_GROUP_USERS = GR.ID_SRV(+) ") 
									                    .append("   AND rol_group.ID_SRV(+) = LGR.UP_ROLES ") 
									                    .append("   AND ROL.UP_IS = ais.ID_SRV(+) ") 
									                    .append("   AND ROL_group.UP_IS = ") 
									                       .append("       ais_group.ID_SRV(+) ") 
									                    .append("   AND SYSGROUP.ID_SRV = ") 
									                       .append("       LINKSYSGROUP.UP_GROUP_SYSTEMS ") 
									              .append(" and ( ") 
									              .append("   (LINKSYSGROUP.UP_SYSTEMS=AIS.ID_SRV ") 
									                 .append(" or LINKSYSGROUP.UP_SYSTEMS=AIS_GROUP.ID_SRV) ") 
									                 .append(" and SYSGROUP.GROUP_CODE = :idIS ") 
									                 .append(" or -1 = :onlyISUsers ") 
									              .append("   )  ")
									  .append("and to_char(au_full.ID_SRV) in ("+ uidsLine + ") ") 
									  .append(filterSt != null ? filterSt : " ") 
									           .append("   ORDER BY t_core_id) t_core ") 
									  .append("  GROUP BY t_core_id ") 
									  .append("  ORDER BY t_core.t_core_id) t4, ") 
									  .append(" ISP_BSS_T cl_org_full, ") 
									  .append(" ISP_BSS_T cl_usr_full, ") 
									  .append(" AC_USERS_KNL_T au_full, ") 
									  .append(" AC_USERS_KNL_T usr_crt, ") 
									  .append(" AC_USERS_KNL_T usr_upd ") 
									  .append(" WHERE     cl_org_full.ID_SRV = CL_ORG_ID ") 
									  .append(" AND cl_usr_full.ID_SRV(+) = CL_USR_ID ") 
									  .append(" AND au_full.UP_SIGN = CL_ORG_CODE ") 
									  .append(" AND au_full.UP_SIGN_USER = CL_USR_CODE(+) ") 
									  .append(" AND au_full.CREATOR = USR_CRT.ID_SRV ") 
									  .append(" AND au_full.MODIFICATOR = USR_UPD.ID_SRV(+) ") 
									  .append(" AND AU_FULL.ID_SRV = t4.t_core_id) t1 ") 
									  .append(" WHERE 1 = 1  ") 
									
									.append									
									(settingsMap.containsKey("FILTER_FIO") ? 
											 " and upper(t1_fio) LIKE  upper('%"+settingsMap.get("FILTER_FIO")+"%')" : "")
									.append
									(settingsMap.containsKey("FILTER_ORG") ? 
											 " and upper(t1_org_name) LIKE  upper('%"+settingsMap.get("FILTER_ORG")+"%')" : "")
                                    
									  .append(" ) ")
									
									.toString())
							.setParameter("idIS", idIS)
							.setParameter("onlyISUsers",
									CUDConstants.categorySYS.equals(category) ? 1: -1).getSingleResult()).intValue();
				   }
			 }
				
			}

			isu.setUsers(result);
			isu.setCount(resultCount);

			sys_audit(72L, "idIS:" + idIS
					+ "result_count:" + resultCount, "true; ", IPAddress,
					idUserAuth);

		} catch (Exception e) {
			sys_audit(72L, "; idIS:" + idIS,
					"error", IPAddress, idUserAuth);

			LOGGER.error("users_data+:Error:", e);
			
			throw new GeneralFailure(e.getMessage());
			
			
			
		}
		return isu;
	
	}

	/**
	 * данные по группам
	 */
	public GroupsData groups_data(String idIS, List<String> groupsCodes,
			String category, List<String> rolesCodes, Integer start,
			Integer count, Map<String, String> settings, Long idUserAuth,
			String IPAddress) throws GeneralFailure {

		LOGGER.debug("groups_data:01");

		// onlyISUsers условие сильнее, чем rolesCodes
		// то есть, если стоит onlyISUsers = false [все пользователи],
		// то rolesCodes уже не учитывается

		// category:
		// ALL
		// SYS

		// + USER

		Integer resultCount = 0;
		List<Group> result = new ArrayList<Group>();
		Map<String, Group> resultIds = new HashMap<String, Group>();
		Group group = null;

		List<Object[]> loGr = null;
		String idRec = null;

		GroupsData isu = new GroupsData();

		String rolesLine = null;
		String usersIdsLine = null;
	
		try {

			if (idIS == null) {
				LOGGER.debug("groups_data:return:1");
				throw new GeneralFailure("idIS is null!");
			}

			if (count == null) {
				count = MAX_CONT_GROUPS;
			}
			if (start == null) {
				start = 0;
			}

			if (MAX_CONT_GROUPS < count) {
				LOGGER.debug("groups_data:return:2");
				throw new GeneralFailure(csCountUBoundMsg
						+ MAX_CONT_GROUPS);
			}

			LOGGER.debug("groups_data:idIS1:" + idIS);

			String uidsLine = null;
			
			uidsLine = CommonUtil.createLine(groupsCodes);
			


			if (CUDConstants.categorySYS.equals(category) && rolesCodes != null
					&& !rolesCodes.isEmpty()) {

				rolesLine = CommonUtil.createLine(rolesCodes);
				
			

			}

			if (idIS.startsWith(CUDConstants.armPrefix)
					|| idIS.startsWith(CUDConstants.subArmPrefix)) {

				// !!!
				idIS = getCodeIs(idIS);

				LOGGER.debug("groups_data:idIS2:" + idIS);

				// системы и подсистемы
				// 1.группы

				if (!CUDConstants.categoryUSER.equals(category)) {
					// от системы группы или весь список групп

					loGr = em.createNativeQuery(

							(new StringBuilder("select gr_full.ID_SRV, gr_full.SIGN_OBJECT, gr_full.FULL_, gr_full.DESCRIPTION  "))
							  .append("from GROUP_USERS_KNL_T gr_full, ")
							  .append("( ")
							  .append("select GR.ID_SRV gr_id ")
							  .append("from GROUP_USERS_KNL_T gr, ")
							  .append("LINK_GROUP_USERS_ROLES_KNL_T lgr, ")
							  .append("AC_ROLES_BSS_T rol, ")
							  .append("AC_IS_BSS_T sys ")
							  .append("where GR.ID_SRV = LGR.UP_GROUP_USERS(+) ")
							  .append("and ROL.ID_SRV(+) = LGR.UP_ROLES ")
							  .append("and SYS.ID_SRV(+)=ROL.UP_IS ")
							  .append(" ")
							  .append("and( SYS.SIGN_OBJECT = :idIS or -1 = :onlyISUsers ) ")
							  .append(uidsLine != null ? "and GR.SIGN_OBJECT in ("
											+ uidsLine + ") "
											: " ")
							  .append(rolesLine != null ? "and (ROL.SIGN_OBJECT in ("
											+ rolesLine
											+ ") and SYS.SIGN_OBJECT = :idIS ) "
											: " ")
							  .append("group by GR.ID_SRV ")
							  .append(") ")
							  .append("where gr_id=gr_full.ID_SRV ")
							  .append("order by gr_full.FULL_ ")
							.toString())

							.setParameter("idIS", idIS)
							.setParameter(
									"onlyISUsers",
									CUDConstants.categorySYS.equals(category) ? 1
											: -1)
							.setFirstResult(start.intValue())
							.setMaxResults(count.intValue())
							.getResultList();

				} else {
					// группы текущего пользователя

					LOGGER.debug("groups_data:02_01");
					
					loGr = em.createNativeQuery(
							(new StringBuilder("select gr_full.ID_SRV, gr_full.SIGN_OBJECT, gr_full.FULL_, gr_full.DESCRIPTION  "))
							  .append("from GROUP_USERS_KNL_T gr_full, ")
							  .append("( ")
							  .append("select GR.ID_SRV gr_id ")
							  .append("from GROUP_USERS_KNL_T gr, ")
							  .append("LINK_GROUP_USERS_ROLES_KNL_T lgr, ")
							  .append("AC_ROLES_BSS_T rol, ")
							  .append("AC_IS_BSS_T sys, ")
							  .append("LINK_GROUP_USERS_USERS_KNL_T guu ")
							  .append("where GR.ID_SRV = LGR.UP_GROUP_USERS(+) ")
							  .append("and ROL.ID_SRV(+) = LGR.UP_ROLES ")
							  .append("and SYS.ID_SRV(+)=ROL.UP_IS ")
							  .append(" ")
							  .append("and( SYS.SIGN_OBJECT = :idIS or -1 = :onlyISUsers ) ")
							  .append("and guu.UP_GROUP_USERS = GR.ID_SRV ")
							  .append("and guu.UP_USERS = :idUser ")
							  .append(uidsLine != null ? "and GR.SIGN_OBJECT in ("+ uidsLine + ") ": " ")
							  .append("group by GR.ID_SRV ")
							  .append(") ")
							  .append("where gr_id=gr_full.ID_SRV ")
							  .append("order by gr_full.FULL_ ")									
								.toString())

							.setParameter("idIS", idIS)
							.setParameter("onlyISUsers", -1)
							.setParameter("idUser", idUserAuth)
							.setFirstResult(start.intValue())
							.setMaxResults(count.intValue())
							.getResultList();

				}
				
				StringBuilder sbUsersIdsLine = new StringBuilder();
				for (Object[] objectArray : loGr) {

					idRec = objectArray[0].toString();

					group = new Group();

					group.setName (objectArray[2] != null ? objectArray[2]
							.toString() : "");
					
					group.setCode (objectArray[1] != null ? objectArray[1]
							.toString() : "");
					group.setDescription (objectArray[3] != null ? objectArray[3]
							.toString() : "");

					result.add(group); // для сохранения сортировки из запроса
					resultIds.put(idRec, group);

					sbUsersIdsLine.append(", '").append(idRec).append("'");
				}
				
				usersIdsLine = sbUsersIdsLine.substring(2);

				LOGGER.debug("groups_data:02");

				// 2.роли

				loGr = em.createNativeQuery(
						(new StringBuilder("  SELECT gr.ID_SRV, ROL.SIGN_OBJECT "))
						  .append(" FROM AC_IS_BSS_T sys, ")
						  .append(" AC_ROLES_BSS_T rol, ")
						  .append(" GROUP_USERS_KNL_T gr, ")
						  .append(" AC_SUBSYSTEM_CERT_BSS_T subsys, ")
						  .append(" LINK_GROUP_USERS_ROLES_KNL_T lugr ")
						  .append(" WHERE (SYS.SIGN_OBJECT = :idIS ")
						  .append(" OR SUBSYS.SUBSYSTEM_CODE = :idIS ) ")
						  .append(" AND ROL.ID_SRV = LUGR.UP_ROLES ")
						  .append(" AND LUGR.UP_GROUP_USERS = gr.ID_SRV ")
						  .append(" AND ROL.UP_IS = sys.ID_SRV ")
						  .append(" AND gr.ID_SRV IN (")
						  .append(usersIdsLine)
						  .append(") ")
						  .append(" AND SUBSYS.UP_IS(+) = SYS.ID_SRV ")
						  .append("GROUP BY gr.ID_SRV, ROL.SIGN_OBJECT ")
						  .toString())
						.setParameter("idIS", idIS).getResultList();

				for (Object[] objectArray : loGr) {

					if (resultIds.get(objectArray[0].toString())
							.getCodesRoles() == null) {
						resultIds.get(objectArray[0].toString())
								.setCodesRoles(new ArrayList<String>());
					}

					resultIds.get(objectArray[0].toString()).getCodesRoles()
							.add(objectArray[1].toString());
				}

				// 3.количество

				LOGGER.debug("groups_data:03");

				if (!CUDConstants.categoryUSER.equals(category)) {
					// от системы группы или весь список групп

					resultCount = ((java.math.BigDecimal) em
							.createNativeQuery(
									(new StringBuilder("select count(*) from  GROUP_USERS_KNL_T gr_full, "))
									  .append("( ")
									  .append("select GR.ID_SRV gr_id ")
									  .append("from GROUP_USERS_KNL_T gr, ")
									  .append("LINK_GROUP_USERS_ROLES_KNL_T lgr, ")
									  .append("AC_ROLES_BSS_T rol, ")
									  .append("AC_IS_BSS_T sys ")
									  .append("where GR.ID_SRV = LGR.UP_GROUP_USERS(+) ")
									  .append("and ROL.ID_SRV(+) = LGR.UP_ROLES ")
									  .append("and SYS.ID_SRV(+)=ROL.UP_IS ")
									  .append(" ")
									  .append("and( SYS.SIGN_OBJECT = :idIS or -1 = :onlyISUsers ) ")
									  .append(uidsLine != null ? "and GR.SIGN_OBJECT in ("
													+ uidsLine + ") "
													: " ")
									  .append(rolesLine != null ? "and ( ROL.SIGN_OBJECT in ("
													+ rolesLine
													+ ") and SYS.SIGN_OBJECT = :idIS ) "
													: " ")
									  .append("group by GR.ID_SRV ")   .append(") ")
									  .append("where gr_id=gr_full.ID_SRV ")
									  .append("order by gr_full.FULL_ ")											
											.toString())
							.setParameter("idIS", idIS)
							.setParameter(
									"onlyISUsers",
									CUDConstants.categorySYS.equals(category) ? 1
											: -1).getSingleResult())
							.intValue();

				} else {
					// группы текущего пользователя

					resultCount = ((java.math.BigDecimal) em
							.createNativeQuery(
									(new StringBuilder("select count(*)  "))
									  .append("from GROUP_USERS_KNL_T gr_full, ")
									  .append("( ")
									  .append("select GR.ID_SRV gr_id ")
									  .append("from GROUP_USERS_KNL_T gr, ")
									  .append("LINK_GROUP_USERS_ROLES_KNL_T lgr, ")
									  .append("AC_ROLES_BSS_T rol, ")
									  .append("AC_IS_BSS_T sys, ")
									  .append("LINK_GROUP_USERS_USERS_KNL_T guu ")
									  .append("where GR.ID_SRV = LGR.UP_GROUP_USERS(+) ")
									  .append("and ROL.ID_SRV(+) = LGR.UP_ROLES ")
									  .append("and SYS.ID_SRV(+)=ROL.UP_IS ")
									  .append(" ")
									  .append("and( SYS.SIGN_OBJECT = :idIS or -1 = :onlyISUsers ) ")
									  .append("and guu.UP_GROUP_USERS = GR.ID_SRV ")
									  .append("and guu.UP_USERS = :idUser ")
									  .append(uidsLine != null ? "and GR.SIGN_OBJECT in ("+ uidsLine + ") ": " ") 
									  .append("group by GR.ID_SRV ")
									  .append(") ")
									  .append("where gr_id=gr_full.ID_SRV ")
									  .append("order by gr_full.FULL_ ")
									  .toString()
							  )
							.setParameter("idIS", idIS)
							.setParameter("onlyISUsers", -1)
							.setParameter("idUser", idUserAuth)
							.getSingleResult()).intValue();

				}

			} else if (idIS.startsWith(CUDConstants.groupArmPrefix)) {

				// группы
				// 1. пользователи

				if (!CUDConstants.categoryUSER.equals(category)) {
					// от системы группы или весь список групп

					loGr = em.createNativeQuery(

							(new StringBuilder("select gr_full.ID_SRV, gr_full.SIGN_OBJECT, gr_full.FULL_, gr_full.DESCRIPTION  "))
									  .append("from GROUP_USERS_KNL_T gr_full, ")
									  .append("( ")
									  .append("select GR.ID_SRV gr_id ")
									  .append("from GROUP_USERS_KNL_T gr, ")
									  .append("LINK_GROUP_USERS_ROLES_KNL_T lgr, ")
									  .append("AC_ROLES_BSS_T rol, ")
									  .append("AC_IS_BSS_T sys, ")
									  .append("GROUP_SYSTEMS_KNL_T sysgroup,  LINK_GROUP_SYS_SYS_KNL_T linksysgroup ")
									  .append("where GR.ID_SRV = LGR.UP_GROUP_USERS(+) ")
									  .append("and ROL.ID_SRV(+) = LGR.UP_ROLES ")
									  .append("and SYS.ID_SRV(+)=ROL.UP_IS ")
									  .append("and SYSGROUP.ID_SRV = LINKSYSGROUP.UP_GROUP_SYSTEMS ")
									  .append("and ( ")
									  .append("LINKSYSGROUP.UP_SYSTEMS=SYS.ID_SRV  ")
									  .append("and SYSGROUP.GROUP_CODE = :idIS ")
									  .append("or -1 = :onlyISUsers  ")
									  .append(" ) ")							
									  .append(uidsLine != null ? "and GR.SIGN_OBJECT in ("
											+ uidsLine + ") "
											: " ")
									  .append(rolesLine != null ? "and ( ROL.SIGN_OBJECT in ("
											+ rolesLine
											+ ") and LINKSYSGROUP.UP_SYSTEMS=SYS.ID_SRV ) "
											: " ")
									  .append("group by GR.ID_SRV ")
									  .append(") ")
									  .append("where gr_id=gr_full.ID_SRV ")
									  .append("order by gr_full.FULL_ ")
									.toString())

							.setParameter("idIS", idIS)
							.setParameter(
									"onlyISUsers",
									CUDConstants.categorySYS.equals(category) ? 1
											: -1)
							.setFirstResult(
									start != null ? start.intValue() : 0)
							.setMaxResults(
									count != null ? count.intValue() : 1000000)
							.getResultList();

				} else {
					// группы текущего пользователя

					loGr = em.createNativeQuery(

							(new StringBuilder("select gr_full.ID_SRV, gr_full.SIGN_OBJECT, gr_full.FULL_, gr_full.DESCRIPTION  "))
									  .append("from GROUP_USERS_KNL_T gr_full, ")
									  .append("( ")
									  .append("select GR.ID_SRV gr_id ")
									  .append("from GROUP_USERS_KNL_T gr, ")
									  .append("LINK_GROUP_USERS_ROLES_KNL_T lgr, ")
									  .append("AC_ROLES_BSS_T rol, ")
									  .append("AC_IS_BSS_T sys, ")
									  .append("LINK_GROUP_USERS_USERS_KNL_T guu, ")
									  .append("GROUP_SYSTEMS_KNL_T sysgroup,  LINK_GROUP_SYS_SYS_KNL_T linksysgroup ")
									  .append("where GR.ID_SRV = LGR.UP_GROUP_USERS(+) ")
									  .append("and ROL.ID_SRV(+) = LGR.UP_ROLES ")
									  .append("and SYS.ID_SRV(+)=ROL.UP_IS ")
									  .append("and guu.UP_GROUP_USERS = GR.ID_SRV ")
									  .append("and guu.UP_USERS = :idUser ")
									  .append("and SYSGROUP.ID_SRV = LINKSYSGROUP.UP_GROUP_SYSTEMS ")
									  .append("and ( ")
									  .append("LINKSYSGROUP.UP_SYSTEMS=SYS.ID_SRV  ")
									  .append("and SYSGROUP.GROUP_CODE = :idIS ")
									  .append("or -1 = :onlyISUsers  ")
									  .append(" ) ")
									  .append(uidsLine != null ? "and GR.SIGN_OBJECT in ("
												+ uidsLine + ") "
												: " ")
									  .append("group by GR.ID_SRV ")
									  .append(") ")
									  .append("where gr_id=gr_full.ID_SRV ")
									  .append("order by gr_full.FULL_ ")									
									.toString())

							.setParameter("idIS", idIS)
							.setParameter("onlyISUsers", -1)
							.setParameter("idUser", idUserAuth)
							.setFirstResult(start.intValue())
							.setMaxResults(count.intValue())
							.getResultList();

				}

				for (Object[] objectArray : loGr) {

					idRec = objectArray[0].toString();

					group = new Group();

					group.setCode (objectArray[1] != null ? objectArray[1]
							.toString() : "");
					group.setName (objectArray[2] != null ? objectArray[2]
							.toString() : "");
					group.setDescription (objectArray[3] != null ? objectArray[3]
							.toString() : "");

					result.add(group); // для сохранения сортировки из запроса
					resultIds.put(idRec, group);

					if (usersIdsLine == null) {
						usersIdsLine = "'" + idRec + "'";
					} else {
						usersIdsLine = usersIdsLine + ", '" + idRec + "'";
					}
				}

				LOGGER.debug("groups_data:04");

				// 2. роли

				loGr = em.createNativeQuery(
						        SELECT_ROLE_START
								+ usersIdsLine
								+SELECT_ROLE_END
								)
						.setParameter("idIS", idIS).getResultList();

				for (Object[] objectArray : loGr) {

					if (resultIds.get(objectArray[0].toString())
							.getCodesRoles() == null) {
						resultIds.get(objectArray[0].toString())
								.setCodesRoles(new ArrayList<String>());
					}

					resultIds.get(objectArray[0].toString()).getCodesRoles()
							.add(objectArray[1].toString());
				}

				// 3. количество

				LOGGER.debug("groups_data:05");

				if (!CUDConstants.categoryUSER.equals(category)) {
					// от системы группы или весь список групп

					resultCount = ((java.math.BigDecimal) em
							.createNativeQuery(
									(new StringBuilder("select count(*) "))
									  .append("from GROUP_USERS_KNL_T gr_full, ")
									  .append("( ")
									  .append("select GR.ID_SRV gr_id ")
									  .append("from GROUP_USERS_KNL_T gr, ")
									  .append("LINK_GROUP_USERS_ROLES_KNL_T lgr, ")
									  .append("AC_ROLES_BSS_T rol, ")
									  .append("AC_IS_BSS_T sys, ")
									  .append("GROUP_SYSTEMS_KNL_T sysgroup,  LINK_GROUP_SYS_SYS_KNL_T linksysgroup ")
									  .append("where GR.ID_SRV = LGR.UP_GROUP_USERS(+) ")
									  .append("and ROL.ID_SRV(+) = LGR.UP_ROLES ")
									  .append("and SYS.ID_SRV(+)=ROL.UP_IS ")
									  .append("and SYSGROUP.ID_SRV = LINKSYSGROUP.UP_GROUP_SYSTEMS ")
									  .append("and ( ")
									  .append("LINKSYSGROUP.UP_SYSTEMS=SYS.ID_SRV  ")
									  .append("and SYSGROUP.GROUP_CODE = :idIS ")
									  .append("or -1 = :onlyISUsers  ")
									  .append(" ) ")
									  .append("and GR.SIGN_OBJECT in ("+ uidsLine + ") ")
									  .append(rolesLine != null ? "and ( ROL.SIGN_OBJECT in ("
													+ rolesLine
													+ ") and LINKSYSGROUP.UP_SYSTEMS=SYS.ID_SRV ) "
													: " ")											  
									  .append("group by GR.ID_SRV ")
									  .append(") ")
									  .append("where gr_id=gr_full.ID_SRV ")
									  .append("order by gr_full.FULL_ ")											
									.toString())
							.setParameter("idIS", idIS)
							.setParameter(
									"onlyISUsers",
									CUDConstants.categorySYS.equals(category) ? 1
											: -1).getSingleResult())
							.intValue();

				} else {
					// группы текущего пользователя

					resultCount = ((java.math.BigDecimal) em
							.createNativeQuery(

									(new StringBuilder("select count(*)  "))
											  .append("from GROUP_USERS_KNL_T gr_full, ")
											  .append("( ")
											  .append("select GR.ID_SRV gr_id ")
											  .append("from GROUP_USERS_KNL_T gr, ")
											  .append("LINK_GROUP_USERS_ROLES_KNL_T lgr, ")
											  .append("AC_ROLES_BSS_T rol, ")
											  .append("AC_IS_BSS_T sys, ")
											  .append("LINK_GROUP_USERS_USERS_KNL_T guu, ")
											  .append("GROUP_SYSTEMS_KNL_T sysgroup,  LINK_GROUP_SYS_SYS_KNL_T linksysgroup ")
											  .append("where GR.ID_SRV = LGR.UP_GROUP_USERS(+) ")
											  .append("and ROL.ID_SRV(+) = LGR.UP_ROLES ")
											  .append("and SYS.ID_SRV(+)=ROL.UP_IS ")
											  .append("and guu.UP_GROUP_USERS = GR.ID_SRV ")
											  .append("and guu.UP_USERS = :idUser ")
											  .append("and SYSGROUP.ID_SRV = LINKSYSGROUP.UP_GROUP_SYSTEMS ")
											  .append("and ( ")
											  .append("LINKSYSGROUP.UP_SYSTEMS=SYS.ID_SRV  ")
											  .append("and SYSGROUP.GROUP_CODE = :idIS ")
											  .append("or -1 = :onlyISUsers  ")
											  .append(" ) ")
												.append("and GR.SIGN_OBJECT in ("+ uidsLine + ") ")													
											.append("group by GR.ID_SRV ")   
											.append(") ")
											.append("where gr_id=gr_full.ID_SRV ")
											.append("order by gr_full.FULL_ ")
											
											.toString())

							.setParameter("idIS", idIS)
							.setParameter("onlyISUsers", -1)
							.setParameter("idUser", idUserAuth)
							.getSingleResult()).intValue();

				}
			}

			isu.setGroups(result);
			isu.setCount(resultCount);

			sys_audit(72L,"idIS:" + idIS
					+ "result_count:" + resultCount, "true; ", IPAddress,
					idUserAuth);

		} catch (Exception e) {
			sys_audit(72L, "; idIS:" + idIS,
					"error", IPAddress, idUserAuth);

			LOGGER.error("groups_data:Error:", e);
			throw new GeneralFailure(e.getMessage());
		}
		return isu;
	}
	
	private final String csCountUBoundMsg = "'count' should be not less than 0 and less than ";

	/**
	 * данные по ресурсам
	 */
	public ResourcesData resources_data(String idIS,
			List<String> resourcesCodes, String category,
			List<String> rolesCodes, Integer Start, Integer Count,
			Map<String, String> settings, Long idUserAuth, String IPAddress)
			throws GeneralFailure {
		
		Integer count = (Count==null)?MAX_CONT_RES:Count;
		Integer start = (Start==null)?0:Start;
		
		LOGGER.debug("resources_data:01 start ="+start+", count ="+count);
		if (MAX_CONT_RES < count || count < 0) {
			LOGGER.debug("resources_data:return:2");
			throw new GeneralFailure(csCountUBoundMsg + MAX_CONT_RES);
		}		
		
		// onlyISUsers[category:SYS] условие сильнее, чем rolesCodes
		// то есть, если стоит onlyISUsers = false [все пользователи],
		// то rolesCodes уже не учитывается

		// category:
		// USER (используем idUserAuth)
		// SYS

		Integer resultCount = 0;
		List<ResourceNU> result = new ArrayList<ResourceNU>();
		Map<String, ResourceNU> resultIds = new HashMap<String, ResourceNU>();
		ResourceNU uat = null;

		List<Object[]> lo = null;
		String idRec = null;

		ResourcesData isu = new ResourcesData();

		String rolesLine = null;
		
	
		try {

			if (idIS == null) {
				LOGGER.debug("resources_data:return:1");
				throw new GeneralFailure("idIS is null!");
			}

			LOGGER.debug("resources_data:idIS1:" + idIS);

			String uidsLine = null;

			uidsLine = CommonUtil.createLine(resourcesCodes);
			
	

			if (CUDConstants.categorySYS.equals(category) && rolesCodes != null
					&& !rolesCodes.isEmpty()) {

				rolesLine = CommonUtil.createLine(rolesCodes);
			
			}

			if (idIS.startsWith(CUDConstants.armPrefix)
					|| idIS.startsWith(CUDConstants.subArmPrefix)) {

				// !!!
				idIS = getCodeIs(idIS);

				LOGGER.debug("resources_data:idIS2:" + idIS);

				// системы и подсистемы
				// 1.группы

				lo = em.createNativeQuery(
						(new StringBuilder(" SELECT res_full.ID_SRV, "))
						  .append(" res_full.SIGN_OBJECT, ")
						  .append(" res_full.FULL_, ")
						  .append(" res_full.DESCRIPTION ")
						  .append(" FROM AC_RESOURCES_BSS_T res_full, ")
						  .append(" (  SELECT res.ID_SRV res_id ")
						  .append(" FROM AC_RESOURCES_BSS_T res, ")
						  .append(" AC_LINK_ROLE_RESOURCE_KNL_T lgr, ")
						  .append(" AC_ROLES_BSS_T rol, ")
						  .append(" AC_IS_BSS_T sys ")
						  .append(" WHERE     res.ID_SRV = LGR.UP_RESOURCE(+) ")
						  .append(" AND ROL.ID_SRV(+) = LGR.UP_ROLE ")
						  .append(" AND SYS.ID_SRV(+) = ROL.UP_IS ")
						  .append(" AND res.up_is = SYS.ID_SRV ")
						  .append(" AND (SYS.SIGN_OBJECT = :idIS OR -1 = :onlyISUsers) ")
				
								.append (uidsLine != null ? "   and res.SIGN_OBJECT in ("
										+ uidsLine + ") "
										: "")
										
								.append(rolesLine != null ? "    and (ROL.SIGN_OBJECT in ("
										+ rolesLine
										+ ") and SYS.SIGN_OBJECT = :idIS ) "
										: "") 
										
								  .append(" GROUP BY res.ID_SRV) ")
								  .append(" WHERE res_id = res_full.ID_SRV ")
								  .append("ORDER BY res_full.FULL_")
								
								.toString())
						.setParameter("idIS", idIS)
						.setParameter(
								"onlyISUsers",
								CUDConstants.categorySYS.equals(category) ? 1
										: -1)
						.setFirstResult(start.intValue())
						.setMaxResults(count.intValue())
						.getResultList();

				StringBuffer sbfUsersIdsLine = new StringBuffer();
				for (Object[] objectArray : lo) {

					idRec = objectArray[0].toString();

					uat = new ResourceNU();

					uat.setDescription (objectArray[3] != null ? objectArray[3]
							.toString() : "");
					uat.setCode (objectArray[1] != null ? objectArray[1]
							.toString() : "");
					uat.setName (objectArray[2] != null ? objectArray[2]
							.toString() : "");					
					result.add(uat); // для сохранения сортировки из запроса
					resultIds.put(idRec, uat);
					sbfUsersIdsLine.append(", '").append(idRec).append("'");
				}				
				String usersIdsLine = sbfUsersIdsLine.substring(2);

				LOGGER.debug("resources_data:02");

				// 2.роли

				lo = em.createNativeQuery(
						(new StringBuilder("  SELECT gr.ID_SRV, ROL.SIGN_OBJECT "))
						  .append(" FROM AC_IS_BSS_T sys, ")
						  .append(" AC_ROLES_BSS_T rol, ")
						  .append(" GROUP_USERS_KNL_T gr, ")
						  .append(" AC_SUBSYSTEM_CERT_BSS_T subsys, ")
						  .append(" LINK_GROUP_USERS_ROLES_KNL_T lugr ")
						  .append(" WHERE (SYS.SIGN_OBJECT = :idIS ")
						  .append(" OR SUBSYS.SUBSYSTEM_CODE = :idIS ) ")
						  .append(" AND ROL.ID_SRV = LUGR.UP_ROLES ")
						  .append(" AND LUGR.UP_GROUP_USERS = gr.ID_SRV ")
						  .append(" AND ROL.UP_IS = sys.ID_SRV ")
						  .append(" AND gr.ID_SRV IN (")
				  .append( usersIdsLine)
				  .append(") ")
				  .append(" AND SUBSYS.UP_IS(+) = SYS.ID_SRV ")
				  .append("GROUP BY gr.ID_SRV, ROL.SIGN_OBJECT ")
								
							.toString())
						.setParameter("idIS", idIS).getResultList();

				for (Object[] objectArray : lo) {

					if (resultIds.get(objectArray[0].toString())
							.getCodesRoles() == null) {
						resultIds.get(objectArray[0].toString())
								.setCodesRoles(new ArrayList<String>());
					}

					resultIds.get(objectArray[0].toString()).getCodesRoles()
							.add(objectArray[1].toString());
				}

				// 3.количество

				LOGGER.debug("resources_data:03");

				resultCount = ((java.math.BigDecimal) em
						.createNativeQuery(
								(new StringBuilder("select count(*) from  GROUP_USERS_KNL_T gr_full, "))
								  .append("( ")
								  .append("select GR.ID_SRV gr_id ")
								  .append("from GROUP_USERS_KNL_T gr, ")
								  .append("LINK_GROUP_USERS_ROLES_KNL_T lgr, ")
								  .append("AC_ROLES_BSS_T rol, ")
								  .append("AC_IS_BSS_T sys ")
								  .append("where GR.ID_SRV = LGR.UP_GROUP_USERS(+) ")
								  .append("and ROL.ID_SRV(+) = LGR.UP_ROLES ")
								  .append("and SYS.ID_SRV(+)=ROL.UP_IS ")
								  .append(" ")
								  .append("and( SYS.SIGN_OBJECT = :idIS or -1 = :onlyISUsers ) ")
								.append("and GR.SIGN_OBJECT in ("+ uidsLine + ") ")
										.append(rolesLine != null ? "and ( ROL.SIGN_OBJECT in ("
												+ rolesLine
												+ ") and SYS.SIGN_OBJECT = :idIS ) "
												: " ") 
												
										  .append("group by GR.ID_SRV ")
										  .append(") ")
										  .append("where gr_id=gr_full.ID_SRV ")
										  .append("order by gr_full.FULL_ ")
										
										.toString())
						.setParameter("idIS", idIS)
						.setParameter(
								"onlyISUsers",
								CUDConstants.categorySYS.equals(category) ? 1
										: -1).getSingleResult()).intValue();

			} else if (idIS.startsWith(CUDConstants.groupArmPrefix)) {

				// группы
				// 1. пользователи

				lo = em.createNativeQuery(

						(new StringBuilder("select gr_full.ID_SRV, gr_full.SIGN_OBJECT, gr_full.FULL_, gr_full.DESCRIPTION  "))
								  .append("from GROUP_USERS_KNL_T gr_full, ")
								  .append("( ")
								  .append("select GR.ID_SRV gr_id ")
								  .append("from GROUP_USERS_KNL_T gr, ")
								  .append("LINK_GROUP_USERS_ROLES_KNL_T lgr, ")
								  .append("AC_ROLES_BSS_T rol, ")
								  .append("AC_IS_BSS_T sys, ")
								  .append("GROUP_SYSTEMS_KNL_T sysgroup,  LINK_GROUP_SYS_SYS_KNL_T linksysgroup ")
								  .append("where GR.ID_SRV = LGR.UP_GROUP_USERS(+) ")
								  .append("and ROL.ID_SRV(+) = LGR.UP_ROLES ")
								  .append("and SYS.ID_SRV(+)=ROL.UP_IS ")
								  .append("and SYSGROUP.ID_SRV = LINKSYSGROUP.UP_GROUP_SYSTEMS ")
								  .append("and ( ")
								  .append("LINKSYSGROUP.UP_SYSTEMS=SYS.ID_SRV  ")
								  .append("and SYSGROUP.GROUP_CODE = :idIS ")
								  .append("or -1 = :onlyISUsers  ")
								  .append(" ) ")

						
								.append
									(uidsLine != null ? "and GR.SIGN_OBJECT in ("
											+ uidsLine + ") " : " ")
								.append
									(rolesLine != null ? "and ( ROL.SIGN_OBJECT in ("
											+ rolesLine
											+ ") and LINKSYSGROUP.UP_SYSTEMS=SYS.ID_SRV ) "
											: " ")
										
								  .append("group by GR.ID_SRV ")
								  .append(") ")
								  .append("where gr_id=gr_full.ID_SRV ")
								  .append("order by gr_full.FULL_ ")
								
								.toString())

						.setParameter("idIS", idIS)
						.setParameter(
								"onlyISUsers",
								CUDConstants.categorySYS.equals(category) ? 1
										: -1)
						.setFirstResult( start.intValue() )
						.setMaxResults( count.intValue() )
						.getResultList();
				
				StringBuilder sbfUsersIdsLine = new StringBuilder();
				
				for (Object[] objectArray : lo) {
					idRec = objectArray[0].toString();
					uat = new ResourceNU();
					uat.setDescription (objectArray[3] != null ? objectArray[3]
							.toString() : "");					
					uat.setCode (objectArray[1] != null ? objectArray[1]
							.toString() : "");					
					uat.setName (objectArray[2] != null ? objectArray[2]
							.toString() : "");
					result.add(uat); // для сохранения сортировки из запроса
					resultIds.put(idRec, uat);
					sbfUsersIdsLine.append(", '").append(idRec).append("'");
				}
				
				String	usersIdsLine = sbfUsersIdsLine.substring(2);
				LOGGER.debug("resources_data:04");

				// 2. роли

				lo = em.createNativeQuery(
						 SELECT_ROLE_START
							+ usersIdsLine
							+SELECT_ROLE_END)
						.setParameter("idIS", idIS).getResultList();

				for (Object[] objectArray : lo) {

					if (resultIds.get(objectArray[0].toString())
							.getCodesRoles() == null) {
						resultIds.get(objectArray[0].toString())
								.setCodesRoles(new ArrayList<String>());
					}

					resultIds.get(objectArray[0].toString()).getCodesRoles()
							.add(objectArray[1].toString());
				}

				// 3. количество

				LOGGER.debug("resources_data:05");

				resultCount = ((java.math.BigDecimal) em
						.createNativeQuery(
								(new StringBuilder("select count(*) "))
								  .append("from GROUP_USERS_KNL_T gr_full, ")
								  .append("( ")
								  .append("select GR.ID_SRV gr_id ")
								  .append("from GROUP_USERS_KNL_T gr, ")
								  .append("LINK_GROUP_USERS_ROLES_KNL_T lgr, ")
								  .append("AC_ROLES_BSS_T rol, ")
								  .append("AC_IS_BSS_T sys, ")
								  .append("GROUP_SYSTEMS_KNL_T sysgroup,  LINK_GROUP_SYS_SYS_KNL_T linksysgroup ")
								  .append("where GR.ID_SRV = LGR.UP_GROUP_USERS(+) ")
								  .append("and ROL.ID_SRV(+) = LGR.UP_ROLES ")
								  .append("and SYS.ID_SRV(+)=ROL.UP_IS ")
								  .append("and SYSGROUP.ID_SRV = LINKSYSGROUP.UP_GROUP_SYSTEMS ")
								  .append("and ( ")
								  .append("LINKSYSGROUP.UP_SYSTEMS=SYS.ID_SRV  ")
								  .append("and SYSGROUP.GROUP_CODE = :idIS ")
								  .append("or -1 = :onlyISUsers  ")
								  .append(" ) ")						
										 .append("and GR.SIGN_OBJECT in ("+ uidsLine + ") ")
										 .append
											(rolesLine != null ? "and ( ROL.SIGN_OBJECT in ("
													+ rolesLine
													+ ") and LINKSYSGROUP.UP_SYSTEMS=SYS.ID_SRV ) "
													: " ") 
												
										  .append("group by GR.ID_SRV ")   .append(") ")
										  .append("where gr_id=gr_full.ID_SRV ")
										  .append("order by gr_full.FULL_ ")
										
										.toString())
						.setParameter("idIS", idIS)
						.setParameter(
								"onlyISUsers",
								CUDConstants.categorySYS.equals(category) ? 1
										: -1).getSingleResult()).intValue();

			}

			isu.setResources(result);
			isu.setCount(resultCount);

			sys_audit(72L, "idIS:" + idIS + "result_count:" + resultCount,
					"true; ", IPAddress, idUserAuth);

		} catch (Exception e) {
			sys_audit(72L, "; idIS:" + idIS, "error", IPAddress, idUserAuth);

			LOGGER.error("resources_data:Error:", e);
			throw new GeneralFailure(e.getMessage());
		}
		return isu;

	}

	/**
	 * данные по подсистемам
	 */
	public List<Resource> resources_data_subsys(String idIS,
	
	String category, Long idUserAuth, String IPAddress) throws GeneralFailure {

		LOGGER.debug("resources_data:01");

		// onlyISUsers[category:SYS] условие сильнее, чем rolesCodes
		// то есть, если стоит onlyISUsers = false [все пользователи],
		// то rolesCodes уже не учитывается

		// category:
		// USER (используем idUserAuth)
		// SYS

		Integer resultCount = 0;
		List<Resource> result = new ArrayList<Resource>();
		Map<String, Resource> resultIds = new HashMap<String, Resource>();
		Resource uat = null;

		List<Object[]> lo = null;
		String idRec = null;

		try {

			if (idIS == null) {
				LOGGER.debug("resources_data:return:1");
				throw new GeneralFailure("idIS is null!");
			}

			LOGGER.debug("resources_data:idIS1:" + idIS);

			if (idIS.startsWith(CUDConstants.armPrefix)
					|| idIS.startsWith(CUDConstants.subArmPrefix)) {

				// !!!
				idIS = getCodeIs(idIS);

				LOGGER.debug("resources_data:idIS2:" + idIS);

				// системы и подсистемы

				// информация по системе
				if (CUDConstants.categorySYS.equals(category)) {

					lo = em.createNativeQuery(
							(new StringBuilder("select arm.ID_SRV, ARM.SIGN_OBJECT, ARM.FULL_,  ARM.DESCRIPTION , arm.LINKS from AC_IS_BSS_T arm "))
							  .append("where ARM.SIGN_OBJECT= :idIS ")
							  .toString())
							.setParameter("idIS", idIS).getResultList();

				} else {
					// доступная система для пользователя
					lo = em.createNativeQuery(
							(new StringBuilder("select sys_full.ID_SRV, sys_full.SIGN_OBJECT, sys_full.FULL_, SYS_FULL.DESCRIPTION, sys_full.LINKS from AC_IS_BSS_T sys_full,"))
							  .append(" (select   SYS.ID_SRV sys_id")
							  .append(" from  AC_IS_BSS_T sys,     ")
							  .append(" AC_ROLES_BSS_T rol,     ")
							  .append(" AC_USERS_LINK_KNL_T url,     ")
							  .append(" AC_USERS_KNL_T AU,     ")
							  .append(" LINK_GROUP_USERS_ROLES_KNL_T lugr,   ")
							  .append(" LINK_GROUP_USERS_USERS_KNL_T lugu     ")
							  .append(" where SYS.SIGN_OBJECT= :idIS      ")
							  .append(" and (ROL.ID_SRV = URL.UP_ROLES or ROL.ID_SRV = LUGR.UP_ROLES )   ")
							  .append(" and LUGU.UP_GROUP_USERS= LUGR.UP_GROUP_USERS(+)   ")
							  .append(" and LUGU.UP_USERS(+)  = AU.ID_SRV   ")
							  .append(" and URL.UP_USERS(+)  = AU.ID_SRV   ")
							  .append(" and ROL.UP_IS=sys.ID_SRV    ")
							  .append(" and AU.ID_SRV = :idUser       ")
							  .append(" group by SYS.ID_SRV  ) t1 ")
							  .append(" where t1.sys_id = SYS_FULL.ID_SRV ")
							.toString()
							)
							.setParameter("idIS", idIS)
							.setParameter("idUser", idUserAuth).getResultList();

				}

				for (Object[] objectArray : lo) {

					idRec = objectArray[0].toString();

					uat = new Resource();

					if (objectArray[4] != null
							&& !objectArray[4].toString().trim().equals("")) {
						uat.setLinks(Arrays.asList(objectArray[4].toString()
								.replaceAll(" ", "").split(LINKS_SEPARATOR)));
					}
					
					uat.setName (objectArray[2] != null ? objectArray[2]
							.toString() : "");
					
					uat.setCode (objectArray[1] != null ? objectArray[1]
							.toString() : "");
					
					uat.setDescription (objectArray[3] != null ? objectArray[3]
							.toString() : "");

					

					result.add(uat); // для сохранения сортировки из запроса
					resultIds.put(idRec, uat);

				}

				LOGGER.debug("resources_data:02");

			} else if (idIS.startsWith(CUDConstants.groupArmPrefix)) {

				// группы
				// 1. пользователи

				if (CUDConstants.categorySYS.equals(category)) {

					lo = em.createNativeQuery(
							(new StringBuilder(" select SYS.ID_SRV, SYS.SIGN_OBJECT, SYS.FULL_, SYS.DESCRIPTION, sys.LINKS from "))
							  .append(" GROUP_SYSTEMS_KNL_T gsys, ")
							  .append(" AC_IS_BSS_T sys, ")
							  .append(" LINK_GROUP_SYS_SYS_KNL_T lgr ")
							  .append(" where GSYS.ID_SRV=LGR.UP_GROUP_SYSTEMS ")
							  .append(" and LGR.UP_SYSTEMS= SYS.ID_SRV ")
							  .append(" and GSYS.GROUP_CODE=:idIS ")
							  .toString())
							.setParameter("idIS", idIS).getResultList();

				} else {

					lo = em.createNativeQuery(
							(new StringBuilder("select sys_full.ID_SRV,  sys_full.SIGN_OBJECT, sys_full.FULL_, SYS_FULL.DESCRIPTION , sys_full.LINKS "))
							  .append(" from AC_IS_BSS_T sys_full, (   ")
							  .append(" select SYS.ID_SRV sys_id  ")
							  .append(" from GROUP_SYSTEMS_KNL_T gsys,   ")
							  .append(" AC_IS_BSS_T sys,   ")
							  .append(" AC_ROLES_BSS_T rol,   ")
							  .append(" LINK_GROUP_SYS_SYS_KNL_T lgr,   ")
							  .append(" LINK_GROUP_USERS_ROLES_KNL_T lugr,   ")
							  .append(" LINK_GROUP_USERS_USERS_KNL_T lugu,   ")
							  .append(" AC_USERS_LINK_KNL_T url,   ")
							  .append(" AC_USERS_KNL_T AU    ")
							  .append(" where GSYS.GROUP_CODE=:idIS   ")
							  .append(" and GSYS.ID_SRV=LGR.UP_GROUP_SYSTEMS   ")
							  .append(" and LGR.UP_SYSTEMS=SYS.ID_SRV   ")
							  .append(" and ROL.UP_IS= SYS.ID_SRV   ")
							  .append(" and (ROL.ID_SRV = URL.UP_ROLES or ROL.ID_SRV = LUGR.UP_ROLES )   ")
							  .append(" and LUGU.UP_GROUP_USERS = LUGR.UP_GROUP_USERS(+)   ")
							  .append(" and LUGU.UP_USERS(+)  = AU.ID_SRV   ")
							  .append(" and URL.UP_USERS(+)  = AU.ID_SRV   ")
							  .append(" and AU.ID_SRV = :idUser   ")
							  .append(" group by SYS.ID_SRV )   t1 ")
							  .append(" where t1.sys_id = SYS_FULL.ID_SRV ")
							  .append(" order by sys_full.SIGN_OBJECT ")
							  .toString())
							.setParameter("idIS", idIS)
							.setParameter("idUser", idUserAuth).getResultList();

				}

				for (Object[] objectArray : lo) {

			
					idRec = objectArray[0].toString();

					uat = new Resource();

					uat.setCode (objectArray[1] != null ? objectArray[1]
							.toString() : "");
					uat.setName (objectArray[2] != null ? objectArray[2]
							.toString() : "");
					uat.setDescription (objectArray[3] != null ? objectArray[3]
							.toString() : "");

					if (objectArray[4] != null
							&& !objectArray[4].toString().trim().equals("")) {
						uat.setLinks(Arrays.asList(objectArray[4].toString()
								.replaceAll(" ", "").split(LINKS_SEPARATOR)));
					}

					result.add(uat); // для сохранения сортировки из запроса
					resultIds.put(idRec, uat);

				}

				LOGGER.debug("resources_data:04");

			}

			sys_audit(72L, "idIS:" + idIS + "result_count:" + resultCount,
					"true; ", IPAddress, idUserAuth);

		} catch (Exception e) {
			sys_audit(72L, "; idIS:" + idIS, "error", IPAddress, idUserAuth);

			LOGGER.error("resources_data:Error:", e);

			throw new GeneralFailure(e.getMessage());
		}
		return result;

	}

	
	public List<Role> roles_data(String idIS, String category,
			Long idUserAuth, String IPAddress) throws GeneralFailure{
		     
		 //расширенная версия SyncManager is_roles
		
		// для групп систем, систем и подсистем

		       // category:
				// USER (используем idUserAuth)
				// SYS

		
				LOGGER.debug("roles_data:01");

				
				List<Role> result = new ArrayList<Role>();
				List<String> keyList = new ArrayList<String>();

				List<Object[]> lo = null;
				
				try {

					if (idIS == null || idIS.trim().isEmpty()) {
						LOGGER.debug("roles_data:01");
						throw new GeneralFailure("idIS is null!");
					}

					if (idIS.startsWith(CUDConstants.groupArmPrefix)) {
						// группа ИС

						LOGGER.debug("roles_data:02");

						// информация по системе
						if (CUDConstants.categorySYS.equals(category)) {
						 lo = em
								.createNativeQuery(
										(new StringBuilder("  SELECT '[' || sys_code || ']' || role_full.SIGN_OBJECT role_is_code, "))
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
										  .toString())
								.setParameter(1, idIS).getResultList();
						}else{
							lo = em
									.createNativeQuery(
											/*"select '['||sys_code||']' || role_full.SIGN_OBJECT role_full_code, "
													+ "role_full.FULL_, "
													+ "role_full.DESCRIPTION "
													+ "from( "
													+ "select SYS.SIGN_OBJECT sys_code,  ROL.ID_SRV role_id "
													+ "from GROUP_SYSTEMS_KNL_T gsys, "
													+ "AC_IS_BSS_T sys, "
													+ "AC_ROLES_BSS_T rol, "
													+ "LINK_GROUP_SYS_SYS_KNL_T lgr, "
													+ "LINK_GROUP_USERS_ROLES_KNL_T lugr, "
													+ "LINK_GROUP_USERS_USERS_KNL_T lugu, "
													+ "AC_USERS_LINK_KNL_T url, "
													+ "AC_USERS_KNL_T AU "
													+ "where GSYS.GROUP_CODE=:idIs "
													+ "and GSYS.ID_SRV=LGR.UP_GROUP_SYSTEMS "
													+ "and LGR.UP_SYSTEMS=SYS.ID_SRV "
													+ "and ROL.UP_IS= SYS.ID_SRV "
													+ "and (ROL.ID_SRV = URL.UP_ROLES or ROL.ID_SRV = LUGR.UP_ROLES ) "
													+ "and LUGU.UP_GROUP_USERS = LUGR.UP_GROUP_USERS(+) "
													+ "and LUGU.UP_USERS(+)  = AU.ID_SRV "
													+ "and URL.UP_USERS(+)  = AU.ID_SRV "
													+ "and AU.ID_SRV= :idUser "
													+ "group by SYS.SIGN_OBJECT, ROL.ID_SRV), "
													+ "AC_ROLES_BSS_T role_full "
													+ "WHERE role_full.ID_SRV = role_id "
													+ "order by sys_code "*/
											
											(new StringBuilder(" SELECT '[' || sys_code || ']' || role_full.SIGN_OBJECT role_full_code, "))
											  .append(" role_full.FULL_, ") 
											  .append(" role_full.DESCRIPTION ") 
											  .append("  FROM (  SELECT sys_code, role_id ") 
											  .append(" FROM (  SELECT SYS.SIGN_OBJECT sys_code, ROL.ID_SRV role_id ") 
											  .append("  FROM GROUP_SYSTEMS_KNL_T gsys, ") 
											        .append(" AC_IS_BSS_T sys, ") 
											        .append(" AC_ROLES_BSS_T rol, ") 
											        .append(" LINK_GROUP_SYS_SYS_KNL_T lgr, ") 
											        .append(" AC_USERS_LINK_KNL_T url, ") 
											        .append(" AC_USERS_KNL_T AU ") 
											  .append(" WHERE     GSYS.GROUP_CODE = :idIs ") 
											        .append(" AND GSYS.ID_SRV = LGR.UP_GROUP_SYSTEMS ") 
											        .append(" AND LGR.UP_SYSTEMS = SYS.ID_SRV ") 
											        .append(" AND ROL.UP_IS = SYS.ID_SRV ") 
											        .append(" AND ROL.ID_SRV = URL.UP_ROLES ") 
											        .append(" AND URL.UP_USERS = AU.ID_SRV ") 
											        .append(" AND AU.ID_SRV = :idUser ") 
											  .append("  GROUP BY SYS.SIGN_OBJECT, ROL.ID_SRV ") 
											  .append("  UNION ALL ") 
											  .append(" SELECT SYS.SIGN_OBJECT sys_code, ROL.ID_SRV role_id ") 
											  .append("  FROM GROUP_SYSTEMS_KNL_T gsys, ") 
											        .append(" AC_IS_BSS_T sys, ") 
											        .append(" AC_ROLES_BSS_T rol, ") 
											        .append(" LINK_GROUP_SYS_SYS_KNL_T lgr, ") 
											        .append(" LINK_GROUP_USERS_ROLES_KNL_T lugr, ") 
											        .append(" LINK_GROUP_USERS_USERS_KNL_T lugu, ") 
											        .append(" AC_USERS_KNL_T AU ") 
											  .append(" WHERE     GSYS.GROUP_CODE = :idIs ") 
											        .append(" AND GSYS.ID_SRV = LGR.UP_GROUP_SYSTEMS ") 
											        .append(" AND LGR.UP_SYSTEMS = SYS.ID_SRV ") 
											        .append(" AND ROL.UP_IS = SYS.ID_SRV ") 
											        .append(" AND ROL.ID_SRV = LUGR.UP_ROLES ") 
											        .append(" AND LUGU.UP_GROUP_USERS = LUGR.UP_GROUP_USERS ") 
											        .append(" AND LUGU.UP_USERS = AU.ID_SRV ") 
											        .append(" AND AU.ID_SRV = :idUser ") 
											  .append("  GROUP BY SYS.SIGN_OBJECT, ROL.ID_SRV) ") 
											  .append(" GROUP BY sys_code, role_id), ") 
											  .append(" AC_ROLES_BSS_T role_full ") 
											  .append(" WHERE role_full.ID_SRV = role_id ") 
											  .append("ORDER BY sys_code ")
											
											.toString() )
									.setParameter("idIs", idIS)
									.setParameter("idUser", idUserAuth).getResultList();
						}
						for (Object[] objectArray : lo) {
							LOGGER.debug("IdRole:" + objectArray[0].toString());

							Role role = new Role();

							role.setCode(objectArray[0].toString());
							role.setName(objectArray[1].toString());
							role.setDescription (objectArray[2] != null ? objectArray[2]
									.toString() : null);

							result.add(role);

							keyList.add(objectArray[0].toString());

						}

						LOGGER.debug("roles_data:03");

					} else if (idIS.startsWith(CUDConstants.armPrefix)
							|| idIS.startsWith(CUDConstants.subArmPrefix)) {
						// система или подсистема

						// !!!
						idIS = getCodeIs(idIS);

						
						// информация по системе
						if (CUDConstants.categorySYS.equals(category)) {
						
						 lo = em
								.createNativeQuery(
										(new StringBuilder("SELECT ROL.SIGN_OBJECT, ROL.FULL_, ROL.DESCRIPTION "))
										  .append(" FROM AC_IS_BSS_T app, AC_ROLES_BSS_T rol ")
										  .append(" WHERE APP.SIGN_OBJECT = ? AND ROL.UP_IS = APP.ID_SRV ")
								.toString())
								.setParameter(1, idIS).getResultList();
						}else{
							// доступные роли для пользователя
							
							lo =  em
									.createNativeQuery(
											/*"select ROL.SIGN_OBJECT, ROL.FULL_, ROL.DESCRIPTION "
													+ "from  AC_IS_BSS_T sys, "
													+ "         AC_ROLES_BSS_T rol, "
													+ "         AC_USERS_LINK_KNL_T url, "
													+ "         AC_USERS_KNL_T AU, "
													+ "         AC_SUBSYSTEM_CERT_BSS_T subsys, "
													+ "         LINK_GROUP_USERS_ROLES_KNL_T lugr, "
													+ "         LINK_GROUP_USERS_USERS_KNL_T lugu "
													+ "where (SYS.SIGN_OBJECT= :idIs or  SUBSYS.SUBSYSTEM_CODE=:idIs) "
													+ "      and (ROL.ID_SRV = URL.UP_ROLES or ROL.ID_SRV = LUGR.UP_ROLES ) "
													+ "      and LUGU.UP_GROUP_USERS= LUGR.UP_GROUP_USERS(+) "
													+ "      and LUGU.UP_USERS(+)  = AU.ID_SRV "
													+ "      and URL.UP_USERS(+)  = AU.ID_SRV "
													+ "      and ROL.UP_IS=sys.ID_SRV "
													+ "      and AU.ID_SRV= :idUser "
													+ "      and  SUBSYS.UP_IS(+) =SYS.ID_SRV "
													+ "group by ROL.SIGN_OBJECT, ROL.FULL_, ROL.DESCRIPTION "*/
											
									(new StringBuilder("SELECT SIGN_OBJECT, FULL_, DESCRIPTION "))
									  .append("  FROM (  SELECT ROL.SIGN_OBJECT, ROL.FULL_, ROL.DESCRIPTION ") 
									  .append(" FROM AC_IS_BSS_T sys, ") 
									  .append(" AC_ROLES_BSS_T rol, ") 
									  .append(" AC_USERS_LINK_KNL_T url, ") 
									  .append(" AC_USERS_KNL_T AU, ") 
									  .append(" AC_SUBSYSTEM_CERT_BSS_T subsys ") 
									  .append(" WHERE     (SYS.SIGN_OBJECT = :idIs OR SUBSYS.SUBSYSTEM_CODE = :idIs) ") 
									  .append(" AND ROL.ID_SRV = URL.UP_ROLES ") 
									  .append(" AND URL.UP_USERS = AU.ID_SRV ") 
									  .append(" AND ROL.UP_IS = sys.ID_SRV ") 
									  .append(" AND AU.ID_SRV = :idUser ") 
									  .append(" AND SUBSYS.UP_IS(+) = SYS.ID_SRV ") 
									  .append(" GROUP BY ROL.SIGN_OBJECT, ROL.FULL_, ROL.DESCRIPTION ") 
									  .append(" UNION ALL ") 
									  .append("  SELECT ROL.SIGN_OBJECT, ROL.FULL_, ROL.DESCRIPTION ") 
									  .append(" FROM AC_IS_BSS_T sys, ") 
									  .append(" AC_ROLES_BSS_T rol, ") 
									  .append(" AC_USERS_KNL_T AU, ") 
									  .append(" AC_SUBSYSTEM_CERT_BSS_T subsys, ") 
									  .append(" LINK_GROUP_USERS_ROLES_KNL_T lugr, ") 
									  .append(" LINK_GROUP_USERS_USERS_KNL_T lugu ") 
									  .append(" WHERE     (SYS.SIGN_OBJECT = :idIs OR SUBSYS.SUBSYSTEM_CODE = :idIs) ") 
									  .append(" AND ROL.ID_SRV = LUGR.UP_ROLES ") 
									  .append(" AND LUGU.UP_GROUP_USERS = LUGR.UP_GROUP_USERS ") 
									  .append(" AND LUGU.UP_USERS = AU.ID_SRV ") 
									  .append(" AND ROL.UP_IS = sys.ID_SRV ") 
									  .append(" AND AU.ID_SRV = :idUser ") 
									  .append(" AND SUBSYS.UP_IS(+) = SYS.ID_SRV ") 
									  .append(" GROUP BY ROL.SIGN_OBJECT, ROL.FULL_, ROL.DESCRIPTION) ") 
									  .append("GROUP BY SIGN_OBJECT, FULL_, DESCRIPTION ")
											
									.toString()
											)
									.setParameter("idIs", idIS)
									.setParameter("idUser", idUserAuth).getResultList();
						}
						for (Object[] objectArray : lo) {

							Role role = new Role();

							role.setCode(objectArray[0].toString());
							role.setName(objectArray[1].toString());
							role.setDescription (objectArray[2] != null ? objectArray[2]
									.toString() : null);

							result.add(role);

							keyList.add(objectArray[0].toString());

						}

						LOGGER.debug("roles_data:04");

					}

					sys_audit(80L, "idIS:" + idIS, "true", IPAddress, null);

					return result;

				} catch (Exception e) {
					sys_audit(80L, "idIS:" + idIS, "error", IPAddress, null);
					throw new GeneralFailure(e.getMessage());
				}
		
	}
	
	/**
	 * данные по организациям
	 */
	public ISOrganisations is_organisations(
	    String idIS, Integer start, Integer count, List<String> rolesCodes,
	    Long idUserAuth, String IPAddress) throws GeneralFailure {

		LOGGER.debug("is_organisations:STUB");

		return null;
	}

	/**
	 * проверки наличия системы
	 */
	public void is_exist(String idIS) throws GeneralFailure {

		LOGGER.debug("is_exist:idIS:" + idIS);

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
	 * протоколирование действий
	 */
	private void sys_audit(Long idServ, String inp_param, String result,
			String ip_adr, Long idUser) {
		LOGGER.debug("sys_audit");
		try {

			if (idUser != null && !idUser.equals(-1L)) {
				em.createNativeQuery(
						(new StringBuilder("insert into SERVICES_LOG_KNL_T( "))
						  .append("ID_SRV,  UP_SERVICES, DATE_ACTION, CREATED, ")
						  .append("input_param, result_value, ip_address, UP_USERS ) ")
						  .append("values(SERVICES_LOG_KNL_SEQ.nextval , ?, sysdate, sysdate, ")
						  .append("?, ?, ?, ? ) ")
						  .toString()
						).setParameter(1, idServ)
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
			LOGGER.error("sys_audit:Error:", e);
			
		}

	}

	/**
	 * получение ИД системы по коду системы
	 */
	private String getCodeIs(String codeSys) throws GeneralFailure {

		String result = null;

		try {

			// сюда заходим только в случае систем и подсистем
			// вообще нужно толко для подсистем - взять код их ИС.
			// при группе систем своя ветка - там код группы
			// используется прямо в запросе.

			// системы и подсистемы

			result = (String) em
					.createNativeQuery(
							(new StringBuilder("select SYS.SIGN_OBJECT "))
							  .append("from  AC_IS_BSS_T sys, ")
							  .append("AC_SUBSYSTEM_CERT_BSS_T subsys ")
							  .append("where (SYS.SIGN_OBJECT= :codeSys or  SUBSYS.SUBSYSTEM_CODE= :codeSys) ")
							  .append("and  SUBSYS.UP_IS(+) =SYS.ID_SRV ")
							  .append("group by SYS.SIGN_OBJECT ")
							  .toString())
					.setParameter("codeSys", codeSys).getSingleResult();

		

		} catch (NoResultException ex) {
			LOGGER.error("get_code_is:NoResultException");
			throw new GeneralFailure("System is not defined");
		} catch (Exception e) {
			throw new GeneralFailure(e.getMessage());
		}
		return result;
	}
	
	
	private Map<String,String> getSettingsMap(List<String> settings) throws GeneralFailure {

		String filterSt = null;
		Map<String,String> settingsMap = new HashMap<String,String>();
		
		if(settings==null||settings.isEmpty()){
			return settingsMap;
		}
		
		try {

			
			for(String setting :settings){
				if(setting==null){
					break;
				}
				LOGGER.info("getSettingsMap:01:"+setting);
				
				if(setting.startsWith("FILTER_FIO:")){
					
					filterSt = setting.substring(setting.indexOf(":")+1).trim();
					
                    if("".equals(filterSt)){
                    	filterSt="_#_";
					}
					
					
					settingsMap.put("FILTER_FIO", filterSt);
					
					LOGGER.info("getSettingsMap:02:"+filterSt);
					
					
					
				}else if(setting.startsWith("FILTER_ORG:")){
					
                    filterSt = setting.substring(setting.indexOf(":")+1).trim();
					
                    if("".equals(filterSt)){
                    	filterSt="_#_";
					}
                    
					settingsMap.put("FILTER_ORG", filterSt);
					
					LOGGER.info("getSettingsMap:03:"+filterSt);
					
					
				}else if(setting.startsWith("ACCOUNTS_ONLY:")){
					
					settingsMap.put("ACCOUNTS_ONLY", 
							"TRUE".equals(setting.substring(setting.indexOf(":")+1).toUpperCase())
							 ?"TRUE":"FALSE"
							);
					
				}
			}

		
			if(!"TRUE".equals(settingsMap.get("ACCOUNTS_ONLY"))){
				settingsMap.remove("FILTER_FIO");
				settingsMap.remove("FILTER_ORG");
			}

		} catch (Exception e) {
			throw new GeneralFailure(e.getMessage());
		}
		return settingsMap;
	}
	
	
	
}
