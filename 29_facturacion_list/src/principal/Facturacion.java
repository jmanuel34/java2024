package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import modelo.Depto;

/*
 * Segundo ejercicio vacaciones: 
 * String facturacion="ventas-20800,administracion-17900,
 * informatica-35000,RRHH-10350";
 * El programa mostrará:
 * Nombre del departamento que más ha facturado
 * Nombres de todos los departamentos, ordenados de menos a más 
 * facturación
 */

public class Facturacion {

	public static void main(String args[]) {
		
		List<Depto> list = new ArrayList<Depto>();

		String facturacion = "Ventas-99999,"
				+ "Contabilidad-571111,"
				+ "Administracion-17900," 
				+ "Informatica-35000," 
				+ "RRHH-10350,"
				+ "Otro-50555," 
				+ "OtroMas-44444," 
				+ "Ultimo-7500";
		String[] facturaciones = facturacion.split(",");		
		for (int i = 0; i < facturaciones.length; i++) {
			Depto dep = new Depto(
					facturaciones[i].toString().substring(0, facturaciones[i].toString().indexOf('-')),
					Integer.parseInt(facturaciones[i].toString().substring(facturaciones[i].indexOf('-') + 1,
							facturaciones[i].length())));
			list.add(dep);
		}
		
		System.out.println("--------------------------");
		System.out.println("Departamentos sin ordenar:");		// Departamentos sin ordenar
		for (Depto a : list)									// por Orden de entrada
			System.out.println(a.getDeptonombre() + ", "+a.getDeptofact());
		System.out.println();
		
		
		System.out.println("------------------------");
		System.out.println("Departamentos ordenados:");			// ordenamos los Departamentos por nombre
		Collections.sort(list);
		for (Depto a : list)
			System.out.print(a.getDeptonombre() + ", ");

		System.out.println(" ");
		System.out.println(" ");

		Collections.sort(list, new Depto());        			// Ordenamos los deptos. por facturacion
		System.out.println("-----------------------------------------");
		System.out.println("Departamentos ordenados por facturacion: ");
		
		for (Depto a : list)
			System.out.println(a.getDeptonombre() + ": " + a.getDeptofact() + ", ");
	
		
		System.out.println("-----------------------------------------");
		System.out.println("Departamento de máxima facturacion: ");	
		Depto maximo= Collections.max(list, new Depto());
		System.out.println("Departamento: " +maximo.getDeptonombre()+ "; Facturacion: "+maximo.getDeptofact());
	}
	
}
