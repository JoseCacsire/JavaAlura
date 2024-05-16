package main;

import java.util.Scanner;

import entidad.CuentaBancaria;
import servicio.CuentaBancariaServicio;

public class Main {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		CuentaBancariaServicio cbs = new CuentaBancariaServicio();
		CuentaBancaria cuenta1 = cbs.crearCuenta();
		//CuentaBancaria cuenta2 = cbs.crearCuenta();
		
		int opcion;
		char respuesta = 'a';
		
		do {
			System.out.println("1-Ingresar");
			System.out.println("2-Retirar");
			System.out.println("3-Extraccion rapida");
			System.out.println("4-Consultar saldo");
			System.out.println("5-Consultar datos");
			System.out.println("6-Salir");
			opcion = leer.nextInt();
			switch (opcion) {
			case 1:
				cbs.ingresar(cuenta1);
				break;
			case 2:
				cbs.retirar(cuenta1);
				break;
			case 3:
				cbs.extraccionRapida(cuenta1);
				break;
			case 4:
				cbs.consultarSaldo(cuenta1);
				break;
			case 5:
				cbs.consultarDatos(cuenta1);
				break;
			case 6:
				System.out.println("S para confirmar la salida");
				respuesta = Character.toUpperCase(leer.next().charAt(0));
				break;
			default:
				System.out.println("No se reconoce la opción ingresada");;
			}
		} while (!(respuesta == 'S'));
	}

}
