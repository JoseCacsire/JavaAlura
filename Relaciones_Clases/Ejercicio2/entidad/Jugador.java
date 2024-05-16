package entidad;

import java.util.Scanner;


/*
Clase jugador:esta clase posee los siguientes atributos:id (representa el numero del jugador),
nombre(Empezara con jugador mas su ID,"Jugador 1" por ejemplo ) y mojado (indica si está mojado 
o no el jugador).El número de jugadores será decidido por el usuario,pero debe ser entre 1 y 6.
Si no está en este rango,por defecto 6.
*/

public class Jugador {
	private  int id = 0;
	private String nombre;
	boolean mojado;
	Scanner leer = new Scanner(System.in);
	
	public  Jugador(int id) {
		System.out.println("Ingrese el nombre");
		String nombre2 = leer.next();
		this.nombre = id + " " + nombre2;
		this.mojado = false;
		this.id = id;
	}
	
	public void disparo(Revolver revolver, Jugador jugador) {
		jugador.setMojado(revolver.mojar());
		revolver.siguienteChorro();
	}

	public  int getId() {
		return id;
	}

	public  void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isMojado() {
		return mojado;
	}

	public void setMojado(boolean mojado) {
		this.mojado = mojado;
	}

}
