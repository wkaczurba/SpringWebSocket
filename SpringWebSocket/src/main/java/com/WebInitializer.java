package com;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	// TODO: May add also security features.
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebConfig.class, WebSocket.class };
	}
	
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
	
	// TODO: Add setAsyncSupport - not sure what for...
}
