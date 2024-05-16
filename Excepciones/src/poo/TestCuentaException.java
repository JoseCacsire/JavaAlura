package poo;

public class TestCuentaException {
	public static void main(String[] args) {
		Cuenta cuenta = new CuentaAhorros(123, 456);
		cuenta.depositar(200);
		//Aca lanza mi excepcion creada
		try {
			cuenta.retirar(10);
			cuenta.retirar(200);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cuenta.getSaldo());
		
	}
}
