package com.dred.struts.tiendastruts.modelos;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.sql.DataSource;
import org.apache.struts2.ServletActionContext;

public class ModeloDAO implements DAO {
	
	DataSource dataSource=null;
	
	@Override
	public Connection getConnection() {
		Connection conexion=null;
		ServletContext sc = ServletActionContext.getServletContext();
		// si no tenemos la instancia del DataSource lo ercgemos del 
		// contexto de la palicación
		if (dataSource==null) {
			dataSource = (DataSource) sc.getAttribute("dataSource");
		}
		if (dataSource!=null) {
			try {
				// Intentamos hacer la conexión.
				conexion = dataSource.getConnection();
			} catch (SQLException ex) {
				System.out.println("Error al conectar");
			}
		}
		return conexion;
	}

}
