package principal;

import java.util.Arrays;

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

	public static void main(String[] args) {
		String facturacion = "ventas-99999," 
							+ "administracion-17900," 
							+ "informatica-35000," 
							+ "RRHH-10350,"
							+ "Otro-50555," 
							+ "OtroMas-44444," 
							+ "Ultimo-7500";
		String[] facturaciones = facturacion.split(",");
//*		
		String[] aux;
		String[][] depto = new String[facturaciones.length][2];
		for (int n = 0; n < facturaciones.length; n++) {
			depto[n] = facturaciones[n].toString().split("-");
		}
<<<<<<< HEAD
		// Comentario nuevo   
=======
		// Ordenacion del array
>>>>>>> bac13c7c8a03a3f3ae70d6ddf2920f8b2097140f
		for (int i = 0; i < depto.length - 1; i++) {
			for (int j = i; j < depto.length; j++) {
				if (Integer.valueOf(depto[i][1]) > Integer.valueOf(depto[j][1])) {
					aux = depto[i];
					depto[i] = depto[j];
					depto[j] = aux;
				}
			}
		}
		
//*/
		System.out.println("El departamento de mayor facturacion es: " + depto[depto.length - 1][0]);
		System.out.println("Con una cantidad de: " + depto[depto.length - 1][1]);
		System.out.println("");
		
		System.out.println("---------------------------------------");
		System.out.println("Departamentos ordenados por facturacion");
		System.out.println("---------------------------------------");	
		for (String[] n : depto) {
			System.out.println("Departamento de mas Facturacion: " + n[0] + ": " + n[1]);
		}
//*/	
	}

}
