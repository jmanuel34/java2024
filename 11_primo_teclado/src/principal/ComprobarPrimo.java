package principal;

import java.util.Scanner;

public class ComprobarPrimo {

	public static void main(String[] args) {
		int num;
		boolean primo = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		num = sc.nextInt();
		sc.close();
		for (int i=2; i<num;i++) {
			if (num%i==0) {
				primo = false;
				break;
			}
		}
		if (primo) System.out.println("El numero ES primo");

		else System.out.println("El número NO ES primo");
		
	// 
	}

}
