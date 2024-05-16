package servicio;

import java.util.Scanner;

import entidad.Persona;

public class PersonaServicio {
	
	Scanner leer = new Scanner(System.in);
	
	public Persona crearPersona() {
		Persona persona = new Persona();
		System.out.println("Ingrese el nombre de la persona");
		persona.setNombre(leer.next());
		System.out.println("Ingrese la edad de la persona");
		persona.setEdad(leer.nextInt());
		
		char sexo;
		do {
			System.out.println("Ingrese el sexo de la persona");
			sexo = leer.next().charAt(0);
			
		}while(sexo != 'H' && sexo != 'M' && sexo != 'O');
		persona.setSexo(sexo);
		
		
		System.out.println("Ingrese el peso de la persona");
		persona.setPeso(leer.nextDouble());
		System.out.println("Ingrese la altura de la persona");
		persona.setAltura(leer.nextDouble());
		return persona;
	}
	
	public boolean esMayor(Persona persona) {
		//Ya que va a ser verdadero o falso.Osea una sola respuesta
		//Pones la condicion de forma directa ya que el metodo es booleano
		//osea que te devolvera verdadero o false.
		return persona.getEdad() >= 18;
	}
	
	public int calcularIMC(Persona persona) {
		
		double pesoIdeal = persona.getPeso()/(Math.pow(persona.getAltura(), 2));
		int retorno;
		//Primera forma
		if (pesoIdeal < 20) {
			retorno = -1;
		}else if (pesoIdeal <= 25) {
			retorno = 0;
		}else {
			retorno = 1;
		}
		return retorno;
		
		//Segunda forma
		
		//el return es como un break
		/*if (pesoIdeal < 20) {
			return -1;
		}else if (pesoIdeal <= 25) {
			return 0;
		}
		return 1;*/
		
		
	}
	
}
