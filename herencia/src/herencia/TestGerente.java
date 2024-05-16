package herencia;

public class TestGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente gerente = new Gerente();
		gerente.setNombre("Pepe");
		gerente.setSalario(10000);
		//Funcionario gerente = new Funcionario();
		gerente.setClave("AluraCursos");
		gerente.iniciarSesion();
		System.out.println(gerente.getNombre());
		System.out.println(gerente.getBonificacion());
	}

}
