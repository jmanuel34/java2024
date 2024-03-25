package principal;

public class SumaPares {

	public static void main(String[] args) {
		// Calcula la suma de todos los numeros pares
		// Comprendidos entre 1 y 10
		int suma=0;
		for (int i=1; i<=10; i++) {
			if (i%2==0) suma+=i;
		}
		System.out.println("El total de la suma es: "+suma);
	}

}
