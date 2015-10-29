package ru.spb.iac.cud.core.data;

import java.security.InvalidAlgorithmParameterException;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ru.spb.iac.cud.exceptions.GeneralFailure;
import ru.spb.iac.cud.core.data.DataField.IDataFieldDescriptor;
import javaw.util.Actor;
import javaw.util.Tuple;
import javaw.util.Tuple.T2;

public class DataField<VALUETYPE> { // указание VALUETYPE позволяет обезопаситься от ошибок (опечаток) (компилятор проверяет соответствие типов)
	public static abstract class IDataFieldDescriptor<T> extends Actor<T> {
		// Map2: columnName => (dataType, dataLength, nullable, columnId))
		public abstract Map<String, Tuple.T4<String, Long, Boolean, Integer>> getTableColumnsInfo(String tableName);
		public abstract Tuple.T2<String, Long> getTypeInfo(String tableName, String columnName);	// data_Type, dataLength
		public abstract Boolean getNullable(String tableName, String columnName);
		public abstract Integer getColumnId(String tableName, String columnName);
	}
	
	private String 			tableName; 		//TABLE_NAME
	private String 			columnName; 	//COLUMN_NAME
	private DataFieldType 	dataType; 		//DATA_TYPE
	private Long			dataLength; 	//DATA_LENGTH
	private Boolean 		nullable; 		//NULLABLE
	private Integer 		columnId;		//COLUMN_ID	

	public String 	getTableName() 						{		return tableName;			}
	public void 	setTableName(String tableName) 		{		this.tableName = tableName;	}
	public String 	getColumnName() 					{		return columnName;			}
	public void 	setColumnName(String columnName) 	{		this.columnName = columnName;	}
	public DataFieldType getDataType() 					{		return dataType;			}
	public void 	setDataType(DataFieldType dataType) {		this.dataType = dataType;	}
	public Long 	getDataLength() 					{		return dataLength;	}
	public void 	setDataLength(Long dataLength) 		{		this.dataLength = dataLength;	}
	public Boolean 	getNullable() 						{		return nullable;			}
	public void 	setNullable(Boolean nullable) 		{		this.nullable = nullable;	}
	public Integer 	getColumnId() 						{		return columnId;	}
	public void setColumnId(Integer columnId) 			{		this.columnId = columnId;	}

	private byte keyNum;
	public byte getKeyNum()				{ return keyNum; };
	public void setKeyNum(byte keyNum) 	{ this.keyNum = keyNum; }
				
	public Class<VALUETYPE> getValueType()
	{	// this can perform a check whether types are compatible
		return (Class<VALUETYPE>)dataType.toValueClass();
	}

	public void lookup(IDataFieldDescriptor<?> descriptor, boolean extended) throws GeneralFailure {
		if(descriptor==null) throw new GeneralFailure("IDataFieldDescriptor descriptor not initialized!");
		m_lookup(descriptor, extended);
	}
	
	private void m_lookup(IDataFieldDescriptor<?> descriptor, boolean extended) {
		if(extended) {
			nullable = descriptor.getNullable(tableName, columnName);
			columnId = descriptor.getColumnId(tableName, columnName);
		}
		T2<String, Long> typeInfo = descriptor.getTypeInfo(tableName, columnName);
		this.dataLength = typeInfo.item2;
		this.dataType = DataFieldType.valueOf(typeInfo.item1, this.dataLength);		
	}
	
	public DataField(String tableName, String columnName) {
		this.tableName = tableName;
		this.columnName = columnName;
	}
	
	public DataField(DataFieldType dataType, String columnName) {		
		this.dataType = dataType;
		this.columnName = columnName;
	}
	
	public DataField(IDataFieldDescriptor<?> descriptor, String tableName, String columnName) {
		this(tableName, columnName);
		if(descriptor!=null)
			m_lookup(descriptor, true);		
	}
	
	public DataField(IDataFieldDescriptor<?> databaseFieldDescriptor, byte keyNum, String tableName, String columnName) {
		this(databaseFieldDescriptor, tableName, columnName);
		this.keyNum = keyNum;
	}
	
	final static int rxpFieldSpecGrpCnt = 5;	
	//								    1 2        34        5		
	final static String rxpFieldSpec = "(<(\\d+)>)?((\\w+)\\.(\\w+))";
	final static Pattern rxpFieldSpecPattern = Pattern.compile(rxpFieldSpec);
	static DataField<?> fromMatch(Matcher m, int groupOffset) {
		return new DataField<Object>(JPABuilder.databaseFieldDescriptor, 
				(m.group(groupOffset+1)!=null)?Byte.valueOf(m.group(groupOffset+2)):0, 
				m.group(groupOffset+4), 
				m.group(groupOffset+5));
	}
	public static DataField<?> fromString(String value) {
		Matcher m = rxpFieldSpecPattern.matcher(value);		
		if (m.find())
			return fromMatch(m, 0);
		else
			return null;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(keyNum!=0) {
			sb.append("<").append(keyNum).append(">");
		}
		sb.append(tableName).append(".").append(columnName);
		return sb.toString();
	}
}
