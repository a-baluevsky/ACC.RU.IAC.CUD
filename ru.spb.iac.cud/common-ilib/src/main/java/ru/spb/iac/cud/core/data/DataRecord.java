package ru.spb.iac.cud.core.data;

import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import javaw.util.Actor;
import javaw.util.Tuple;

// 										table => attrs
public class DataRecord extends HashMap<String, List<XAttribute>> { //<DRXA extends XAttribute>
	private static final long serialVersionUID = 6290276737492474582L;

	//protected final Map<String, List<XAttribute>> hmTblAtr = new HashMap<String, List<XAttribute>>();
	public static abstract class IWalkDataRecord<DataType> extends Actor<DataType> {
		public	 boolean walkAllAttributes;
		abstract<XA extends XAttribute>  boolean process		(String tableName, XA atr) throws InvalidAlgorithmParameterException;
		public  <XA extends XAttribute>  boolean beginTable		(Map<String, List<XA>> hmTblAtr, String tableName)  { return true; }
		public  <XA extends XAttribute>  boolean endTable		(Map<String, List<XA>> hmTblAtr, String tableName) 	{ return true; }
		@Override 
		public IWalkDataRecord<DataType> setData(DataType data) { super.setData(data); return this; }
	}
	public static<XA extends XAttribute> void walk(IWalkDataRecord<?> actor, Map<String, List<XA>> hmTblAtr) 
			throws InvalidAlgorithmParameterException {
		for(Entry<String, List<XA>> e: hmTblAtr.entrySet()) {
			final String tableName = e.getKey();
			if(!actor.beginTable(hmTblAtr, tableName)) return;
			for(XA atr: e.getValue())
				if (!atr.ignoreOutput || actor.walkAllAttributes)
					if(!actor.process(tableName, atr))
						return;
			if(!actor.endTable(hmTblAtr, tableName)) return;
		}		
	}
	
	public Exception walkErrorInfo; 
	public void walk(IWalkDataRecord<?> actor) {
		try {
			walk(actor, this);
		} catch (InvalidAlgorithmParameterException e) {
			e.printStackTrace();
			walkErrorInfo = e;
		}
	}	
	
	public static class DataAccess extends JPABuilder {
		private static abstract class IPrepareQueriesActor<typeOfDataAttr, typeOfDataJPABuilder> {
			public typeOfDataAttr dataAttr; public typeOfDataJPABuilder dataJPABuilder;
			abstract<XA extends XAttribute> void processAttribute(JPABuilder jb, XA oa) throws InvalidAlgorithmParameterException;
			abstract void processJPABuilder(String tn, JPABuilder jb);
			abstract void initJPABuilder(JPABuilder jb);
		}
		
		private static<typeOfDataAttr, typeOfDataJPABuilder, DRXA> void prepareQueries(
				Map<String, List<XAttribute>> hmTblAtr, 
				IPrepareQueriesActor<typeOfDataAttr, typeOfDataJPABuilder> actor) throws InvalidAlgorithmParameterException {			
			final Map<String, JPABuilder> hmTB = new HashMap<String, JPABuilder>();				
			// JPABuildersMap, currentTableJPABuilder, PrepareQueriesActor
			final IWalkDataRecord
				<Tuple.T3<
					Map<String, JPABuilder>, 
					JPABuilder, 
					IPrepareQueriesActor<typeOfDataAttr, typeOfDataJPABuilder>>
				> walkPrepQr = 
					new IWalkDataRecord
					<Tuple.T3<
						Map<String, JPABuilder>, 
						JPABuilder, 
						IPrepareQueriesActor<typeOfDataAttr, typeOfDataJPABuilder>>
					>() {
							@Override
							public <XA extends XAttribute> boolean beginTable(
									Map<String, List<XA>> hmTblAtr, String tableName) {
								data.item2 = new JPABuilder();
								data.item3.initJPABuilder(data.item2);
								data.item1.put(tableName, data.item2);
								return true;
							}				
							@Override<XA extends XAttribute> 
							boolean process(
									String tableName, XA atr)
									throws InvalidAlgorithmParameterException {
								data.item3.processAttribute(data.item2, atr);
								return true;
						}
					}; 
			walkPrepQr.walkAllAttributes = true;			
			walkPrepQr.setData(new Tuple.T3<
					Map<String,JPABuilder>, 
					JPABuilder, 
					IPrepareQueriesActor<typeOfDataAttr, typeOfDataJPABuilder>>
				(hmTB, null, actor));
			walk(walkPrepQr, hmTblAtr);
			for (Map.Entry<String, JPABuilder> esb : hmTB.entrySet()) {
				final String tn = esb.getKey();
				final JPABuilder jb = esb.getValue();				
				actor.processJPABuilder(tn, jb);
			}			
		}

