package principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PruebaLectura {

	public static void main(String[] args) {
		String ruta= "C:\\Users\\manana\\Curso Java\\Java2024\\dias.txt";
		try (FileReader fr= new FileReader(ruta);
				BufferedReader bf = new BufferedReader(fr);) {
			String linea = bf.readLine();
			while (linea!= null) {	 	//while(linea=bf.readLine())!=null;
				System.out.println(bf.readLine());
				linea = bf.readLine();
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
