package principal;
/* Hasta que numero, empezando por 1, hay que llegar
 * para que sume 1000
 */

public class SumarHastaMil {

	public static void main(String[] args) {
		int suma=0;
		int contador=0;
		do {
			contador++;
			suma+=contador;		
		} while (suma<1000);
		System.out.println("La suma es: "+suma);
		System.out.println("El numero es: "+contador);
	}

}
