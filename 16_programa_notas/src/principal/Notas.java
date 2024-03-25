package principal;

import java.util.Scanner;

/*
 * Realizar un programa que solicite una a una la introduccion de 6 notas tipo double
 * que seran guardadas en un array. tras ello el programa mostrara los siguientes datos
 * - Nota media
 * - Nota mas alta
 * - Notas de Aprobados
 */
public class Notas {

	public static void main(String[] args) {

		int tamaño = 6;		
		double sup = 0;
		double notas[];
		double suma=0;
		notas = new double[tamaño];
		
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<notas.length; i++) {
			System.out.println("Introduce una nota: ");
			notas[i]= sc.nextDouble();
			suma+=notas[i];
			if (notas[i]>sup) sup = notas[i];
		}
		sc.close();		
		for (double n:notas) {
			if (n>=5) {
				System.out.println("Nota de Aprobado: "+n);
			}
		}
		System.out.println("Nota media: "+ suma/tamaño);
		System.out.println("Nota mas alta: "+ sup);
		
	}

}
