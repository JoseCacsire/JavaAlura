package clases;

/*
 los enums son objetos del mismo tipo que la clase que los guarda. 
 Son estáticos para poder accederlos mediante la clase, por ejemplo, Continente.AMERICA. 
 Son final para que no hagas esto: Continente.AMERICA = otraCosa; 
 y el constructor es privado para que no se puedan crear instancias de Continente
 usando 'new' por fuera de la clase, sino, sería contradecir a lo que esperas 
 (que solo se pueda tener un lote de objetos Continente enumerados)
 */
public enum Continente {
	AMERICA(100, 100000),
    EUROPA(200, 100000),
    AFRICA(300, 100000),
    ASIA(400, 100000),
    OCEANIA(500, 100000),
    ANTARTIDA(600, 100000);
	
	private int cantHabitantes;
    private double superficie;
    
    
    
	public int getCantHabitantes() {
		return cantHabitantes;
	}

	public void setCantHabitantes(int cantHabitantes) {
		this.cantHabitantes = cantHabitantes;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	private Continente(int cantHabitantes, double superficie) {
		this.cantHabitantes = cantHabitantes;
		this.superficie = superficie;
	}
    
	public double densidadPoblacion() {
		return this.cantHabitantes/this.superficie;
	}
    
	@Override
    public String toString() {
        return "Continente{" + "cantHabitantes=" + cantHabitantes + ", superficie=" + superficie + '}';
    }
    
}
