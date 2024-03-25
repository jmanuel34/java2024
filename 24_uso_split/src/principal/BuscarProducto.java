package principal;
/*
 * Se piede la introduccion de un producto y el proegrama nos muestra su stock
 */

import java.util.Scanner;

public class BuscarProducto {

	public static void main(String[] args) {
		String cesta= "tomates, peras, patatas,vino, leche, azucar, pan, patatas, vino";
		Scanner sc = new Scanner(System.in);
		String producto;
		int stock=0;
		String [] productos=cesta.split("[ ,.");
		System.out.println("Introduce el producto: ");
		producto= sc.nextLine();
		for (String p:productos) {
			if (p.trim().equals(producto)) {
				stock++;
			}
		}
		System.out.println("El producto "+ producto+ " tiene "+stock+ " unidades");
	}

}
