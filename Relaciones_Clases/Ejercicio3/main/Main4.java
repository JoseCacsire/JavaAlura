package main;
/*
Realizar una baraja de cartas espa�olas orientada a objetos. Una carta tiene un n�mero entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un m�todo toString() que retorne el n�mero de carta y el palo. La baraja estar�
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podr� realizar la baraja son:
� barajar(): cambia de posici�n todas las cartas aleatoriamente.
� siguienteCarta(): devuelve la siguiente carta que est� en la baraja, cuando no haya m�s o
se haya llegado al final, se indica al usuario que no hay m�s cartas.
� cartasDisponibles(): indica el n�mero de cartas que a�n se puede repartir.
� darCartas(): dado un n�mero de cartas que nos pidan, le devolveremos ese n�mero de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indic�rselo al usuario.
� cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indic�rselo al usuario
� mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al m�todo, este no mostrara esa primera carta. 
*/

import java.awt.BufferCapabilities;
import java.util.Scanner;

import entidad.Baraja;
import servicio.BarajaServicio;

public class Main4 {
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		BarajaServicio bs = new BarajaServicio();
		Baraja baraja1 = bs.crearBaraja();
		boolean bucle = true;
		do {
			System.out.println("1- Barajar");
			System.out.println("2- Ver cartas disponibles");
			System.out.println("3- Dar cartas");
			System.out.println("4- Cartas desechadas");
			System.out.println("5- Mostrar Baraja");
			System.out.println("Cualquier n�mero para salir");
			int opcion = leer.nextInt();
			switch (opcion) {
			case 1:
				bs.barajar(baraja1);
				break;
			case 2:
				bs.cartasDisponibles(baraja1);
				break;
			case 3:
				bs.darCartas(baraja1);
				break;
			case 4:
				bs.cartasMonton(baraja1);
				break;
			case 5:
				bs.mostrarBaraja(baraja1);
				break;
			default:
				bucle = false;
				break;
			}
		} while (bucle);
		
		
		
	}
	
	

	
}
