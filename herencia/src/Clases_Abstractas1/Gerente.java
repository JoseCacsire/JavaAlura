package Clases_Abstractas1;

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
	@Override
	public double getBonificacion() {
		System.out.println("Ejecutando desde Gerente");
		return super.getSalario() + super.getSalario()*0.05;
	}
}


