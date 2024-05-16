package agregacion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {
		//En este ejemplo se nota que si muere un animal eso no significa que el zoologico cierra
		//igualmente si el zoologico cierra no significa q los animales mueran
		//en conclusion no hay una dependencia fuerte,solo una asociacion o uso.
		//Declaración de un zoologico
		Zoologico chapultepec;
		//Asignacion de memoria (creamos el zoologico)
		chapultepec = new Zoologico();
		//Creamos el arreglo de animales
		chapultepec.animales = new Animal[3];
		//Creamos los animales
		Animal a1 = new Animal("antonio");
		Animal a2 = new Animal("kenyi");
		Animal a3 = new Animal("juan");
		chapultepec.animales[0] = a1;
		chapultepec.animales[1] = a2;
		chapultepec.animales[2] = a3;
		
		
		//Con este print solo me mostrara una representacion del arreglo en memoria
		System.out.println(chapultepec.animales);
		//debemos agregar el atributo nombre,ya que recuerda que animales es un arreglo de tipo Animal osea clase
		//por lo tanto debemos llamar a su atrbituo de cada objeto que contiene ese arreglo
		System.out.println(chapultepec.animales[1].nombre);
		//Aca utilizo el to string de la clase animal para que me muestre el contenido del array
		//sino me mostrara un arreglo,pero con la representacion en memoria de cada objeto Animal en el arreglo nombres.
		//Opcion 1 para que me mueste el contenido del array animales
		//Cuando utilizas Arrays.toString(chapultepec.animales), el método toString() se aplicará automáticamente a cada objeto 
		//Animal en el arreglo animales para obtener su representación en forma de cadena.
		System.out.println(Arrays.toString(chapultepec.animales));
		
		//Opcion 2 para que me muestre el contenido del array animales
		//para recorrer el arreglo de objetos Animal llamado chapultepec.animales
//En cada iteración del bucle, se almacena el objeto Animal actual en la variable animal, y luego se imprime el objeto Animal 
//utilizando System.out.println(animal);. Dado que has sobrescrito el método toString() en la clase Animal para que muestre el 
//nombre del animal, la llamada System.out.println(animal); mostrará el nombre del animal en cada iteración. 
		for (Animal animal : chapultepec.animales) {
			System.out.println(animal);
		}
		
		//Practicando
		String[] nombres = {"Juan", "María"};
		//nombres[0] = "pepe";
		//nombres[1] = "Juan";
		System.out.println(chapultepec.animales[2].nombre);
		//Arrays.toString(nombres) para imprimir el contenido del arreglo nombres en la consola. 
		System.out.println(Arrays.toString(nombres));
	}

}
