package iac.grn.infosweb.session.navig;

import iac.cud.authmodule.dataitem.AuthItem;
import iac.cud.authmodule.dataitem.PageItem;
import iac.cud.infosweb.dataitems.NavigItem;
import iac.cud.infosweb.entity.AcAppPage;
import iac.cud.infosweb.entity.AcUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;

import iac.grn.infosweb.session.navig.LinksMap;

import org.jboss.seam.Component;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.contexts.Contexts;
import org.jboss.seam.log.Log;
import org.omg.CORBA.INTF_REPOS;

/**
 * Управляющий бин, осуществляющий реализацию навигации по используемым ресурсам
 * приложения
 * 
 * @author bubnov
 * 
 */
@Name("navigManager")
 public class NavigManager {

	@Logger
	private static Log log;

	
	/**
	 * Менеджер сущностей, обеспечивающий взаимодействие с БД
	 */
	@In
	transient EntityManager entityManager;

	/**
	 * Импортируемая сущности Используемых Ресурсов для навигации
	 */
	@In
	LinksMap linksMap;

	/**
	 * Текущий активный раздел
	 */
	private String activeSection;

	/**
	 * Список элементов меню
	 */
	private List<AcAppPage> listMenu = null;

	private List<NavigItem> listNavigMenu = null;

	public List<AcAppPage> getListMenu() throws Exception {
		log.info("navigManager:getListMenu:01");

		try {
			if (listMenu == null) {
				listMenu = entityManager
						.createQuery(
								(new StringBuilder("select aap from AcAppPage aap "))
								  .append("where aap.idParent.idParent2 = 1 and aap.idParent.acApplication = :acApplication ")
								  .append("and aap.visible = 1 order by orderNum ")
								  .toString()
						)
						.setParameter("acApplication", linksMap.getAppCode())
						.getResultList();
			}
		} catch (Exception e) {
			log.error("getListMenu:ERROR:", e);
			throw e;
		}
		return listMenu;
	}
	
	private static List<Object[]> queryNavigData(EntityManager entityManager, LinksMap linksMap) {
		return entityManager
				.createNativeQuery(
				// "SELECT N.ID_SRV, N.UP, N.PAGE_CODE, LPAD(' ',
				// (LEVEL - 1) * 2) || N.PAGE_NAME PAGE_NAME , LEVEL
						(new StringBuilder("SELECT N.ID_SRV, N.UP, N.PAGE_CODE, N.PAGE_NAME, LEVEL "))
						  .append("FROM AC_APP_DOMAINS_BSS_T n ")
						  .append("WHERE N.IS_VISIBLE=1 ")
						  .append("CONNECT BY  PRIOR N.ID_SRV = N.UP ")
						  .append("START WITH N.UP= ")
						  .append("(SELECT N2.ID_SRV FROM AC_APP_DOMAINS_BSS_T n2 WHERE N2.UP_IS=? and N2.UP=1 )")
						  .append("ORDER SIBLINGS BY  N.ORDER_NUM, N.PAGE_NAME ")
						  .toString()
				)
				.setParameter(1, linksMap.getAppCode())
				.getResultList();
	}
	
	private static class NavigItemInfo {
		static boolean isAccOrgManager;
		static Map<String, PageItem> mpPageList;
		static {
			AcUser cau = (AcUser) Component.getInstance("currentUser",ScopeType.SESSION);
			isAccOrgManager = cau.getIsAccOrgManagerValue();
			if(isAccOrgManager) {
				AuthItem ai=(AuthItem)Component.getInstance("authItem", ScopeType.SESSION);
				mpPageList = ai.getPageList();
			}
		}
		
		public NavigItem navi;
		public int level;
		
		public boolean hasAdded;
		public boolean isAccessible;
		
		NavigItemInfo(Object[] objectArray) {
			String pageCode = (objectArray[2] != null ? objectArray[2].toString(): "");			
			navi = new NavigItem(
					(objectArray[0] != null ? objectArray[0].toString(): ""),
					pageCode,
					(objectArray[3] != null ? objectArray[3].toString(): ""));
			isAccessible = isAccOrgManager? mpPageList.containsKey(pageCode): true;	
			level = Integer.parseInt(objectArray[4].toString());
		}
		
		void linkParent(NavigItemInfo parentInfo, List<NavigItem> navList) {
			if(isAccessible) {
				NavigItem parent = parentInfo.navi;
				if(parentInfo.level==1 && !parentInfo.hasAdded) {
					navList.add(parent);
					parentInfo.hasAdded = true;
				}				
				linkParent2(parent);
			}
		}
		void linkParent(NavigItem parent) {
			if(isAccessible)
				linkParent2(parent);
		}
		private void linkParent2(NavigItem parent) {
			navi.setParent(parent);
			List<NavigItem> kids = parent.getChildren();
			if (kids == null) {
				kids = new ArrayList<NavigItem>();							
				parent.setChildren(kids);
			}
			kids.add(navi);		
		}		
		
		public static enum NavigItemRelation { LOWER, SIBLING, UPPER }
		public NavigItemRelation getRelationTo(NavigItemInfo niInfo) {
			if(level>niInfo.level) return NavigItemRelation.LOWER;
			else if(level<niInfo.level) return NavigItemRelation.UPPER;
			return NavigItemRelation.SIBLING;			
		}
		
	}

	

	
	private List<NavigItem> getNavigList() {
		List<NavigItem> navigList = (List<NavigItem>) Component
				.getInstance("navigList", ScopeType.SESSION);

		if (navigList == null) {
			navigList = new ArrayList<NavigItem>();
			log.info("navigManager:getListNavigMenu:02");
			List<Object[]> lo = queryNavigData(entityManager, linksMap);
			NavigItemInfo nifprv = null, nifpar = null;
			for (Object[] objectArray : lo) {
				NavigItemInfo nif = new NavigItemInfo(objectArray);
				if(nif.level>1) {
					switch(nif.getRelationTo(nifprv)) {
						case LOWER:  // пошли дочерние записи
							nifpar = nifprv;
						case SIBLING:	
							nif.linkParent(nifpar, navigList);
							break;
						case UPPER:  // прошли дочерние записи	
							nif.linkParent(nifpar.navi.getParent());
					}
				}
				nifprv = nif;
			}
			Contexts.getSessionContext().set("navigList", navigList);
		}
		return navigList;		
	}
		

	public List<NavigItem> getListNavigMenu() throws Exception {
		log.info("navigManager:getListNavigMenu:01");
		try {
				if (listNavigMenu == null) { 
					listNavigMenu = getNavigList();
				}
		} catch (Exception e) {
			log.error("getListNavigMenu:ERROR:", e);
			throw e;
		}
		return listNavigMenu;
	}

	

	public String getActiveSection() {
		if (activeSection == null) {
			String actSect = FacesContext.getCurrentInstance()
					.getExternalContext().getRequestParameterMap()
					.get("actSect");
			log.info("getActiveSection:actSect:" + actSect);
		
			if (actSect == null) {
				activeSection = "#topnav_0";
			} else {
				activeSection = "#topnav_" + actSect;
			}
		}
		return activeSection;
	}

	public void setActiveSection(String activeSection) {
		this.activeSection = activeSection;
	}

	
}

