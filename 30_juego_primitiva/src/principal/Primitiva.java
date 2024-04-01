package principal;

import java.util.Arrays;
import java.util.Scanner;

public class Primitiva {
// Introduce tu combinacion
// Esta es tu combinacion
// Esta es la combinacion ganadora
// Has tenido ...X aciertos
	public static void main(String[] args) {
		int maximo=6;
		int [] combinacion = new int [maximo];
		int [] boleto = new int[maximo];
		
		generarPrimitiva(combinacion);
		pedirNumeros(boleto, maximo);
		System.out.println("Has acertado: "+aciertos(boleto, combinacion) );
		System.out.println("Combinacion de usuario: "+Arrays.toString(boleto));
		System.out.println("Combinacion ganadora: "+Arrays.toString(combinacion));

		
	}
	
	static void generarPrimitiva(int [] combinacion) {
		int numero;
		int maximo = 49;
		int totales=0;
		do {
			numero = (int) (Math.random() * maximo + 1);
			if (!repetido(combinacion, numero, totales)) {
				combinacion[totales] = numero;
				totales++;
			}
		} while (totales < 6);
		Arrays.sort(combinacion);
		for (int n:combinacion) {
			System.out.print(n + ", ");
		}
	}
	
	static boolean repetido(int [] generados, int numero, int  totales ) {
		boolean repetido = false;
		for (int i=0; i<totales; i++) {
			if (numero == generados[i]) { 
				repetido = true;
				break;
			}
		}
		return repetido;
	}
	
	static void pedirNumeros(int []boleto, int maximo) {
		String entrada;
		int numeros;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduzca 6 numeros separados por comas:");
			entrada = sc.nextLine();	
		} while (!comprobarNumeros(entrada, boleto, maximo));
	}

	static boolean comprobarNumeros(String entrada, int[] boleto, int maximo) {
//		boleta=Arrays.stream(boleta).distinct().collect(Collectors.joining(',')));
		String[] boleta=entrada.split(",");
		for (int i=0; i<boleta.length; i++) {
			boleto[i]= Integer.parseInt(boleta[i]);
		}
	
		if (boleta.length==maximo) return true;
		else return false;
	}
	
	static int aciertos(int [] boleto, int [] combinacion) {
		int aciertos=0;
		for (int b:boleto) {
			for (int c:combinacion ) {
				if(b==c) {
					aciertos++;
					break;
				}
			}
		}
		return aciertos;
	}
}
	