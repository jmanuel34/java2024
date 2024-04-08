package model;
/*
Programa para manejar pedidos. Un pedido se caracteriza por producto,unidades,fechaPedido.
Se presenta el siguiente menú:
1.- Nuevo pedido
2.- Pedido más reciente
3.- Pedidos entre dos fechas
4.- Pedido proximo a fecha
5.- Salir

2: Muestra los datos del pedido más reciente
3: Se solicitan dos fechas, y se muestran los pedidos realizados
en ese rango de fechas
4: Se solicita una fecha y nos muestra el pedido mas cercano a dicha fecha 

public class Pedido {
	//*/

import java.time.LocalDate;

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

