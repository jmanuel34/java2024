package principal;

public class Panel {

	public static void main(String[] args) {
		final int FILAS=10;
		final int COLUMNAS=10;
		int [][] panel=new int[FILAS][COLUMNAS];
		int premios=0;
		int fila, columna;
		do {
			fila=(int)(Math.random()*(FILAS)); //entre 0 y 4
			columna=(int)(Math.random()*(COLUMNAS));//entre 0 y 4
			if(panel[fila][columna]!=1) {//si no está ocupada, la ocupamos
				panel[fila][columna]=1;
				premios++;
			}
		}while(premios<5);
		mostrarPanel(panel);
	}
	static void mostrarPanel(int[][] panel) {
		for(int i=0;i<panel.length;i++) {
			for(int j=0;j<panel[i].length;j++) {
				System.out.print(panel[i][j]+"|");
			}
			System.out.println();
		}
	}

}
