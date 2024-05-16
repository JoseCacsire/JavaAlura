package entidad;

import java.util.Random;

/*
Clase Resolver de agua:esta clase posee los siguientes atributos:posici�n actual(posici�n
del tambor que se dispara,puede que est� el agua o no) y posici�n agua (la posici�n del 
tambor donde se encuentra el agua).Estas dos posiciones,se generaran aleatoriamente.
M�todos:
+llenarRevolver():le pone los valores de posicion actual y de posicion del agua.
Los valores deben ser aleatorios.
+mojar():devuelve true si la posici�n del agua coincide con la posici�n actual
+siguienteChorro():cambia a la siguiente posici�n del tambor
+toString():muestra informaci�n del revolver (posici�n actual
+siguienteChorro():cambia a la sguiente posici�n del tambor
+toString():muestra informaci�n del revolver (posici�n actual y donde est� el agua)
*/
public class Revolverr {
	
	private int posicionActual;
	private int posicionAgua;
	
	public Revolverr() {
		
	}

	public void llenarRevolver() {
		Random random = new Random();
		this.posicionActual = random.nextInt(6);
		this.posicionAgua = random.nextInt(6);
	}
	
	public Boolean mojar() {
		return this.posicionActual == this.posicionAgua;
	}
	
	public void siguienteChorro() {
		if (this.posicionActual == 5) {
			this.posicionActual = 0;
		}
		this.posicionActual++;
	}

	@Override
	public String toString() {
		return "Revolver1 [posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + "]";
	}

	public int getPosicionActual() {
		return posicionActual;
	}

	public void setPosicionActual(int posicionActual) {
		this.posicionActual = posicionActual;
	}

	public int getPosicionAgua() {
		return posicionAgua;
	}

	public void setPosicionAgua(int posicionAgua) {
		this.posicionAgua = posicionAgua;
	}
	
}
