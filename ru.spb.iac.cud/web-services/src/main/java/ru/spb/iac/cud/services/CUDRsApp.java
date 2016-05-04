package ru.spb.iac.cud.services;

import java.util.Set;

import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;


@ApplicationPath("/rs")
public class CUDRsApp  extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        addProviderClasses(resources);
        return resources;
    }
    
    private void addRestResourceClasses(Set<Class<?>> resources) {
        /*resources.add(org.codehaus.jackson.jaxrs.JacksonJaxbJsonProvider.class);
        resources.add(org.codehaus.jackson.jaxrs.JacksonJsonProvider.class);
        resources.add(org.codehaus.jackson.jaxrs.JsonMappingExceptionMapper.class);
        resources.add(org.codehaus.jackson.jaxrs.JsonParseExceptionMapper.class);*/
    	resources.add(ru.spb.iac.cud.services.auth.AuthServiceREST.class);
        resources.add(ru.spb.iac.cud.services.audit.AuditServiceREST.class);
        resources.add(ru.spb.iac.cud.services.admin.AdminServiceREST.class);
        resources.add(ru.spb.iac.cud.services.application.ApplicationResultServiceREST.class);
        resources.add(ru.spb.iac.cud.services.application.ApplicationServiceREST.class);
        resources.add(ru.spb.iac.cud.services.util.UtilServiceREST.class);	        
    }
    private void addProviderClasses(Set<Class<?>> resources) {
		resources.add(ru.spb.iac.cud.services.handlers.OAuthHandler.class);
		resources.add(ru.spb.iac.cud.services.handlers.HeadersFilter.class);
		resources.add(ru.spb.iac.cud.services.handlers.ExceptionHandler.GeneralFailureMapper.class);
		resources.add(ru.spb.iac.cud.services.handlers.ExceptionHandler.SecurityExceptions_ClientAuthExceptionMapper.class);
		//resources.add(ru.spb.iac.cud.services.handlers.ExceptionHandler.JsonMappingExceptionMapper.class);
		resources.add(ru.spb.iac.cud.services.handlers.ExceptionHandler.GlobalExceptionHandler.class);
		
		// Marshalers
		resources.add(ru.spb.iac.cud.marshaler.JAXBMarshaler.FunctionMarshaler.class);
		resources.add(ru.spb.iac.cud.marshaler.JAXBMarshaler.RoleMarshaler.class);
		resources.add(ru.spb.iac.cud.marshaler.JAXBMarshaler.GroupMarshaler.class);
		resources.add(ru.spb.iac.cud.marshaler.JAXBMarshaler.ResourceMarshaler.class);
		resources.add(ru.spb.iac.cud.marshaler.JAXBMarshaler.AuditFunctionMarshaler.class);
		resources.add(ru.spb.iac.cud.marshaler.JAXBMarshaler.AppResultRequestMarshaler.class);
		//resources.add(ru.spb.iac.cud.marshaler.JAXBMarshaler.AppResultRequestListMarshaler.class);
		resources.add(ru.spb.iac.cud.marshaler.JAXBMarshaler.AppAttributeMarshaler.class);	
	}
}
