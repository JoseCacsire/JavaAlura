package herencia;

public class Perro extends Animal {
	private String raza;
	
	public Perro(String nombre, int edad, String raza) {
        // Llamamos al constructor de la clase padre usando "super"
        super(nombre, edad);
        this.raza = raza;
    }
		
	public void ladrar() {
        System.out.println("El perro está ladrando");
    }
	
	public void name() {
		System.out.println("what's up? I am your son,my name is " + this.nombre);
	}
	
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
}
