package principal;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PruebaEscritura {

	public static void main(String[] args) {
//		String ruta= "dias.txt";  //		Se pone en la ruta del proyecto
//		String ruta= "C:\\Users\\manana\\Curso Java\\Java2024\\temp";
		String ruta = "C:\\Users\\manana\\Curso Java\\Java2024\\dias.txt";
		try {
		PrintStream out = new PrintStream (ruta); 
		out.println("Viernes");
		out.println("Sabado");
		out.println("Domingo");
		System.out.println("Informacion almacenada en el fichero");
		out.close();
		} catch(FileNotFoundException ex){
			ex.printStackTrace();
		}
	}

}
