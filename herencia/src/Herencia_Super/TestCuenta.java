package Herencia_Super;

public class TestCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaCorriente cc = new CuentaCorriente(1,1);
		CuentaAhorros ca = new CuentaAhorros(2,3);
		cc.depositar(2000);
		cc.transferir(1000,ca);
		
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
		//cc.retirar(100);
		//System.out.println(cc.getSaldo());
	}
}
