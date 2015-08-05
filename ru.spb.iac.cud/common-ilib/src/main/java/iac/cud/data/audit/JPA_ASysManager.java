package iac.cud.data.audit;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.persistence.EntityManager;


// Java Persistence Abstraction layer (compared to stored procs in DB)
public class JPA_ASysManager {

	public static List<Object[]> getAuditList(
			EntityManager entityManager,
			int firstRow, int numberOfRows, 
			Map<String, String> filter, 
			Set<Entry<String, String>> sortOrder) 
	{
		
		 String orderQuery = null;
		 if(sortOrder!=null)
         for (Map.Entry<String, String> me : sortOrder) {
		       //log.info("me.getKey+:"+me.getKey());
		       //log.info("me.getValue:"+me.getValue());		       
		       if(orderQuery==null){
		    	 orderQuery="order by "+me.getKey()+" "+me.getValue();
		       }else{
		    	 orderQuery=orderQuery+", "+me.getKey()+" "+me.getValue();  
		       }
		     }
         //log.info("ASys:invokeLocal:list:orderQuery:"+orderQuery);
         
         String st = null;
         if(filter!=null){
    		 Set<Map.Entry<String, String>> setFilterASys = filter.entrySet();
              for (Map.Entry<String, String> me : setFilterASys) {            	
   		        	  if(me.getKey().equals("crt_date")){  
    	      	     	 st=(st!=null?st+" and " :"")+" lower(to_char("+me.getKey()+",'DD.MM.YY HH24:MI:SS')) like lower('"+me.getValue()+"%') ";
    	    	  }else{
    	        		//делаем фильтр на начало
    	            	  st=(st!=null?st+" and " :"")+" lower("+me.getKey()+") like lower('"+me.getValue()+"%') ";
    	          }
              }
    	   }
         //log.info("ASys:invokeLocal:list:filterQuery:"+st);
         List<Object[]> lo = entityManager.createNativeQuery(
        		 (new StringBuilder("select t1.sys_id, t1.crt_date, t1.serv_name, t1.input_param, t1.RESULT_VALUE, "))
                 .append("t1.IP_ADDRESS, t1.fio ")
                 .append("from( ")
                 .append("select SL.ID_SRV sys_id , ")
                 .append("SL.CREATED crt_date, ")
                 .append("SERV.FULL_ serv_name, SL.INPUT_PARAM input_param, SL.RESULT_VALUE RESULT_VALUE, SL.IP_ADDRESS, ")
                 .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.SURNAME||' '||AU_FULL.NAME_ ||' '|| AU_FULL.PATRONYMIC,  CL_USR_FULL.FIO) fio ")
                 .append("from SERVICES_LOG_KNL_T sl,  ")
                 .append("SERVICES_BSS_T serv, ")
                 .append("AC_USERS_KNL_T AU_FULL, ")
                 .append("ISP_BSS_T cl_usr_full, ")
                 .append("(select max(CL_usr.ID_SRV) CL_USR_ID,  CL_USR.SIGN_OBJECT  CL_USR_CODE ")
                 .append("from ISP_BSS_T cl_usr, ")
                 .append("AC_USERS_KNL_T au ")
                 .append("where AU.UP_SIGN_USER  = CL_usr.SIGN_OBJECT ")
                 .append("group by CL_usr.SIGN_OBJECT) t2 ")
                 .append("where SERV.ID_SRV=SL.UP_SERVICES ")
                 .append("and AU_FULL.UP_SIGN_USER=t2.CL_USR_CODE(+) ")
                 .append("and AU_FULL.ID_SRV (+)=SL.UP_USERS ")
                 .append("and CL_USR_FULL.ID_SRV(+)=t2.CL_USR_ID ")
                 .append(") t1")
                 .append(st!=null ? " where "+st :" ")
                 .append(orderQuery!=null ? orderQuery+", sys_id desc " : " order by sys_id desc ")
                 .toString())
                  .setFirstResult(firstRow)
                  .setMaxResults(numberOfRows)
		          .getResultList();
		return lo;
	}

	public static Long getAuditCount(
			EntityManager entityManager,
			Map<String, String> filter			
			) 
	{
		 String st = null;
		 if(filter!=null){
    		 Set<Map.Entry<String, String>> setFilterASys = filter.entrySet();
              for (Map.Entry<String, String> me : setFilterASys) {
              
   		   
             if(me.getKey().equals("crt_date")){  
  	             	 st=(st!=null?st+" and " :"")+" lower(to_char("+me.getKey()+",'DD.MM.YY HH24:MI:SS')) like lower('"+me.getValue()+"%') ";
  	    	  }else{
  	        		//делаем фильтр на начало
  	            	  st=(st!=null?st+" and " :"")+" lower("+me.getKey()+") like lower('"+me.getValue()+"%') ";
  	          }  
              }
    	   }
         //log.info("ASys:invokeLocal:count:filterQuery:"+st);		 
		 return ((java.math.BigDecimal)entityManager.createNativeQuery(
			        (new StringBuilder("select count(*) "))
                       .append("from( ")
                       .append("select SL.ID_SRV sys_id , ")
                       .append("SL.CREATED crt_date, ") /*"to_char(SL.CREATED , 'DD.MM.YY HH24:MI:SS') crt_value, "*/
                       .append("SERV.FULL_ serv_name, SL.INPUT_PARAM input_param, SL.RESULT_VALUE RESULT_VALUE, SL.IP_ADDRESS, ")
                       .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.SURNAME||' '||AU_FULL.NAME_ ||' '|| AU_FULL.PATRONYMIC,  CL_USR_FULL.FIO) fio ")
                       .append("from SERVICES_LOG_KNL_T sl,  ")
                       .append("SERVICES_BSS_T serv, ")
                       .append("AC_USERS_KNL_T AU_FULL, ")
                       .append("ISP_BSS_T cl_usr_full, ")
                       .append("(select max(CL_usr.ID_SRV) CL_USR_ID,  CL_USR.SIGN_OBJECT  CL_USR_CODE ")
                       .append("from ISP_BSS_T cl_usr, ")
                       .append("AC_USERS_KNL_T au ")
                       .append("where AU.UP_SIGN_USER  = CL_usr.SIGN_OBJECT ")
                       .append("group by CL_usr.SIGN_OBJECT) t2 ")
                       .append("where SERV.ID_SRV=SL.UP_SERVICES ")
                       .append("and AU_FULL.UP_SIGN_USER=t2.CL_USR_CODE(+) ")
                       .append("and AU_FULL.ID_SRV (+)=SL.UP_USERS ")
                       .append("and CL_USR_FULL.ID_SRV(+)=t2.CL_USR_ID ")
                       .append(") t1")
	                   .append(st!=null ? " where "+st :" ")
           			 .toString())
           .getSingleResult()).longValue();
		}
	
}