		 // tableName:idx => updateQuery
		public static Map<String, String> PrepareUpdateQueries(Map<String, List<XAttribute>> mapTA) throws InvalidAlgorithmParameterException {
			IPrepareQueriesActor<Object, Map<String, String>> actorPrepQueries = 
			new IPrepareQueriesActor<Object, Map<String, String>>() {
				@Override
				public void initJPABuilder(JPABuilder jb) {
					jb.resetUpdateSet(); jb.resetWhereConditions();					
				}				
				@Override
				public void processJPABuilder(String tn, JPABuilder jb) {
					try {
						dataJPABuilder.put(tn, jb.getUpdateClause(tn));
					} catch (InvalidAlgorithmParameterException e) { }						
				}
				@Override<XA extends XAttribute>
				void processAttribute(JPABuilder jb, XA oa) throws InvalidAlgorithmParameterException {
					DataField<?> fld = oa.domain.getDbFields().get(0);
					final String an = fld.getColumnName(), av = oa.getValue();
					if(av!=null) {
						if(oa.useCondition) {
							jb.putWhereCondition(an, "=", av);
						} else { // oa.ignoreUpdate
							jb.putUpdateSet(an, av);
						}
					}					
				}
			};
			actorPrepQueries.dataAttr = null;
			actorPrepQueries.dataJPABuilder = new HashMap<String, String>();
			prepareQueries(mapTA, actorPrepQueries);
			return actorPrepQueries.dataJPABuilder;
		}
		
		// tableName => insertQuery
		public static Map<String, String> PrepareInsertQueries(Map<String, List<XAttribute>> mapTA) throws InvalidAlgorithmParameterException {
			IPrepareQueriesActor<Object, Map<String, String>> actorPrepQueries = 
			new IPrepareQueriesActor<Object, Map<String, String>>() {
				@Override
				void initJPABuilder(JPABuilder jb) {
					jb.resetInsertSet();					
				}
				@Override
				void processAttribute(JPABuilder jb, XAttribute oa) throws InvalidAlgorithmParameterException {
					final String v = oa.getValue();
					if (v!=null && !oa.useCondition) {
						final DataField dbField = oa.domain.getDbField(0);
						jb.putInsertField(dbField, dbField.getDataType().fromString(v));
					}					
				}
				@Override
				void processJPABuilder(String tn, JPABuilder jb) {
					try {
						dataJPABuilder.put(tn, jb.getInsertClause(tn));
					} catch (InvalidAlgorithmParameterException e) { }	
				}
			};
			actorPrepQueries.dataAttr = null;
			actorPrepQueries.dataJPABuilder = new HashMap<String, String>();
			prepareQueries(mapTA, actorPrepQueries);
			return actorPrepQueries.dataJPABuilder;
		}		
		
