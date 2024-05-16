package PracticandoHerencia;

public class Coche extends Vehiculo {
	private int numeroPuertas;

    public Coche(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public void abrirPuertas() {
        System.out.println("Abriendo las " + numeroPuertas + " puertas del coche");
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + super.marca);
        System.out.println("Modelo: " + super.modelo);
        System.out.println("Número de puertas: " + this.numeroPuertas);
    }
}
