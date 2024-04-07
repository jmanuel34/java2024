package view;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import model.Pedido;
import service.PedidosService;

/*
 * Programa para manejar pedidos.
 * Un pedido se caracteriza por producto,unidades, fecha de pedido
 * 1.- Nuevo pedido
 * 2.- Pedido más reciente
 * 3.- Pedidos entre dos fechas
 * 4.- Pedido mas cercano a una fecha
 * 5.- Salir 
 * 
 */

public class PedidosMenu {
	static PedidosService service = new PedidosService();

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//*	
		LocalDate fecha1 = LocalDate.parse("11/10/2023", dtf);
		LocalDate fecha2 = LocalDate.parse("11/11/2023", dtf);
		LocalDate fecha3 = LocalDate.parse("13/12/2023", dtf);
		LocalDate fecha4 = LocalDate.parse("14/09/2023", dtf);
		LocalDate fecha5 = LocalDate.parse("15/02/2023", dtf);
		
		service.agregar(new Pedido("CocaCola", 20, fecha1));
		service.agregar(new Pedido("Fanta", 21, fecha2));
		service.agregar(new Pedido("Mirinda", 22, fecha3));
		service.agregar(new Pedido("Agua Fontenova", 21, fecha4));
		service.agregar(new Pedido("Agua Cabreiroa", 22, fecha5));
		
//*/	
		int opcion;

		do {
			// presentar menu
			// leer opción y comprobar opcion elegida
			presentarMenu();
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				agregarPedido();
				break;
			case 2:
				masReciente();
				break;
			case 3:
				buscarEntreFechas();
				break;
			case 4:
				masCercano();
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
				1.- Agregar Pedido
				2.- Pedido Mas Reciente
				3.- Buscar entre fechas (excluidas ambas)
				4.- Pedido más cercano a una fecha
				5.- Salir

				""");
	}

	static void agregarPedido() throws Exception {
		Scanner sc = new Scanner(System.in);
//		calendar.set(2023,11,30);
//		Date f1=calendar.getTime();
		String nombre;
		Integer unidades;
		LocalDate fechaIntro;

		System.out.println("Vamos a añadir los datos");
		System.out.println("Introduce el pedido: ");
		nombre = sc.nextLine();

		System.out.println("Introduce las unidades: ");
		unidades = Integer.parseInt(sc.nextLine());

		System.out.println("Introduce la fecha: ");

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		fechaIntro = LocalDate.parse(sc.nextLine());
		Pedido pedido = new Pedido(nombre, unidades, fechaIntro);
		if (service.agregar(pedido)) {
			System.out.println("El pedido " + pedido.getNombre() + " ha sido añadida");
		} else
			System.out.println("Error");
	}

	static void masReciente() {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Pedido pedido = service.masReciente();
		System.out.println("El pedido mas reciente es:" + pedido.getNombre() + "; " + pedido.getUnidades() + "; "
				+ (pedido.getFechaPedido().format(dtf)));
		System.out.println();
	}

	static void buscarEntreFechas() throws Exception {
		String fechaI, fechaF;
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		String fechaI="20/09/2019";
		System.out.println("Introduce la fecha inicial (excluida): ");
		fechaI = sc.nextLine();
		LocalDate ldI = LocalDate.parse(fechaI, format);
		System.out.println();

		System.out.println("Introduce la fecha final (excluida): ");
		fechaF = sc.nextLine();
		LocalDate ldF = LocalDate.parse(fechaF, format);
		System.out.println();
		ArrayList<Pedido> pedidos = service.pedidosEntreFechas(ldI, ldF);
		System.out.println("Pedidos entre fechas" + fechaI + " y " + fechaF);
		for (Pedido p : pedidos) {
			System.out.println(p.getNombre() + ", " + p.getUnidades() + ", " + p.getFechaPedido());
		}
	}

	static void masCercano() {
		String fecha;
		Scanner sc = new Scanner(System.in);
		Pedido pedido;
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Introduce la fecha (dd/MM/yyyy): ");
		fecha = sc.nextLine();
		LocalDate ld = LocalDate.parse(fecha, format);
		System.out.println(" El pedido mas cercano es:" +service.pedidoMasCercano(ld).getNombre());

	}

}
