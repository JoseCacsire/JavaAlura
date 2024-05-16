/*
 Un cine necesita implementar un sistema en el que se puede cargar peliculas.
 Para esto,tendremos una clase Pelicula con el titulo,director y duraci�n de la pel�cula(en horas)
 Implemente las clases y m�todos necesarios para esta situaci�n,teniendo en cuenta lo que se pide a continuaci�n:
 En el servicio deberemos tener un bucle que crea un objeto Pelicula pidi�ndole al usuario todos sus datos y guard�ndolos
 en el objeto Pelicula.
 Despu�s,esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear otra Pel�cula o no.
 Despues de ese bucle realizaremos las siguientes acciones:
 *Mostrar en pantalla todas las pel�culas
 *Mostrar en pantalla todas las pel�culas con una duraci�n mayor a 1 hora
 *Ordenar las pel�culas de acuerdo a su duraci�n (de mayor a menor) y mostrarlo en pantalla.
 *Ordenar las pel�culas de acuerdo a su duraci�n (de menor a mayor) y mostrarlo en pantalla.
 *Ordenar las pel�cuas por t�tulo,alfab�ticamente y mostrarlo en pantalla
 *Ordenar las pel�culas por director,alfab�ticamente y mostrarle en pantalla.
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
