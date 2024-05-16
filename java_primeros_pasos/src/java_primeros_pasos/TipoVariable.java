package java_primeros_pasos;

public class TipoVariable {

	public static void main(String[] args) {
		String nombre = "Jose";
		int edad=26;
		
		//Sobrescribiendo el valor de edad
		edad=27;
		
		//dato decimal
		double salario = 2500.50;
		
		System.out.println(nombre+" tiene "+edad+" años ");
		System.out.println ("Su salario es " + salario);
		
		//dividiendo dos numeros
		//Nota:coloca el .0 despues del dividendo para que te salga la respuesta correcta
		double division = 5.0/2;
		System.out.println(division);
		
		//casteando el numeroDecimal a entero
		double numeroDecimal = 1270.50;
        int numeroEntero = (int) numeroDecimal;
        System.out.println(numeroEntero);
        
        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);
        
        //casteando un double a float
        float puntoFlotante = 3.14f;
        System.out.println(puntoFlotante);
	}

}
