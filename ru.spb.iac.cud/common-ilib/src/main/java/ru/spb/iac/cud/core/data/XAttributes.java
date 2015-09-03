package ru.spb.iac.cud.core.data;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import javaw.util.Tuple;
import ru.spb.iac.cud.exceptions.GeneralFailure;
import ru.spb.iac.cud.items.Attribute;
import ru.spb.iac.cud.items.OrganisationAttribute;

public class XAttributes<EXA extends XAttribute> implements Iterable<EXA> {
	protected Class<EXA> itemClass;
	private DataRecord dr = new DataRecord();
	private static final long serialVersionUID = -2750822581728093871L;
	public 	XAttributes(Class<EXA> itemClass) { this.itemClass = itemClass; }
	private List<EXA> lstDefaultedAttributes;
	private List<EXA> lstMulXTableAttributes;	
	public 	XAttributes(Iterable<? extends EXA> attributes)  { addAll(attributes); }
	public 	void addAll(Iterable<? extends EXA> attributes)  { for (EXA oa : attributes) add(oa); }	
	public 	EXA add(EXA oa) {
		final List<XAttribute> alRegAttr = new ArrayList<>();
		if (XAttribute.Domain.DomainType.Defaulted.equals(oa.domain.domainType)) { 
			if( lstDefaultedAttributes==null)
				lstDefaultedAttributes = new ArrayList<EXA>();
			lstDefaultedAttributes.add(oa);
			splitMagicAttribute(oa, alRegAttr);				
			oa.defaults = alRegAttr;
		} else if (XAttribute.Domain.DomainType.XKey.equals(oa.domain.domainType)) {
			if( lstMulXTableAttributes==null)
				lstMulXTableAttributes = new ArrayList<EXA>();
			lstMulXTableAttributes.add(oa);
			oa.useCondition = true; // "X" field is always a conditional
			splitMagicAttribute(oa, alRegAttr);
		} else {
			alRegAttr.add(oa);
		}
		for (XAttribute regAttr : alRegAttr) {
			putAttribute(regAttr);
		}
		return oa;
	}
	
	protected void putAttribute(XAttribute regAttr) {
		final DataField<?> fld = regAttr.domain.getDbField(0);
		final String tn = fld.getTableName();
		List<XAttribute> la = dr.get(tn);
		if (la==null) {
			la = new ArrayList<XAttribute>();
			dr.put(tn, la);
		}
		la.add(regAttr);
	}

	// table => [query, {attributes...}]
	public Map<String, Tuple.T2<String, List<XAttribute>>> getSelectQueryData() throws InvalidAlgorithmParameterException {
		return DataRecord.DataAccess.PrepareSelectQueries(dr);
	}
	// table => query
	public Map<String, String> getUpdateQueries()  throws InvalidAlgorithmParameterException {
		return DataRecord.DataAccess.PrepareUpdateQueries(dr);
	}
	
	public Map<String, String> getInsertQueries()  throws InvalidAlgorithmParameterException {
		return DataRecord.DataAccess.PrepareInsertQueries(dr);
	}
	
	public boolean useTable(String tableName) { return dr.containsKey(tableName);	}
	
	private static void splitMagicAttribute(XAttribute oa, List<XAttribute> registry) {
		final String n = oa.getName(), v = oa.getValue();
		for (DataField<?> fld : oa.domain.getDbFields()) {
			final XAttribute realOA = new XAttribute(new XAttribute.Domain(fld), n, v);
			realOA.ignoreOutput = true; // don't output, it's just for internal use only
			realOA.useCondition = oa.useCondition;
			registry.add(realOA);
		}	
	}
	
	public int getCount()  {
		DataRecord.IWalkDataRecord<Integer> counter = new DataRecord.IWalkDataRecord<Integer>() {
			@Override boolean process(String tableName, XAttribute atr) {++data; return true; }			
		};
		counter.setData(0);
		dr.walk(counter);
		return counter.getData();
	}
	
