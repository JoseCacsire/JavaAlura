package entidad;

import java.util.ArrayList;

/*
Crear una clase llamada Alumno que mantenga informacion sobre las notas de 
distintos alumnos.La clase Alumno tendrá como atributos,su nombre y una lista 
de tipo integer con sus 3 notas.
*/
public class Alumno {
	private String nombre;
	private ArrayList<Integer> notas;
	
	public Alumno() {
	}
	
	public Alumno(String nombre, ArrayList<Integer> notas) {
		super();
		this.nombre = nombre;
		this.notas = notas;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Integer> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Integer> notas) {
		this.notas = notas;
	}
	@Override
	public String toString() {
		return "nombre="+this.nombre + ", notas=" +this.notas;
	}
}
