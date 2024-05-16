package Listas;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creando un array simple
		int[] edades = new int[5];
		
		//Agregandole valores al array
		for (int i = 0; i < edades.length; i++) {
            edades[i] = i * i;
        }
		
		//Recorriendo una lista
		for (int i = 0; i < edades.length; i++) {
            System.out.println(edades[i]);
        }
		
		MiClase c1 = new MiClase(1, "Hello");
//		System.out.println(c1.toString());
		//Creando una lista de objetos tipo MiClase
		MiClase[] clases = new MiClase[3];
		//Agregandole valores al array 
		clases[0] = c1;
		//Recorriendo una lista
		for (int i = 0; i < clases.length; i++) {
            System.out.println(clases[i]);
        }		
		
		
		
		
		
		
	}
}
