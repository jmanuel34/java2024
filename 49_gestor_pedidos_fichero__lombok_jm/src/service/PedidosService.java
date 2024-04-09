package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

import model.Pedido;
import utilidades.Util;

public class PedidosService {
	String fichero = "C:\\Users\\manana\\Curso Java\\Java2024\\pedidos.txt";
	
	public void borrarPedidos() {
		File file = new File(fichero);
		file.delete();
	}
	public void nuevoPedido(Pedido pedido) {
		try(FileOutputStream fos=new FileOutputStream(fichero,true);
				PrintStream out=new PrintStream(fos)){
			out.println(Util.convertirPedidoACadena(pedido));
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public Pedido pedidoMasReciente() {
		LocalDate fMin = LocalDate.of(0,1,1);
		String linea;
		Pedido pedido= new Pedido();
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		try(FileReader fr=new FileReader(fichero);
				BufferedReader bf=new BufferedReader(fr)){
			//mientras haya una nota que leer
			while((linea=bf.readLine())!=null) {
				 pedido = Util.convertirCadenaAPedido(linea);
				if (fMin.isBefore(pedido.getFechaPedido())) {
					fMin = pedido.getFechaPedido();
			}
		}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		return pedido;
	}
	
	public ArrayList<Pedido> pedidosEntreFechas(LocalDate f1, LocalDate f2) {
		ArrayList<Pedido> pedidos = new ArrayList<Pedido>();		
		String linea;
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
		Pedido pedido;
		try(FileReader fr=new FileReader(fichero);
				BufferedReader bf=new BufferedReader(fr)){

			while((linea=bf.readLine())!=null) {
				 pedido = Util.convertirCadenaAPedido(linea);
				if (pedido.getFechaPedido().isAfter(f1)&&
						pedido.getFechaPedido().isBefore(f2)) {
					pedidos.add(pedido);
			}
		}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		return pedidos;
		
	}
	
	public Pedido pedidoProximoFecha(LocalDate fecha) {
		Pedido pAux=new Pedido();
		pAux.setFechaPedido(LocalDate.of(1, 1, 1));
		String linea;
		//comparamos la diferencia de días entre la fecha de cada pedido y la 
		//parámetro, con la diferencia de días entre la fecha auxiliar y la parámetro
		//si la del pedido es inferior, actualizamos la variable pedido auxiliar
		Pedido pedido;
		try(FileReader fr=new FileReader(fichero);
				BufferedReader bf=new BufferedReader(fr)){

			while((linea=bf.readLine())!=null) {
				 pedido = Util.convertirCadenaAPedido(linea);
					if(Math.abs(ChronoUnit.DAYS.between(pedido.getFechaPedido(), fecha))<
							Math.abs(ChronoUnit.DAYS.between(pAux.getFechaPedido(), fecha))) {
						pAux=pedido;
			}
		}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		return pAux;
	}
}
