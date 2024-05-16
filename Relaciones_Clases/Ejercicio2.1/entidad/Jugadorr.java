package entidad;

import java.util.Scanner;

/*
Clase jugador:esta clase posee los siguientes atributos:id (representa el numero del jugador),
nombre(Empezara con jugador mas su ID,"Jugador 1" por ejemplo ) y mojado (indica si est� mojado 
o no el jugador).El n�mero de jugadores ser� decidido por el usuario,pero debe ser entre 1 y 6.
Si no est� en este rango,por defecto 6.
M�todos:
+disparo(Revolver r):el m�todo recibe el revolver de agua y llama a los m�todos de mojar() y siguienteChorro()
de Revolver.El jugador se apunta,aprieta el gatillo y si l revolver tira el agua,el jugador se moja.El atributo 
mojado pasa a false y el m�todo devuelve true,sino false.
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
