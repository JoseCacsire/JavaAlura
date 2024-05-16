package main;

import java.util.ArrayList;

import entidad.Alumno;
import servicio.AlumnoServicio;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Investigar el tostring para arraylist de objetos
		AlumnoServicio as = new AlumnoServicio();
		ArrayList<Alumno> alumnos = as.crearListaAlumnos();
		
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.toString());
		}
		
		System.out.println("El promedio del alumno es "+ as.buscarAlumno(alumnos));
	}

}
