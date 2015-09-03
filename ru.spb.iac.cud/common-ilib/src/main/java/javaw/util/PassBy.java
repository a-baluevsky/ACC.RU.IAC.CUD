package javaw.util;


public class PassBy {
	public static class reference<T> {
		private T value;
		reference(T value)	{ this.value = value; }
		public T getValue() { return value;		}
		public void setValue(T value) { this.value = value; }
	}
	public static <T extends ICloneable<T>> T value(T value) {
		if(value==null) return null;
		return (T) value.clone();
	}
	public static <T> reference<T> reference(T value) {
		return new reference<T>(value);
	}
}
