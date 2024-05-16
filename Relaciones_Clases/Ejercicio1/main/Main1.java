package main;

import entidad.Perro;
import entidad.Persona;

/*
Realizar un programa para que una Persona pueda adoptar un Perro.Vamos a contar 
de dos clases.Ahora deberemos en el main crear dos Personas y dos Perros.Despu�s,vamos a tener que pensar
la l�gica necesaria para asignarle a cada Persona un Perro y por �ltimo,mostrar desde la clase
Persona,la informaci�n del Perro y de la Persona
*/

public class Main1 {
	public static void main(String[] args) {
		Persona[] personas = new Persona[2];
		personas[0] = new Persona("Jeremias","Rivelli",28,12345,null);
		personas[1] = new Persona("Jorge","Lanatta",21312,123,null);
		Perro[] perros = new Perro[2];
		perros[0] = new Perro("Chiquito","Rotwailer",2,"chiquito");
		perros[1] = new Perro("Cartucho","Chihuahua",1,"grande");
		
		//Agregando el objeto perro a cada objeto persona del array personas
		for (int i = 0; i < perros.length; i++) {
			personas[i].setPerro(perros[i]);
		}
		
		for (Persona persona : personas) {
			System.out.println(persona);
		}
	}
}
