package entidad;

public class Persona {
	
	//Atributos
	String nombre;
	int DNI;
	int edad;
	
	//Aca es opcional.Molde vacio
	public Persona() {
		
	}
	
	//Aca tengo que saber sus datos,por que me pedira obligatoriamente
	public Persona(String nombre, int dNI, int edad) {
		//con el this hace referencia directa al atributo del objeto que vamos a instanciar
		//no de la clase,sino del objeto que vas a crear
		this.nombre = nombre;
		this.DNI = dNI;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
