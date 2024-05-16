package main;

import java.util.Scanner;

import entidad.Persona;
import servicio.PersonaServicio;

public class Main1 {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		
		PersonaServicio ps = new PersonaServicio();
		System.out.println("Ingresa la cantidad de personas que quieras controlar: ");
		int N = leer.nextInt();
		//Creando un vector o array de tipo Persona que contendra 
		//N elementos que le pasemos.Puede ser 4 o lo que le pases.
		//La cosa que si pasas 4 el array tendrea 4 objetos tipo persona
		Persona[] personas = new Persona[N];
		int[] IMC = new int[N];
		boolean[] mayor = new boolean[N];
		int sobrepeso = 0;
		int pesoIdeal = 0;
		int pesoBajo = 0;
		int esMayor = 0;
		int esMenor = 0;
		//Nos va a instanciar en cada posicion del vector o array personas
		//instanciando persona por cada indice.Empezando de 0
		for (int i = 0; i < N; i++) {
			personas[i] = ps.crearPersona();
			//Agregandole los valores a cada indice
			IMC[i] = ps.calcularIMC(personas[i]);
			//Mostrando por pantalla que tiene cada persona o objeto
			//Si es sobrepeso,peso idal,peso bajo
			//Pero se debe verificar recorriendo por indice el array IMC
			//Tambien se agrega 1 a la variable sobrepeso,peso ideal,peso bajo
			//dependiendo de que caso sea.
			switch (IMC[i]) {
				case 1:
					System.out.println("La persona tiene sobrepeso");
					sobrepeso++;
					break;
				case 0:
					System.out.println("La persona tiene peso ideal");
					pesoIdeal++;
					break;
				default:
					System.out.println("La persona está bajo el peso ideal");
					pesoBajo++;
					break;
			}
			//Agregandoles valores a cada indice.Por ejemplo en el primer indice
			//Puede ir true o false dependiendo si es mayor o menor
			mayor[i] = ps.esMayor(personas[i]);
			if (mayor[i]) {
				esMayor++;
			}else {
				esMenor++;
			}
		} 
		System.out.println("El promedio de personas con peso ideal es" + ((pesoIdeal*(1.0)/N)*100));
		System.out.println("El promedio de personas con peso alto es" + ((sobrepeso*(1.0)/N)*100));
		System.out.println("El promedio de personas con peso bajo es" + ((pesoBajo*(1.0)/N)*100));
		System.out.println(esMayor + "son mayores de edad");
		System.out.println(esMenor + "son menores de edad");
	}

}
