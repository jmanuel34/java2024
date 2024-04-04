package service;
/*
 *
 * Realizar un programa para la gestión de empleados de una empresa. 
Un empleado se caracteriza por un nombre,un email, edad y tiene asociado un código de empleado.
al iniciar el programa, aparecerá el siguiente menú:
1.- Nuevo empleado
2.- Buscar empleado
3.- Eliminar empleado
4.- Mostrar datos de todos los empleados
5.- Salir


3: Se pìde el código del empleado y se borra, indicando un mensaje que diga el nombre del empleado 
que se ha borrado
//*/ 

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import model.Empleado;

public class EmpleadosService {
	HashMap<Integer, Empleado> empleados = new HashMap<>();
	
	public boolean existe(Integer codigo) {
		if (empleados.containsKey(codigo)) {
			return true;
		}
		return false;	
	}

	public boolean agregarEmpleado(Empleado empleado) {
		if (!existe(empleado.getCodigo())) {
			empleados.put(empleado.getCodigo(), empleado);
			return true;
		}
		return false;
	}
/*
 * 2: Se pide el código del empleado y se muestran sus datos	
 */
	public Empleado buscarEmpleado (Integer codigo) {
		Empleado empleado= new Empleado();
		if (existe(codigo)) {
			empleado = empleados.get(codigo);
		}
		return empleado;
	}
	
/*
 * 3: Se pìde el código del empleado y se borra, indicando un mensaje que diga el nombre del empleado 
 * que se ha borrado
 */
	public String eliminarEmpleado(Integer codigo) {
		String nombre ="";
		if (existe(codigo)) {
			nombre= empleados.get(codigo).getNombre();
			empleados.remove(codigo);
		}
		return nombre;

	}
	
/*
 * 4.- Muestra datos de todos los empleados 	
 */
	public Collection<Empleado> todosEmpleados() {
		Collection<Empleado> todos=empleados.values();
		return todos;
		
	}
	
}
