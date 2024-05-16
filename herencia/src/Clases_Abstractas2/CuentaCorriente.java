package Clases_Abstractas2;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
		
	}
	//Se utiliza para sobrescribir el método de la clase madre, 
	//lo que indica que se ha modificado el método original.
	@Override
	public boolean retirar(double valor) {
		double comision = 0.2; 
		return super.retirar(valor + comision);
	}
	@Override
	public void depositar(double valor) {
		if (valor > 0) {
			//accediendo al atributo de clase padre
			saldo += valor;
		}
	}
	
}
