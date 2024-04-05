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
	HashSet<Ciudad> ciudades = new HashSet<>();
	ArrayList<CiudadPoblacion> ciudadesPoblaciones = new ArrayList<>();
	
	public boolean agregar (Ciudad ciudad) {
		return ciudades.add(ciudad);
	}
	
	public boolean agregarCP (CiudadPoblacion ciudadPoblacion) {
		if (agregar(ciudadPoblacion.getCiudad())) {
			return ciudadesPoblaciones.add(ciudadPoblacion);
		}
		return false;
	}

	public CiudadPoblacion buscarMasPoblada () {
		CiudadPoblacion masPoblada=new CiudadPoblacion();
		for (CiudadPoblacion cp:ciudadesPoblaciones) {
			if (cp.getPoblacion()> masPoblada.getPoblacion()) {
				masPoblada=cp;
			}
		}
		return masPoblada;
	}
	public ArrayList<CiudadPoblacion> buscarPorPais(String pais)  {
		ArrayList<CiudadPoblacion> cp = new ArrayList<>();
		for (CiudadPoblacion c:ciudadesPoblaciones) {
			if(c.getCiudad().getPais().equals(pais)) {
				cp.add(c);
			}
		}
		return cp;
	}
}