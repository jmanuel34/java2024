package principal;

import java.util.*;

import modelo.CustomObject;
import modelo.GFG;

public class Facturacion {
	// Method 4
	// Main driver method
	public static void main(String[] args) {

		// Creating an empty ArrayList of custom class type
		ArrayList<CustomObject> list = new ArrayList<>();

		// Calling above methods defined inside class
		GFG nuevo= new GFG();
		// in main() method
		nuevo.add(list);
		nuevo.sort(list);
		nuevo.print(list);
	}
}