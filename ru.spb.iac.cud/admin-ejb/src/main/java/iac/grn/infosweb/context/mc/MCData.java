package iac.grn.infosweb.context.mc;

import static iac.cud.jboss.SeamComponentAdminEjb.getApplicationLinksMap;
import static iac.cud.jboss.SeamComponentAdminEjb.getSessionItem;
import iac.cud.infosweb.entity.AcApplication;
import iac.cud.infosweb.entity.AcUser;

import java.util.List;

import javax.persistence.EntityManager;





import org.jboss.seam.log.Log;

import javaw.util.ArrayList;
import javaw.util.Tuple;

public class MCData {
	protected final Log log;
	protected MCData(Log log) { this.log = log;	}	
	
	public static<K> Tuple.T3<String,String,K> atrOp(String name, String op, K value) {
		return new Tuple.T3<String,String,K>(name,op,value);
	}
	public static<K> Tuple.T3<String,String,K> atrOp(String name, K value) {
		return new Tuple.T3<String,String,K>(name,"=",value);
	}
	
	public static boolean hasAtr(Log log, EntityManager entityManager,
		String domain, Tuple.T3<String, String, ?> ... atrOps ) {
		if(atrOps.length==0) {
			log.error("hasAtr: no attrs to check!");			
		} else try {
			final StringBuilder sbQuery = new StringBuilder("select ");
			javax.persistence.Query q;
			if(atrOps.length==1) {
				Tuple.T3<String, String, ?> ao = atrOps[0];
				String atrName = ao.item1;
				sbQuery.append(atrName)
					.append(" from ").append(domain)
					.append(" where ").append(atrName).append(ao.item2).append(" ?");
				q = entityManager.createNativeQuery(sbQuery.toString());
				q.setParameter(1, ao.item3);				
			} else {
				Tuple.T3<String, String, ?> ao = atrOps[0];
				sbQuery.append("domain.").append(ao.item1)
	                   .append(" from ").append(domain).append(" domain")
	                   .append(" where domain.").append(ao.item1).append(ao.item2).append("?");
				for(int i=1; i<atrOps.length; ++i) {
					ao = atrOps[i];
					if(ao.item3==null) 
						return false;
					else
						sbQuery.append(" and domain.").append(ao.item1).append(ao.item2).append("?");						
				}
				q = entityManager.createNativeQuery(sbQuery.toString());
				int i=0;
				for(Tuple.T3<String, String, ?> aop: atrOps)			
					q.setParameter(++i, aop.item3);
			}
			return !q.getResultList().isEmpty();
		} catch(Exception e){
	           log.error("hasAtr:Error:"+e);
	           throw e;
        }		
		return false;
	}
	
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
