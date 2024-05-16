package servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


import entidad.Pelicula;

/*
 En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario todos sus datos 
 y guardándolos en el objeto Pelicula.
 Después,esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear otra Película o no.
 */

//Scanner leer = new Scanner(System.in);
public class PeliculaServicio {
	
	

	public ArrayList<Pelicula> crearListaPeliculas() {
		//Creando un arraylist peliculas de tipo Clase Pelicula
		ArrayList<Pelicula> peliculas = new ArrayList<>();
		boolean confirmacion = true;
		do {
			Scanner leer = new Scanner(System.in);
			//Creando un objeto
			Pelicula pelicula = new Pelicula();
			//Agregando los valores ingresados mediante sus setters de cada ojeto creado
			System.out.println("Ingrese el nombre del director:");
			//Uso nextline ya que es util si quieres leer una linea completa,para luego guardar eso
			//sea una variable o añadiandolo a un objeto mediante sus setters
			pelicula.setDirector(leer.nextLine());
			System.out.println("Ingrese el título de la película:");
			pelicula.setTitulo(leer.nextLine());
			System.out.println("Ingrese la duración de la película:");
			//Como no hay nextDoubleLine no me deja ingresar un double.
			//Ya que el next no lee espacios solo palabras.
			//Aqui tengo que crear una variable string y luego pasarlo a Double,sino 
			//no me dejara ingresar un valor numerico,por el salto de linea 
//			String duracion = leer.nextLine();
//			pelicula.setDuracion(Double.parseDouble(duracion));
			
			//Segunda forma.Bueno aqui tengo que agregar el nextLine para que haga el salto de linea sino me 
			//Saldra desea ingresar otra pelicula junto con ingrese el nombre del director.
			pelicula.setDuracion(leer.nextDouble());
			leer.nextLine();
			peliculas.add(pelicula);
			System.out.println("Desea ingresar otra película S/N:");
			if (leer.nextLine().equalsIgnoreCase("N")) {
				confirmacion = false;
			}
		} while (confirmacion);
		return peliculas;
	}
 /*Despues de ese bucle realizaremos las siguientes acciones:
 *Mostrar en pantalla todas las películas
 *Mostrar en pantalla todas las películas con una duración mayor a 1 hora
 *Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
 *Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
 *Ordenar las pelícuas por título,alfabéticamente y mostrarlo en pantalla
 *Ordenar las películas por director,alfabéticamente y mostrarle en pantalla.*/
	
	public void mostrarPeliculas(ArrayList<Pelicula> peliculas) {
		for (Pelicula pelicula : peliculas) {
			System.out.println(pelicula);
		}
	}
	
	public void mostrarPeliculasDuracion(ArrayList<Pelicula> peliculas) {
		for (Pelicula pelicula : peliculas) {
			if (pelicula.getDuracion() > 1) {
				System.out.println(pelicula);
			}
		}
	}
	//Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
	//Usar el comparator,para odenar un arraylist con objetos.
	public void ordenarDuracionMayorMenor(ArrayList<Pelicula> peliculas) {
		peliculas.sort(Pelicula.comparadorDuracion);
		mostrarPeliculas(peliculas);
	}
	
	//Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
	public void ordenarDuracionMenorMayor(ArrayList<Pelicula> peliculas) {
		//ordenando la lista por duracion de mayor a menor
		peliculas.sort(Pelicula.comparadorDuracion);
		//Invierte la lista de arriba para que sea de menor a mayor
		Collections.reverse(peliculas);
		mostrarPeliculas(peliculas);
	}
	
	//Ordenar las pelícuas por título,alfabéticamente y mostrarlo en pantalla
	public void mostrarTitulo(ArrayList<Pelicula> peliculas) {
		peliculas.sort(Pelicula.comparadorTitulo);
		mostrarPeliculas(peliculas);
	}
	
	//Ordenar las películas por director,alfabéticamente y mostrarle en pantalla.
	public void mostrarDirector(ArrayList<Pelicula> peliculas) {
		peliculas.sort(Pelicula.comparadorDirector);
		mostrarPeliculas(peliculas);
	} 
	
	
	
	
}
