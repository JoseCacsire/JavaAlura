
public class Creando_Excepciones {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.out.println("Inicio main");
		metodo1();
		System.out.println("Fin main");
	}
	
	private static void metodo1() {
		System.out.println("Inicio metodo 1");
		metodo2();
		System.out.println("Fin de metodo1");
	}
	
	private static void metodo2() {
		System.out.println("Inicio metodo2");
		//Lanzando una excepcion.Usando la palabra reservada throw
		//No puede ir nada abajo del throw ya q estoy lanzando una bomba
		//para q explote
		throw new ArithmeticException(); //Lanzando un objeto de tipo excepcion.
		//no necesito instanciarla como cuando creas un objeto.Sino solo lo lanzo sin hacer referencia
		//q es traficionalmente cuando creamos objetos.
	}
}
