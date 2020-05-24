package com.dred.struts.tiendastruts.utilidades;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Clase de utilidad para el borrado de recursos utilizados en las 
 * tranferencia de datos desde y hacia la BBDD 
 */
public class GestionBBDD {

	public static void liberaResulset( ResultSet resultado) {
		if (resultado!=null) {
			try {
				resultado.close();
			} catch (SQLException ex) {
				System.out.println("Error al liberar el resultset");
			}
		}
	}
	
	public static void liberaStatement( Statement consulta) {
		if (consulta!=null) {
			try {
				consulta.close();
			} catch (SQLException ex) {
				System.out.println("Error al liberar el stetement");
			}
		}
	}
	
	public static void liberaConnection( Connection conexion) {
		if (conexion!=null) {
			try {
				conexion.close();
			} catch (SQLException ex) {
				System.out.println("Error al liberar la conexión");
			}
		}
	}
}
