package main;

import java.awt.Window.Type;

import clases.Continente;
import clases.NivelEstudio;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Recuerda q el Continente.values() devuelve un array de constantes 
		//de la clase enum que sería Continente
		System.out.println("Superficie de America: "+Continente.AMERICA.getCantHabitantes());
		
		 System.out.println("Solucion mejorada de la 1 solución");	
		 for (Continente continente : Continente.values()) {
			System.out.println(continente.densidadPoblacion());
		 }
		 
		 System.out.println("Primera solución:");
		 Continente[] continentes = Continente.values();
		 //Verificando si es un array
		 if (continentes instanceof Object[]) {
	            System.out.println("La variable continentes es un array de objetos.");
	     } else {
	            System.out.println("La variable continentes no es un array de objetos.");
	     }
		 //Verificando el tipo de la variable
		 Class<?> tipo = continentes.getClass();
	     String nombreTipo = tipo.getSimpleName();
	     System.out.println("El tipo de la variable mensaje es: " + nombreTipo);
	     
		 for (int i = 0; i < continentes.length; i++) {
            System.out.println(continentes[i].densidadPoblacion());
		 }
	}

}
