package java_primeros_pasos;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "Alura";
		
		System.out.println("Antes de aplicar metodos: "+nombre);
		//Acordarse que no estoy modificando la variable sino le estoy asignadole
		//lo que me retorna el m�todo.Ya que si no lo igualas a algo no te cambiara nada.
		//Asignandole a la misma variable lo que retorna del metodo replace.
		//Descomenta lo de abajo y veras de lo que te digo.
		//nombre.replace("A", "a");
		nombre = nombre.replace("A", "a");
		System.out.println("Aplicando el m�todo replace: "+nombre);
		//igual aca
		nombre = nombre.concat(" cursos online");
		System.out.println("Aplicando el m�todo concat: "+nombre);
		
		nombre = nombre.toUpperCase();
		System.out.println("Aplicando el m�todo toUpperCase: "+nombre);
		
		
		nombre = nombre.toLowerCase();
		System.out.println("Aplicando el m�todo toLowerCase: "+nombre);
		
		char letra = nombre.charAt(0);
		System.out.println("Aplicando el m�todo charAt: "+letra);
		
		int indice = nombre.indexOf("e");
		System.out.println("Aplicando el m�todo indexOf: "+indice);
		
		//Recorriendo todos sus caracteres incluyedo el espacio de mi variable string nombre
		for(int i = 0; i < nombre.length(); i++) {
		    System.out.println(nombre.charAt(i));
		} 
		
	}

}
