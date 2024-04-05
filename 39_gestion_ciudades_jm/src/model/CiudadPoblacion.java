package model;

public class CiudadPoblacion {
	private Ciudad ciudad;
	private int poblacion;
	
	public CiudadPoblacion() {
		super();
	}

	public CiudadPoblacion(Ciudad ciudad, int poblacion) {
		super();
		this.ciudad = ciudad;
		this.poblacion = poblacion;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public int getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}
	
	
}
