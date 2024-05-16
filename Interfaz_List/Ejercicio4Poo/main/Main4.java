package main;

import java.util.HashMap;
import java.util.Scanner;

import servicio.ProductoServicio;

/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán.Además,se necesita que la aplicación
cuente con las funciones básicas.Estas las realizaremos en el servicio. 
Realizar un menú para lograr todas las acciones previamente mencionadas
*/

public class Main4 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		//Un HashMap es como un diccionario en python.Osea tiene clase y valor.
		//Que por mediante su key o clave podemos obtener su value o valor.
		HashMap<String, Double> productos = new HashMap<>();
		ProductoServicio ps = new ProductoServicio();
		boolean condicion=true;
		do {
			System.out.println("Seleccione algunas de las opciones: ");
			System.out.println("1) Agregar productos");
			System.out.println("2) Modificar precio del producto");
			System.out.println("3) Eliminar producto");
			System.out.println("4) Mostrar productos");
			System.out.println("5) Salir");
			//Usamos un switch ya que es una forma eficiente y legible de manejar diferentes
			//opciones en funcion del valor de UNA VARIABLE.En este no he declarado la variable
			//pero sería "leer.nexInt()" la expresión mas semejante a eso.Dependiendo de que opcion escoja
			//Me ejecutara algunos de los casos mostrados.
			switch (leer.nextInt()) {
			case 1:
				ps.agregarProductos(productos, leer);
				break;
			case 2:
				ps.modificarPrecio(productos, leer);
				break;
			case 3:
				ps.eliminarProducto(productos, leer);
				break;
			case 4:
				ps.mostrarProductos(productos);;
				break;
			case 5:
				condicion=false;
				System.out.println("Usted acaba de salir del sistema");
				break;
			default:
				System.out.println("No se reconoce la opción ingresada");
			}
		} while (condicion);
	}
}
