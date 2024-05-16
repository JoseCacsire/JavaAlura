package java_primeros_pasos;

public class Condicionales_booleanos {

	public static void main(String[] args) {
		boolean fuePromovido = true;
		double salario = 0;
        if (fuePromovido) {
        	//Esta variable solo es visible aca,para usarlo afuera hay q declararlo e iniciarlo
             salario = 4200.0;
        } else {
             salario = 3800.0;
        }

        System.out.println(salario);
	}

}
