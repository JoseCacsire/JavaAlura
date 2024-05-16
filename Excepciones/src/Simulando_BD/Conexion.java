package Simulando_BD;

public class Conexion {

	   public Conexion() {
	       System.out.println("Abriendo conexion");
	       //throw new IllegalStateException();
	   }

	   public void leerDatos() {
	       System.out.println("Recibiendo datos");
	       throw new MiBomba("Q pasa causa");
	   }

	   public void cerrar() {
	       System.out.println("Cerrando conexion");
	   }
}
