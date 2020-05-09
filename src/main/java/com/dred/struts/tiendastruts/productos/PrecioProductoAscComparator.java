package com.dred.struts.tiendastruts.productos;

import java.util.Comparator;

public class PrecioProductoAscComparator implements Comparator<Producto> {
	public int compare(Producto o1, Producto o2) {
		return Double.compare(o1.getPrecio(), o2.getPrecio());
	}
}
