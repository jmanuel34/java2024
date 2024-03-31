package modelo;

import java.util.ArrayList;

// Class 2
public class GFG {
 
    // Method 1
    // To print sorted ArrayList objects
    // using enhanced for loop
    public static void print(ArrayList<CustomObject> list) {
       
        for (CustomObject obj : list) {
            System.out.println(obj.getCustomProperty());
        }
    }
 
    // Method 2
    // Comparing two list
    // using compareTo() method
    public static void sort(ArrayList<CustomObject> list) {
 
    	list.sort(01,02)
    	;
    	//        list.sort((o1, o2)
        		
        		//                 -> o1.getValor().compareTo(
 //                     o2.getCustomProperty()));
    }
 
    // Method 3
    // Adding custom objects
    public static void add(ArrayList<CustomObject> list) {
 
        // Adding elements to list
        // using add() method
        list.add(new CustomObject("Z", 35));
        list.add(new CustomObject("A", 37));
        list.add(new CustomObject("B", 39));
        list.add(new CustomObject("X",23));
        list.add(new CustomObject("Aa",17));
    }
}