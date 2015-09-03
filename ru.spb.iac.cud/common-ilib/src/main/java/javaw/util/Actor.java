package javaw.util;

public abstract class Actor<DataType> {
	protected DataType data; 
	public DataType getData() { return data; };	
	public Actor<DataType> setData(DataType data){ this.data = data; return this; };
}
