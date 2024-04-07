package service;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
/*
 * Programa para manejar pedidos.
 * Un pedido se caracteriza por producto,unidades, fecha de pedido
 * 1.- Nuevo pedido
 * 2.- Pedido más reciente
 * 3.- Pedidos entre dos fechas
 * 4.- Salir 
 * 4: Se solicita una fecha y nos muestra el pedido mas cercano a dicha fecha 

 */
import java.util.ArrayList;

import model.Pedido;

public class PedidosService {
	ArrayList<Pedido> pedidos = new ArrayList<>();

	public boolean agregar(Pedido pedido) {
		return pedidos.add(pedido);
	}

	public Pedido masReciente() {
//		Date f1=new Date(Long.MIN_VALUE);
//		Pedido pedidoMasReciente = new Pedido();
//		pedidoMasReciente.setFechaPedido(f1);
//		Pedido paux=null;
//		LocalDate fMax = LocalDate.of(2024, 12, 23);
		Pedido pedidoMasReciente = pedidos.get(0);
		for (Pedido p : pedidos) {
			if (pedidoMasReciente.getFechaPedido().isAfter(p.getFechaPedido())) {
				pedidoMasReciente = p;
			}
		}
		return pedidoMasReciente;
	}

//	 * 3.- Pedidos entre dos fechas
	public ArrayList<Pedido> pedidosEntreFechas(LocalDate fecha1, LocalDate fecha2) {
		if (fecha1.compareTo(fecha2) > 0) {
			LocalDate aux = fecha1;
			fecha1 = fecha2;
			fecha2 = aux;
		}
		ArrayList pedidosAux = new ArrayList<>();
		for (Pedido p : pedidos) {
			if ((p.getFechaPedido().isAfter(fecha1)) && (p.getFechaPedido().isBefore(fecha2))) {
				pedidosAux.add(p);
			}
		}
		return pedidosAux;
	}

	public Pedido pedidoMasCercano(LocalDate fecha) {
//		LocalDate aux = pedidos.get(0).getFechaPedido();
/*
		DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyyMMdd");		
		System.out.println(fecha.format(format)); 
/*
 * 		
 */
//*		Esto funciona
		long auxiliar = Math.abs(ChronoUnit.DAYS.between(fecha, pedidos.get(0).getFechaPedido())) ;
//		System.out.println(auxiliar);
//*/
		Pedido pedido = pedidos.get(0);
		for (Pedido p:pedidos) {
			if (Math.abs( ChronoUnit.DAYS.between(p.getFechaPedido(), fecha)) < auxiliar ) {
				auxiliar=Math.abs(ChronoUnit.DAYS.between(p.getFechaPedido(), fecha));
				pedido = p;
			}
		}
		return pedido;
//			long auxiliar=ChronoUnit.DAYS.between(fecha, p.getFechaPedido()) ;
//			if (auxiliar<ChronoUnit.DAYS.between(fecha, p.getFechaPedido())) {
//				pedido = p;
//			}
		
		//		long Periodo= LocalDate.getLong(fecha);
//		long ped = pedidos.get(0).getFechaPedido().toEpochSecond(null, null);
//		ZoneOffset zone = ZoneOffset.of("Z");
		
//		long value = f2.toEpochSecond(f1, zone);		
//		System.out.println(f1.getLong().toEpochDay());
//		System.out.println();
//		System.out.println(fecha.getLong(null));
		
		
		/*
		 * Period p1 = Period.between(ped.getFechaPedido(), fecha);
		 * 
		 * 
		 * tiempo = ChronoUnit.DAYS.between(ped.getFechaPedido(), fecha); for (Pedido
		 * p:pedidos) {
		 * 
		 * int cmp = fecha.compareTo(ped.getFechaPedido()); if (cmp == 0) { cmp = fecha.
		 * - otherDate.month; if (cmp == 0) { cmp = this.day - otherDate.day; } }
		 * 
		 * return cmp;
		 */

//		System.out.println(ped);
	}

}
