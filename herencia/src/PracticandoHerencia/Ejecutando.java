package PracticandoHerencia;

public class Ejecutando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Creaci�n de un objeto Coche
        Coche coche = new Coche("Toyota", "Corolla", 4);

        // Acceso a los atributos y m�todos heredados de Vehiculo
        coche.conducir();

        // Acceso a los atributos y m�todos espec�ficos de Coche
        coche.abrirPuertas();

        // Llamada al nuevo m�todo de la clase hija que utiliza los atributos de la clase padre
        coche.mostrarInformacion();
	}

}
