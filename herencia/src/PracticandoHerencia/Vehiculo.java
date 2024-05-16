package PracticandoHerencia;

public class Vehiculo {
	protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void conducir() {
        System.out.println("Conduciendo el vehículo");
    }
}
