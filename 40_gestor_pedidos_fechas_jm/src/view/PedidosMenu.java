package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import modelo.Pedido;
import service.PedidosService;

/*
 * Programa para manejar pedidos.
 * Un pedido se caracteriza por producto,unidades, fecha de pedido
 * 1.- Nuevo pedido
 * 2.- Pedido más reciente
 * 3.- Pedidos entre dos fechas
 * 4.- Salir 
 * 
 */

public class PedidosMenu {
	static PedidosService service = new PedidosService();
	static Calendar calendar = Calendar.getInstance();

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		calendar.set(2023, 04, 30);
		Date f1 = calendar.getTime();
		calendar.set(2022, 11, 30);
		Date f2 = calendar.getTime();
		calendar.set(2022, 10, 29);
		Date f3 = calendar.getTime();
		service.agregar(new Pedido("CocaCola", 20, f1));
		service.agregar(new Pedido("Fanta", 21, f2));
		service.agregar(new Pedido("Mirinda", 22, f3));

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
				System.out.println("Adios!");
				break;
			default:
				System.out.println("Opción no válida!");
			}
		} while (opcion != 4);

	}

	static void presentarMenu() {
		System.out.println("""
				1.- Agregar Pedido
				2.- Pedido Mas Reciente
				3.- Buscar entre fechas
				4.- Salir

				""");
	}

	static void agregarPedido() {
		Scanner sc = new Scanner(System.in);
//		calendar.set(2023,11,30);
//		Date f1=calendar.getTime();
		String nombre;
		Integer unidades;
		String fecha;

		System.out.println("Vamos a añadir los datos");
		System.out.println("Introduce el pedido: ");
		nombre = sc.nextLine();

		System.out.println("Introduce las unidades: ");
		unidades = Integer.parseInt(sc.nextLine());

		System.out.println("Introduce la fecha: ");
		try {
			fecha = sc.nextLine();
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			Date date = format.parse(fecha);

			Pedido pedido = new Pedido(nombre, unidades, date);
			sc.close();
			if (service.agregar(pedido)) {
				System.out.println("El pedido " + pedido.getNombre() + " ha sido añadida");
			} else
				System.out.println("Error");
		} catch (ParseException ex) {
			System.out.println("Fecha no valida, el pedido no se ha guardado");
		}
	}

	static void masReciente() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Pedido pedido = service.masReciente();
		System.out.println("El pedido mas reciente es:" + pedido.getNombre() + "; " + pedido.getUnidades() + "; "
				+ sdf.format(pedido.getFechaPedido()));
	}

	static void buscarEntreFechas() {
		String fecha1, fecha2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la fecha inicial: ");
		try {
			fecha1 = sc.nextLine();
			SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
			Date date1 = format1.parse(fecha1);

			System.out.println("Introduce la fecha final: ");
			fecha2 = sc.nextLine();
			SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyyy");
			Date date2 = format1.parse(fecha2);

			ArrayList<Pedido> pedidos = service.pedidosEntreFechas(date1, date2);
			System.out.println("Pedidos entre fechas" + fecha1 + " y " + fecha2);
			System.out.println();
			for (Pedido p : pedidos) {
				System.out.println(p.getNombre() + ", " + p.getUnidades() + ", " + p.getFechaPedido());
			}
		} catch(ParseException ex) {
			ex.printStackTrace();
			System.out.println("Fecha no valida");
		}
	}
}
