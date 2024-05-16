package agregacion;

public class Animal {
	public String nombre;

	public Animal(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return  "to string " + nombre;
	}
	
}
