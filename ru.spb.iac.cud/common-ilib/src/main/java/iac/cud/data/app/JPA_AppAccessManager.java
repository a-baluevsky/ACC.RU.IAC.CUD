package iac.cud.data.app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import ru.spb.iac.cud.core.data.JPABuilder;

public class JPA_AppAccessManager extends JPABuilder {

	//список ролей, которые надо назначить пользователю по заявке
	public static List<String> getUserRolesReq(EntityManager entityManager, Long idApp) {
		return (List<String>) entityManager.createNativeQuery(
   			  (new StringBuilder("select to_char(RL.ID_SRV) "))
                 .append("from JOURN_APP_ACCESS_BSS_T jas, ")
                 .append("ROLES_APP_ACCESS_BSS_T rlapp, ")
                 .append("AC_ROLES_BSS_T rl ")
                 .append("where RLAPP.UP_APP_ACCESS=JAS.ID_SRV ")
                 .append("and RL.ID_SRV=RLAPP.UP_ROLE ")
                 .append("and JAS.ID_SRV=? ")
                 .append("order by RL.FULL_ ")
   			  .toString())
   			.setParameter(1, idApp)
   			.getResultList();
	}
	
	//список ролей, которые уже есть у пользователя в системе 
	public static List<String> getUserRolesArm(EntityManager entityManager,
			Long idArm, Long idUser) {		
		
		Query query = entityManager.createNativeQuery(
  			  (new StringBuilder("select to_char(URL.UP_ROLES) "))
              .append("from AC_ROLES_BSS_T rl, ")
              .append("AC_USERS_LINK_KNL_T url ")
              .append("where RL.ID_SRV=URL.UP_ROLES ")
              .append("and RL.UP_IS=? ")
              .append("and URL.UP_USERS=? ")
			  .toString())
			.setParameter(1, idArm)
			.setParameter(2, idUser);
		
		System.out.println(getQueryString(query));		
		return (List<String>)query.getResultList();
	}
	
}
