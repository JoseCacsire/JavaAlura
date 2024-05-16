package try_finally_resources;

public class TestConexion  {
	public static void main(String[] args) throws Exception{
		
		//Mejorando la solucion 1,aplicando un try con recursos
		//Usando un try con parentesis.Le colocamos un objeto
		//En si es un recurso ya q no dice un objeto del tipo conexion
		//Por eso debemos implementar una interfaz "AutoCloseable" en la clase Conexion
		//Aqui ya toy abriendo mi conexion
		try (Conexion conexion = new Conexion()){
			conexion.leerDatos();
		}catch (IllegalStateException ex) {
			System.out.println("Ejecutando catch");
			ex.printStackTrace();
		}
		
		//El de arriba simplifica mucho el de abajo.Pero el de arriba trabaja con recursos
		//Sea un conexion o un lector de datos.Sino fuera asi y fuera un objeto normal
		//usar el de abajo.
		
		//Solucion 1
		//En este ejemplo la bomba esta ejecutandose durante la 
		//creacion del objeto por eso no me cierra la conexion
		/*Conexion con = null;
		try {
			con = new Conexion();
			con.leerDatos();
		} 
		catch (IllegalStateException ex) {
			ex.printStackTrace();
		}
		//con el finally aseguramos que va a cerrar nuestra conexion
		//tenga o no excepcion.
		finally {
			System.out.println("Ejecutando finally");
			if (con !=null){
				con.cerrar();
			}
		}*/
	}
}
