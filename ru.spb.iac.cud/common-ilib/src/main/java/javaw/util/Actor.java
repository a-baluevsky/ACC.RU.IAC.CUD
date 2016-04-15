package javaw.util;

public abstract class Actor<DataType> {
	//public Actor(DataType data) { setData(data); }
	protected DataType data; 
	public DataType getData() { return data; };	
	public Actor<DataType> setData(DataType data){ this.data = data; return this; };
}