		public static<DRXA> 
		Map<String, Tuple.T2<String, List<XAttribute>>> 
		PrepareSelectQueries(Map<String, List<XAttribute>> mapTA) throws InvalidAlgorithmParameterException {
			IPrepareQueriesActor<
				Map<String, List<XAttribute>>, 
				Map<String, String>> 
			actorPrepQueries = new IPrepareQueriesActor<
				Map<String, List<XAttribute>>, 
				Map<String, String>>() {
				@Override
				public void initJPABuilder(JPABuilder jb) {
					jb.resetSelectField(); jb.resetWhereConditions();	jb.resetOrderBy();				
				}				
				@Override
				public void processAttribute(JPABuilder jb, XAttribute oa) throws InvalidAlgorithmParameterException {
					final DataField<?> fld = oa.domain.getDbField(0);
					final String tn = fld.getTableName(), an = fld.getColumnName(), av = oa.getValue();				
					if (av!=null && oa.useCondition) {
						jb.putWhereCondition(an, "=", av);
					} else {
						Map<String, List<XAttribute>> hmFA = dataAttr;
						List<XAttribute> alFetchAttrs;
						if (hmFA.containsKey(tn)) {
							alFetchAttrs = hmFA.get(tn);
						} else {
							alFetchAttrs = new ArrayList<XAttribute>();
							hmFA.put(tn, alFetchAttrs);
						}
						if (oa.orderBy!=null) {
							jb.putOrderBy(an, oa.orderBy);
						}
						alFetchAttrs.add(oa);
						jb.putSelectField(fld);
					}
				}
				@Override
				public void processJPABuilder(String tn, JPABuilder jb) {
					Map<String, String> hmTQ = dataJPABuilder;
					try {
						hmTQ.put(tn, jb.getSelectClause(tn));
					} catch (InvalidAlgorithmParameterException e) { }						
					
				}			
			};
			// tableName => [selectQuery=>attributes]			
			Map<String, List<XAttribute>> hmTA = new HashMap<String, List<XAttribute>>();
			Map<String, String> hmTQ = new HashMap<String, String>();
			actorPrepQueries.dataAttr = hmTA;
			actorPrepQueries.dataJPABuilder = hmTQ;
			prepareQueries(mapTA, actorPrepQueries);
			// TableName => (SelectQuery, List<XAttribute>)
			Map<String, Tuple.T2<String, List<XAttribute>>> hmTQA = new HashMap<String, Tuple.T2<String, List<XAttribute>>>();
			for (Entry<String, List<XAttribute>> e : hmTA.entrySet()) {
				final String tn = e.getKey();
				final String q = hmTQ.get(tn);
				Tuple.T2<String, List<XAttribute>> tp = new Tuple.T2<String, List<XAttribute>>(q, e.getValue());
				hmTQA.put(tn, tp);
			}
			return hmTQA;
		}
	}	

	// read values for attributes contained
	public void fetch(EntityManager em) throws NoResultException, InvalidAlgorithmParameterException {
		// table => [query, {attributes...}]
		for (Tuple.T2<String, List<XAttribute>> sqlData : DataAccess.PrepareSelectQueries(this).values()) {
			final String sqlString = sqlData.item1;			
			final Object o = em.createNativeQuery(sqlString).getSingleResult();
			List<XAttribute> attrsFetch = sqlData.item2;
			if(o instanceof Object[]) {
				Object[] lo = (Object[])o;
				for (int i = 0; i < lo.length; i++) {
					final XAttribute af = attrsFetch.get(i);
					final Object av = lo[i];
					if(av!=null) {
						af.setValue(av.toString());					
					}
				}				
			} else {				
				final XAttribute af = attrsFetch.get(0);
				af.setValue(o.toString());
			}
		}	
	}
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("{ ");
		for(Entry<String, List<XAttribute>> e: entrySet()) {			
			sb.append("\nTABLE: ").append(e.getKey());
			for(XAttribute atr: e.getValue()) {
				sb.append("\n  ").append(atr.useCondition?"* ":"  ").append(atr.toString());
			}			
		}
		sb.append(/* + " " + roles + */"\n}");
		return sb.toString();
	}	
}
