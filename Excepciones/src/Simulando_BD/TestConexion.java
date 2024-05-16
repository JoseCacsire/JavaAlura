package Simulando_BD;

public class TestConexion {
	public static void main(String[] args) {
		Conexion con = new Conexion();
		try {
			con.leerDatos();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//con el finally aseguramos que va a cerrar nuestra conexion
		//tenga o no excepcion.
		finally {
			System.out.println("Ejecutando finally");
			con.cerrar();
		}
	}
}
