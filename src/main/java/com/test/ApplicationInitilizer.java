package com.test;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ApplicationInitilizer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        try (// TODO Auto-generated method stub
                //Bootstrap dispacherServlet
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext()) {
            context.register(ApplicationConfig.class);
        }
        ServletRegistration.Dynamic servletRegistration=
            servletContext.addServlet("mvc", new DispatcherServlet());
        servletRegistration.setLoadOnStartup(1);
        servletRegistration.addMapping("/");

        throw new UnsupportedOperationException("Unimplemented method 'onStartup'");
    }
    
}
