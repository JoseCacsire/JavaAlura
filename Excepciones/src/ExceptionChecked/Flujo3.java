package ExceptionChecked;

public class Flujo3 {

	public static void main(String[] args) {
		System.out.println("Inicio main");
		try {
			metodo1();
		//Poniendo el (Exception e) atrapamos cualquier tipo de excepcion
		//Sea mi excepcion creada que es MiException o la aritmetica,ya que
		//toy diviendo entre 0
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fin main");
	}
	private static void metodo1() throws MiException {
		System.out.println("Inicio metodo 1");
		metodo2();
		System.out.println("Fin de metodo1");
	}
	private static void metodo2() throws MiException {
		System.out.println("Inicio metodo2");
		int a = 50/0;
		throw new MiException("Mi excepcion fue lanzada");
	}
}
