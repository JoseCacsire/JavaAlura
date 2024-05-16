package java_primeros_pasos;

public class ProgramaConBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int fila = 1; fila < 6; fila++) {
            for (int columna = 1; columna < 6; columna++) {
                if ( columna > fila ) {
//                	System.out.print("a");
                    break;
                }
                System.out.print( columna + " ");
            }
            System.out.println("");
        }
	}

}
