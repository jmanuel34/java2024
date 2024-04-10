package service;

import java.util.ArrayList;
import java.util.HashSet;

import model.Ciudad;
import model.CiudadPoblacion;

/*
 * 
 * Desarrollar un programa para gestión de ciudades. 
 * Una ciudad se caracteriza por nombre, habitantes y pais.

El programa mostrará el siguiente menú: 

1.- Nueva ciudad
2.- Ciudad más poblada
3.- Buscar por pais
4.- Salir

1: se piden los datos de la nueva ciudad y se guarda. No puede haber dos ciudades con mismo nombre 
en el mismo pais
2: muestra directamente los datos de la ciudad má poblada
3: se pide un nombre de pais y se muestran los datos de todas las ciudades de dicho pais 
 */
public class CiudadesService {
	ArrayList<Ciudad> ciudades = new ArrayList<>();
	
	public boolean agregar (Ciudad ciudad) {
		for (Ciudad c:ciudades)
			if (ciudad.getNombre().equals(c.getNombre())  && 
					ciudad.getPais().equals(c.getPais())) {
				ciudades.add(ciudad);
				return true;
			}
		return false;
	}
	

	public Ciudad buscarMasPoblada () {
		Ciudad masPoblada=new Ciudad();
		for (Ciudad c:ciudades) {
			if (c.getHabitantes()> masPoblada.getHabitantes()) {
				masPoblada=c;
			}
		}
		return masPoblada;
	}
	public ArrayList<Ciudad> buscarPorPais(String pais)  {
		ArrayList<Ciudad> aux = new ArrayList<>();
		for (Ciudad c:ciudades) {
			if(c.getPais().equals(pais)) {
				aux.add(c);
			}
		}
		return aux;
	}
}