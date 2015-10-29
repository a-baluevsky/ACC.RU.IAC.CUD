package ru.spb.iac.cud.core.data;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javaw.lang.Strings;
import ru.spb.iac.cud.core.data.XAttribute.Domain.DomainType;
import ru.spb.iac.cud.exceptions.GeneralFailure;
import ru.spb.iac.cud.items.Attribute;

public class XAttribute extends Attribute {
	public Domain domain;
	public boolean ignoreOutput, useCondition;
	public String orderBy;
	List<XAttribute> defaults;	
	
	public XAttribute() {}
	public XAttribute(Attribute  base) { clone(base);  } // конструктор преобразования	
	public XAttribute(XAttribute copy) { clone(copy);  } // конструктор копирования
	
	@Override public XAttribute clone() { return new XAttribute(this); }	
	@Override public void clone(Attribute copy) {
		if(copy instanceof XAttribute)
			clone((XAttribute)copy);
		else 
			super.clone(copy);		
	}
	private void clone(XAttribute copy) {
		super.clone(copy);
		this.defaults = copy.defaults;
		this.domain = copy.domain;
		this.ignoreOutput = copy.ignoreOutput;
		this.orderBy = copy.orderBy;
		this.useCondition = copy.useCondition;
	}

	public XAttribute(Domain domain, String name, String value) {
		super(name, value);
		this.domain = domain;
	}	

	public XAttribute(String name, String value) {
		super(name, value);
		try {
			if(Domain.isValidDomainSpec(name))
				this.domain = new Domain(name);
		} catch (GeneralFailure e) {
			e.printStackTrace();
		}
	}
	// возвращает КОПИЮ надкласса; xa.getBase() и ((Attribute)xa) - разные вещи
	//public Attribute getBase() 			{ return super.clone(); }	
	//public void setBase(Attribute base) { super.clone(base);	}
	public XAttribute(Domain domain, Attribute base) {
		super.clone(base);
		this.domain = domain;
	}

	// 0-attribute isn't in key; >0 - number of atr within the complex key	
	public byte getKeyNum() {
		byte kn = 0;
		if(domain!=null && DomainType.Direct.equals(domain.getDomainType())) {
			kn = domain.getDbField(0).getKeyNum();
		}
		return kn;	
	}	

	public static class Domain {		
		public enum DomainType {
			Direct, 	// direct mapping to a single table field; READ-WRITE, CONDITIONAL
			Defaulted,	// attribute is "backed-up" by a list of table field; value=first non-null from the list; FETCH-only, non-CONDITIONAL
			XKey		// multiple/cross-table key; READ-only, CONDITIONAL-only
		}
		DomainType domainType = DomainType.Direct;	
		public DomainType getDomainType() {
			return domainType;
		}
		
		// (keyNum, tableName, columnName //, fieldType/Converter)
		private List<DataField> dbFields; //, Class<?>
		public<T> DataField<?> getDbField(int index) {
			return dbFields.get(index);
		}
		public List<DataField> getDbFields() {
			return dbFields;
		}
		private final static String rxpNxtFieldSpec = getNxtFieldSpec(); 
		private final static String rxpDomainType = "(\\*|\\?)?"; 
		private final static String rxpDomainSpec = getRxpDomainSpec();
		private final static String delimFldList = ":";
		private static String getNxtFieldSpec() {
			final StringBuilder sb = new StringBuilder("(");
			sb.append(delimFldList).append(DataField.rxpFieldSpec).append(")");
			return sb.toString();
		}
		private static String getRxpDomainSpec() {
			final StringBuilder sb = new StringBuilder("^");
			sb.append(rxpDomainType).append(DataField.rxpFieldSpec)
			.append("(").append(rxpNxtFieldSpec).append("*").append(")"); 
			return sb.toString();
		}
		public<T> Domain(byte keyNum, String tableName, String columnName) {
			this.domainType = DomainType.Direct;
			this.dbFields = new ArrayList<DataField>();
			DataField<?> df = new DataField(JPABuilder.databaseFieldDescriptor, tableName, columnName);
			df.setKeyNum(keyNum);			
			this.dbFields.add(df);
		}
		public Domain(DataField fld) {
			this(fld.getKeyNum(), fld.getTableName(), fld.getColumnName());
		}		
		public Domain(String attributeKey) throws GeneralFailure {
			if(isValidDomainSpec(attributeKey)) {
				parseDomainField(attributeKey);				
			} else 
				throw new GeneralFailure("Invalid domain specification: "+attributeKey+". Must match: "+rxpDomainSpec);
			validateDomain();
		}
		private void validateDomain() throws GeneralFailure {
			final int cntFld = dbFields.size();
			switch(domainType) {
			case Direct: 
				if(cntFld!=1) 
					throw new GeneralFailure("Direct mapping must contain only one field!");
				break;
			case Defaulted: case XKey:
				if(cntFld<2)
					throw new GeneralFailure("Defaulted and XKey mapping must contain multiple fields!");
			}
		}
		private void parseDomainField(String attributeKey) {			
			final Pattern p = Pattern.compile(rxpDomainSpec);
			Matcher m = p.matcher(attributeKey);		
			if (m.find()) {
				//отладка: for (int i = 0; i <= m.groupCount(); i++) { System.out.println(i+" "+m.group(i)); }					
				final String sDomType = m.group(1);					
				if ("?".equals(sDomType)) {
					domainType = DomainType.Defaulted;
				} else if ("*".equals(sDomType)) {
					domainType = DomainType.XKey;
				} else {
					domainType = DomainType.Direct;
				}
			}				
			dbFields = new ArrayList<DataField>();
			dbFields.add(DataField.fromMatch(m,1));
			final String sList = m.group(2+DataField.rxpFieldSpecGrpCnt);
			if (!Strings.isNullOrEmptyTrim(sList)) {
				String sLastInList = m.group(3+DataField.rxpFieldSpecGrpCnt);
				if(sList.equals(sLastInList)) { 
					// shortcut: list has only one item
					dbFields.add(DataField.fromMatch(m,6));
				} else {
					final Pattern pNxtFld = Pattern.compile(rxpNxtFieldSpec);
					m = pNxtFld.matcher(m.group(2+DataField.rxpFieldSpecGrpCnt));
					while(m.find()) {	
						//отладка: for (int i = 0; i <= m.groupCount(); i++) { System.out.println(i+" "+m.group(i)); }
						dbFields.add(DataField.fromMatch(m,1));
					}
				}
			}			
		}
		public static boolean isValidDomainSpec(String domainSpec) {
			return domainSpec!=null && domainSpec.matches(rxpDomainSpec);
		}
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			switch (domainType) {
				case Defaulted: sb.append("?"); break;
				case XKey:	sb.append("*"); break;
			}
			for (DataField<?> df : dbFields) {
				sb.append(df).append(delimFldList);
			}
			int adjustLen = delimFldList.length(), sbLen=sb.length();
			adjustLen = delimFldList.equals(sb.substring(sbLen-adjustLen) )?adjustLen:0; 
			return sb.substring(0,sbLen-adjustLen);
		}
	}

	@Override
	public String toString() {		
		if(domain==null)
			return super.toString();
		else {
			StringBuilder sb = new StringBuilder(domain.toString());
			sb.append(" ");
			sb.append(super.toString());
			return sb.toString();			
		}
	}
	

}