	public List<XAttribute> findByName(String attrName, boolean findFirstOnly, boolean scanAllProps) {
		DataRecord.IWalkDataRecord<Tuple.T3<String, List<XAttribute>, Boolean>> finder = 
		new DataRecord.IWalkDataRecord<Tuple.T3<String, List<XAttribute>, Boolean>>() {
			@Override
			boolean process(String tableName, XAttribute atr) {
				if(atr.getName().indexOf(data.item1)!=-1) {
					data.item2.add(atr);
					return !data.item3;
				} else {
					return true;
				}
			}
		};		
		finder.walkAllAttributes = scanAllProps;
		finder.setData(new Tuple.T3<String, List<XAttribute>, Boolean>(attrName, new ArrayList<XAttribute>(), findFirstOnly));
		dr.walk(finder);
		return finder.getData().item2;		
	}
	
	
	public List<XAttribute> findConditionals(Set<String> excludeNames, boolean walkAllAttributes) {
		DataRecord.IWalkDataRecord<Tuple.T2<List<XAttribute>, Set<String>>>
		condFetcher = new DataRecord.IWalkDataRecord<Tuple.T2<List<XAttribute>,Set<String>>>() {
			@Override
			boolean process(String tableName, XAttribute atr) {
				final String an = atr.getName();
				if (atr.useCondition && !data.item2.contains(an)) {
					data.item1.add(atr);
				}
				return true;
			}	
		};
		condFetcher.walkAllAttributes = walkAllAttributes;
		dr.walk(condFetcher);
		return condFetcher.getData().item1;
	}
	public void remove(XAttribute atr) {
		DataRecord.IWalkDataRecord<Tuple.T3<
				XAttribute, 
				List<?>,
				Boolean>> killer = new DataRecord.IWalkDataRecord<Tuple.T3<
						XAttribute, 
						List<?>,
						Boolean>
		>() {
			@Override
			public <XA extends XAttribute> boolean beginTable(
					Map<String, List<XA>> hmTblAtr, String tableName) {
				data.item2 = hmTblAtr.get(tableName);
				return true;				
			}			
			@Override
			boolean process(String tableName, XAttribute atr) {
				if (atr==data.item1) {
					data.item2.remove(atr);
				}
				return true;
			}
			@Override
			public <XA extends XAttribute> boolean endTable(
					Map<String, List<XA>> hmTblAtr, String tableName) {
				if (data.item2.isEmpty()) {
					hmTblAtr.remove(tableName);
				}
				return true;
			}
		};
		killer.walkAllAttributes = true;
		dr.walk(killer);
	}

	// TableName => KeyBitmap
	public Map<String, Long> getKeyBitmap(boolean scanAllAttributes) {
		// (resultMap, currentCode
		DataRecord.IWalkDataRecord<Tuple.T2<Map<String, Long>, Long>> fetcherKeyBmp = 
		new DataRecord.IWalkDataRecord<Tuple.T2<Map<String,Long>,Long>>() {
			@Override
			public <XA extends XAttribute> boolean beginTable(
					Map<String, List<XA>> hmTblAtr, String tableName) {
				data.item2 = 0L;
				return true;
			}			
			@Override<XA extends XAttribute> 
			boolean process(String tableName, XA atr)
					throws InvalidAlgorithmParameterException {
				if(atr.getKeyNum()>0)
					data.item2 |= (1<<(atr.getKeyNum()-1)); 
				return true;
			}
			@Override
			public <XA extends XAttribute> boolean endTable(
					Map<String, List<XA>> hmTblAtr, String tableName) {
				data.item1.put(tableName, data.item2);
				return true;
			}
		};
		fetcherKeyBmp.walkAllAttributes = scanAllAttributes;
		fetcherKeyBmp.setData(new Tuple.T2<Map<String,Long>, Long>(new HashMap<String,Long>(), 0L));
		dr.walk(fetcherKeyBmp);
		return fetcherKeyBmp.getData().item1;
	}
	
