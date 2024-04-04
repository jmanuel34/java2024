package view;

import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

import model.Empleado;
import service.EmpleadosService;

/*
* Realizar un programa para la gestión de empleados de una empresa. 
* Un empleado se caracteriza por un nombre,un email, edad y tiene asociado un código de empleado.
* al iniciar el programa, aparecerá el siguiente menú:
* 
* 1.- Nuevo empleado
* 2.- Buscar empleado
* 3.- Eliminar empleado
* 4.- Mostrar datos de todos los empleados
* 5.- Salir
* 
* 1: Se pide el nómbre, email, edad y código del empleado. Si no existe empleado con ese código, 
* 			se guarda, pero si el código ya existe, no se guarda y se muestra advertencia al usuario
* 2: Se pide el código del empleado y se muestran sus datos
* 	
* 3: Se pìde el código del empleado y se borra, indicando un mensaje que diga el nombre del empleado 
* que se ha borrado
* 4.- Muestra datos de todos los empleados 
* 
//*/ 

public class EmpleadosMenu {
	static EmpleadosService service= new EmpleadosService();
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Empleado empleado= new Empleado(1,"Jm",24, "jm@m");
		Empleado empleado1= new Empleado(2,"Ms",25, "ms@m");
		Empleado empleado2= new Empleado(3,"Ma",26, "ma@m");
		Empleado empleado3= new Empleado(4,"El",27, "el@m");
		Empleado empleado4= new Empleado(5,"Otro",29, "otro@ma");
		service.agregarEmpleado(empleado);
		service.agregarEmpleado(empleado2);
		service.agregarEmpleado(empleado3);
		service.agregarEmpleado(empleado4);
		service.agregarEmpleado(empleado1);

		int opcion;

		do {
			//presentar menu
			//leer opción y comprobar opcion elegida
			presentarMenu();
			opcion=sc.nextInt();
			switch(opcion) {
				case 1:
					agregarEmpleado();
					break;
				case 2:
					buscarEmpleado();
					break;
				case 3:
					eliminarEmpleado();
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
		}while(opcion!=5);

	}
	static void presentarMenu() {
		System.out.println("""
				1.- Agregar empleado
				2.- Buscar empleado
				3.- Eliminar empleado
				4.- Mostrar empleados
				5.- Salir
				
				""");
		
	}
	
	static void agregarEmpleado() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Código empleado: ");
		int codigo=Integer.parseInt(sc.nextLine());
		System.out.println("Nombre empleado: ");
		String nombre=sc.nextLine();
		System.out.println("INtroduzca la edad: ");
		int edad= Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca el email: ");
		String email=sc.nextLine();
		Empleado empleado = new Empleado(codigo, nombre, edad, email);
		if(service.agregarEmpleado(empleado)) {
			System.out.println("Añadido!");
		}else {
			System.out.println("Código ya existente, no se añadió!");
		}
	}
	
	static void buscarEmpleado() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Código empleado:");
		int codigo=Integer.parseInt(sc.nextLine());
		Empleado empleado=service.buscarEmpleado(codigo);
		if(empleado.getNombre()==null) {
			System.out.println("No existe empleado");
		}else {
			System.out.println("Datos del empleado: ");
			System.out.println("Nombre: "+empleado.getNombre()+ "; " 
								+ " Codigo: "+ empleado.getCodigo()+ "; "
								+ " Edad: "+empleado.getEdad()+ "; "
								+ " Email: "+empleado.getEmail());
		}
		System.out.println();
	}
	
	static void eliminarEmpleado() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Código empleado:");
		int codigo=Integer.parseInt(sc.nextLine());
		String nombre=service. eliminarEmpleado(codigo);
		if(nombre==null) {
			System.out.println("No existe empleado");
			System.out.println();
		}else {
			System.out.println("El empleado eliminado es: "+nombre);
			System.out.println("");
		}
	}
/*	
	static void mostrarEmpleados() {
		String[] empleados=service.todosEmpleados();
		System.out.println("Empleados: "+Arrays.toString(empleados));
	}
*/
	static void mostrarEmpleados() {
		Collection<Empleado> empleados = service.todosEmpleados();
			Iterator itr=empleados.iterator();
			System.out.println("Empleados: ");
			while (itr.hasNext()) {
				Empleado e=(Empleado)itr.next();
				System.out.println("Codigo: "+e.getCodigo()+"; "
									+ " Nombre: "+e.getNombre()+"; "
									+ " Edad: "+ e.getEdad()+"; "
									+ " Email: "+e.getEmail());
				
			}
			System.out.println();
	}
}
