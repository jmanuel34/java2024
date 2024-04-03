package view;

import java.util.Scanner;

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

import service.EmpleadosService;

public class EmpleadosHashMap {
	static EmpleadosService service = new EmpleadosService();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			// presentar menu
			// leer opción y comprobar opcion elegida
			presentarMenu();
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				inicializarEmpleados();
				agregarEmpleado();
				break;
			case 2: 
				buscarEmpleado();
				break;
			case 3:
				borrarEmpleado();
				break;
			case 4:
				mostrarEmpleados();
				break;
			case 5:
				System.out.println("Adios!");
				break;
			default:
				System.out.println("Opción no válida!");
			}
		} while (opcion != 5);

	}
	static void presentarMenu() {
		System.out.println("""
				1.- Agregar empleado
				2.- Buscar empleado
				3.- Borrar empleado
				4.- Mostrar empleados
				5.- Salir
				
				""");
	}
	static void agregarEmpleado() {
		int clave;
		String nombre;
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca clave para el usuario");
		clave = Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca el nombre del usuario");
		nombre = sc.nextLine();
		if (service.agregarEmpleado(clave, nombre)) {
			System.out.println("Usuario agregado");
		}
		else System.out.println("Error. La clave de usuario ya existe");
	}
	static void buscarEmpleado() {
		int clave;
		String nombre;
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca clave ");
		clave = Integer.parseInt(sc.nextLine());
		if (service.existeEmpleado(clave)) {
			nombre =service.buscarEmpleado(clave);
			System.out.println("Nombre de empleado: "+ nombre);
		}
		else {
			System.out.println("Error. No existe esa clave de empleado");
		}
	}
	
	static void borrarEmpleado() {
		int clave;
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca clave para de usuario para borrar");
		clave = Integer.parseInt(sc.nextLine());
		if (service.existeEmpleado(clave)) {
			service.borrarEmpleado(clave);
		}
		else {
			System.out.println("Error. No existe esa clave de empleado");
		}
	}
	static void mostrarEmpleados() {
		String[] empleados;
		empleados = service.todosEmpleados();
		System.out.println("Nombres de los empleados:");
		for (String e:empleados) {
			System.out.println(e);
		}
		System.out.println();
	}
	static void inicializarEmpleados() {
		service.agregarEmpleado(1, "jm");
		service.agregarEmpleado(2, "cm");
		service.agregarEmpleado(3, "ma");
		service.agregarEmpleado(4, "el");
	}
}
