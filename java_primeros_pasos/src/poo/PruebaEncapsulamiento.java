package poo;

public class PruebaEncapsulamiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuenta = new Cuenta(12);
		Cliente cliente = new Cliente();
		cliente.setNombre("Pepe");
		cliente.setDocumento("8394843");
		cuenta.setTitular(cliente);
		System.out.println(cliente.getNombre());
		System.out.println(cuenta.getTitular().getNombre());
	}

}
