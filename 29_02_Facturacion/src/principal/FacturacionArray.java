package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import modelo.Depto;

public class FacturacionArray {

	public static void main(String[] args) {
		List<Depto> lista = new ArrayList<Depto>();

		String facturacion = "ventas-99999," + "administracion-17900," + "informatica-35000," + "RRHH-10350,"
				+ "Otro-50555," + "OtroMas-44444," + "Ultimo-7500";

		String[] facturaciones = facturacion.split(",");
		String[][] deptos = new String[facturaciones.length][2];

		for (int i = 0; i < facturaciones.length; i++) {
			Depto dep = new Depto(facturaciones[i].toString().substring(0, facturaciones[i].toString().indexOf('-')),
					Integer.parseInt(facturaciones[i].toString().substring(facturaciones[i].indexOf('-') + 1,
							facturaciones[i].length())));
			lista.add(dep);
		}
		Collections.sort(lista);
		Collections.sort(lista, new Depto());
	}
}
