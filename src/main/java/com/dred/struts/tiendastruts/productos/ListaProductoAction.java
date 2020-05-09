package com.dred.struts.tiendastruts.productos;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

public class ListaProductoAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private ArrayList<Producto> listaProductos;

	public ListaProductoAction() {
		this.listaProductos = new ArrayList<Producto>();
	}
	
	public void addProducto(Producto p) {
		this.listaProductos.add(p);
	}

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	public String execute() {
		this.rellenaLista();
		return SUCCESS;
	}

	private void rellenaLista() {
		this.listaProductos.clear();
		this.listaProductos.add(new Producto("Bolígrafo",
				"Bolígrafo de gel de punta fina azul",1.45));
		this.listaProductos.add(new Producto("Goma de Borrar",
				"Goma de borrar con zona de borrado de bolígrafo",0.35));
		this.listaProductos.add(new Producto("Cuaderno A%",
				"Libreta de rayas de tamaño A5",1.1));
		this.listaProductos.add(new Producto("Lápiz",
				"Lápiz de punta fina de 0.5 mm",0.55));
		this.listaProductos.add(new Producto("Lenovo ideapad L340-15IRH",
				"Intel Core i5-9300H/8GB/512GB SSD/GTX1650/15.6\"",890.99));
		this.listaProductos.add(new Producto("HP Pavilion Gaming 15-DK0019NS",
				"Intel Core i5-9300H/16GB/1TB SSD/GTX 1660Ti/15.6\"",949));
		this.listaProductos.add(new Producto("Dell Vostro 5490",
				"Intel Core i5-10210U/8GB/256GB SSD/14\"",789));
		
	}
}
