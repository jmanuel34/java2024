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
		final int PIN_VALIDO=1234;
		int intentos=0;
		int entrada;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduzca el pin de entrada:");
			entrada = sc.nextInt();
			sc.close();
			if (entrada != PIN_VALIDO) {
				System.out.println("El pin no es valido. Intente de nuevo:");
				intentos++;
			}	
		} while (entrada != PIN_VALIDO && intentos <3);
		
		if (entrada != PIN_VALIDO) {
			System.out.println("Pin INVALIDO, saliendo del programa");
		} else {
			System.out.println("El pin ES VALIDO. Saliendo ...");
		}
	}

}
