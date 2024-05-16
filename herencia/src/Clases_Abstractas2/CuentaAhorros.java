package Clases_Abstractas2;

public class CuentaAhorros extends Cuenta {

	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean retirar(double valor) {
		// TODO Auto-generated method stub
		return super.retirar(valor);
	}

	@Override
	public void depositar(double valor) {
		if (valor > 0) {
			super.saldo += valor;
		}
	}
}
