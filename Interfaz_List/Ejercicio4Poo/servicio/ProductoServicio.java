package servicio;

import java.util.HashMap;
import java.util.Scanner;

/*
 Funciones básicas:
 *Introducir un elemento *Modificar su precio *Eliminar un producto *Mostrar los
 productos con sus respectivos precios (utilizar Hashmap).El HashMap tendrá de llave
 el nombre del producto y de valor el precio.Realizar un menú para lograr todas las
 acciones previamente mencionadas 
 Nota:HashMap  es lo mismo que decir diccionario
 */

public class ProductoServicio {
	
	public void agregarProductos(HashMap<String,Double> productos,Scanner leer) {
		boolean condicion = true;
		do {
			System.out.println("Ingrese el nombre del producto: ");
			String producto = leer.next();
			System.out.println("Ingrese el precio del producto: ");
			Double precio = leer.nextDouble();
			//Con el put agregamos un elemento clave-valor al HashMap
			productos.put(producto, precio);
			System.out.println("Desea ingresar otro producto S/N: ");
			if (leer.next().equalsIgnoreCase("n")) {
				condicion = false;
				System.out.println(condicion);
			}
		} while (condicion);
	}
	
	public void modificarPrecio(HashMap<String, Double> productos,Scanner leer) {
		System.out.println("Ingrese el nombre del producto: ");
		//Obteniendo la clave(key)
		String producto = leer.next();
		System.out.println("Ingrese el nuevo precio: ");
		//Obteniendo el valor(value)
		double precioActual = leer.nextDouble();
		//Modificamos el valor de un elemento.Para eso usamos el replace
		//que pedira primero la clave y luego el valor nuevo
		productos.replace(producto, precioActual);
	}
	
	public void eliminarProducto(HashMap<String, Double> productos,Scanner leer) {
		System.out.println("Ingrese el producto a eliminar: ");
		//Con el remove eliminamos un elemento del diccionario
		productos.remove(leer.next());
	}
	
	public void mostrarProductos(HashMap<String, Double> productos) {
		//Recorremos el dicionario,pero primero obtenemos las llaves.
		for (String producto : productos.keySet()) {
			//Luego de obtener las llave de cada elemento por recorrido
			//obtenemos su valor
			Double precio = productos.get(producto);
			//Mostramos cada elemento
			System.out.println("Producto: "+producto+" Precio: "+precio);
		}
	}
}
