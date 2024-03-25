package principal;

public class Sumador {

	public static void main(String[] args) {
		/*
		 * Calcular la suma de todos los numeros
		 * comprendidos entre el mayor y el menor
		 * no incluidos los extemos
		 */
		int menor=0, suma=0;
		int mayor;
		int n1=11;
		int n2=20;
		menor = Math.min(n1, n2);
		mayor = Math.max(n1, n2);
		//		int mayor=n1;
//		mayor=(n1>n2)?n1:n2;
		//		num%2==0?num/2:(num-1)/2);
/*
		if (n1>n2) {
			mayor=n1;menor=n2;
		}
		else {
			mayor=n2;
			menor=n1;
		}
*/
		for (int i=menor+1; i<mayor; i++) {
			suma+=i;
		}
		System.out.println("La suma es: "+suma);
	}

}
