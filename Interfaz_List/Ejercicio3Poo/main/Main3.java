/*
 Un cine necesita implementar un sistema en el que se puede cargar peliculas.
 Para esto,tendremos una clase Pelicula con el titulo,director y duración de la película(en horas)
 Implemente las clases y métodos necesarios para esta situación,teniendo en cuenta lo que se pide a continuación:
 En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario todos sus datos y guardándolos
 en el objeto Pelicula.
 Después,esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear otra Película o no.
 Despues de ese bucle realizaremos las siguientes acciones:
 *Mostrar en pantalla todas las películas
 *Mostrar en pantalla todas las películas con una duración mayor a 1 hora
 *Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
 *Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
 *Ordenar las pelícuas por título,alfabéticamente y mostrarlo en pantalla
 *Ordenar las películas por director,alfabéticamente y mostrarle en pantalla.
 */


package main;

import java.util.ArrayList;

import entidad.Pelicula;
import servicio.PeliculaServicio;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PeliculaServicio ps = new PeliculaServicio();
		ArrayList<Pelicula> peliculas = ps.crearListaPeliculas();
		
		System.out.println("Mostrar peliculas");
		ps.mostrarPeliculas(peliculas);
		System.out.println("-------------------------");
		System.out.println("Mostrar duracion mayor a una hora");
		ps.mostrarPeliculasDuracion(peliculas);
		System.out.println("-------------------------");
		System.out.println("Mostrar de mayor a menor por duracion");
		ps.ordenarDuracionMayorMenor(peliculas);
		System.out.println("-------------------------");
		System.out.println("Mostrar de menos a mayor por duracion");
		ps.ordenarDuracionMenorMayor(peliculas);
		System.out.println("-------------------------");
		System.out.println("Mostrar por director");
		ps.mostrarDirector(peliculas);
		System.out.println("-------------------------");
		System.out.println("Mostrar por titulo");
		ps.mostrarTitulo(peliculas);
	}

}
