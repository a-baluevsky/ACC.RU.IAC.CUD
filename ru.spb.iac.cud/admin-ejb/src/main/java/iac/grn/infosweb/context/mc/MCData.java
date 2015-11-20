package iac.grn.infosweb.context.mc;

import static iac.cud.jboss.SeamComponentAdminEjb.getApplicationLinksMap;
import static iac.cud.jboss.SeamComponentAdminEjb.getSessionItem;
import iac.cud.infosweb.entity.AcApplication;
import iac.cud.infosweb.entity.AcUser;

import java.util.List;

import javax.persistence.EntityManager;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.log.Log;

import javaw.util.ArrayList;

public class MCData {
	protected final Log log;
	protected MCData(Log log) { this.log = log;	}	
	
	public static class ArmList extends MCData {
		public ArmList(Log log) { super(log); }
		private /*Serializable*/ List<AcApplication> listArm = null;	
		public List<AcApplication> getListArm(EntityManager entityManager) throws Exception {
		    log.info("ArmList:getListArm:01");
		    try {
		    	if(listArm==null){
		    		
		    		String query = null;
		    		
		    		AcUser cau = getSessionItem("currentUser"); 
		    		Long appCode = getApplicationLinksMap().getAppCode();
					
		    		if(!cau.getIsSysAdmin().equals(1L)){
		    			query=" o.idArm!="+appCode;
		    		}
		    		
		    		if(cau.getAllowedSys()!=null){
		    			listArm=new ArrayList<AcApplication>(
		    					entityManager.createQuery(
		    					"select o from AcApplication o "
		    				    + "where o.idArm in (:idsArm) " +
		    				    (query!=null?" and "+query:" ")+" order by o.name ")
		       				    .setParameter("idsArm", cau.getAllowedSys())
		    					.getResultList()
		    					);
		    		}else{
		    			listArm=new ArrayList<AcApplication>(
		    					entityManager.createQuery(
		    					"select o from AcApplication o "+
		    					(query!=null?" where "+query:" ")+" order by o.name ")
		    					.getResultList());
		    		}
		    		
		      	}
		     } catch (Exception e) {
		    	 log.error("ArmList:getListArm:ERROR:"+e);
		         throw e;
		     }
		    return listArm;
		}		
	}
	
	

}
