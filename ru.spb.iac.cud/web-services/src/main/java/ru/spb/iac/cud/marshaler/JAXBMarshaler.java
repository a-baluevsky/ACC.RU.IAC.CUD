package ru.spb.iac.cud.marshaler;

import java.io.StringReader;
import java.io.StringWriter;

import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.jboss.resteasy.spi.StringConverter;

import ru.spb.iac.cud.items.AuditFunction;
import ru.spb.iac.cud.items.Function;
import ru.spb.iac.cud.items.Group;
import ru.spb.iac.cud.items.Resource;
import ru.spb.iac.cud.items.Role;
import ru.spb.iac.cud.items.app.AppAttribute;
import ru.spb.iac.cud.items.app.AppResultRequest;

public class JAXBMarshaler<T> {
	protected static final JAXBContext jaxbContext = getJAXBCtx();
	protected static final Marshaller jaxbMarshaller = createMarshaller();
	protected static final Unmarshaller jaxbUnmarshaller = createUnmarshaller();
	private static Marshaller createMarshaller() {
		try {
			return jaxbContext.createMarshaller();
		} catch (JAXBException e) {
			e.printStackTrace();
			return null;
		}
	} 
	private static Unmarshaller createUnmarshaller() {
		try {
			return jaxbContext.createUnmarshaller();
		} catch (JAXBException e) {
			e.printStackTrace();
			return null;
		}
	} 		
	private static JAXBContext getJAXBCtx() {
		try {
			return JAXBContext.newInstance(Function.class);
		} catch (JAXBException e) {
			e.printStackTrace();
			return null;
		}
	}
	public static<T> T _fromString(String str) {
		try {
			StringReader sr = new StringReader(str);
			return (T)jaxbUnmarshaller.unmarshal(sr);
		} catch (JAXBException e) {
			e.printStackTrace();
			return null;
		}
	}
	public static<T> String _toString(T value) {
		String str = null;
		try {
			StringWriter sw = new StringWriter();
			jaxbMarshaller.marshal(value, sw);
			str = sw.toString();
		} catch (JAXBException e) {
			e.printStackTrace();
			str = "toString Error: "+e.getMessage();
		}
		return str;
	}	

	// NOTE: there's registration entry in ru.spb.iac.cud.services.CUDRsApp.addProviderClasses(Set<Class<?>>)
	public static @Provider class FunctionMarshaler extends JAXBMarshaler<Function>  implements StringConverter<Function> {
		@Override	public Function fromString(String str) { return _fromString(str); }
		@Override	public String toString(Function value) { return _toString(value); }
	}
	// XML <=> Role
	public static @Provider class RoleMarshaler extends JAXBMarshaler<Role>  implements StringConverter<Role> {
		@Override	public Role fromString(String str) { return _fromString(str); }
		@Override	public String toString(Role value) { return _toString(value); }
	}
	// XML <=> Group
	public static @Provider class GroupMarshaler extends JAXBMarshaler<Group>  implements StringConverter<Group> {
		@Override	public Group fromString(String str) { return _fromString(str); }
		@Override	public String toString(Group value) { return _toString(value); }
	}
	// XML <=> Resource
	public static @Provider class ResourceMarshaler extends JAXBMarshaler<Resource>  implements StringConverter<Resource> {
		@Override	public Resource fromString(String str) { return _fromString(str); }
		@Override	public String toString(Resource value) { return _toString(value); }
	}
	// XML <=> AuditAuditFunction
	public static @Provider class AuditFunctionMarshaler extends JAXBMarshaler<AuditFunction>  implements StringConverter<AuditFunction> {
		@Override	public AuditFunction fromString(String str) { return _fromString(str); }
		@Override	public String toString(AuditFunction value) { return _toString(value); }
	}
	// XML <=> AppResultRequest
	public static @Provider class AppResultRequestMarshaler extends JAXBMarshaler<AppResultRequest>  implements StringConverter<AppResultRequest> {
		@Override	public AppResultRequest fromString(String str) { return _fromString(str); }
		@Override	public String toString(AppResultRequest value) { return _toString(value); }
	}
	// XML <=> AppAttribute
	public static @Provider class AppAttributeMarshaler extends JAXBMarshaler<AppAttribute>  implements StringConverter<AppAttribute> {
		@Override	public AppAttribute fromString(String str) { return _fromString(str); }
		@Override	public String toString(AppAttribute value) { return _toString(value); }
	}	
}
