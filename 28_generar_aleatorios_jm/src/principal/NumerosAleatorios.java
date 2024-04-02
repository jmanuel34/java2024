package principal;

import java.util.Arrays;

public class NumerosAleatorios {

	public static void main(String[] args) {
		int maximo = 49;
//		int numeros = 10;
		int []numeros = new int [maximo];
		for (int i=0; i<6; i++) {
			System.out.println((int)(Math.random()*maximo+1));
			numeros[(int)(Math.random()*maximo)]++;
		}
		Arrays.sort(numeros);
		for (int n=0; n<numeros.length; n++) {
			System.out.println("Numero: "+(n+1)+ " Sale "+ numeros[n]+ " veces");
			
		}
		
	}
}
