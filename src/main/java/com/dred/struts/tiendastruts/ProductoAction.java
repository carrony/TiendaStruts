package com.dred.struts.tiendastruts;

import com.opensymphony.xwork2.ActionSupport;

public class ProductoAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private Producto producto;

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	public String execute() throws Exception {
		return SUCCESS;
	}
	
	
}
