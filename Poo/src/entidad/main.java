package entidad;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		//la parte izquiera estamos declarando el objeto y en la derecha tamos instanciando
		//ese objeto y asignandole valor o no.
		Persona persona1 = new Persona("Jose",12333,26);
		System.out.println(persona1.getDNI());
		//creando un objeto vacio,que le agregaremos sus valores mediante los setters
		Persona persona2 = new Persona();
		persona2.setDNI(433);
		System.out.println(persona2.getDNI());
		
	}
}

