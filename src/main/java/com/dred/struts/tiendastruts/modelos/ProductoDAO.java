package com.dred.struts.tiendastruts.modelos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dred.struts.tiendastruts.productos.Producto;
import com.dred.struts.tiendastruts.utilidades.GestionBBDD;

public class ProductoDAO extends ModeloDAO {

	private Connection conexion= null;
	private ResultSet resultado = null;
	private static ArrayList<Producto> listaProductos;
	
	public ArrayList<Producto> getListaProductos() {
		PreparedStatement ps=null;
		String consulta=null;
		listaProductos= new ArrayList<Producto>();
		Producto p=null;
		try {
			// Abrimos la conexion desde la clase padre
			conexion = super.getConnection();
			consulta = "SELECT * FROM Productos WHERE 1 ORDER BY id";
			ps = conexion.prepareStatement(consulta);
			resultado=ps.executeQuery();
			//Almacenamos los resultados en la lista de objetos
			while (resultado!=null && resultado.next())  {
				p=recogeProducto(resultado);
				listaProductos.add(p);
			}	
		} catch (SQLException ex) {
			System.out.println("Error en getListaProductos en ProductoDAO");
		} finally {
			// Liberamos los recursos utilizados
			GestionBBDD.liberaResulset(resultado);
			GestionBBDD.liberaStatement(ps);
			GestionBBDD.liberaConnection(conexion);
		}
		return listaProductos;
	}

	// Buscar un usuario por id.
	public Producto getProducto(int id) {
		PreparedStatement ps=null;
		String consulta=null;
		Producto p=null;
		try {
			// Abrimos la conexion desde la clase padre
			conexion = super.getConnection();
			consulta = "SELECT * FROM productos WHERE id=?";
			ps = conexion.prepareStatement(consulta);
			ps.setInt(1, id);
			resultado=ps.executeQuery();
			//Almacenamos los resultados en la lista de objetos
			if (resultado!=null && resultado.next())  {
				p=recogeProducto(resultado);
			}	
		} catch (SQLException ex) {
			System.out.println("Error en getProducto en ProductoDAO");
		} finally {
			// Liberamos los recursos utilizados
			GestionBBDD.liberaResulset(resultado);
			GestionBBDD.liberaStatement(ps);
			GestionBBDD.liberaConnection(conexion);
		}
		return p;
	}
	
	// Añadir un producto nuevo.
	public int addProducto(Producto p) {
			PreparedStatement ps=null;
			String consulta=null;
			int error=0;
			try {
				// Abrimos la conexion desde la clase padre
				conexion = super.getConnection();
				consulta = "INSERT INTO productos( nombre, descripcion, precio) " + 
						"VALUES (?,?,?)";
				ps = conexion.prepareStatement(consulta);
				ps.setString(1, p.getNombre());
				ps.setString(2, p.getDescripcion());
				ps.setDouble(3, p.getPrecio());
				error=ps.executeUpdate();
			} catch (SQLException ex) {
				System.out.println("Error en addProducto en ProductoDAO");
				error=1;
			} finally {
				// Liberamos los recursos utilizados
				GestionBBDD.liberaResulset(resultado);
				GestionBBDD.liberaStatement(ps);
				GestionBBDD.liberaConnection(conexion);
			}
			return error;
		}
	
	
	// Añadir un producto nuevo.
		public int removeProducto(int id) {
				PreparedStatement ps=null;
				String consulta=null;
				int error=0;
				try {
					// Abrimos la conexion desde la clase padre
					conexion = super.getConnection();
					consulta = "DELETE FROM Productos WHERE id = ?";
					ps = conexion.prepareStatement(consulta);
					ps.setInt(1, id);
					error=ps.executeUpdate();
				} catch (SQLException ex) {
					System.out.println("Error en removeProducto en ProductoDAO");
					error=1;
				} finally {
					// Liberamos los recursos utilizados
					GestionBBDD.liberaResulset(resultado);
					GestionBBDD.liberaStatement(ps);
					GestionBBDD.liberaConnection(conexion);
				}
				return error;
			}
		
		// Modificar un producto exiztente.
		public int editarProducto(Producto p) {
				PreparedStatement ps=null;
				String consulta=null;
				int error=0;
				try {
					// Abrimos la conexion desde la clase padre
					conexion = super.getConnection();
					consulta = "UPDATE productos SET nombre=?,descripcion=?,"
							+ "precio=? WHERE id=?";
					ps = conexion.prepareStatement(consulta);
					
					ps.setString(1, p.getNombre());
					ps.setString(2, p.getDescripcion());
					ps.setDouble(3, p.getPrecio());
					ps.setInt(4, p.getId());
					error=ps.executeUpdate();
				} catch (SQLException ex) {
					System.out.println("Error en editarProducto en ProductoDAO");
					error=1;
				} finally {
					// Liberamos los recursos utilizados
					GestionBBDD.liberaResulset(resultado);
					GestionBBDD.liberaStatement(ps);
					GestionBBDD.liberaConnection(conexion);
				}
				return error;
			}
	
	private Producto recogeProducto(ResultSet rs) {
		Producto p=new Producto();
		try {
			if (rs!=null) {
				if (rs.getString("id")==null) {
					p.setId(0);
				} else {
					p.setId(rs.getInt("id"));
				}
				if (rs.getString("nombre")==null) {
					p.setNombre("");
				} else {
					p.setNombre(rs.getString("nombre"));
				}
				if (rs.getString("descripcion")==null) {
					p.setDescripcion("");
				} else {
					p.setDescripcion(rs.getString("descripcion"));
				}
				if (rs.getString("precio")==null) {
					p.setPrecio(0);
				} else {
					p.setPrecio(rs.getDouble("precio"));
				}
			}
		} catch (SQLException ex) {
			System.out.println("Error al recoger el producto de la BBDD en ProductoDAO");
		}
		
		return p;
	}

	
}
