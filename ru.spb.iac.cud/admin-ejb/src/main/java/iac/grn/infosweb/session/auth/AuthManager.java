package iac.grn.infosweb.session.auth;

import java.util.HashMap; import java.util.Map;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import java.util.ArrayList;

import org.jboss.seam.annotations.In;

/**
 * Session Bean implementation class AuthManager
 */

 public class AuthManager implements AuthManagerLocal, AuthManagerRemote {

	@In
	transient EntityManager entityManager;

	
	public AuthManager() {
	}

	public Map<String, List<String>[]> authComplete(Long appCode,
			String login, String password) throws Exception {
		try {
			Long idUser = createAuth(login, password);
			if (idUser == null) {
				return null;
			}
			return createResourceTree(appCode, null, idUser);
		} catch (Exception e) {
			throw e;
		}
	}

	public Long authenticate(String login, String password) throws Exception {
		return createAuth(login, password);
	}

	public List<String>[] access(Long appCode, String pageCode, Long idUser)
			throws Exception {
		return createResourceTree(appCode, pageCode, idUser).get(pageCode);
	}

	private Long createAuth(String login, String password) throws Exception {
		Long idUser = null;
		try {
			idUser = ((java.math.BigDecimal) entityManager
					.createNativeQuery(
							(new StringBuilder("select AU.ID_USER "))
							  .append("from ")
							  .append("AC_USERS au ")
							  .append("where AU.LOGIN=? ")
							  .append("and AU.PASSWORD=? ")
							  .append("and (AU.START_ is null or au.START_ <= sysdate) ")
							  .append("and (AU.FINISH_ is null or au.FINISH_ > sysdate) ")
					.toString())
					.setParameter(1, login).setParameter(2, password)
					.getSingleResult()).longValue();

		
		} catch (NoResultException ex) {
			throw ex;
		} catch (Exception e) {
			throw e;
		}
		return idUser;
	}

	private Map<String, List<String>[]> createResourceTree(Long appCode,
			String pageCode, Long idUser) throws Exception {

		Map<String, List<String>[]> result = new HashMap<String, List<String>[]>();

		ArrayList<String> raiList = new ArrayList<String>();
		ArrayList<String> permList = new ArrayList<String>();
		String pageCode_prev = "", pageCode_curr = "";
		String idRai_prev = "", idRai_curr = "";
		int raiChange = 0;

		try {
			List<Object[]> lo = entityManager
					.createNativeQuery(
							(new StringBuilder("select AAD.PAGE_CODE, ARR.ID_RAION, ADP.ID_PERM "))
							  .append("from AC_APP_DOMAINS aad, ")
							  .append("AC_LINK_ROLE_APP_DOMEN_PRMSSNS adp, ")
							  .append("AC_LINK_USER_TO_ROLE_TO_RAIONS arr ")
							  .append("where AAD.APP_CODE=? and ")
							  .append("adp.ID_DOMEN=AAD.ID_DOMEN ")
							  .append("and adp.ID_ROLE=arr.ID_ROLE ")
							  .append("and arr.ID_USER=? ")
					
								.append(pageCode != null ? "and AAD.PAGE_CODE=? ": "and 1=? ")
								.append("group by AAD.PAGE_CODE, ARR.ID_RAION, ADP.ID_PERM ")
								.append("order by  AAD.PAGE_CODE, ARR.ID_RAION, ADP.ID_PERM ")
									
									.toString())
					.setParameter(1, appCode).setParameter(2, idUser)
					.setParameter(3, (pageCode != null ? pageCode : 1))
					.getResultList();

		
			for (Object[] objectArray : lo) {
				pageCode_curr = objectArray[0].toString();
				idRai_curr = objectArray[1].toString();

				if (pageCode_curr.equals(pageCode_prev)
						|| "".equals(pageCode_prev)) {

					if ((idRai_curr.equals(idRai_prev) || "".equals(idRai_prev))) {
						if (raiChange == 0) {
							permList.add(objectArray[2].toString());
							 
						}
						if ("".equals(idRai_prev) && !"-1".equals(idRai_curr)) {
							 
							raiList.add(idRai_curr);
						}
					} else {

						if (!"-1".equals(idRai_curr)) {
							raiList.add(idRai_curr);
						}
						 
						raiChange = 1;
					}

				} else {
					result.put(pageCode_prev, new ArrayList[] { raiList,
							permList });
					raiChange = 0;
					raiList.clear();
					permList.clear();
					if (!"-1".equals(idRai_curr)) {
						raiList.add(objectArray[1].toString());
					}
					permList.add(objectArray[2].toString());

				}

				idRai_prev = idRai_curr;
				pageCode_prev = pageCode_curr;
				 
				 
			}
			if (!"".equals(idRai_curr)) {
				result.put(pageCode_prev, new ArrayList[] { raiList, permList });
			}
			
		} catch (Exception e) {
				throw e;
		}
		return result;
	}
}