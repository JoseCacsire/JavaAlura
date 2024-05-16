package poo;

public class PruebaMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cuenta miCuenta = new Cuenta();
		//miCuenta.saldo = 300;
		//miCuenta.depositar(100);
		//System.out.println(miCuenta.saldo);
		// miCuenta.retirar(550);
		//System.out.println(miCuenta.retirar(550));
		//System.out.println(miCuenta.saldo);
		
		Cuenta cuentadeJose = new Cuenta(12);
		cuentadeJose.depositar(1000);
		
		
		/*boolean puedeTransferir = cuentadeJose.transferir(0, miCuenta);
		if (puedeTransferir) {
			System.out.println("Transferencia Exitosa");
		}else {
			System.out.println("No es posible");
		}*/
	}

}
