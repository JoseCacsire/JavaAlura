package servicio;

import java.util.Scanner;

import entidad.CuentaBancaria;

public class CuentaBancariaServicio {
	
	//variable global
	Scanner leer = new Scanner(System.in);
	
	public CuentaBancaria crearCuenta() {
		CuentaBancaria cuenta = new CuentaBancaria();
		name();
		System.out.println("Ingrese el número de cuenta");
		cuenta.setNumeroCuenta(leer.nextInt());
		System.out.println("Ingrese el DNI del usuario");
		cuenta.setDniCliente(leer.nextLong());
		System.out.println("Ingrese el saldo actual");
		cuenta.setSaldoActual(leer.nextDouble());
		return cuenta;
	}
	
	public void ingresar(CuentaBancaria cuenta) {
		System.out.println("Ingrese el dinero que desea depositar");
		name();
		double ingreso = leer.nextDouble();
		if (ingreso > 0) {
			cuenta.setSaldoActual(ingreso + cuenta.getSaldoActual());
		}else {
			System.out.println("El dinero que quiere ingresar no es válido");
		}
		
	}
	
	public void name() {
		System.out.println("pepe");
	}
	
	public void retirar(CuentaBancaria cuenta) {
		System.out.println("Ingrese el dinero que desea retirar");
		double retiro = leer.nextDouble();
		if (retiro > cuenta.getSaldoActual()) {
			//si yo tengo 1000 y retiro 1100.Me quitara solo 1000
			//por eso coloco setSaldoAcutal(0) ya que como es mayor me quita
			//todo lo que tengo y por eso me queda 0
			System.out.println("Saldo insuficiente,se retiró" + cuenta.getSaldoActual());
			cuenta.setSaldoActual(0);
		}else {
			//Aca es menor o igual.Puedo retirar mis 1000 o menor que eso
			System.out.println("Se retiró" + retiro);
			cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
		}
	}
	
	public void extraccionRapida(CuentaBancaria cuenta) {
		//El 20% de mi saldo extraigo
		System.out.println("Se extrajo" + cuenta.getSaldoActual()*0.2);
		//lo que me queda
		cuenta.setSaldoActual(cuenta.getSaldoActual()*0.8);
	}
	
	public void consultarSaldo(CuentaBancaria cuenta) {
		System.out.println("El saldo actual es " + cuenta.getSaldoActual());
	}
	
	public void consultarDatos(CuentaBancaria cuenta) {
		System.out.println("El numero de cuenta es" + cuenta.getNumeroCuenta());
		System.out.println("El dni del cliente es " + cuenta.getDniCliente());
	}
}









