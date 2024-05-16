package herencia;

public class Animal {
	//atributos privador no puedes usarlos directamente
	//solo metiando sus getter and setter que serán publicos
	//si quisieras usar los atributos directamente sin sus get and set
	//tendrias que declararlos protected y asi las clases podrían usar
	//los atributos
	protected String nombre;
	//si pongo private solo podre usar este atributo dentro de la clase misma
	//no podran otras clases ni siqueira las hijas solo mediante los metodos
	//get and set.
	private int edad;
	
	public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
	
	public void emitirSonido() {
        System.out.println("El animal emite un sonido");
    }

	public String getNombre() {
		System.out.println("metodo get: "+this.nombre);
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
