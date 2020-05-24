package com.dred.struts.tiendastruts.productos;

import java.util.ArrayList;

import com.dred.struts.tiendastruts.modelos.ProductoDAO;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class ProductoAction extends ActionSupport 
         implements Preparable, ModelDriven{

	private static final long serialVersionUID = 1L;

	private ArrayList<Producto> listaProductos;
	private Producto producto;
	private int idProducto=0;


	public ArrayList<Producto> getListaProductos() {
		ProductoDAO pDAO = new ProductoDAO();
		listaProductos=pDAO.getListaProductos();		
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	public String execute() {
		ProductoDAO pDAO = new ProductoDAO();
		pDAO.addProducto(producto);
		return SUCCESS;
	}
	
	public String editar() throws Exception {
		return Action.SUCCESS;
	}
	
	public String modificar() throws Exception {
		ProductoDAO pDAO = new ProductoDAO();
		pDAO.editarProducto(producto);
		return Action.SUCCESS;	
	}
	
	public String eliminar() throws Exception {
		ProductoDAO pDAO = new ProductoDAO();
		pDAO.removeProducto(idProducto);
		return Action.SUCCESS;	
	}
	
	public String mostrar() {
		ProductoDAO pDAO = new ProductoDAO();
		listaProductos=pDAO.getListaProductos();		
		return SUCCESS;
	}

	@Override
	public Object getModel() {
		return producto;
	}

	@Override
	public void prepare() throws Exception {
		ProductoDAO pDAO = new ProductoDAO();
		if (idProducto==0) {
			producto=new Producto();
		} else {
			producto=pDAO.getProducto(idProducto);
		}
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	

	/*private void rellenaLista() {
		this.listaProductos.clear();
		this.listaProductos.add(new Producto(1,"Bolígrafo",
				"Bolígrafo de gel de punta fina azul",1.45));
		this.listaProductos.add(new Producto(2, "Goma de Borrar",
				"Goma de borrar con zona de borrado de bolígrafo",0.35));
		this.listaProductos.add(new Producto(3, "Cuaderno A%",
				"Libreta de rayas de tamaño A5",1.1));
		this.listaProductos.add(new Producto(4, "Lápiz",
				"Lápiz de punta fina de 0.5 mm",0.55));
		this.listaProductos.add(new Producto(5, "Lenovo ideapad L340-15IRH",
				"Intel Core i5-9300H/8GB/512GB SSD/GTX1650/15.6\"",890.99));
		this.listaProductos.add(new Producto(6, "HP Pavilion Gaming 15-DK0019NS",
				"Intel Core i5-9300H/16GB/1TB SSD/GTX 1660Ti/15.6\"",949));
		this.listaProductos.add(new Producto(7, "Dell Vostro 5490",
				"Intel Core i5-10210U/8GB/256GB SSD/14\"",789));
		
	}*/
}
