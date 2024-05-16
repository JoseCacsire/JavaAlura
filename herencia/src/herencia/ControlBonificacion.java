package herencia;

//Ejemplo de POLIMORFISMO
//Para este ejemplo toy creando la clase testControl para las pruebas de esta clase

public class ControlBonificacion {
	private double suma;
	
	//Bueno dependiendo de que tipo de objeto le pases ejecutara su metodo
	//getBonificacion que tenga dicho objeto
	//Por ejemplo si le paso un objeto tipo contador tomara su metodo getBonificacion
	//de dicha clase.Pero te preguntaras q en el parametro dice funcionario como tipo
	//lo q pasa que el objeto contado es una clase hija de funcionario,por lo tanto
	//contador es un funcionario.En conclcuion pasarle un objeto tipo contador
	//es igual que pasarle un objeto tipo funcionario.Ya que es hija de funcionario
	public double registrarSalario(Funcionario funcionario) {
		System.out.println(this.suma);
		//Pero como es especifico tomara el metodo que este en la clase hija 
		//no en la padre,Me refiero al getBonificacion
		this.suma += funcionario.getBonificacion();
		System.out.println("Calculo actual: "+this.suma);
		return this.suma;
	}
	
}








