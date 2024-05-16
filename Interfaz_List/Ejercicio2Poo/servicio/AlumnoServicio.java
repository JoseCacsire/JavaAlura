package servicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import entidad.Alumno;

/*
 En el servicio de Alumno deberemos tener un bucle que crea un objeto
 Alumno.Se pide toda la información al usuario y ese Alumno se guarda en una lista
 de tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no.
 Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
 Método notaFinal():El usuario ingresa el nombre del alumno que quiere calcular su nota
 final y se lo busca en la lista de Alumnos.Si está en la lista,se llama al método.Dentro del
 método se usará la lista notas para calcular el promedio final de alumno.Siendo este
 promedio final,devuelto por el método y mostrado en el main
 */
public class AlumnoServicio {
	
	public ArrayList<Alumno> crearListaAlumnos(){
		Scanner leer = new Scanner(System.in);
		//Creando un arraylist alumnos de tipo Clase Alumno
		ArrayList<Alumno> alumnos = new ArrayList<>();
		boolean confirmacion = true;
		do {
			//Creando un objeto 
			Alumno alumno = new Alumno();
			System.out.println("Ingrese el nombre del alumno");
			//Agregando el nombre
			alumno.setNombre(leer.next());
			System.out.println("Ingresa las notas del alumno");
			//Creando un arraylist notas de tipo Integer
			ArrayList<Integer> notas = new ArrayList<>();
			//Agregando las notas al array
			for (int i = 0; i < 3; i++) {
				notas.add(leer.nextInt());
			}
			//Agregando el arraylist notas al objeto creado ya con sus valores
			//obtenidos del for
			alumno.setNotas(notas);
			alumnos.add(alumno);
			System.out.println("Desea ingresar otro alumno? S/N");
			//Para salir del bucle 
			if (leer.next().equalsIgnoreCase("N")) {
				confirmacion = false;
			}
		} while (confirmacion);
		//Retornando el arraylist alumnos de tipo clase alumno
		return alumnos;
	}
	
	//Crear un método para buscar un alumno,pero para eso hay que pasarle como 
	//argumento un arraylist de tipo clase alumno 
	public Double buscarAlumno(ArrayList<Alumno> alumnos) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el nombre del alumno que desea calcular la nota final");
		//Creando una variable string que capturara el valor que se ingresara por consola
		String alumnoABuscar = leer.next();
		//Creando el iterator para manipular el arraylist
		Iterator<Alumno> it = alumnos.iterator();
		//Creando un bucle que permitira el recorrido
		while (it.hasNext()) {
			//Creando una variable auxiliar de tipo clase alumno que capturara los objetos por cada recorrido
			//Nota se crea la variable alumno auxiliar para que atrape el valor donde se encuentre el it.next
			Alumno alumnoAuxiliar = it.next();
			System.out.println(alumnoAuxiliar.getNombre());
			//verificando si el son iguales el nombre del objeto que se haya guardado en alumnoAuxiliar
			//con la variable alumnoABUSCAR que se ingreso por consola.Si son iguales se ejecuta el metodo promedioNotas
			if (alumnoAuxiliar.getNombre().equalsIgnoreCase(alumnoABuscar)) {
				return promedioNotas(alumnoAuxiliar);
			}
		}
		//Si no son iguales se jecuta esta parte de codigo.Ya que al no ser iguales no se ejecuta el if
		//Y se mostrara que no se encontro el alumno y retornara null ya que no ejecuto el metodo promedioNotas
		System.out.println("NO se encontró el alumno");
		return null;
	}
	
	public Double promedioNotas(Alumno alumno) {
		double sumaNotas=0;
		//definiendo un foreach que recorrera el objeto pasado como argumento
		//pero solo recorrera las notas ya que se esta usando el getNotas que es un arraylist no el objeto 
		for (Integer nota : alumno.getNotas()) {
			//Sumando las notas,ya que recorrera nota por nota y eso se ira sumando con la variable sumaNotas
			sumaNotas+=nota;
		}
		//Retornando el promedio.Usamos size() para calcular el tamaño del arraylist que obtiene de alumno.getNotas
		//acuerdate que en la clase Alumno hay un atributo que es arraylist con nombre notas.Por eso usamos el size.
		return sumaNotas / alumno.getNotas().size();
	}
}
