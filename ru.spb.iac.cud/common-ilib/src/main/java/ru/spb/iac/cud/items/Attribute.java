package ru.spb.iac.cud.items;

import javaw.util.ICloneable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ru.spb.iac.cud.core.data.XAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attribute", propOrder = { "name", "value" })
 public class Attribute implements ICloneable<Attribute> {

	@XmlElement(name = "name" )
	private String name;

	@XmlElement(name = "value" )
	private String value;
	
	public Attribute() {}
	public Attribute(String name, String value) {
		this.name = name;
		this.value = value;
	}	
	public Attribute(Attribute copy) { clone(copy); }
	
	public String 	getName() 				{ return name; }
	public void 	setName(String name) 	{ this.name = name;}

	public String 	getValue() 				{ return value; }	
	public void 	setValue(String value) 	{ this.value = value; }

	@Override
	public String toString() {
		final int maxNameLen = 15;
		String showName=(name==null||name.length()<=maxNameLen)?name:name.substring(0,maxNameLen-3)+"...";
		return "'" + showName + "' => " + value;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Attribute) {
			Attribute a = (Attribute)obj;
			String n = a.name, v=a.value;
			if(value==null || v==null) 
				return this.name.equals(n);
			return this.name.equals(n) && value.equals(v);
		}
		return super.equals(obj);
	}
	
	@Override	public Attribute clone() 			{ return new Attribute(this); }
	@Override	public void clone(Attribute copy) 	{ name = copy.name; value = copy.value;	}
}
