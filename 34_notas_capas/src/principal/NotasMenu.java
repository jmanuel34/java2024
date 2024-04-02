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
			presentarMenu();
			respuesta = sc.nextLine();
			switch  (respuesta) {
				case "1":
					introducirNota(service);
					break;
				case "2":
					calcularMedia(service);
					break;
				case "3":
					notasExtremas(service);
					break;
				case "4":
					mostrarTodas(service);
			}
		} while (!respuesta.equalsIgnoreCase("5"));
		System.out.println("BBye");
	}

	public static void presentarMenu() {
		System.out.println("Menu de opciones:");
		System.out.println("");
		System.out.println("1.- Nueva nota");
		System.out.println("2.- Calcular media:");
		System.out.println("3.- Notas extremas");
		System.out.println("4.- Ver todas");
		System.out.println("5.- Salir");

	}

	public static void introducirNota(NotasService service) {
		String respuesta;
		double nota;
		Scanner sc = new Scanner(System.in);
		System.out.println ("Introduce una nota: ");
		respuesta= sc.nextLine();
		nota= Double.parseDouble(respuesta);
		service.agregarNota(nota);	
	}
	
	public static void calcularMedia(NotasService service) {
		System.out.println("La nota media es: "+  (double)Math.round(service.calcularMedia() * 100d) / 100d);
	}
	
	public static void notasExtremas(NotasService service) {
		System.out.println("La nota mayor es: "+service.max());
		System.out.println("La nota menor es: "+service.min());
		
	}
	public static void mostrarTodas(NotasService service) {
		double[] notas = service.devolverNotas();
		System.out.println("Listado de todas las notas:");
		for (double n:notas) {
			System.out.println(n+"; ");
		}
	}
}

