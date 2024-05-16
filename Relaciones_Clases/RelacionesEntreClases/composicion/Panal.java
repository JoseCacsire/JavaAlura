package composicion;

public class Panal {
	Abeja[] enjambre;

	//Estamos definiendo su constructor de la clase Panal
	//Bueno se puede observar que estamos inicializando el array
	//y agregandole valores.Entonces si eliminamos el objeto que se creara en Main2
	//deja de exister las abejas que hemos creado en el constructor,ya que al crear el objeto de 
	//que se llama "zzzz" se inicializara el constructor automaticamente creandome esas dos abejas
	//dentro del array.Entonces este  un ejemplo claro de composicion.Ya que hay una dependencia.
	//Eliminas el objeto "zzzz" que esta en el main creado tambien se borrara su array de abejas.
	//Ya que existe una dependencia  y la destruccion del compuesto conlleva a la destruccion de los componentes.
	public Panal() {
		enjambre = new Abeja[2];
		enjambre[0] = new Abeja("pepe");
		enjambre[1] = new Abeja("lucho");
		//enjambre[2] = new Abeja("miki");
		//enjambre[3] = new Abeja("chila");
	}

	
}
