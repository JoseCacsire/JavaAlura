package poo;

public class CrearCuenta {

	public static void main(String[] args) {
		// Yo estoy diciéndole que esta variable del tipo cuenta
		//va a representar una nueva cuenta
		Cuenta primeraCuenta = new Cuenta(-12);
		primeraCuenta.depositar(1000);
		primeraCuenta.retirar(200);
		System.out.println(primeraCuenta.getAgencia());
		System.out.println(primeraCuenta.getSaldo());
	}
}


