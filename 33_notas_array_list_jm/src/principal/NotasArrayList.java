package principal;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Realizar un programa para solicitar al usuario las notas de un grupo de alumnos.
Al iniciarse el programa, se le pide al usuario que introduzca una nota y esta 
se guardará. Después, se le pregunta si quiere introducir una nueva nota, si dice 
que sí,
se le pide otra nota y así sucesivamente hasta que diga que no.
Cuando se hayan guardado todas las notas, el programa mostrará los siguientes datos:
-Nota media
-Aprobados
-Nota más alta
 */
public class NotasArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> notas = new ArrayList<>();
		notas.add(5);
		notas.add(5);
		notas.add(6);
		notas.add(6);
		
		menu(notas);
		presentar(notas);
	}
	
	static void presentar (ArrayList<Integer> notas) {
		int masAlta=0;
		int aprobados=0;
		double media=0;	
		for (int n:notas) {
			media=media+n;
			if (n>masAlta) masAlta=n;
			if (n>=5) {
				aprobados++;					
			}
		}
		System.out.println("Numero de aprobados: " +aprobados);	
		System.out.println("Nota media: "+ media/notas.size());
		System.out.println("Nota mas alta: "+ masAlta);
		
	}
	
	static void menu(ArrayList<Integer> notas) {
		String entrada="";
		int nota;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduzca una nota:");
//			introducirNota(notas);
			notas.add(Integer.parseInt(sc.nextLine())) ;
			System.out.println("Introducir mas notas? s/n");
			entrada= sc.nextLine();
		} while (entrada.equals("s") || entrada.equals("S"));
		sc.close();
	}
}
