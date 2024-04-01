package modelo;

import java.util.Comparator;

public class Depto implements Comparator<Depto>, Comparable<Depto> {
	private String nombre;
	private int fact;

	public Depto(String n, int a) {
		nombre = n;
		fact = a;
	}
	
	public Depto() {		
	}

	public String getDeptonombre() {
		return nombre;
	}

	public int getDeptofact() {
		return fact;
	}

// Overriding the compareTo method
	public int compareTo(Depto d) {
		return (this.nombre).compareTo(d.nombre);
	}

// Overriding the compare method to sort the fact 
	public int compare(Depto d, Depto d1) {
		return d.fact - d1.fact;
	}
	public int compareDescend(Depto d, Depto d1) {
		return d1.fact - d.fact;
	}
	
	

}
