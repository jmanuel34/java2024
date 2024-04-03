package view;

import java.util.Arrays;
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
	Prueba para subir a Github
 */
//*/
public class NotasMenu {
	static NotasService service = new NotasService();
	public static void main(String[] args) {
	
		menu();
	}

	public static void menu() {
//		NotasService service = new NotasService();
		double nota;
		String respuesta;
		Scanner sc = new Scanner(System.in);
		do {
			presentarMenu();
			respuesta = sc.nextLine();
			switch  (respuesta) {
				case "1":
					agregarNota();
					break;
				case "2":
					calcularMedia();
					break;
				case "3":
					notasExtremas();
					break;
				case "4":
					mostrarTodas();
				case "5":
					System.out.println("BBye");
				default:
					System.out.println("Opción Inválida");
			}
		} while (!respuesta.equalsIgnoreCase("5"));
		
	}

	public static void presentarMenu() {
		System.out.println("Menu de opciones:");
		System.out.println("");
		System.out.println("""
							1.- Nueva nota
							2.- Calcular media
							3.- Notas extremas
							4.- Ver todas
							5.- Salir
							""");
	}

	public static void agregarNota() {
		String respuesta;
		double nota;
		Scanner sc = new Scanner(System.in);
		System.out.println ("Introduce una nota: ");
		respuesta= sc.nextLine();
		nota= Double.parseDouble(respuesta);
		service.agregarNota(nota);	
	}
	
	public static void calcularMedia() {
		System.out.println("La nota media es: "+  (double)Math.round(service.calcularMedia() * 100d) / 100d);
	}
	
	public static void notasExtremas() {
		System.out.println("La nota mayor es: "+service.max());
		System.out.println("La nota menor es: "+service.min());
		
	}
	public static void mostrarTodas() {
		/*
		 * Double[] notas = service.devolverNotas();
		 * System.out.println("Listado de todas las notas:"); for (double n:notas) {
		 * System.out.println(n+"; "); }
		 */
		System.out.println ("Las notas son: "+Arrays.toString(service.devolverNotas()));
	}
}

