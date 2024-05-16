package java_primeros_pasos;

public class Facotiral1al10 {
	public static void main(String[] args) {
		//misolucion();
		tusolucion();
	}

	public static void misolucion() {
		for (int i = 1; i < 11; i++) {
			int multiplicacion = 1;
			//i=3
			for (int j = 1; j <= i; j++) {
				multiplicacion*=(j);
			
//				System.out.print(i);
			}
			System.out.println("Factorial de " + i + " es: " + multiplicacion);
			System.out.println(" ");
		}
	}
	
	public static void tusolucion() {
		int factorial = 1;
        for (int i = 1; i < 11; i++) {
            factorial *= i;
            System.out.println("Factorial de " + i + " = " + factorial);
        }
	}
}
