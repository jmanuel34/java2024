package principal;

import java.util.Scanner;

/*
 * UN programa que solicite la introduccion de un pin
 * Si es correcto muestra un mensaje y termina
 * Si NO ES correcto le informa de ello al usuario
 * y solicita de nuevo el pin.
 * Si falla 3 veces, muestra un mensaje de error y termina
 */
public class SolicitudPin {

	public static void main(String[] args) {
		final String PIN_VALIDO="1234";
		int intentos=0;
		String entrada;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduzca el pin de entrada:");
			entrada = sc.nextLine();
			if (!entrada.equals(PIN_VALIDO)) {
				System.out.println("El pin no es valido. Intente de nuevo:");
				intentos++;
			}	
		} while (!entrada.equals(PIN_VALIDO) && intentos <3);
		sc.close();
		
		if (!entrada.equals(PIN_VALIDO)) {
			System.out.println("Pin INVALIDO, saliendo del programa");
		} else {
			System.out.println("El pin ES VALIDO. Saliendo ...");
			System.out.println("Metodo intern"+ entrada.intern());
		}
	}

}
