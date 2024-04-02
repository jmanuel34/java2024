package principal;

import java.util.Scanner;

import service.*;

/*
 * Realizar una nueva versión del programa de las notas. Al iniciar el programa
aparecerá el siguiente menú:
1.- Nueva nota
2.- Calcular media
3.- Notas extremas
4.- Ver todas
5.- Salir 
 */
//*/
public class NotasMenu {

	public static void main(String[] args) {

		menu();

	}

	public static void menu() {
		NotasService service = new NotasService();
		double nota;
		String respuesta;
		Scanner sc = new Scanner(System.in);
		do {
			// pedir nota, guardarla y preguntar si quiere
			// introducir otra
			System.out.println("Introduce nota");
			nota = Double.parseDouble(sc.nextLine());
			service.agregarNota(nota);
			System.out.println("Quieres introducir otra nota?(s/n)");
			respuesta = sc.nextLine();

		} while (respuesta.equalsIgnoreCase("s"));
		System.out.println("Media: " + service.calcularMedia());
		System.out.println("Aprobados: " + totalAprobados(notas));
		System.out.println("Nota más alta: " + notaMayor(notas));
	}

}
