package principal;
/*
 * Programa que sume un punto a cada alumno por buen comportamiento
 * y luego muestre todas las notas
 */
public class PruebaArray {

	public static void main(String[] args) {
		int [] notas= {3,5,8,5,4,9};
		for (int i=0; i<notas.length; i++) {
			System.out.print("Notas: "+ notas[i]);
			System.out.println();
//			notas[i]++;
		}
		for (int n:notas) {
			n++;
			System.out.println("Nuevas Notas: "+ n);	
		}

	}

}
