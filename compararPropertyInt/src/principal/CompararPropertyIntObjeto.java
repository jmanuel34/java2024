package principal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import modelo.*;
public class CompararPropertyIntObjeto {

	public static void main(String args[]) {
		// Takes a list o Dog objects
		List<Dog> list = new ArrayList<Dog>();

		list.add(new Dog("Shaggy", 3));
		list.add(new Dog("Lacy", 2));
		list.add(new Dog("Roberto", 499999));
		list.add(new Dog("Roger", 10));
		list.add(new Dog("Tommy", 4));
		list.add(new Dog("Tammy", 1));
		
		Collections.sort(list);// Sorts the array list

		for (Dog a : list)// printing the sorted list of names
			System.out.print(a.getDogName() + ", ");

		// Sorts the array list using comparator
		Collections.sort(list, new Dog());
		System.out.println(" ");
		for (Dog a : list)// printing the sorted list of ages
			System.out.println(a.getDogName() + "  : " + a.getDogAge() + ", ");
	}
}
