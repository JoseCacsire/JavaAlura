package Herencia_Super;

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
}
