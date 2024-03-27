package model;

public class Departamento {
	String departamento;
	int facturacion;
	
	  public Departamento(String departamento, int facturacion) {
	        this.departamento=departamento;
	        this.facturacion=facturacion;
	    }

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getFacturacion() {
		return facturacion;
	}

	public void setFacturacion(int facturacion) {
		this.facturacion = facturacion;
	}
	  

}
