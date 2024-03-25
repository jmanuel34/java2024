package principal;

public class ContarVocales {

	public static void main(String[] args) {
		String cadena= "Esto es un texto nuevo i";
//		String cadena2="AEiou asi";
		// cuantas vocales tiene ese texto?
		int contador = 0;
		for (int i=0; i<cadena.length(); i++) {
			if (cadena.toLowerCase().charAt(i)=='a' ||
				cadena.toLowerCase().charAt(i)=='e' ||
				cadena.toLowerCase().charAt(i)=='i' ||
				cadena.toLowerCase().charAt(i)=='o' ||
				cadena.toLowerCase().charAt(i)=='u'
				) 
			{ 
				System.out.println("Letra "+ cadena.charAt(i));
				contador++;
			}	
		}
		System.out.println("Numero de vocales: "+contador);
	}

}