	public<XAS extends XAttributes<EXA>> XAttributes<EXA> getConditions(XAS destination, boolean scanAll) {
		DataRecord.IWalkDataRecord<XAttributes<EXA>>
		condFetcher = new DataRecord.IWalkDataRecord<XAttributes<EXA>>() {
			@Override
			boolean process(String tableName, XAttribute atr) {
				if(atr.useCondition)
					data.add((EXA) atr);
				return true;
			}
		};	
		condFetcher.walkAllAttributes = scanAll;		
		condFetcher.setData(destination);
		dr.walk(condFetcher);
		return condFetcher.getData();
	}	

	public Set<String> getNamesSet(boolean walkAllAttributes) {
		DataRecord.IWalkDataRecord<HashSet<String>> nameFetch = new DataRecord.IWalkDataRecord<HashSet<String>>() {
			@Override
			boolean process(String tableName, XAttribute atr) {
				data.add(atr.getName());
				return true;
			}
		};
		nameFetch.walkAllAttributes = walkAllAttributes;
		nameFetch.setData(new HashSet<String>());
		dr.walk(nameFetch);
		return nameFetch.getData();		
	}
	
	public void merge(Iterable<EXA> mergeAttrs) throws GeneralFailure {
		final List<EXA> lst;
		if (mergeAttrs instanceof List) {
			lst = (List<EXA>) mergeAttrs;
		} else {
			lst = new ArrayList<EXA>();
			for (EXA exa : lst) {
				lst.add(exa);
			}
		}
		mergeList(lst);
	}

	public<XA extends Attribute> void mergeCopy(Iterable<EXA> mergeAttrs) throws GeneralFailure {
		if(itemClass==null) throw new GeneralFailure("mergeCopy: itemClass not specified, so copy constructor is not available");
		final List<EXA> lst;
		if(mergeAttrs instanceof XAttributes) {
			lst = ((XAttributes<EXA>)mergeAttrs).toListCopy(new ArrayList<EXA>(), itemClass);			
		} else {
			Constructor<EXA> copy = getCopyConstructor(itemClass);
			lst = new ArrayList<EXA>();
			for (EXA exa : mergeAttrs) 
			try {
				lst.add(copy.newInstance(exa));
			} catch (Exception e) {
				throw new GeneralFailure(e.toString());
			}
		}
		mergeList(lst);
	}
	
	private void mergeList(List<EXA> mergeAttrs) throws GeneralFailure {
		DataRecord.IWalkDataRecord<List<EXA>> cleaner = 
		new DataRecord.IWalkDataRecord<List<EXA>>() {
			@Override
			boolean process(String tableName, XAttribute atr) {
				final XAttribute cmpName = new XAttribute(null, atr.getName(), null);
				data.remove(cmpName);
				return true;
			}
		};
		cleaner.walkAllAttributes = true;
		cleaner.setData(mergeAttrs);
		dr.walk(cleaner);
		addAll(mergeAttrs);
	}
	
	public<EXA2 extends EXA> List<EXA2> mergeNonNulls(List<EXA2> mergeAttrs) throws GeneralFailure { //EXA
		DataRecord.IWalkDataRecord<List<EXA2>> cleaner = 
		new DataRecord.IWalkDataRecord<List<EXA2>>() {
			@Override
			boolean process(String tableName, XAttribute atr) {
				final XAttribute cmpName = new XAttribute(null, atr.getName(), null);
				final int i = data.indexOf(cmpName);
				if(i!=-1) {
					final String av = data.get(i).getValue();
					if(av!=null) atr.setValue(av);
					data.remove(i);
				}
				return true;
			}
		};
		cleaner.walkAllAttributes = true;
		cleaner.setData(mergeAttrs);
		dr.walk(cleaner);
		for (XAttribute exa : mergeAttrs) {
			final String av = exa.getValue();
			if(av!=null) add((EXA) exa);
		}
		return mergeAttrs;
	}	
	
