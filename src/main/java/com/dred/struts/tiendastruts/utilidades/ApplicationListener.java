package com.dred.struts.tiendastruts.utilidades;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.sql.DataSource;

public class ApplicationListener implements ServletContextListener {

	Context context = null;

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext servletContext = sce.getServletContext();
		// Recogemos el data source desde el descriptor de la aplicación 
		String dataSourceJNDI = servletContext.getInitParameter("dataSourceJNDI");
		try {
			context = new InitialContext();
			DataSource dataSource = (DataSource) context.lookup(dataSourceJNDI);
			if (dataSource == null) {
				System.out.println("No se ha definido el DataSource en web.xml");
			} else {
				System.out.println("DataSource cargado");
			}
			servletContext.setAttribute("dataSource", dataSource);
		} catch (NamingException e) {
			throw new RuntimeException();
		} finally {
			try {
				// cerrar el contexto para libear recursos
				if (context != null) {
					context.close();
				}
			} catch (Exception e) {
				System.out.println("¡Error en 		initCtx!");
			}
		}
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		try {
			// cerrar el contexto para libear recursos
			if (context != null) {
				context.close();
			}
		} catch (Exception e) {
			System.out.println("¡Error en 		initCtx!");
		}
	}

}
