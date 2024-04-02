package principal;

import java.util.Arrays;

public class AleatorioClase {
	public static void main(String[] args) {
		int[] generados = new int[6];

		int numero;
		int totales = 0;
		int maximo = 49;
		// Hay que generar un numero aleatorio entre 1 y 49
		// hasta conseguir 6 difierentes
		do {
			numero = (int) (Math.random() * maximo + 1);
			if (!repetido(generados, numero, totales)) {
				generados[totales] = numero;
				totales++;
			}
		} while (totales < 6);
		Arrays.sort(generados);
		for (int n:generados) {
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

}