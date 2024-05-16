package Listas;

public class TestGuardador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuardadorDeClases guardador = new GuardadorDeClases();

		MiClase mc1 = new MiClase(1, "Jose");
		guardador.adicionar(mc1);
		
		MiClase mc2 = new MiClase(2, "Pepe");
		guardador.adicionar(mc2);
		
		int tamano = guardador.getCantidadDeElementos();
        System.out.println(tamano);
	}	

}
