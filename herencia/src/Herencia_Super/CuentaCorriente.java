package Herencia_Super;

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
	
}
