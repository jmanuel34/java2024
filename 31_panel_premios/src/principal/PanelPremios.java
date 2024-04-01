package principal;

public class PanelPremios {

	public static void main(String[] args) {
		int DIMENSION=10;
		final int CANTIDAD=5;
		int [][] panel = new int [DIMENSION][DIMENSION];
		int [] generados = new int[CANTIDAD];
		generarPanel(generados);
		asignarNumeros(generados, panel);
		presentarPanel(panel, DIMENSION);

	}
	static void presentarPanel(int [][]panel, int DIMENSION) {

		for (int i=0; i<DIMENSION; i++) {
			for (int j=0; j<DIMENSION; j++) {
				if (panel[i][j]==1) System.out.print("X ");
				else System.out.print("O ");
			}
		System.out.println("");
		}
	}

	static void asignarNumeros(int [] generados, int [][] panel) {
		for (int i=0; i<generados.length; i++) {
			panel[generados[i]/10][generados[i]%10]=1;
		}
		
	}
/*	
	static void asignarNumeros(int[] generados, int[][] panel) {
		for (int i=0; i<panel.length; i++) {
			for (int j=0; j<panel.length; j++) {
				if ((i== generados[i]/10) && (j==generados[i]%10)) {
					System.out.print("X");
				}
				else System.out.print("0");
			}
			System.out.println();
		}
	}
*/
	static void generarPanel(int []generados) {
		int numero;
		int cantidad =0;
		do {
			//genero número y si no está repetido, lo guardamos
			numero=(int)(Math.random()*100);
			if (!repetido(numero, generados)) {
				generados[cantidad]=numero;
				cantidad++;
			}
		} while (cantidad < 5);
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
		for (int n:generados) {
			System.out.print(n+",");
		}
		System.out.println();
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
