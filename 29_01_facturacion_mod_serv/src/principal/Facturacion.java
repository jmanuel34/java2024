package principal;

import service.FacturacionService;
import java.util.ArrayList;
import java.util.List;

import model.Depto;

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

		FacturacionService service = new FacturacionService();
		String facturacion = "Ventas-99999," 
							+ "Administracion-175900," 
							+ "Informatica-35000," 
							+ "RRHH-10350,"
							+ "Otro-50555," 
							+ "OtroMas-44444," 
							+ "Ultimo-7500,"
							+ "Contabilidad-75000";

		String[] facturaciones = facturacion.split(",");

//		String[][] deptos = new String[facturaciones.length][2];
		for (int i = 0; i < facturaciones.length; i++) {
			Depto dep = new Depto(
					facturaciones[i].toString().substring(0, facturaciones[i].toString().indexOf('-')),
					Integer.parseInt(facturaciones[i].toString().substring(facturaciones[i].indexOf('-') + 1,
							facturaciones[i].length())));
			service.agregar(dep);
		}
		Depto dep = service.FacturacionMasAlta();
		System.out.println("Departamento con Facturacion mas alta: "+dep.getNombre()+ ";Facturacion: "+dep.getFacturacion());
		System.out.println(" ");
		
		System.out.println("----------------------");
		System.out.println("Departamentos por Nombre");	
		List<Depto> deptosNombre=service.devolverDeptosNombre();
		for (Depto d:deptosNombre) {
			System.out.println("Departamento: "+d.getNombre()+"; Facturacion: "+d.getFacturacion());
		}
		
		System.out.println("----------------------");
		System.out.println("Departamentos por Facturacion");
		List<Depto> deptosFact=service.devolverDeptosFact();	
		for (Depto d:deptosFact) {
			System.out.println("Departamento: "+d.getNombre()+"; Facturacion: "+d.getFacturacion());
		}

	}

	
}
