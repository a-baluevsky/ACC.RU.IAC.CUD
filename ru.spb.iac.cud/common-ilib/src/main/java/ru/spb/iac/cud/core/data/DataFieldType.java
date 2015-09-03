package ru.spb.iac.cud.core.data;

import java.text.SimpleDateFormat;
import java.util.Map;

import javaw.util.Actor;

import java.math.BigInteger;
import java.util.Date;
import java.util.EnumMap;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public enum DataFieldType {
	NUMBER,	NUMBER_LONG,
	DATE, DATE_YYYYMMDD, DATE_DDMMYY,
	VARCHAR2, VARCHAR2LC /* lower-case string (for ignore-case comparison) */
	;

	private static abstract class IStrCnv<T, DataType> extends Actor<DataType> {
		private final Type type;
		public IStrCnv() {
	        final ParameterizedType parameterizedType =
	                (ParameterizedType) getClass().getGenericSuperclass();
	        type = parameterizedType.getActualTypeArguments()[0];			
		}
		public Class<T> getValueClass() { return (Class<T>) type; }		
		public abstract T fromString(String string);
		public abstract String toString(T value);
		public abstract String toSQLExpression(T value);
		public String decorateSQLArgument(String argName) { return argName; };	// e.g. toDate(argName)
		public abstract Long getDataSize(T data);
	}

	private static final IStrCnv<?,?> IStrCnv_Number = new IStrCnv<Number,Object>() {
		@Override	public Number fromString(String string) 				{ return Long.valueOf(string); } // TODO: get a proper number subtype from const num representation
		@Override 	public String toString(Number value) 	  				{ return value==null? null: value.toString(); }
		@Override   public String toSQLExpression(Number value) 			{ return toString(value); }
		@Override	public Long getDataSize(Number data) 					{ return 4L; } // TODO:  get a proper size, depeding on a number subtype
	};	
	private static final IStrCnv<?,?> IStrCnv_Long = new IStrCnv<Long,Object>() {
			@Override	public Long fromString(String string) 				{ return Long.valueOf(string); }
			@Override 	public String toString(Long value) 	  				{ return value==null? null: value.toString(); }
			@Override   public String toSQLExpression(Long value) 			{ return toString(value); }
			@Override	public Long getDataSize(Long data) 					{ return 4L; }
		};
	private static final IStrCnv<?,?> IStrCnv_String = new IStrCnv<String,Object>() {
			@Override   public String fromString(String string) 			{ return string; }
			@Override	public String toString(String value) 				{ return value;	 }
			@Override	public String toSQLExpression(String value) 		{ return (value==null?"NULL": (new StringBuilder()).append("'").append(value).append("'").toString()); }
			@Override	public Long getDataSize(String data) 				{ return data==null? 0L: Long.valueOf(data.length()); }
		};
	private static final IStrCnv<?,?> IStrCnv_StringLC = new IStrCnv<String,Object>() {
			@Override   public String fromString(String string) 	{ return string==null? null: string.toLowerCase(); }
			@Override	public String toString(String value) 		{ return value;	 }
			@Override	public String toSQLExpression(String value) {
				return (value==null?"NULL": (new StringBuilder()).append("'").append(value.toLowerCase()).append("'").toString());					
			}
			@Override	public String decorateSQLArgument(String argName) 	{ return (new StringBuilder("lower(")).append(argName).append(")").toString(); }
			@Override	public Long getDataSize(String data) 				{ return data==null? 0L: Long.valueOf(data.length()); }
		};
	private static final IStrCnv<?,?> IStrCnv_DATEYYYYMMDD = new IStrCnv<Date, Object>() {
		@Override public Date fromString(String string) 			{ return parseDateValue_YYYYDDMM(string); }
		@Override public String toString(Date value) 				{ return getDateString_yyyyMMdd(value);   }
		@Override public String toSQLExpression(Date value) 		{ return "'"+toString(value)+"'"; }
		@Override public Long getDataSize(Date data) 				{ return 8L; } // YYYY MM DD
		@Override public String decorateSQLArgument(String argName) { return wrapDateFieldNameToNumChar(argName); }
	};
	private static final IStrCnv<?,?> IStrCnv_DATEDDMMYY = new IStrCnv<Date, Object>() {
		@Override public Date fromString(String string) 			{ return parseDateValue_DDMMYY(string); }
		@Override public String toString(Date value) 				{ return (new SimpleDateFormat("dd.MM.yy")).format(value); }
		@Override public String toSQLExpression(Date value) 		{ return "'"+toString(value)+"'"; }
		@Override public Long getDataSize(Date data) 				{ return 10L; } // DD.MM.YY
		@Override public String decorateSQLArgument(String argName) { return "to_char("+argName+",'DD.MM.YY')"; }
	};	
	//private static final IStrCnv<?,?> IStrCnv_ = ;
	
	private static Map<DataFieldType, IStrCnv<?,?>> getIStrCnvMap() {
		Map<DataFieldType, IStrCnv<?,?>> m = new EnumMap<DataFieldType, IStrCnv<?,?>>(DataFieldType.class);
		m.put(NUMBER, 			IStrCnv_Number);
		m.put(NUMBER_LONG, 		IStrCnv_Long);
		m.put(VARCHAR2, 		IStrCnv_String);
		m.put(VARCHAR2LC, 		IStrCnv_StringLC);
		m.put(DATE, 			IStrCnv_DATEYYYYMMDD);
		m.put(DATE_YYYYMMDD, 	IStrCnv_DATEYYYYMMDD);
		m.put(DATE_DDMMYY, 		IStrCnv_DATEDDMMYY);
		return m;
	}
	
	private static final Map<DataFieldType, IStrCnv<?,?>> m_convMap = getIStrCnvMap();		
	private static Map<DataFieldType, Class<?>> getClassMap() {
		Map<DataFieldType, Class<?>> m = new EnumMap<DataFieldType, Class<?>>(DataFieldType.class);
		for (Entry<DataFieldType, IStrCnv<?,?>> e : m_convMap.entrySet()) {
			m.put(e.getKey(), e.getValue().getValueClass());	// m.put(NUMBER, Long.class); m.put(DATE, Date.class);
		}
		return m;
	}		
	private static final Map<DataFieldType, Class<?>> m_classMap = getClassMap();	
	public Class<?> 	 toValueClass() { return getFromMap(this, m_classMap); }
	
	private static<T, M> T getFromMap(M ft, Map<M, T> mapValue) {
		final T value = mapValue.get(ft);
		if(value!=null) return value;
		else throw new AssertionError(ft.getClass().getSimpleName()+".getFromMap: Unexpected enumerated value - "+ft);
	}
	
	public<T> T fromString(String string) 		{ return (T)m_convMap.get(this).fromString(string); }
	public<T> String toString(T value)  		{ return ((IStrCnv<T,?>)m_convMap.get(this)).toString(value); }
	public<T> String toSQLValueExpression(T value) 	{ return ((IStrCnv<T,?>)m_convMap.get(this)).toSQLExpression(value); }
	public<T> Long getDataSize(T data)			{ return ((IStrCnv<T,?>)m_convMap.get(this)).getDataSize(data); };
	
	// conversion utils; MUST inject into getIStrCnvMap!
	public static boolean isNumeric(Class<?> cl) {
		return isIntNumeric(cl) || isFloatNumeric(cl);
	}		
	public static boolean isIntNumeric(Class<?> cl) {
		return cl.equals(Byte.class) || cl.equals(Integer.class) 
				|| cl.equals(Long.class) || cl.equals(BigInteger.class);
	}
	public static boolean isFloatNumeric(Class<?> cl) {
		return cl.equals(Float.class) || cl.equals(Double.class);
	}
	public static String wrapDateFieldNameToChar(String fieldName) {
		return "to_char("+fieldName+",'DD.MM.YY HH24:MI:SS')";		
	}
	public static String wrapDateFieldNameToNumChar(String fieldName) {
		return "to_char("+fieldName+",'YYYYMMDD')";	
	}	
	public static final Pattern ptDateDDMMYY = Pattern.compile("^(?<day>\\d{2})\\.(?<month>\\d{2})\\.(?<year>\\d{2}(\\d{2})?)");
	public static Date parseDateValue_DDMMYY(String sValue) {	return parseDateValue(sValue, ptDateDDMMYY);	}
	public static final Pattern ptDateYYYYMMDD = Pattern.compile("^(?<year>\\d{4})(?<month>\\d{2})(?<day>\\d{2})");
	public static Date parseDateValue_YYYYDDMM(String sValue) {	return parseDateValue(sValue, ptDateYYYYMMDD);	}
	public static Date parseDateValue(String sValue, Pattern datePattern) {
		Date dt = null;		
		final Matcher re = datePattern.matcher(sValue);
		if(re.matches()) {
			int year=Integer.parseInt(re.group("year"));			
			if(year<60) year+=100;
			if(year>100) year-=1900;
			final int month=Integer.parseInt(re.group("month"))-1;
			final int day=Integer.parseInt(re.group("day"));			
			dt = new Date(year,month,day);
		}
		//else throw new InvalidAlgorithmParameterException("Can't convert "+sValue+" => Date");
		return dt;		
	}
	public static String getDateString_yyyyMMdd(Date dt) {
		return (new SimpleDateFormat("yyyyMMdd")).format(dt);
	}
	public static DataFieldType valueOf(String typeName, Long dataSize) {
		// TODO Implement getting more specific type, based on dataSize; e.g. (NUMBER, 2) => NUMBER_Integer
		return valueOf(typeName);
	}
}
