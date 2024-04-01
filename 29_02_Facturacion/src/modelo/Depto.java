package modelo;

import java.util.Comparator;

public class Depto implements Comparator<Depto>, Comparable<Dog>{
	
	private String nombre;
	private int fact;
	
	public Depto() {
		super();
	}
	
	public Depto(String nombre, int fact) {
		super();
		this.nombre = nombre;
		this.fact = fact;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getFact() {
		return fact;
	}
	public void setFact(int fact) {
		this.fact = fact;
	}

	// Overriding the compareTo method
		public int compareTo(Depto d) {
			return (this.nombre).compareTo(d.nombre);
		}

	// Overriding the compare method to sort the age 
		public int compare(Depto d, Depto d1) {
			return d.fact - d1.fact;
		}

		@Override
		public int compareTo(Dog o) {
			// TODO Auto-generated method stub
			return 0;
		}

}
