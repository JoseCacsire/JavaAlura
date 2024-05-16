package try_finally_resources;

import Simulando_BD.MiBomba;

public class Conexion implements AutoCloseable{

	   public Conexion() {
	       System.out.println("Abriendo conexion");
	       //throw new MiBomba();
	   }

	   public void leerDatos() {
	       System.out.println("Recibiendo datos");
	       throw new IllegalStateException();
	   }

	   public void cerrar() {
	       System.out.println("Cerrando conexion");
	   }
	//Implementando el AutoCloseable hacemos que este metodo close se 
	//ejecute automaticamente  al final,pero si hay una excepcion no se ejecuta
	//A menos que uses un catch para atrapar ese error
	@Override
	public void close() throws Exception {
		cerrar();
	}
}
