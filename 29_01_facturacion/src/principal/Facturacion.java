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
		String [][] deptos= new String [facturaciones.length][2]; 		
		for (String n:facturaciones) {
			
			String depto;
			String deptFact;
			Departamento dept= new Departamento (n.substring(0, n.indexOf('-')),
										Integer.parseInt(n.substring(n.indexOf('-')+1,n.length() )));
					
		}
		String depto;
		String deptFact;
		for (int i=0; i<deptos.length; i++) {
			depto= facturaciones[i].substring(0, 
						Integer.parseInt(facturaciones[i].substring(facturaciones[i].indexOf('-'))));
			deptFact = facturaciones[i].substring(Integer.parseInt(facturaciones[i].substring(facturaciones[i].indexOf('-'))),
					facturaciones[i].length());
		}
		

	}

}
