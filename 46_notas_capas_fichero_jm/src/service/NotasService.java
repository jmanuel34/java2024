package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class NotasService {
	String ruta = "C:\\Users\\manana\\Curso Java\\Java2024\\notas.txt";
	
	public void borrarNotas() {
		File file= new File(ruta);
		file.delete();
	}
	
	public void agregarNota(Double nota) {	
		escribirFichero(nota);	
	}
	
	public double calcularMedia() {
		ArrayList<Double> notas= devolverNotas();
		double media=0;
		for (double n:notas) {
			media+=n;
		}
		return media/notas.size();
	}
	
	public double max() {
		ArrayList<Double> notas = devolverNotas();	
		double max=0;
		for (double n:notas)  {
			if (n>max) max=n;
		}
		return max;
		
	}
	public double min() {
		ArrayList<Double> notas = devolverNotas();
		double min=10;
		for (double n:notas)  {
			if (n<min) min=n;
		}
		return min;	
	}
	
	public ArrayList<Double> devolverNotas() {		
		ArrayList<Double> notas = new ArrayList<>();
		try (FileReader fr= new FileReader(ruta);
				BufferedReader bf = new BufferedReader(fr);) {
			String linea = bf.readLine();
			while (linea!= null) {	 					//while(linea=bf.readLine())!=null;
				notas.add( Double.parseDouble(linea));
				linea = bf.readLine();
			}
		}
		catch(FileNotFoundException ex){
			ex.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return notas;
	}
	
	public void  escribirFichero(double nota) {
		try (FileOutputStream fos= new FileOutputStream(ruta, true); 
				PrintStream out= new PrintStream(fos);) {
			out.println(nota);
			System.out.println("Informacion almacenada en el fichero");
		}
		 catch (IOException e) {
				e.printStackTrace();
		}
	}
}
