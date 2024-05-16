package entidad;
/*Perro,que tendrá como atributos:nombre,raza,edad y tamaño;y la clase*/
public class Perro {
	private String nombre;
	private String raza;
	private int edad;
	private String temario;
	
	public Perro() {
	}

	public Perro(String nombre, String raza, int edad, String temario) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.temario = temario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTemario() {
		return temario;
	}

	public void setTemario(String temario) {
		this.temario = temario;
	}

	@Override
	public String toString() {
		return "Perro {nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", temario=" + temario + "}";
	}
	
}
