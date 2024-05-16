package Listas;

public class GuardadorDeClases {
	
	private MiClase[] referencias;
	private int posicionLibre;
    
	//Constructor
	public GuardadorDeClases() {
		System.out.println("Ejecutandose el Constructor");
        this.referencias = new MiClase[10];
        this.posicionLibre = 0;
    }
	public void adicionar(MiClase ref) {
        referencias[this.posicionLibre] = ref;
        this.posicionLibre++;
    }
	public int getCantidadDeElementos() {
		//System.out.println(this.referencias[0]);
		return this.posicionLibre;
	}
}
