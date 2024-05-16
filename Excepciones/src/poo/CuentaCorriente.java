package poo;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
		
	}
	//Se utiliza para sobrescribir el método de la clase madre, 
	//lo que indica que se ha modificado el método original.
	@Override
	public void retirar(double valor) throws SaldoInsuficienteException {
		double comision = 0.2; 
		super.retirar(valor + comision);
	}
	@Override
	public void depositar(double valor) {
		if (valor > 0) {
			//accediendo al atributo de clase padre
			saldo += valor;
		}
	}
	
}
