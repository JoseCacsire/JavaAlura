package main;

import clases.Empresa;
import clases.NivelEstudio;
import clases.Persona;

public class Main2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empresa e =new Empresa();
		
		e.agregarPersona(new Persona("Pepe", "Fulano",NivelEstudio.PRIMARIA));
        e.agregarPersona(new Persona("Maria", "Sultana",NivelEstudio.SECUNDARIA));
        e.agregarPersona(new Persona("Luis", "Mengano",NivelEstudio.PRIMARIA));
        e.agregarPersona(new Persona("Lito", "García",NivelEstudio.TECNICO));
        e.agregarPersona(new Persona("Arón", "Quilez",NivelEstudio.UNIVERSITARIO));
        e.agregarPersona(new Persona("Rita", "Perez",NivelEstudio.SECUNDARIA));
        e.agregarPersona(new Persona("Alex", "Gomez",NivelEstudio.POSGRADO));
        e.agregarPersona(new Persona("Sara", "Jerez", NivelEstudio.PRIMARIA));
        
        //Mostrano el arraylist creado de objetos 
        //System.out.println(e.getListaPersonas());
        
        //Obteniedo el primer valor del arraylist creado y guardandolo en una variable
        //que debe ser tipo persona ya que el arraylist es de tipo persona tambien.
        Persona persona1 = e.getListaPersonas().get(0);
        //Mostrando el valor de la variable persona1 
        //System.out.println(persona1);
        
        //Usando ENUMS
        //e.mostrarPorNivel(NivelEstudio.PRIMARIA);
        
        //Utilizando en metodo values para obtener un array de mi clase enum
        //Y asi poder recorrerlo con mi foreach
        for (NivelEstudio nivel : NivelEstudio.values()) {
            System.out.println(nivel);
        }
	}

}
