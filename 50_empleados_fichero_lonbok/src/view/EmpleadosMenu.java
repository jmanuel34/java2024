package view;

import java.util.Arrays;
import java.util.Scanner;

import model.Empleado;
import service.EmpleadosService;

public class EmpleadosMenu {
	static EmpleadosService service=new EmpleadosService();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
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
		/*Empleado emp=new Empleado();
		System.out.println("Código empleado:");
		emp.setCodigo(Integer.parseInt(sc.nextLine()));
		System.out.println("Nombre empleado:");
		emp.setNombre(sc.nextLine());*/
		
		
		System.out.println("Código empleado:");
		int codigo=Integer.parseInt(sc.nextLine());
		System.out.println("Nombre empleado:");
		String nombre=sc.nextLine();
		System.out.println("Email empleado:");
		String email=sc.nextLine();
		System.out.println("Edad empleado:");
		int edad=Integer.parseInt(sc.nextLine());
		
		Empleado emp=new Empleado(codigo, nombre, email, edad);
		
		
		
		
		if(service.agregarEmpleado(emp)) {
			System.out.println("Añadido!");
		}else {
			System.out.println("Código ya existente, no se añadió!");
		}
	}
	static void buscarEmpleado() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Código empleado:");
		int codigo=Integer.parseInt(sc.nextLine());
		Empleado emp=service.buscarEmpleado(codigo);
		if(emp==null) {
			System.out.println("No existe empleado");
		}else {
			System.out.println("El empleado es: "+emp.getNombre());
		}
	}
	static void eliminarEmpleado() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Código empleado:");
		int codigo=Integer.parseInt(sc.nextLine());
		Empleado emp=service.eliminarEmpleado(codigo);
		if(emp==null) {
			System.out.println("No existe empleado");
		}else {
			System.out.println("El empleado eliminado es: "+emp.getNombre());
		}
	}
	static void mostrarEmpleados() {
		Empleado[] empleados=service.todosEmpleados();
		//System.out.println("Empleados: "+Arrays.toString(empleados));
		for(Empleado e:empleados) {
			System.out.println("Nombre: "+e.getNombre()+" Edad:"+e.getEdad());
		}
	}
}
