package service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import model.Depto;

public class FacturacionService {
	List<Depto> deptos = new ArrayList<Depto>();
	
	public boolean agregar (Depto Depto ) {
		if (!comprobar(Depto.getNombre())) {
			deptos.add(Depto);
			return true;
		}
		return false;
	}
/*	
	public Depto FacturacionMasAlta() {
		int maximo= deptos.get(0).getFacturacion();
		Depto dept= deptos.get(0);
		for (Depto d:deptos) {
			if (d.getFacturacion()>maximo){
				dept=d;
			}
		}
		return dept;
	}
*/
	public Depto FacturacionMasAlta() {
		return Collections.max(deptos, new Depto());
	}
	
	public List<Depto> devolverDeptosFact(){
		Collections.sort(deptos, new Depto());
		return deptos;
	}
		
	public List<Depto> devolverDeptosNombre(){
		Collections.sort(deptos);
		return deptos;
	}
	
	public boolean comprobar(String nombre) {
		for (Depto d:deptos) {
			if (d.getNombre().equalsIgnoreCase(nombre))
				return true;		
		}
		return false;
	}

}
