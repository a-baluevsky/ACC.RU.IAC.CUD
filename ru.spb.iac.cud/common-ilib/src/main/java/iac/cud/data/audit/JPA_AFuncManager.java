package iac.cud.data.audit;


import java.security.InvalidAlgorithmParameterException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.persistence.EntityManager;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ru.spb.iac.cud.core.data.DataField;
import ru.spb.iac.cud.core.data.DataFieldType;
import ru.spb.iac.cud.core.data.JPABuilder;

public class JPA_AFuncManager extends JPABuilder {

	public boolean IsAccOrgManagerValue;
	public List<Long> listAllowedSys;
	public String UpSign;
	
	private String sQuerySqlT1() {
		return (new StringBuilder("(select AL.ID_SRV act_id, "))
			   .append("AL.DATE_ACTION act_dat, to_char(AL.DATE_ACTION, 'DD.MM.YY HH24:MI:SS') act_dat_value, ")
			   .append("decode(AU_FULL.UP_SIGN_USER, null, AU_FULL.SURNAME||' '||AU_FULL.NAME_ ||' '|| AU_FULL.PATRONYMIC,  CL_USR_FULL.FIO) usr_fio")
			   .append(", ARM.ID_SRV arm_id, ARM.FULL_ arm_name, ACT.FULL_ act_name")
			   .append(", AU_FULL.ID_SRV usr_id") 
			   .append(", CL_ORG_FULL.FULL_ org_name") 
			   .append(" from ACTIONS_LOG_KNL_T al")
			   .append(", AC_IS_BSS_T arm")
			   .append(", ACTIONS_BSS_T act")
			   .append(", AC_USERS_KNL_T AU_FULL")
			   .append(", ISP_BSS_T cl_usr_full")
			   // выбор названия организации
			   	.append(",    (  SELECT MAX (CL_ORG.ID_SRV) CL_ORG_ID,") 
			   	.append("    		CL_ORG.SIGN_OBJECT CL_ORG_CODE") 
			   	.append("       FROM ISP_BSS_T cl_org, AC_USERS_KNL_T au") 
			   	.append("       WHERE AU.UP_SIGN = CL_ORG.SIGN_OBJECT") 
			   	.append("       GROUP BY CL_ORG.SIGN_OBJECT) t1") 
			   // 
				   .append(", (select max(CL_usr.ID_SRV) CL_USR_ID,  CL_USR.SIGN_OBJECT  CL_USR_CODE ")
				   .append("from ISP_BSS_T cl_usr, ")
				   .append("AC_USERS_KNL_T au ")
				   .append("where AU.UP_SIGN_USER  = CL_usr.SIGN_OBJECT ")
				   .append("group by CL_usr.SIGN_OBJECT) t2 ")
			   .append(", ISP_BSS_T cl_org_full ") 				   
			   .append("where ACT.ID_SRV=AL.UP_ACTIONS ")
			   .append("and ACT.UP_IS=ARM.ID_SRV ")
			   .append("and AU_FULL.UP_SIGN_USER=t2.CL_USR_CODE(+) ")
			   .append("and AU_FULL.ID_SRV=AL.UP_USERS ")
			   .append("and CL_USR_FULL.ID_SRV(+)=t2.CL_USR_ID ")
			   .append("AND cl_org_full.ID_SRV = CL_ORG_ID ") 
			   .append("AND au_full.UP_SIGN = CL_ORG_CODE ")			   	
			   .append(IsAccOrgManagerValue ? "and au_full.UP_SIGN = " + UpSign : "" )
			   .append(") t1 ")					 
			 .toString();
	}
	
	public void setFilter(Map<String, String> filter) throws InvalidAlgorithmParameterException {
		resetWhereConditions();
        if(filter!=null){
   		 Set<Map.Entry<String, String>> setFilterAFunc = filter.entrySet();
             for (Map.Entry<String, String> me : setFilterAFunc) {  
           	  String sKey=me.getKey();           	  
             //у нас act_dat_value переведена в строку уже в запросе	            	  
  		      if("arm_id".equals(sKey)){ 
  		    	 putWhereCondition("arm_id", "=", me.getValue());      	        		  
	          } else if("act_dat_value".equals(sKey)) {	        	  
	        	  //putWhereCondition(new DataField<String>(DataFieldType.DATE, "act_dat"), ">=", me.getValue());
	        	  putWhereCondition(new DataField<Date>(DataFieldType.DATE_YYYYMMDD, "act_dat"), ">=", (Date)DataFieldType.DATE_DDMMYY.fromString(me.getValue()));
	          } else if("act_dat_value2".equals(sKey)) {
	        	  //putWhereCondition(new DataField<String>(DataFieldType.DATE, "act_dat"), "<=", me.getValue());
	        	  putWhereCondition(new DataField<Date>(DataFieldType.DATE_YYYYMMDD, "act_dat"), "<=", (Date)DataFieldType.DATE_DDMMYY.fromString(me.getValue()));
	          } else if("usr_id".equals(sKey)) {
	        	  putWhereCondition(new DataField<Long>(DataFieldType.NUMBER_LONG, "usr_id"), "=", Long.valueOf(me.getValue()));
	          } else { //делаем фильтр на начало текста
	        	  putWhereCondition(sKey, "like", me.getValue());
	          }
           }
   	  	}
	}
	
	public void setSortOrders(Set<Entry<String, String>> sortOrders) {
		resetOrderBy(); putOrderByFromStringSet(sortOrders);
	}
	
	public List<Object[]> getAuditList( EntityManager entityManager,
										long rowStartOffset, int numberOfRows) 
	throws InvalidAlgorithmParameterException {	
        StringBuilder sQuerySql = new StringBuilder("select "); 
        sQuerySql.append("t1.act_id, t1.act_dat_value, t1.usr_fio, t1.arm_name, t1.act_name, t1.usr_id, t1.org_name ")
        	.append("")
        	.append(" from ")
        	.append(sQuerySqlT1());
        putOrderBy("act_id", "desc");
        javax.persistence.Query query;        
        if(listAllowedSys!=null){
        	putWhereCondition("arm_id", "in", ":idsArm");
        	sQuerySql.append(getWhereAndClause())
        		.append(" ").append(getOrderByClause());
        	query = entityManager.createNativeQuery(sQuerySql.toString()).setParameter("idsArm", listAllowedSys);
        }else{
        	sQuerySql.append(getWhereAndClause())
    		.append(" ").append(getOrderByClause());
        	query = entityManager.createNativeQuery(sQuerySql.toString()); 	    			
        }
        // для отладки: System.out.println(getQueryString(query));
        return query.setFirstResult((int)rowStartOffset).setMaxResults(numberOfRows).getResultList();
	}
	
	public Long getAuditCount(EntityManager entityManager) 
	throws InvalidAlgorithmParameterException {
		StringBuilder sQuerySql = new StringBuilder("select count(*) from ");
		sQuerySql.append(sQuerySqlT1());
		javax.persistence.Query query;
 		if(listAllowedSys!=null){
  			putWhereCondition("arm_id", "in", ":idsArm");  			
  			sQuerySql.append(getWhereAndClause());
  			query = entityManager.createNativeQuery(sQuerySql.toString())
                 .setParameter("idsArm", listAllowedSys);
  		} else{
  			sQuerySql.append(getWhereAndClause());
  			query = entityManager.createNativeQuery(sQuerySql.toString());
  		} 
 		// для отладки: System.out.println(getQueryString(query));
		return ((java.math.BigDecimal)query.getSingleResult()).longValue();		
	}
}
