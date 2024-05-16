package main;

import java.util.Comparator;

import clases.EjemploComparator;
						
public class Main1 {
		
	public static void main(String[] args) {
		//No entiendo la diferencia de declarar de tipo interfaz o de la clase
		
		Comparator<Integer> comparador1 = new EjemploComparator();
		EjemploComparator comparador2 = new EjemploComparator();
		
		int resultado = comparador2.compare(5, 5);
		System.out.println(resultado);
		comparador2.name();

	}

}
