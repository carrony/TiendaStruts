package com.dred.struts.tiendastruts.modelos;

import java.sql.Connection;

public interface DAO {
	// Lo tendrá que implementar todas las clases DAO
	public Connection getConnection();	
}
