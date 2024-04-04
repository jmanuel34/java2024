package view;

import java.util.HashSet;
import java.util.Scanner;

import model.Direccion;
import service.BuscadorService;

public class BuscadorView {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BuscadorService service=new BuscadorService();
		System.out.println("Introduce temática:");
		String tematica=sc.nextLine();
		HashSet<Direccion> direcciones=service.buscar(tematica);
		for(Direccion d:direcciones) {
			System.out.println("URL: "+d.getUrl());
			System.out.println("Descripción: "+d.getDescripcion());
			System.out.println("-----------------------");
		}
	}

}