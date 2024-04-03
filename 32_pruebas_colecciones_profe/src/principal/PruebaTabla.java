package principal;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class PruebaTabla {

	public static void main(String[] args) {
		HashMap<String, Integer> ciudades= new HashMap<String, Integer>();
		ciudades.put("Madrid", 3_200_000);
		ciudades.put("Zaragoza", 1_000_000);
		ciudades.put("Caceres", 50_000);
		ciudades.put("Zaragoza", 2_000_000);
		ciudades.put("Caceres", 600_000);
		System.out.println(ciudades.get("Caceres"));
		// Recorrido de un HashMap
		Set<String> claves=ciudades.keySet();
		for (String c:claves) {
			System.out.println(c);
		}
		Collection<Integer> valores = ciudades.values();
		for (Integer n:valores) {
			System.out.println(n);
		}
	}

}
