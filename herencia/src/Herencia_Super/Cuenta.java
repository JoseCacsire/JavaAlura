package Herencia_Super;

public class Cuenta {
	//encapsulando
	private double saldo;
	private int agencia;
	private int numero;
	//Referenciando a un cliente que va a ser titular
	//Hay que poner new Cliente() para iniciarlo.Sino nos dara error
	//ya que si no lo referenciamos en el main con algun objeto creado tipo cliente
	//nos dara error cuando queramos ingresar a un atributo de la clase cliente
	//ya que no lo hemos inicializado.
	private Cliente titular = new Cliente();
	//Static lo que nos va a decir es que esta variable no va a ser de la instancia.
	//Esta variable va a ser de la clase.
	//la palabra static nos está diciendo que esta variable que está aquí no va a 
	//ser alterada por la instancia sino directamente por nuestra clase cuenta.
	private static int total;

	public Cuenta( int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estoy creando una cuenta " + this.numero);

        total ++;
    }
	
	/*public Cuenta(int agencia) {
		if (agencia <= 0) {
			System.out.println("No se permite 0");
			this.agencia = 1;
		}else {
			this.agencia = agencia;
		}
		total++;
		System.out.println("Se van creando: "+total+" cuentas");
	}*/
	
	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
//Metodo de la clase y no de la instancia(cuando se crea el objeto se llama instancia)
	public static int getTotal() {
		//no se pone this ya que se refiere a un objeto.Osea cuando
		//se instancia o crea un objeto.Y esta variable estatica es
		//a nivel de clase no objeto.
		return Cuenta.total;
	}

	//Metodo void es que no retorna valor(osea no se usa return)
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}
	
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transferir(double valor, Cuenta cuentaDestino) {
		if (this.saldo >= valor) {
			cuentaDestino.depositar(valor);
			//se usa this ya q aca hago referencia al metodo del objeto que 
			//esta haciendo la transferencia y no la cuenta destino
			this.retirar(valor);
			//cuentaDestino.retirar(valor); 
			return true;
		}
		return false;
	}
}
