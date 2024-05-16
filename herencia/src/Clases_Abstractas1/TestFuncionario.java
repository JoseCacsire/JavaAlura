package Clases_Abstractas1;

public class TestFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario Jose = new Contador();
		Jose.setNombre("Jose");
		Jose.setDocumento("77424976");
		Jose.setSalario(1500);
		System.out.println(Jose.getSalario());
		System.out.println(Jose.getBonificacion());
	}

}
