package entidad;

public class Pelicula {
	private String titulo;
	private double duracion;
	private int edadminima;
	private String director;
	
	public Pelicula() {
	}

	public Pelicula(String titulo, double duracion, int edadminima, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadminima = edadminima;
		this.director = director;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public int getEdadminima() {
		return edadminima;
	}

	public void setEdadminima(int edadminima) {
		this.edadminima = edadminima;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
}
