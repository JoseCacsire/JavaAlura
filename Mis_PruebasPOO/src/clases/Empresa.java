package clases;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Persona> listaPersonas;
	
	public Empresa() {
		System.out.println("Constructor Empresa creando el arraylist");
		this.listaPersonas = new ArrayList<>();
	}
	
	public void agregarPersona(Persona p) {
		this.listaPersonas.add(p);
	}
	
	public void mostrarPorNivel(NivelEstudio nivel) {
		for (Persona p : listaPersonas) {
			if (p.getNivelEstudio().equals(nivel)) {
				System.out.println(p);
			}
		}
	}
	
	public ArrayList<Persona> getListaPersonas() {
		return listaPersonas;
	}

	
	
	
	
}
