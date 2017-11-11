package com.listen;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class TomcatListen implements ServletContextListener {
	
	public static String TMP_DIR=null;

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		TMP_DIR = arg0.getServletContext().getRealPath("/tmp");
	}
	
	

}
