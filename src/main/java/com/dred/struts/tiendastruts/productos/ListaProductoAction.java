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
		this.listaProductos.add(new Producto("Cuaderno A5",
				"Libreta de rayas de tamaño A5",1.1));
		this.listaProductos.add(new Producto("Lápiz",
				"Lápiz de punta fina de 0.5 mm",0.55));
		
	}
}
