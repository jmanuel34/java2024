package principal;

public class PanelPremios {

	public static void main(String[] args) {
		final int DIM=10;
		final int TOTALES=5;
		int [][] panel = new int [DIM][];
		int [] generados = new int[TOTALES];
		generarPanel(generados);
		presentarPanel(generados, DIM);

	}
	static void presentarPanel(int []generados, int DIM) {
		for (int i=0; i<DIM; i++) {
			System.out.println(generados[i]+"; ");
		}
	}

	static void generarPanel(int []generados) {
		int numero;
		int cantidad =0;
		do {
			//genero número y si no está repetido, lo guardamos
			numero=(int)(Math.random()*100+1);
			if (!repetido(numero, generados)) {
				generados[cantidad]=numero;
				cantidad++;
			}
		} while (cantidad <= 5);
		ordenarNumeros(generados);
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
	
	static boolean repetido(int numero, int [] generados) {
		for (int i=0; i<generados.length; i++) {
			if (numero == generados[i]) {
				return true;
			}
		}
		return false;
	}
}
