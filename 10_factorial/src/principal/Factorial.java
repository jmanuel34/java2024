package principal;

public class Factorial {

	public static void main(String[] args) {
		/*
		 * Este programa calcula y muestra el factorial de un número
		 */
		int num=7;
		int factorial=1;
		for (int i=2; i<=num; i++) {
			factorial = factorial*i;
		}
		System.out.println("El factorial es: "+factorial);
	}
/*	
	public static int fac(int num) {
		if (num<=1) return 1
		else return num*fact(num-1);
*/
}
