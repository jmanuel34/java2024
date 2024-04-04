package service;

import java.util.ArrayList;

public class NotasService {
	ArrayList<Double> notas = new ArrayList<>();
	
	public void agregarNota(Double nota) {	
		notas.add(nota);
		
	}
	
	public double calcularMedia() {
		double media=0;
		for (double n:notas) {
			media+=n;
		}
		return media/notas.size();
	}
	
	public double max() {
		double max=0;
		for (double n:notas)  {
			if (n>max) max=n;
		}
		return max;
		
	}
	public double min() {
		double min=10;
		for (double n:notas)  {
			if (n<min) min=n;
		}
		return min;	
	}
	
	public Double [] devolverNotas() {		
/*
		double[] arNotas = new double[notas.size()];
		
		for (int i=0; i<notas.size(); i++) {
			arNotas[i]=notas.get(i);			
		}
*/
//		return arNotas;
		return notas.toArray(new Double[0]);
	}
}
