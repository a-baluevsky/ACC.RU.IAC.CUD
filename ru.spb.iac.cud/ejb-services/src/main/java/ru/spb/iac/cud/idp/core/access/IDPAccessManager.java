package ru.spb.iac.cud.idp.core.access;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.spb.iac.cud.core.util.CUDConstants;

/**
 * EJB для предоставления информации по пользователю при авторизации
 * 
 * @author bubnov
 * 
 */

@Stateless
 public class IDPAccessManager implements IDPAccessManagerLocal,
		IDPAccessManagerRemote {

	@PersistenceContext(unitName = "AuthServices")
	EntityManager em;

	private static final Logger LOGGER = LoggerFactory.getLogger(IDPAccessManager.class);

	private static Map<Integer,String> attributesList;
	
	static{
	   
	   attributesList= new HashMap<Integer,String>();
		
       attributesList.put(0, "USER_UID");
       attributesList.put(1, "USER_LOGIN");
       attributesList.put(3, "USER_FIO");
       attributesList.put(4, "USER_PHONE");
       attributesList.put(5, "USER_EMAIL");
       attributesList.put(9, "ORG_NAME");
       attributesList.put(8, "ORG_CODE_IOGV");
       attributesList.put(10, "ORG_ADDRESS");
       attributesList.put(11, "ORG_PHONE");
       attributesList.put(7, "DEP_NAME");
       attributesList.put(6, "USER_POSITION");
       attributesList.put(12, "ORG_CODE_OKATO");
       attributesList.put(13, "DEP_ADDRESS");

       attributesList.put(14, "ORG_EMAIL");
       attributesList.put(15, "ORG_SITE");
       attributesList.put(16, "ORG_OKPO");
       attributesList.put(17, "ORG_OKOGU");
       attributesList.put(18, "ORG_OGRN");
       attributesList.put(19, "ORG_INN");
       attributesList.put(20, "ORG_KPP");
       
	}
	
	/**
	 * получение аттрибутов пользователя
	 */
	public Map<String, String> attributes(String login) throws Exception {

		Map<String, String> result = new HashMap<String, String>();

		List<Object[]> lo = null;

		try {
			LOGGER.debug("attributes:login:" + login);

			String sqlQuery = (new StringBuilder("SELECT t1.t1_id, ")) 
					.append("       t1.t1_login,   ")
					.append("       t1.t1_usr_code,  ")
					.append("       t1.t1_fio,  ")
					.append("       t1.t1_tel,  ")
					.append("       t1.t1_email,  ")
					.append("       t1.t1_pos,  ")
					.append("       t1.t1_dep_name,  ")
					.append("       t1.t1_org_code,  ")
					.append("       t1.t1_org_name,  ")
					.append("       t1.t1_org_adr,  ")
					.append("       t1.t1_org_tel,  ")
					.append("       t1.t1_org_okato, ")
					.append("       t1.t1_dep_adr,")
					.append("       t1.t1_org_email,  ")
					.append("         t1.t1_org_SITE,  ")
					.append("       t1.t1_org_OKPO,  ")
					.append("       t1.t1_org_OKOGU, ")
					.append("       t1.t1_org_OGRN,")
					.append("       t1.t1_org_INN,")
					.append("        t1.t1_org_KPP")
					.append("  FROM (SELECT AU_FULL.ID_SRV t1_id,  ")
					.append("               AU_FULL.login t1_login,  ")
					.append("               AU_FULL.CERTIFICATE t1_cert,  ")
					.append("               t2.CL_USR_CODE t1_usr_code,  ")
					.append("               DECODE (  ")
					.append("                  AU_FULL.UP_SIGN_USER,  ")
					.append("                  NULL,    AU_FULL.SURNAME  ")
					.append("                        || ' '  ")
					.append("                        || AU_FULL.NAME_  ")
					.append("                        || ' '  ")
					.append("                        || AU_FULL.PATRONYMIC,  ")
					.append("                  CL_USR_FULL.FIO)  ")
					.append("                  t1_fio,  ")
					.append("               DECODE (AU_FULL.UP_SIGN_USER,  ")
					.append("                       NULL, AU_FULL.PHONE,  ")
					.append("                       CL_USR_FULL.PHONE)  ")
					.append("                  t1_tel,  ")
					.append("               DECODE (AU_FULL.UP_SIGN_USER,  ")
					.append("                       NULL, AU_FULL.E_MAIL,  ")
					.append("                       CL_USR_FULL.EMAIL)  ")
					.append("                  t1_email,  ")
					.append("               DECODE (AU_FULL.UP_SIGN_USER,  ")
					.append("                       NULL, AU_FULL.POSITION,  ")
					.append("                       CL_USR_FULL.POSITION)  ")
					.append("                  t1_pos,  ")
					.append("               DECODE (  ")
					.append("                  AU_FULL.UP_SIGN_USER,  ")
					.append("                  NULL, AU_FULL.DEPARTMENT,  ")
					.append("                  DECODE (SUBSTR (CL_DEP_FULL.sign_object, 4, 2),  ")
					.append("                          '00', NULL,  ")
					.append("                          CL_DEP_FULL.FULL_))  ")
					.append("                  t1_dep_name,  ")
					.append("               t1.CL_ORG_CODE t1_org_code,  ")
					.append("    ")
					.append("    DECODE ( org_ext.fullname, null,   CL_ORG_FULL.FULL_, org_ext.fullname)  t1_org_name,  ")
					.append("        DECODE (  org_ext.address, null,   1||CL_ORG_FULL.PREFIX  ")
					.append("               || DECODE (CL_ORG_FULL.HOUSE,  ")
					.append("                          NULL, NULL,  ")
					.append("                          ',' || CL_ORG_FULL.HOUSE)  , org_ext.address)")
					.append("                  t1_org_adr,  ")
					.append("               DECODE ( org_ext.phone, null,  CL_ORG_FULL.PHONE,  org_ext.phone) t1_org_tel,")
					.append("                 DECODE ( org_ext.email, null,  CL_ORG_FULL.email,  org_ext.email) t1_org_email,  ")
					.append("                  org_ext.SITE t1_org_SITE,  ")
					.append("                   org_ext.OKPO  t1_org_OKPO, ")
					.append("                   org_ext.OKOGU t1_org_OKOGU,  ")
					.append("                   org_ext.OGRN  t1_org_OGRN,  ")
					.append("                   org_ext.INN  t1_org_INN,  ")
					.append("                   org_ext.KPP t1_org_KPP,  ")
					.append("                   AU_FULL.STATUS t1_status,  ")
					.append("                 DECODE (  ")
					.append("                  AU_FULL.UP_SIGN_USER,  ")
					.append("                  NULL, NULL,  ")
					.append("                  DECODE (SUBSTR (CL_DEP_FULL.sign_object, 4, 2),  ")
					.append("                          '00', NULL,  ")
					.append("                          CL_DEP_FULL.sign_object))  ")
					.append("                  t1_dep_code,  ")
					.append("               CL_ORG_FULL.STATUS t1_org_status,  ")
					.append("               CL_usr_FULL.STATUS t1_usr_status,  ")
					.append("               DECODE (  ")
					.append("                  AU_FULL.UP_SIGN_USER,  ")
					.append("                  NULL, NULL,  ")
					.append("                  DECODE (SUBSTR (CL_DEP_FULL.sign_object, 4, 2),  ")
					.append("                          '00', NULL,  ")
					.append("                          CL_DEP_FULL.STATUS))  ")
					.append("                  t1_dep_status,  ")
					.append("               CL_ORG_FULL.SIGN_OKATO t1_org_okato,  ")
					.append("               CL_DEP_FULL.PREFIX  ")
					.append("               || DECODE (CL_DEP_FULL.HOUSE,  ")
					.append("                          NULL, NULL,  ")
					.append("                          ',' || CL_DEP_FULL.HOUSE)  ")
					.append("                  t1_dep_adr  ")
					.append("          FROM (  SELECT MAX (CL_ORG.ID_SRV) CL_ORG_ID,  ")
					.append("                         CL_ORG.SIGN_OBJECT CL_ORG_CODE  ")
					.append("                    FROM ISP_BSS_T cl_org, AC_USERS_KNL_T au  ")
					.append("                   WHERE AU.UP_SIGN = CL_ORG.SIGN_OBJECT AND AU.LOGIN = :login  ")
					.append("                GROUP BY CL_ORG.SIGN_OBJECT) t1,  ")
					.append("               (  SELECT MAX (CL_usr.ID_SRV) CL_USR_ID,  ")
					.append("                         CL_USR.SIGN_OBJECT CL_USR_CODE  ")
					.append("                    FROM ISP_BSS_T cl_usr, AC_USERS_KNL_T au  ")
					.append("                   WHERE AU.UP_SIGN_USER = CL_usr.SIGN_OBJECT  ")
					.append("                         AND AU.LOGIN = :login  ")
					.append("                GROUP BY CL_usr.SIGN_OBJECT) t2,  ")
					.append("               (  SELECT MAX (CL_dep.ID_SRV) CL_DEP_ID,  ")
					.append("                         CL_DEP.SIGN_OBJECT CL_DEP_CODE  ")
					.append("                    FROM ISP_BSS_T cl_dep, AC_USERS_KNL_T au  ")
					.append("                   WHERE SUBSTR (au.UP_SIGN_USER, 1, 5) || '000' =  ")
					.append("                            cl_dep.SIGN_OBJECT(+)  ")
					.append("                         AND AU.LOGIN = :login  ")
					.append("                GROUP BY CL_DEP.SIGN_OBJECT) t3,  ")
					.append("               ISP_BSS_T cl_org_full,  ")
					.append("               ISP_BSS_T cl_usr_full,  ")
					.append("               ISP_BSS_T cl_dep_full,  ")
					.append("               AC_USERS_KNL_T au_full,")
					.append("               ISP_EXT_BSS_T org_ext  ")
					.append("         WHERE     cl_org_full.ID_SRV = CL_ORG_ID  ")
					.append("               AND cl_usr_full.ID_SRV(+) = CL_USR_ID  ")
					.append("               AND cl_DEP_full.ID_SRV(+) = CL_DEP_ID  ")
					.append("               AND au_full.UP_SIGN = CL_ORG_CODE  ")
					.append("               AND au_full.UP_SIGN_USER = CL_USR_CODE(+)  ")
					.append("               AND SUBSTR (au_full.UP_SIGN_USER, 1, 5) || '000' =  ")
					.append("                      CL_DEP_CODE(+)  ")
					.append("               AND au_full.login = :login")
					.append("               and org_ext.sign_object(+) = cl_org_full.sign_object")
					.append("               and  org_ext.status(+)=1 ) t1 ")
					.toString();
			
			Query query = em.createNativeQuery(sqlQuery)
					.setParameter("login", login)
					.setHint("org.hibernate.readOnly", true);
					lo = query.getResultList();

			for (Object[] objectArray : lo) {

				String name = null;

				for (int i = 0; i < objectArray.length; i++) {

			
					if (attributesList.get(i) != null) {

						result.put(
								attributesList.get(i),
								objectArray[i] != null ? objectArray[i]
										.toString() : "");
					}
				}
			}

			if (result != null) {
				LOGGER.debug("attributes:result:" + result.size());
			}
		} catch (Exception e) {
			LOGGER.error("attributes:error:", e);
		}

		// если result = null, то будет выброшено исключение
		// в KeyStoreKeyManager.getValidatingKey() -
		// throw LOGGER.keyStoreMissingDomainAlias(domain);

		return result;
	}

	/**
	 * получение кодов ролей пользователя
	 */
	public List<String> rolesCodes(String login, String domain)
			throws Exception {

		List<String> result = new ArrayList<String>();
		try {
			LOGGER.debug("rolesCodes:domain:" + domain);

			if (domain != null
					&& (domain.startsWith(CUDConstants.armPrefix) || domain
							.startsWith(CUDConstants.subArmPrefix))) {
			
				result = (List<String>) em
						.createNativeQuery(
								
			(new StringBuilder("  SELECT * "))
			  .append("  FROM (  SELECT ROL.SIGN_OBJECT ") 
			  .append(" FROM AC_IS_BSS_T sys, ") 
			  .append(" AC_ROLES_BSS_T rol, ") 
			  .append(" AC_USERS_LINK_KNL_T url, ") 
			  .append(" AC_USERS_KNL_T AU, ") 
			  .append(" AC_SUBSYSTEM_CERT_BSS_T subsys ") 
			  .append(" WHERE (SYS.SIGN_OBJECT = :idIs ") 
			  .append("  OR SUBSYS.SUBSYSTEM_CODE = :idIs) ") 
			  .append(" AND ROL.ID_SRV = URL.UP_ROLES ") 
			  .append(" AND URL.UP_USERS = AU.ID_SRV ") 
			  .append(" AND ROL.UP_IS = sys.ID_SRV ") 
			  .append(" AND AU.LOGIN = :login ") 
			  .append(" AND SUBSYS.UP_IS(+) = SYS.ID_SRV ") 
			  .append(" GROUP BY ROL.SIGN_OBJECT ") 
			  .append(" UNION ALL ") 
			  .append("  SELECT ROL.SIGN_OBJECT ") 
			  .append(" FROM AC_IS_BSS_T sys, ") 
			  .append(" AC_ROLES_BSS_T rol, ") 
			  .append(" AC_USERS_KNL_T AU, ") 
			  .append(" AC_SUBSYSTEM_CERT_BSS_T subsys, ") 
			  .append(" LINK_GROUP_USERS_ROLES_KNL_T lugr, ") 
			  .append(" LINK_GROUP_USERS_USERS_KNL_T lugu ") 
			  .append(" WHERE (SYS.SIGN_OBJECT = :idIs ") 
			  .append("  OR SUBSYS.SUBSYSTEM_CODE = :idIs) ") 
			  .append(" AND ROL.ID_SRV = LUGR.UP_ROLES ") 
			  .append(" AND LUGU.UP_GROUP_USERS = LUGR.UP_GROUP_USERS ") 
			  .append(" AND LUGU.UP_USERS = AU.ID_SRV ") 
			  .append(" AND ROL.UP_IS = sys.ID_SRV ") 
			  .append(" AND AU.LOGIN = :login ") 
			  .append(" AND SUBSYS.UP_IS(+) = SYS.ID_SRV ") 
			  .append(" GROUP BY ROL.SIGN_OBJECT) ") 
			  .append("GROUP BY SIGN_OBJECT")
								
			.toString())
										
										
						.setParameter("idIs", domain)
						.setParameter("login", login).getResultList();

			} else if (domain != null
					&& domain.startsWith(CUDConstants.groupArmPrefix)) {

				result = (List<String>) em
						.createNativeQuery(
								
								
								(new StringBuilder("SELECT '[' || sys_code || ']' || role_code role_full_code "))
								  .append("  FROM (  SELECT SYS.SIGN_OBJECT sys_code, ROL.SIGN_OBJECT role_code ") 
								  .append(" FROM GROUP_SYSTEMS_KNL_T gsys, ") 
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
								  .append(" AND URL.UP_USERS  = AU.ID_SRV ") 
								  .append(" AND AU.LOGIN = :login ") 
								  .append(" GROUP BY SYS.SIGN_OBJECT, ROL.SIGN_OBJECT ") 
								  .append(" UNION ALL ") 
								  .append("  SELECT SYS.SIGN_OBJECT sys_code, ROL.SIGN_OBJECT role_code ") 
								  .append(" FROM GROUP_SYSTEMS_KNL_T gsys, ") 
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
								  .append(" AND LUGU.UP_GROUP_USERS = LUGR.UP_GROUP_USERS(+) ") 
								  .append(" AND LUGU.UP_USERS = AU.ID_SRV ") 
								  .append(" AND AU.LOGIN = :login ") 
								  .append(" GROUP BY SYS.SIGN_OBJECT, ROL.SIGN_OBJECT) ") 
								  .append("GROUP BY sys_code, role_code ") 
								  .append("ORDER BY sys_code ")
						
								
								.toString())
										
										
						.setParameter("idIs", domain)
						.setParameter("login", login).getResultList();

			}

			if (result != null) {
				LOGGER.debug("rolesCodes:result:" + result.size());
			}
		} catch (Exception e) {
			LOGGER.error("rolesCodes:error:", e);
		}

		return result;
	}

	/**
	 * получение списка подсистем
	 */
	@SuppressWarnings("unchecked")
	public List<String> resources(String login, String domain) throws Exception {

		List<String> result = new ArrayList<String>();
		try {
			LOGGER.debug("resources:01:" + domain);

			if (domain != null
					&& (domain.startsWith(CUDConstants.armPrefix) || domain
							.startsWith(CUDConstants.subArmPrefix))) {

				// закомментированно, т.к. ресурсы отдаём
				// только для групп систем
				/*
				 * result = (List<String>) em.createNativeQuery(
				 * "select '['||sys_full.SIGN_OBJECT||']' || '['||sys_full.FULL_||']' || '['||sys_full.LINKS ||']' from AC_IS_BSS_T sys_full, "
				 * + " (select   SYS.ID_SRV sys_id " +
				 * "                     from  AC_IS_BSS_T sys,     " +
				 * "                              AC_ROLES_BSS_T rol,     " +
				 * "                              AC_USERS_LINK_KNL_T url,     "
				 * + "                              AC_USERS_KNL_T AU,     " +
				 * "                              AC_SUBSYSTEM_CERT_BSS_T subsys,   "
				 * +
				 * "                              LINK_GROUP_USERS_ROLES_KNL_T lugr,   "
				 * +
				 * "                              LINK_GROUP_USERS_USERS_KNL_T lugu     "
				 * +
				 * "                     where (SYS.SIGN_OBJECT= :idIs or  SUBSYS.SUBSYSTEM_CODE=:idIs)     "
				 * +
				 * "                           and (ROL.ID_SRV = URL.UP_ROLES or ROL.ID_SRV = LUGR.UP_ROLES )   "
				 * +
				 * "                           and LUGU.UP_GROUP_USERS= LUGR.UP_GROUP_USERS(+)   "
				 * +
				 * "                           and LUGU.UP_USERS(+)  = AU.ID_SRV   "
				 * +
				 * "                           and URL.UP_USERS(+)  = AU.ID_SRV   "
				 * + "                           and ROL.UP_IS=sys.ID_SRV    " +
				 * "                           and AU.LOGIN= :login     " +
				 * "                           and  SUBSYS.UP_IS(+) =SYS.ID_SRV     "
				 * + "                     group by SYS.ID_SRV  ) t1 " +
				 * "                     " +
				 * "                     where t1.sys_id = SYS_FULL.ID_SRV ")
				 * .setParameter("idIs", domain) .setParameter("login", login)
				 * .getResultList();
				 */

			} else if (domain != null
					&& domain.startsWith(CUDConstants.groupArmPrefix)) {

				result = (List<String>) em
						.createNativeQuery(
								(new StringBuilder(" select '['||sys_full.SIGN_OBJECT||']' || '['||sys_full.FULL_||']' || '['|| sys_full.LINKS ||']' "))
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
								  .append(" where GSYS.GROUP_CODE=:idIs   ")
								  .append(" and GSYS.ID_SRV=LGR.UP_GROUP_SYSTEMS   ")
								  .append(" and LGR.UP_SYSTEMS=SYS.ID_SRV   ")
								  .append(" and ROL.UP_IS= SYS.ID_SRV   ")
								  .append(" and (ROL.ID_SRV = URL.UP_ROLES or ROL.ID_SRV = LUGR.UP_ROLES )   ")
								  .append(" and LUGU.UP_GROUP_USERS = LUGR.UP_GROUP_USERS(+)   ")
								  .append(" and LUGU.UP_USERS(+)  = AU.ID_SRV   ")
								  .append(" and URL.UP_USERS(+)  = AU.ID_SRV   ")
								  .append(" and AU.LOGIN= :login    ")
								  .append(" group by SYS.ID_SRV )   t1 ")
								  .append(" where t1.sys_id = SYS_FULL.ID_SRV ")
								  .append(" order by sys_full.SIGN_OBJECT")
						.toString())
						.setParameter("idIs", domain)
						.setParameter("login", login).getResultList();

			}

			if (result != null) {
				LOGGER.debug("resources:result:" + result.size());
			}
		} catch (Exception e) {
			LOGGER.error("resources:error:", e);
		}

		return result;
	}

	public void saveTokenID(String tokenID, String userID) throws Exception{
		
	 try{
		LOGGER.debug("saveTokenID:01");
		
		em.createNativeQuery(
				 (new StringBuilder("insert into TOKEN_KNL_T "))
				   .append("(ID_SRV, UP_USERS, SIGN_OBJECT,  CREATED ) ")
				   .append("values ")
				   .append("(TOKEN_KNL_SEQ.nextval, ?, ?, sysdate) ")
				 .toString())
				 .setParameter(1, userID)
				 .setParameter(2, tokenID)
				 .executeUpdate();
	} catch (Exception e) {
		LOGGER.error("saveTokenID:error:", e);
	}
	}
}
