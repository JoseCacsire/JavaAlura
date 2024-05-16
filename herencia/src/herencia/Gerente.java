package herencia;

public class Gerente extends Funcionario {
	private String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
		
	}
	public void iniciarSesion() {
		if (this.clave == "AluraCursos") {
			System.out.println("Bienvenido");
		}
		else {
			System.out.println("Ingresa la clave correcta"); 
		}
	}
	//Sobre-escritura de método que esta en la clase madre
	@Override
	public double getBonificacion() {
		System.out.println("Ejecutando desde Gerente");
		return super.getSalario() + super.getBonificacion();
	}
}


