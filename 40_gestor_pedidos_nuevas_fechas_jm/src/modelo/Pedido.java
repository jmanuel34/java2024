package modelo;

import java.time.LocalDate;
import java.util.Date;

/*
 * Programa para manejar pedidos.
 * Un pedido se caracteriza por producto,unidades,fechaPedido fecha de pedido
 * 1.- Nuevo pedido
 * 2.- Pedido más reciente
 * 3.- Pedidos entre dos fechas
 * 4.- Salir 
 * 
 */

public class Pedido {
	private String nombre;
	private int unidades;
	private LocalDate fechaPedido;
	
	public Pedido() {
		super();
	}
	public Pedido(String nombre, int unidades, LocalDate fechaPedido) {
		super();
		this.nombre = nombre;
		this.unidades = unidades;
		this.fechaPedido = fechaPedido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public LocalDate getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(LocalDate fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	
	

}
