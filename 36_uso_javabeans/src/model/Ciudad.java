package model;

public class Ciudad {
	private String nombre;
	private int poblacion;
	private double temp;
	
	
	public Ciudad() {
		super();
	}


	public Ciudad(String nombre, int poblacion, double temp) {
		super();
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.temp = temp;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPoblacion() {
		return poblacion;
	}


	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}


	public double getTemp() {
		return temp;
	}


	public void setTemp(double temp) {
		this.temp = temp;
	}
	
	
	
	
}
