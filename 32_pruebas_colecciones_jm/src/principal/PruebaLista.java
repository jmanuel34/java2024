package principal;

import java.util.ArrayList;

public class PruebaLista {

	public static void main(String[] args) {
		ArrayList<String> cadenas = new ArrayList<>();
		ArrayList<Integer> numeros = new ArrayList<>();		
		var decimales=new ArrayList<Double>();
		System.out.println(cadenas.size());
		cadenas.add("lunes");
		System.out.println(cadenas.get(0));
		cadenas.add("Martes");
		cadenas.add(0, "Miercoles");
//		cadenas.add(7, "Jueves"); 		//Excepcion
		System.out.println(cadenas.get(cadenas.size()-1));
		cadenas.add(0,"Lunes");
/*		
		numeros.add(35);
		numeros.add(numeros.get(0));
		System.out.println(numeros.get(1));
		numeros.set(1,40);
//*/
		cadenas.remove(1);			// Borra el Lunes
		for (int i=0; i<cadenas.size(); i++) {
			System.out.println(cadenas.get(i));
		}
	}

}
