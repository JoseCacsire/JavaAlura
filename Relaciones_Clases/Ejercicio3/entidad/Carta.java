package entidad;

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
public class Carta {
	private int numero;
	private String palo;
	
	public Carta() {
	}

	public Carta(int numero, String palo) {
		this.numero = numero;
		this.palo = palo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	@Override
	public String toString() {
		return numero + "de" + palo;
	}
	
	
	
}
