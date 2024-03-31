package model;

import java.util.Comparator;

public class Depto implements Comparator<Depto>, Comparable<Depto> {
	String nombre;
	int facturacion;

	public Depto() {
	}

	public Depto(String nombre, int facturacion) {
		this.nombre = nombre;
		this.facturacion = facturacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setDepartamento(String nombre) {
		this.nombre = nombre;
	}

	public int getFacturacion() {
		return facturacion;
	}

	public void setFacturacion(int facturacion) {
		this.facturacion = facturacion;
	}

	// Overriding the compareTo method
	public int compareTo(Depto d) {
		return (this.nombre).compareTo(d.nombre);
	}

	// Overriding the compare method to sort the age
	public int compare(Depto d, Depto d1) {
		return d.facturacion - d1.facturacion;
	}
}
