package service;

import java.util.Collection;
import java.util.HashMap;

import model.Empleado;

public class EmpleadosService {
	HashMap<Integer,Empleado> empleados=new HashMap<>();
	public boolean agregarEmpleado(Empleado empleado) {
		if(!empleados.containsKey(empleado.getCodigo())) { //si no existe la clave, se añade empleado
			empleados.put(empleado.getCodigo(), empleado);
			return true;
		}
		return false;
	}
	
	public Empleado buscarEmpleado(int codigo) {
		return empleados.get(codigo); //devuelve nombre si existe, sino devuelve null
	}
	
	public Empleado eliminarEmpleado(int codigo) {
		return empleados.remove(codigo); //devuelve nombre si existe, sino devuelve null
	}
	
	public Empleado[] todosEmpleados() {
		Collection<Empleado> todos=empleados.values();
		return todos.toArray(new Empleado[0]);
	}
}
