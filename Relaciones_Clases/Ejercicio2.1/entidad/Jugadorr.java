package entidad;

import java.util.Scanner;

/*
Clase jugador:esta clase posee los siguientes atributos:id (representa el numero del jugador),
nombre(Empezara con jugador mas su ID,"Jugador 1" por ejemplo ) y mojado (indica si está mojado 
o no el jugador).El número de jugadores será decidido por el usuario,pero debe ser entre 1 y 6.
Si no está en este rango,por defecto 6.
Métodos:
+disparo(Revolver r):el método recibe el revolver de agua y llama a los métodos de mojar() y siguienteChorro()
de Revolver.El jugador se apunta,aprieta el gatillo y si l revolver tira el agua,el jugador se moja.El atributo 
mojado pasa a false y el método devuelve true,sino false.
*/

public class Jugadorr {
	static int id = 0;
	private String nombre;
	private boolean mojado;
	Scanner leer = new Scanner(System.in);
	
	public Jugadorr() {
		id++;
		System.out.println("Ingrese el nombre");
		String nombre2 = leer.next();
		this.nombre = id + " " + nombre2;
		this.mojado = false;
	}
	
	public void disparo(Revolverr revolver,Jugadorr jugador) {
		jugador.setMojado(revolver.mojar());
		revolver.siguienteChorro();
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Jugadorr.id = id;
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

	@Override
	public String toString() {
		return "nombre: " + nombre;
	}
	
}
