package herencia;

public class Contador extends Funcionario {
	
	//este override me indica que estoy sobreescribieno el m�todo
	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		System.out.println("Ejecutando desde contador");
		return 200;
	}
}
