package principal;

public class TableroPremios {

	public static void main(String[] args) {
		final int FILAS=10;
		final int COLUMNAS = 10;
		final int NUMEROS=5;
		int[] numeros= generarNumeros();
		
		for (int n:numeros) {
			System.out.println(n+",");
		}
		presentar(numeros, FILAS, COLUMNAS);

	}
	public static void  presentar (int [] numeros, int FILAS, int COLUMNAS) {
		for (int i=0; i<FILAS; i++) {
			for (int j=0; j<COLUMNAS; j++) {
				if (estaPresente (numeros, i,j)) {
					System.out.print("X ");
				}
				else System.out.print("o ");
			}
		System.out.println ("");				//Cambiamos de fila (linea)
		}
	}
	
	public static boolean estaPresente (int [] numeros, int fila, int columna) {
		Integer i,j;
		i=fila;
		j=columna;
		String numero=i.toString().concat(j.toString());
		int num=Integer.parseInt(numero);
		for (int n:numeros) {
			if (n==num) {
				return true;
			}
		}
		return false;
	}
	
 	public static int[] generarNumeros() {
		final int CANTIDAD=5;
		int [] generados= new int[CANTIDAD];
		int numero;
		int contador=0;
		do {
			//genero número y si no está repetido, lo guardamos
			numero=(int)(Math.random()*100);
			if (!repetido(numero, generados)) {
				generados[contador]=numero;
				contador++;
			}
		} while (contador < CANTIDAD);
		ordenarNumeros(generados);
		return generados;
	}
	
	static boolean repetido(int numero, int [] generados) {
		for (int i=0; i<generados.length; i++) {
			if (numero == generados[i]) {
				return true;
			}
		}
		return false;
	}
	
	static void ordenarNumeros(int [] generados) {
		int aux;
		for (int i=0; i < generados.length-1; i++) {
			for (int j=i; j < generados.length; j++) {
				if (generados[i]> generados[j]) {
					aux= generados[i];
					generados[i]=generados[j];
					generados[j]= aux;
				}
			}
		}
	}
	

}

