/*
 Diseñar un programa que lea y guarde razas de perros en un ArrayLit de tipo String.
 El programa pedirá una raza de perro en un bucle,el mismo se guardará en la lista
 y despues se le preguntara al usuario si quiere guardar otro perro o si quiere salir.
 Si decide salir,se mostrara todos los perros guardados en el ArrayList
 */
package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		ArrayList<String> razas = new ArrayList<>();
		boolean confirmacion = true;
		do {
			System.out.println("Ingrese la raza del perro:");
			razas.add(leer.next().toUpperCase());
			System.out.println("Desea agregar otro perro? S/N:");
			//El equalsIgnoreCase no diferencia que sea minuscula o mayuscula
			//ignora esos detalles para el  sea "n" o "N" es lo mismo
			//por lo tanto si engresas n mayuscula o minuscula lo tomara igual
			//En esta condicion si ingresas n entraras a la condicion y por tanto
			//confirmacion sera ahora false y saldra del bucle
			if (leer.next().equalsIgnoreCase("N")) {
				confirmacion = false;
			}
		} while (confirmacion);
		//Este for each esta recorriendo cada elemento de mi arraylist razas y lo esta 
		//guardando en la variable raza ,pero recuerda que esa variable debe estar declarada
		//como string ya que el arraylist es String
		for (String raza : razas) {
			System.out.println(raza);
		}
		System.out.println("razas: "+razas);
		System.out.println("***********************");
		System.out.println("Ingrese el perro que desea ELIMINAR");
		String perroEliminar = leer.next().toUpperCase();
		boolean noEncontrado = true;
		//con el razas.iterator() obtenemos un iterator,para poder
		//recorrer los elementos del ArrayList.Que guardaremos en la variable
		//iterator de tipo Iterator
		Iterator iterator = razas.iterator();
		//Una vez obtenido la instancia del Iterator mediante razas.iterator()
		//podemos utilizar el hasnext que nos ayuda a verificar si hay un elemento o no
		//si es que no hay sale del bucle,pero necesitamos del next para poder avanzar y devolver el siguiente elemento
		//y asi verificar si hay o no elementos con el hasnext que hara la verificacion.
		//En resumen si al avanzar con el next y no hay nada el hasnext nos dara false y saldremos del bucle.
		while (iterator.hasNext()) {
			//el equals es para comparar si son iguales el que esta usando el metodo con lo que se pasa como argumento.
			if (iterator.next().equals(perroEliminar)) {
				iterator.remove();
				noEncontrado = false;
			}
		}
		
		if (noEncontrado) {
			System.out.println("No se encontró el perro a eliminar");
		}
		System.out.println("*********************************");
		//Para ordenar el array
		Collections.sort(razas);
		//Para que nos muestre cada elemento usamos este foreach
		for (String raza : razas) {
			System.out.println(raza);
		}
/*
Continuando el ejercicio anterior,despues de mostras los perros.Al usuario se le pedira un perro
y se recorrera la lista con un ITERATOR,se buscará el perro en la lista.Si el perro está en la lista
Se eliminara el perro que ingresó el usuario y se mostrara la lista ordenada.Si el perro no se encuentra
en la lista,se le informara al usuario y se mostrara la lista ordenada. 
*/
	}
}

