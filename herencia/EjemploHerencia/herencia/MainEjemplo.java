package herencia;

public class MainEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perro miPerro = new Perro("Buddy", 3, "Labrador");
		System.out.println("Nombre del perro: " + miPerro.nombre);
		miPerro.name();
		miPerro.getNombre();
	}

}
