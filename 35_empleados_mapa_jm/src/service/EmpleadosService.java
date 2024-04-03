package service;

import java.util.Collection;

/*
Realizar un programa para la gestión de empleados de una empresa.
 Un empleado se caracteriza por 
un nombre, y tiene asociado un código de empleado.
al iniciar el programa, aparecerá el siguiente menú:
1.- Nuevo empleado
2.- Buscar empleado
3.- Eliminar empleado
4.- Mostrar nombres de todos los empleados
5.- Salir

1: Se pide el nombre y código del empleado. Si no existe empleado con ese código, se guarda, 
pero si el código ya existe, no se guarda y se muestra advertencia al usuario
2: Se pide el código del empleado y se muestra su nombre
3: Se pìde el código del empleado y se borra, indicando un mensaje que diga el nombre del 
empleado que se ha borrado
4.- Muestra nombres de todos los empleados 
//*/

import java.util.HashMap;

public class EmpleadosService {
	HashMap<Integer, String> empleados =new HashMap<>();
	
	public boolean agregarEmpleado(Integer codigo, String nombre) {	
		if (!existeEmpleado(codigo)) {
			empleados.put (codigo, nombre);
			return true;
		}
		return false;
	}
	
	public String  devolverEmpleado(Integer codigo) {
		if (existeEmpleado(codigo)) {
			return empleados.get(codigo);
		}
		return "";
	}
	public String  buscarEmpleado (Integer codigo) {
		String nombre="";
		if (existeEmpleado(codigo)) {
			nombre= empleados.remove(codigo);
			empleados.remove(codigo);
		}
		return nombre;
	}
	
	public String  borrarEmpleado(Integer codigo) {
		String nombre ="";
		if (existeEmpleado(codigo)) {
			nombre= empleados.remove(codigo);
			empleados.remove(codigo);
		}
		return nombre;
		
	}
	
	public Collection<String> mostrarEmpleados() {
		 Collection<String> nombres = empleados.values();
		return nombres;
	}
	
	public String [] todosEmpleados() {
		 Collection<String> nombres = empleados.values();
		return nombres.toArray(new String [0]);
	}
	
	public boolean existeEmpleado(Integer codigo) {
		if (empleados.containsKey(codigo)) {
			return true;
		}
		return false;	
	}
	
}
