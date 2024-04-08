package principal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PruebaEscrituraAppend {

	public static void main(String[] args) {

		String ruta = "C:\\Users\\manana\\Curso Java\\Java2024\\dias.txt";
		try (FileOutputStream fos= new FileOutputStream(ruta, true); 
				PrintStream out= new PrintStream(fos);) {
			out.println("Martes");
			out.println("Viernes");
			out.println("Miércoles");
			System.out.println("Informacion almacenada en el fichero");
		}
		catch(FileNotFoundException ex){
			ex.printStackTrace();
		}
		 catch (IOException e) {
				e.printStackTrace();
		}
		
//		String ruta= "dias.txt";  //		Se pone en la ruta del proyecto
//		String ruta= "C:\\Users\\manana\\Curso Java\\Java2024\\temp";

		
		/*		Solucion clasica
		
		FileOutputStream fos= null;
		PrintStream out = null;
		try {
			fos = new FileOutputStream(ruta, true);
			out = new PrintStream (fos); 
			out.println("Martes");
			out.println("Viernes");
			out.println("Miércoles");
			System.out.println("Informacion almacenada en el fichero");
			
		} catch(FileNotFoundException ex){
			ex.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			fos.close();
			out.close();
		}
//*/
		
	}
	
}
