package poo;

public class SaldoInsuficienteException extends Exception{
	
	//Declaro el constructor y mando un mensaje a RuntimeException
	public SaldoInsuficienteException(String mensaje) {
		super(mensaje);
	}
	
}
