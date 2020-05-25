package com.dred.struts.tiendastruts.espera;

import com.opensymphony.xwork2.ActionSupport;

public class EsperaDefectoAction extends ActionSupport{
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		try {
			Thread.sleep(10000);
		} catch (Exception ex) {
			System.out.println("Error al realizar la espera activa");
		}
		return SUCCESS;
	}
}
