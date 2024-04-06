package service;

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
import java.util.Date;

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
		Pedido pedidoMasReciente = pedidos.get(0);
		for (Pedido p : pedidos) {
			if (pedidoMasReciente.getFechaPedido().after(p.getFechaPedido())) {
				pedidoMasReciente = p;
			}

		}
		return pedidoMasReciente;
	}

//	 * 3.- Pedidos entre dos fechas
	public ArrayList<Pedido> pedidosEntreFechas(Date fecha1, Date fecha2) {
		if (fecha1.compareTo(fecha2) > 0) {
			Date aux = fecha1;
			fecha1 = fecha2;
			fecha2 = aux;
		}
		ArrayList pedidosAux = new ArrayList<>();
		for (Pedido p : pedidos) {
			if ((p.getFechaPedido().compareTo(fecha1) >= 0) && (p.getFechaPedido().compareTo(fecha2) <= 0)) {
				pedidosAux.add(p);
			}
		}
		return pedidosAux;
	}

}
