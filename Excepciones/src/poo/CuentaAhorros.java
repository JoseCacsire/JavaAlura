package poo;

public class CuentaAhorros extends Cuenta {

	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void retirar(double valor) throws SaldoInsuficienteException {
		// TODO Auto-generated method stub
		super.retirar(valor);
	}

	@Override
	public void depositar(double valor) {
		if (valor > 0) {
			super.saldo += valor;
		}
	}
}
