package entidad;

import java.util.ArrayList;
import java.util.Scanner;

public class Juegoo {
	private ArrayList<Jugadorr> jugadores = new ArrayList<>();
    private Revolverr revolver = new Revolverr();
	Scanner leer = new Scanner(System.in);
	
	public void array() {
		System.out.println(this.jugadores);
	}
	
	public void llenarJuego() {
		//this.jugadores = new ArrayList<>();
		int cantidad;
		do {
			System.out.println("Cuantos jugadores participaran");
			cantidad = leer.nextInt();
		} while (cantidad > 6 || cantidad < 2);
		for (int i = 0; i < cantidad; i++) {
			Jugadorr jugadorr = new Jugadorr();
			this.jugadores.add(jugadorr);
		}
		//this.revolver = new Revolverr();
		revolver.llenarRevolver();
	}
	
	public void ronda() {
		boolean juego = true;
		do {
			for (Jugadorr jugador : jugadores) {
				jugador.disparo(revolver,jugador);
				System.out.println(jugador.getNombre() + " te toca");
				if (jugador.isMojado()) {
					System.out.println("Finalizo el juego "+jugador.getNombre()+" se mojo");
					juego = false;
					break;
				}
				else {
					System.out.println("Te salvaste por ahora");
				}
			}
		} while (juego);
	}

	@Override
	public String toString() {
		return "Juegoo [jugadores=" + jugadores + "]";
	}
	
}
