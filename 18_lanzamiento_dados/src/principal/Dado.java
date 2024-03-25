package principal;

import java.util.Random;

public class Dado {

	public static void main(String[] args) {
		final int LANZAMIENTOS = 10000;
		
		int [] dados = new int[6];
//		int dado = (int)(Math.random()*6+1); 
//		System.out.println(dado);
		// Lanzará el dado muchas veces (10000)
		// Despues mostraremos el porcentaje obtenido en cada cara
		
		
		// Otra solucion 
//		  var rnd = new Random();
//		  int dado =rnd.nextInt(6)+1;
		 

		for (int i=0; i<LANZAMIENTOS; i++) {
			int dado = (int)(Math.random()*6+1); 
//			System.out.println(dado);
			dados[dado-1]++;
//			dados[dado]++;
		}

/*
		for (int i:dados) {
			System.out.println("El numero "+(i+1)+ " sale "+ dados[i]+ " veces");
		}
*/
		for (int i=0; i<dados.length; i++) {
//			System.out.println("porcentaje de "+(i+1)+": "+contadores[i]*100.0/LANZAMIENTOS);
			System.out.println("El numero "+(i+1)+ " sale "+ dados[i]+ " veces"+ " y sale el "+ dados[i]*100.0/LANZAMIENTOS+ " por ciento de veces");			
		}
	}

}
/*
 */

