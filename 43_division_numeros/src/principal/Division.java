package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// Hacer un progrma que solicita la introduccion de dos numeros
		// enteros y despues muestra el resultado de dividir uno entre otro
		Scanner sc = new Scanner(System.in);
		int n1, n2, div;
		try {
			System.out.println("introduce un numero: ");
			n1 = sc.nextInt();
			System.out.println("introduce otro numero: ");
			n2 = sc.nextInt();
			div = n1 / n2;
			System.out.println("La division es: " + div);
//*
		} catch (InputMismatchException ex) {
			System.out.println("Debe ser un numero!!");
		} catch (ArithmeticException ex) {
			System.out.println("la division no es valida!!");
		}
//*/
/*
		}catch (InputMismatchException|ArithmeticException ex) {
			ex.printStackTrace();
			System.out.println("Error de division o de numero");
		  }
//*/		 
	}
}