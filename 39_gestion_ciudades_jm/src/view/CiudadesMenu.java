package view;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import model.Ciudad;
import model.CiudadPoblacion;
import service.CiudadesService;


/*
 * 
 * Desarrollar un programa para gestión de ciudades. 
 * Una ciudad se caracteriza por nombre, habitantes y pais.

El programa mostrará el siguiente menú: 

1.- Nueva ciudad
2.- Ciudad más poblada
3.- Buscar por pais
4.- Salir

1: se piden los datos de la nueva ciudad y se guarda. No puede haber dos ciudades con mismo nombre 
en el mismo pais
2: muestra directamente los datos de la ciudad más poblada
3: se pide un nombre de pais y se muestran los datos de todas las ciudades de dicho pais 
 */
public class CiudadesMenu {
	static CiudadesService service = new CiudadesService();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CiudadPoblacion ciudadPoblacion0 = new CiudadPoblacion(new Ciudad("Madrid", "España"), 3_000_000);
		CiudadPoblacion ciudadPoblacion1 = new CiudadPoblacion(new Ciudad("Leon", "España"), 800_000);
		CiudadPoblacion ciudadPoblacion2 = new CiudadPoblacion(new Ciudad("Helsinki", "Finlandia"), 700_000);
		CiudadPoblacion ciudadPoblacion3 = new CiudadPoblacion(new Ciudad("Pekin", "China"), 5_800_000);
		CiudadPoblacion ciudadPoblacion4 = new CiudadPoblacion(new Ciudad("Roma", "Italia"), 2_800_000);
		CiudadPoblacion ciudadPoblacion5 = new CiudadPoblacion(new Ciudad("Milan", "Italia"), 3_00_000);
		service.agregarCP(ciudadPoblacion0);
		service.agregarCP(ciudadPoblacion1);
		service.agregarCP(ciudadPoblacion2);
		service.agregarCP(ciudadPoblacion3);
		service.agregarCP(ciudadPoblacion4);
		service.agregarCP(ciudadPoblacion5);


		int opcion;

		do {
			// presentar menu
			// leer opción y comprobar opcion elegida
			presentarMenu();
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				agregarCiudad();
				break;
			case 2:
				masPoblada();
				break;
			case 3:
				buscarPorPais();
				break;		
			case 4:
				System.out.println("Adios!");
				break;
			default:
				System.out.println("Opción no válida!");
			}
		} while (opcion != 4);

	}

	static void presentarMenu() {
		System.out.println("""
				1.- Agregar Ciudad
				2.- Ciudad Mas poblada
				3.- Buscar por pais
				4.- Salir

				""");

	}
	
	static void agregarCiudad () {
		Scanner sc = new Scanner(System.in);
		String nombre;
		String pais;
		Integer poblacion;
		System.out.println("Vamos a añadir los datos");
		System.out.println("Introduce el nombre de la ciudad: ");
		nombre= sc.nextLine();
		System.out.println("Introduce el pais: ");
		pais= sc.nextLine();
		System.out.println("Introduce la poblacion 'EN CIFRA': ");
		poblacion= Integer.parseInt(sc.nextLine());
		Ciudad ciudad = new Ciudad (nombre, pais);
		CiudadPoblacion ciudadP = new CiudadPoblacion(ciudad, poblacion);	
		if (service.agregarCP(ciudadP)) {
			System.out.println("La ciudad "+ciudadP.getCiudad().getNombre()+ " ha sido añadida");
		}
		else System.out.println("Error: Ciudad y Pais ya estaban añadidos");
	}
	
	static void masPoblada() {
		CiudadPoblacion cp = service.buscarMasPoblada();
		System.out.print("La ciudad mas poblada es: ");
		System.out.println(cp.getCiudad().getNombre()+ " con "+ cp.getPoblacion()+ " habitantes");
	}
	static void buscarPorPais() {
		ArrayList<CiudadPoblacion> aux = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String pais;
		System.out.println("Buscar por paises:");
		System.out.println("Introduce el nombre del pais: ");
		pais= sc.nextLine();
		System.out.println("Resultado de ciudades en "+ pais);
		aux = service.buscarPorPais(pais);
		for (CiudadPoblacion cp:aux) {
			System.out.println("Nombre: "+cp.getCiudad().getNombre()
					+ " Poblacion: "+cp.getPoblacion());
		}
	}
	

}
