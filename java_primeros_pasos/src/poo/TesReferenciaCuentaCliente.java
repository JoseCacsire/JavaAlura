package poo;

public class TesReferenciaCuentaCliente {
	public static void main(String[] args) {
		//Cliente Jose = new Cliente();
		//Jose.nombre = "Jose";
		//Jose.documento = "9999";
		//Jose.telefono = "909090909";
		
		Cuenta cuentaJose = new Cuenta(13);
		//cuentaJose.agencia = 1;
		//referenciando al objeto (Jose) tipo cliente
		//cuentaJose.titular = Jose;
		
		System.out.println(cuentaJose.getTitular().nombre);
		//Jose.documento = "77424976";
		//no referenciando,pero como inicialize en mi clase cuenta 
		//la clase cliente.Puedo usar y asignar valores a mis atributos
		//cuentaJose.titular.documento="12";
		System.out.println(cuentaJose.getTitular().documento);
		
	}
}
