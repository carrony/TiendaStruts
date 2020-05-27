package com.dred.struts.tiendastruts.descargas;
import java.io.InputStream;
import javax.servlet.ServletContext;
import org.apache.struts2.util.ServletContextAware;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class DescargarAction extends ActionSupport implements ServletContextAware {
	private String rutaArchivo;
	private ServletContext servletContext;

	public void setRutaArchivo(String rutaArchivo) {
		this.rutaArchivo = rutaArchivo;
	}

	public InputStream getInputStream() throws Exception {
		return servletContext.getResourceAsStream(rutaArchivo);
	}
	
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}
}