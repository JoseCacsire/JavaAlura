package main;

import java.util.ArrayList;

public class Pruebas2 {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Banana");
        //System.out.println(fruits);
        String fruta = "Banana";
      //String element = "Orange";
        String elementToRemove = "Banana";
        
        for (int i = 0; i < fruits.size(); ) {
        	//System.out.println("Posicon: "+fruits.indexOf(element));
        	System.out.println("Frutas: "+fruits);
        	System.out.println("Longitud: "+fruits.size());
        	System.out.println(i);
            if (fruits.get(i).equals(elementToRemove)) {
            	//System.out.println(i);
                fruits.remove(i);
            } else {
				i++;
			}
        }
	}

}
