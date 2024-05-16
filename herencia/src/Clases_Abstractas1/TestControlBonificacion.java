package Clases_Abstractas1;

public class TestControlBonificacion {
	public static void main(String[] args) {
		Funcionario Jose = new Contador();
		Jose.setSalario(2000);
		
		Gerente Luis = new Gerente();
		Luis.setSalario(10000);
		
		Contador Pepe = new Contador();
		Pepe.setSalario(5000);
		
		ControlBonificacion controlBonificacion =
				new ControlBonificacion();
		
		controlBonificacion.registrarSalario(Jose);
		controlBonificacion.registrarSalario(Luis);
		controlBonificacion.registrarSalario(Pepe);
	}
}
