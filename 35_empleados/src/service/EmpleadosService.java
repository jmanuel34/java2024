package service;

import java.util.Collection;
import java.util.HashMap;

public class EmpleadosService {
	HashMap<Integer,String> empleados=new HashMap<Integer, String>();
	public boolean agregarEmpleado(int codigo, String nombre) {
		if(!empleados.containsKey(codigo)) { //si no existe la clave, se añade empleado
			empleados.put(codigo, nombre);
			return true;
		}
		return false;
	}
	
	public String buscarEmpleado(int codigo) {
		return empleados.get(codigo); //devuelve nombre si existe, sino devuelve null
	}
	
	public String eliminarEmpleado(int codigo) {
		return empleados.remove(codigo); //devuelve nombre si existe, sino devuelve null
	}
	
	public String[] todosEmpleados() {
		Collection<String> todos=empleados.values();
		return todos.toArray(new String[0]);
	}
}
