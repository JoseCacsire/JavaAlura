package PracticandoHerencia;

public class Ejecutando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Creación de un objeto Coche
        Coche coche = new Coche("Toyota", "Corolla", 4);

        // Acceso a los atributos y métodos heredados de Vehiculo
        coche.conducir();

        // Acceso a los atributos y métodos específicos de Coche
        coche.abrirPuertas();

        // Llamada al nuevo método de la clase hija que utiliza los atributos de la clase padre
        coche.mostrarInformacion();
	}

}
