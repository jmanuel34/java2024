package principal;

import java.util.Scanner;

/*
 * Dado los datos de coches,m se le pedira
 * al cliente cual es su presupuesto y programa
 * indiccara los coches a los que puede optar
 */
public class Presupuestos {

	public static void main(String[] args) {
		boolean b;
//		int [] b= new int[2];
		var contador=0;
		Double presupuesto;
		var precios= new String[] {"Volvo-19_500.0", "Audi A1-23450", "Toyota-17300", "Mercedes-33500", "Volkswagen-25340", "Ford-41800"};
		var sc = new Scanner(System.in);
		
		System.out.println("Dame tu presupuesto: ");
		presupuesto = sc.nextDouble();
		sc.close();
		
		for (String precio:precios) {
			precio = precio.replace("_", "");
			if(presupuesto > Double.parseDouble(precio.substring(precio.indexOf("-")+1, precio.length()))) {
				System.out.print("Optas a: "+ (precio.substring(0, precio.indexOf("-") )+ " con un "));
				System.out.println(" Precio de: "+ Double.parseDouble(precio.substring(precio.indexOf("-")+1, precio.length())));
				
			}
		}	
	}

}
