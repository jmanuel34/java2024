package principal;

import java.util.Scanner;

public class InvertirTexto {

	public static void main(String[] args) {
		
		String texto;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una cadena: ");
		texto=sc.nextLine();
		sc.close();
		System.out.println(invertir (texto));
	}
	
	static String invertir (String cad) {
		//		String texto="";
		StringBuilder sb = new StringBuilder();
		for (int i=cad.length()-1; i>=0; i--) {
			sb.append(cad.charAt(i));
			System.out.println(cad.charAt(i));
		}
		return sb.toString();
	}
}
