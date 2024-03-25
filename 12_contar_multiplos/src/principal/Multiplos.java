package principal;

import java.util.Scanner;

/*
 * Solicita dos numeros y nos diga cuantos multiplos de 5
 * hay entre ambos números.
 * Si alguno de los numeros es negativo, se vuelve a pedir
 */
public class Multiplos {

	public static void main(String[] args) {
		int total=0;
		int num1, num2;
		int menor,mayor;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Escribe un numero: ");
			num1 = sc.nextInt();
		} while (num1<0);
		do {
			System.out.println("Escribe otro número: ");
			num2=sc.nextInt();
		} while (num2<0);
		sc.close();
		
		menor=num1; mayor=num2;
		// mayor=n1>n2?n1:n2;
		// menor=n1>n2?n2:n1;
		if (num1>num2) {
			mayor=num1;
			menor=num2;
		}	
		for (int i=menor+1; i<mayor; i++) {
			if (i%5==0) total+=1;
		}
		System.out.println("El total de divisores de 5 es: "+total);
	}

}
