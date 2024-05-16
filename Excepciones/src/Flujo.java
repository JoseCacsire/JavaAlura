
public class Flujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inicio main");
		metodo1();
		System.out.println("Fin main");
	}
	
	private static void metodo1() {
		System.out.println("Inicio metodo 1");
		metodo2();
		System.out.println("Fin de metodo1");
	}
	
	private static void metodo2() {
		System.out.println("Inicio metodo2");
		for (int i = 1; i <= 6; i++) {
			System.out.println(i);
			
			try { //Intenta esto
				
				if (i % 3 == 0) {
					int num = 0;
					int resultado = i/num;
					System.out.println(resultado);
				}
				
				String test = null;
				System.out.println(test.toString());
				
				//Controlando dos excepciones
			} catch (ArithmeticException | NullPointerException exception) { //Atrapa el error
				System.out.println("Atrapo Excepcion");
				//Imprime el mensaje que da esa excepcion 
				//Imprimira  by zero si es que el error es aritmetico
				System.out.println(exception.getMessage());
				//Muestrame el camino del error
				exception.printStackTrace();	
			}
		}
		System.out.println("Fin metodo2");
	}
}
