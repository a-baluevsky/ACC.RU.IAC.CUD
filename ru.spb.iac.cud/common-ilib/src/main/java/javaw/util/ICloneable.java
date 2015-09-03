package javaw.util;

public interface ICloneable<T> extends Cloneable {
	void clone(T copy); // use in copy .ctor
	T clone() /*throws CloneNotSupportedException */;
}
