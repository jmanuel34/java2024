package principal;

import model.Departamento;

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
		for (String n:facturaciones) {
			System.out.print(n.substring(0, n.indexOf('-'))+": ");
			System.out.println(n.substring(n.indexOf('-')+1,n.length() ));
			
			// Departamento d= 
			// System.out.println(n.substring(n.charAt(n.indexOf('-'))));
			//			System.out.println(n);
		}
		

	}

}
