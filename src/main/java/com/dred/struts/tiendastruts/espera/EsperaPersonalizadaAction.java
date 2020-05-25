package com.dred.struts.tiendastruts.espera;

import com.opensymphony.xwork2.ActionSupport;

public class EsperaPersonalizadaAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private int progreso=0;

	@Override
	public String execute() throws Exception {
		try {
			Thread.sleep(10000);
		} catch (Exception ex) {
			System.out.println("Error al realizar la espera activa");
		}
		return SUCCESS;
	}

	public int getProgreso() {
		if (progreso+10 >100) progreso=100;
		else progreso+=10;
		return progreso;
	}

	public void setProgreso(int progreso) {
		this.progreso = progreso;
	}
}
