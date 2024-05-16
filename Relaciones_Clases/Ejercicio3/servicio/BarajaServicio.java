package servicio;

import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entidad.Baraja;
import entidad.Carta;
/*
Realizar una baraja de cartas espa�olas orientada a objetos. Una carta tiene un n�mero entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un m�todo toString() que retorne el n�mero de carta y el palo. La baraja estar�
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podr� realizar la baraja son:
� barajar(): cambia de posici�n todas las cartas aleatoriamente.
*/
public class BarajaServicio {
	
	public Baraja crearBaraja() {
		Baraja baraja = new Baraja();
		String[] palos = {"Bassto","Copa","Espada","Oro"};
		ArrayList<Carta> mazo = new ArrayList<>();
		for (int i = 0; i < palos.length; i++) {
			for (int j = 1; j <= 12; j++) {
				if (j == 8 || j==9) {
					continue;
				}
				mazo.add(new Carta(j,palos[i]));
			}
		}
		baraja.setMazo(mazo);
		return baraja;
		
	}
	
	public void barajar(Baraja baraja) {
		System.out.println("Se baraj� el mazo");
		Collections.shuffle(baraja.getMazo());
	}
	
	/*
	� siguienteCarta(): devuelve la siguiente carta que est� en la baraja, cuando no haya m�s o
	se haya llegado al final, se indica al usuario que no hay m�s cartas.
	� cartasDisponibles(): indica el n�mero de cartas que a�n se puede repartir.
	� darCartas(): dado un n�mero de cartas que nos pidan, le devolveremos ese n�mero de
	cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
	debemos indic�rselo al usuario.
	*/
	
	public void siguienteCarta(Baraja baraja) {
		//Quedan 4 - tama�o 4
		//3 vueltas - remove
		//4>1,3>1,2>1
		//Sobra 1 carta
		ArrayList<Carta> monton = baraja.getMonton();
		if (baraja.getMazo().size() > 1) {
			System.out.println("Se ejecuta >1");
			System.out.println("Se entreg� "+baraja.getMazo().get(0));
			monton.add(baraja.getMazo().remove(0));
			System.out.println("Quedan " + baraja.getMazo().size()+" cartas disponibles");
		}else if (baraja.getMazo().size() == 1) {
			System.out.println("Se ejecuta == 1");
			System.out.println("Se entreg� "+baraja.getMazo().get(0));
			monton.add(baraja.getMazo().remove(0));
			System.out.println("No hay mas cartas disponibles");
		}
	}
	
	public int cartasDisponibles(Baraja baraja) {
		System.out.println("Quedann " + baraja.getMazo().size()+" cartas disponibles");
		return baraja.getMazo().size();
	}
	
	public void darCartas(Baraja baraja) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el n�mero de cartas que desea tomar: ");
		int cantidadCartas = leer.nextInt();
		if (cantidadCartas > baraja.getMazo().size()) {
			System.out.println("Solicit� mas cartas de las que hay!!");
		}else {
			for (int i = 0; i < cantidadCartas; i++) {
				siguienteCarta(baraja);
			}
		}
	}

	public void cartasMonton(Baraja baraja) {
		if (baraja.getMonton().isEmpty()) {
			System.out.println("No sali� ninguna carta");
		}else {
			System.out.println(baraja.getMonton());
			System.out.println("Hay "+baraja.getMonton().size()+" cartas desechadas");
		}
	}
	
	public void mostrarBaraja(Baraja baraja) {
		System.out.println(baraja.getMazo());
		
	}
	
	
	
	
}
