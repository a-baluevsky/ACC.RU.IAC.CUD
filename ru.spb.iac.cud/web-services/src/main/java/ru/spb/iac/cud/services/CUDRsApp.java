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
        resources.add(ru.spb.iac.cud.services.auth.AuthService.class);
        resources.add(ru.spb.iac.cud.services.audit.AuditServiceREST.class);
    }

    private void addProviderClasses(Set<Class<?>> resources) {
		resources.add(ru.spb.iac.cud.services.handlers.OAuthHandler.class);
		resources.add(ru.spb.iac.cud.services.handlers.ExceptionHandler.GeneralFailureMapper.class);
		resources.add(ru.spb.iac.cud.services.handlers.ExceptionHandler.SecurityExceptions_ClientAuthExceptionMapper.class);
	}
}
