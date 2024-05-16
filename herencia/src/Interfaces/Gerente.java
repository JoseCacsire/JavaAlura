package Interfaces; 

public class Gerente extends Funcionario implements Autenticable {
	
	/*public void iniciarSesion() {
		if (this.clave == "AluraCursos") {
			System.out.println("Bienvenido");
		}
		else {
			System.out.println("Ingresa la clave correcta"); 
		}
	}*/
	@Override
	public double getBonificacion() {
		System.out.println("Ejecutando desde Gerente");
		return 2000;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
}


