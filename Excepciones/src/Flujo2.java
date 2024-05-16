
public class Flujo2 {
	public static void main(String[] args){
		System.out.println("Inicio main");
		try {
			metodo1();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fin main");
		
	}
	
	//Sino uso el try y catch y solo pongo metodo2()
	//tengo que agrearle el throws,ya q con eso le aviso que lanze mi excepcion
	private static void metodo1() throws MyException {
		System.out.println("Inicio metodo 1");
		//Tratando mi exception para que no explote y me ejecute normal mi codigo 
		//y no se detenga
		/*try {
			metodo2();
		} catch (MyException me) {
			me.printStackTrace();
		}*/
		metodo2();
		System.out.println("Fin de metodo1");
	}
	
	//Con el throws indico que lanze mi excepcion ya que estoy  seguro que hay una excepcion
	//a diferencia del try catch que el try evalua para que catch atrape
	private static void metodo2() throws MyException {
		System.out.println("Inicio metodo2");
		//Creando mi propia bomba lanzando un objeto de mi clase creada 
		//que es "MyException"
		throw new MyException("Mi excepcion fue lanzada");
	}
}
