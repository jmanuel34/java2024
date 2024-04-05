package service;

import java.time.LocalDate;
/*
 * Programa para manejar pedidos.
 * Un pedido se caracteriza por producto,unidades, fecha de pedido
 * 1.- Nuevo pedido
 * 2.- Pedido más reciente
 * 3.- Pedidos entre dos fechas
 * 4.- Salir 
 * 
 */
import java.util.ArrayList;

import modelo.Pedido;

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
		return pedidos;
	}

}