	public<EXA2 extends EXA> List<EXA2> mergeNonNulls(Collection<EXA2> values) throws GeneralFailure {
		List<EXA2> al = new ArrayList<EXA2>();
		al.addAll(values);
		mergeNonNulls(al);
		return al;
	}
	
	private static<T> Constructor<T> getCopyConstructor(Class<T> clsCopy) {
		Constructor<T> copy = null;
		if(clsCopy!=null)
		try {
			copy = (Constructor<T>) clsCopy.getDeclaredConstructor(clsCopy); // Attribute.class
		} catch (Exception e) {
			e.printStackTrace();
		}
		return copy;	
	}

	public List<EXA> toListCopy() {	return toListCopy(new ArrayList<EXA>(), itemClass);	}
	
	public<XA extends Attribute> List<XA> toListCopy(List<XA> lstFA, Class<XA> clsCopy) {
		Constructor<XA> copy = getCopyConstructor(clsCopy);
		DataRecord.IWalkDataRecord<?> convAtr;
		if(copy==null) { // don't copy, put actual object refs; make sure the target lstFA is compatible with atrs
			convAtr = (new DataRecord.IWalkDataRecord<List<XA>>() {
				@Override boolean process(String tableName, XAttribute atr) { data.add((XA)atr); return true; }
			}).setData(lstFA);			
		} else if(Attribute.class.equals(clsCopy)) { // optimize processing (getBase() makes a copy); make sure XA is really Attribute class
			convAtr = (new DataRecord.IWalkDataRecord<List<Attribute>>() {
				@Override boolean process(String tableName, XAttribute atr) { data.add(((Attribute)atr).clone()); return true; }
			}).setData((List<Attribute>)lstFA);
		} else { // generic converter
			convAtr = (new DataRecord.IWalkDataRecord< Tuple.T2<List<XA>, Constructor<XA>> >() {
				@Override boolean process(String tableName, XAttribute atr) { 
					try {
						data.item1.add(data.item2.newInstance(atr)); //? atr.getBase() //atr -- copy by getBase() --> Attribute -> XA
					} catch (Exception e) {
						e.printStackTrace();
					} 
					return true; 
				}
			}).setData(new Tuple.T2<List<XA>, Constructor<XA>>(lstFA, copy));			
		}
		convAtr.walkAllAttributes = false;
		dr.walk(convAtr);
		if(lstDefaultedAttributes!=null)
			for (XAttribute dfAtr : lstDefaultedAttributes)
			try {
				lstFA.add(copy!=null?copy.newInstance((Attribute)dfAtr):(XA)dfAtr);
			} catch (Exception e) {
				e.printStackTrace();
			}
		return lstFA;
	}
	public Attribute[] toArrayCopy() {
		List<Attribute> lst = toListCopy(new ArrayList<Attribute>(), Attribute.class);
		return lst.toArray(new Attribute[lst.size()]);
	}
  	public List<Attribute> toAttributeCopyList() {
  		return toListCopy(new ArrayList<Attribute>(), Attribute.class);
  	}
		

	public void fetch(EntityManager em) throws NoResultException, InvalidAlgorithmParameterException {
		dr.fetch(em);
		// fetch defaulted attributes
		if(lstDefaultedAttributes!=null && !lstDefaultedAttributes.isEmpty())
		for (XAttribute dfAtr : lstDefaultedAttributes) {
			for (XAttribute dv : dfAtr.defaults) {
				final String v = dv.getValue();
				if(v!=null) {
					dfAtr.setValue(v);					
					break;
				}
			}
		}
	}
	
	@Override	public Iterator<EXA> iterator() { return toListCopy(new ArrayList<EXA>(), null).iterator();	}	
	@Override public String toString() { return dr.toString();	}
}
