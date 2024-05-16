package main;

import java.util.ArrayList;
import java.util.Iterator;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pepe");
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Banana");
        System.out.println(fruits);
        String fruta = "Banana";
        //String element = "Orange";
        
        String elementToRemove = "Banana";
        // Utilizar un bucle for para eliminar un elemento
        /*for (int i = 0; i < fruits.size(); ) {
            if (fruits.get(i).equals(elementToRemove)) {
            	System.out.println(i);
                fruits.remove(i);
            } else {
				i++;
			}
            System.out.println("Posicon: "+fruits.indexOf(element));
            System.out.println("Longitud: "+fruits.size());
            System.out.println(i);
        }*/
        
        
        //Para no estar teniendo problemas con el indice mejor usa el iterator que te ahorrara bastante codigo
        //a la hora de eliminar un elemento a la hora de iterar el arraylist y asi te ahorrar mucho tiempo.
        Iterator it = fruits.iterator();
        while(it.hasNext()) {
        	if(it.next().equals(fruta)) {
        		it.remove();
        	}
        }
        
        
        System.out.println(fruits); // Output: [Apple, Orange, Mango]
       /* String element = "Banana";
        System.out.println(fruits.indexOf(element));*/
	        
	}

}
