package javaw.util;

public abstract class TypeConverter<Source, Destination> {
	 public static interface IStrConv<T> {
		T valueOf(String s);
		public String toString(T data);
	 }
	 // Source -> Destination
	 public abstract void set(Source value); 		 public abstract Destination to();
	 // Destination -> Source
	 public abstract void from(Destination value);	 public abstract Source get();
	 
	public static abstract class AbstractBox<T> {
		 // T -> String
		 public abstract void set(T value);					@Override public abstract String toString();
		 // String -> T
		 public abstract void fromString(String value);		public abstract T get();
	}
	
	// kinda pointer (pass object by reference) and converter between String
	public static class StringBox<T> {
		private T data;
		private IStrConv<T> conv;
		StringBox(T value, IStrConv<T> conv) {
			this.data = value; this.conv = conv;
		}
		 // T -> String
		 public void set(T value){ data = value; }		@Override public String toString() { return conv.toString(data); }
		 // String -> T
		 public void fromString(String value) { data = conv.valueOf(value); }		public T get() {	return data; }
	}
	
	/*
	public static class IntegerBox extends Box<Integer> {
		private Integer data;
		@Override		public void set(Integer value) 	{ data = value;			}
		@Override		public String toString() 		{ return data.toString();		}
		@Override		public void fromString(String value) { 	data = Integer.valueOf(value);	}
		@Override		public Integer get() {	return data; }
	}
	*/
	
}


