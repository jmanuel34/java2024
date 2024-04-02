package principal;

import java.util.Arrays;

public class Aleatorio {

	public static void main(String[] args) {
		int maximo = 49;
		int cantidad = 6;
		int []numeros = new int [cantidad];
		for (int i=0; i<6; i++) {
//			System.out.println((int)(Math.random()*maximo+1));
			numeros[i] =(int)(Math.random()*maximo+1);
		}
		Arrays.sort(numeros);
		for (int n: numeros) {
			System.out.println("Numero: "+n);
		}
	}

}
