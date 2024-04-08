package principal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/*
 * Solicitamos por teclado la introduccion de un nombre
 * y guardaremos en un fichero todos los cursos que contengan
 * ese nombre
 */
public class GuardarCursosFichero {

	public static void main(String[] args) {
		String [] cursos= {
				"Java Basico",
				"Python para principiantes",
				"Java EE",
				"JavaScript en Front",
				"POO con Java",
				"Python y Django",
				"Desarrollo Web con ASP.NET",
				"Aplicaciones Web con Python"
		};
		String nombre;
		nombre = solicitarNombre();
		guardar(nombre, cursos);
	}
	public static String solicitarNombre() {
		String nombre;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Introduce nombre a buscar");
		return nombre = sc.nextLine();
	}
	
	public static void guardar(String nombre, String [] cursos) {
		
		String ruta = "C:\\Users\\manana\\Curso Java\\Java2024\\cursos.txt";
		try (FileOutputStream fos= new FileOutputStream(ruta, true); 
				PrintStream out= new PrintStream(fos);) {
			for (int i=0; i<cursos.length; i++) {
				if (cursos[i].contains(nombre)) {
					out.println(cursos[i]);
				}			
			}
		}
		catch(FileNotFoundException ex){
			ex.printStackTrace();
		}
		 catch (IOException e) {
				e.printStackTrace();
		}
		
		
	}

}
