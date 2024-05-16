package main;

import entidad.Juegoo;

/*
Ejercicio 2:

Realizar el juego de la ruleta rusa de agua ej Java.Como muchos saben,el juego se trata de un n�mero de jugadores
que con un revolver de agua,el cual posee una sola carga de agua se dispara y se moja.Las clases por hacer del juego
son las siguientes:
Clase Resolver de agua:esta clase posee los siguientes atributos:posici�n actual (posici�n
del tambor que se dispara,puede que est� el agua o no) y posici�n agua (la posici�n del tambor donde se encuentra el agua).
Estas dos posiciones,se generaran aleatoriamente.
M�todos:
+llenarRevolver():le pone los valores de posicion actual y de posicion del agua.
Los valores deben ser aleatorios.
+mojar():devuelve true si la posici�n del agua coincide con la posici�n actual
+siguienteChorro():cambia a la siguiente posici�n del tambor
+toString():muestra informaci�n del revolver (posici�n actual
+siguienteChorrro():cambia a la sguiente posici�n del tambor
+toString():muestra informaci�n del revolver (posici�n actual y donde est�el agua)
Clase jugador:esta clase posee los siguientes atributos:id (representa el numero del jugador),
nombre(Empezara con jugador mas su ID,"Jugador 1" por ejemplo ) y mojado (indica si est� mojado 
o no el jugador).El n�mero de jugadores ser� decidido por el usuario,pero debe ser entre 1 y 6.
Si no est� en este rango,por defecto 6.
M�todos:
+disparo(Revolver r):el m�todo recibe el revolver de agua y llama a los m�todos de mojar() y siguienteChorro()
de Revolver.El jugador se apunta,aprieta el gatillo y si l revolver tira el agua,el jugador se moja.El atributo 
mojado pasa a false y el m�todo devuelve true,sino false.

Clase juego: esta clase posee los siguientes atributos: Jugadores(conjunto de jugadores)
y Revolver
M�todos:
+llenarJuego(ArrayList<Jugador>jugadores,Revolver r):este m�todo recibe los jugadores y 
el revolver para guardarlos en los atributos del juego.
+ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y aprieta
el gatillo.Si el revolver tira el agua el jugador se moja y se termina el juego,sino se moja,
se pasa al siguiente jugador hasta que uno se moje.Si o si alguien se tiene que mojar.Al final 
del juego,se debe mostrar que jugador se moj�.
Pensar la l�gica necesaria para realizar esto,usando los atributos de la clase Juego. 

*/

public class Main3 {

	public static void main(String[] args) {
		Juegoo juegoo1 = new Juegoo();
		juegoo1.llenarJuego();
		juegoo1.ronda();
		juegoo1.array();
		System.out.println(juegoo1+"\n");
		Juegoo juegoo2 = new Juegoo();
		juegoo2.llenarJuego();
		juegoo2.ronda();
		juegoo2.array();
		System.out.println(juegoo2);		
	}
}
