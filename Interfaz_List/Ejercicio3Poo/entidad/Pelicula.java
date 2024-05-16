package entidad;

import java.util.Comparator;

//Tendremos una clase Pelicula con el titulo,director y duración de la película(en horas)
public class Pelicula {
	String titulo;
	String director;
	Double duracion;
	
	public Pelicula() {
	}

	public Pelicula(String titulo, String director, Double duracion) {
		this.titulo = titulo;
		this.director = director;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Double getDuracion() {
		return duracion;
	}

	public void setDuracion(Double duracion) {
		this.duracion = duracion;
	}

	//Definiendo un metodo toString que me servira para proporcionar una representación significativa y legible de un objeto 
	//en formato de cadena cuando quiera mostrar un objeto creado su información relevante sobre su estado.
	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + "]";
	}
	
	//No te confundas una iterfaz no se puede instanciar.Aca se esta creando una clase anonima
	//Ya que si observas cuidadosamente puedes apreciar que la variable esta igualando a una instancia,pero
	// aplicando un método.Cuando veas eso es que estas instanciando una clase anonima no la interfaz.
	//En conculasion para que no crear una clase y implementar una interfaz.Se usan estos tipo de recursos
	//Instanciar una clase anonima que implemente el metodo que vamos a usar de la interfaz.Por eso
	//usas el override ya que vas a sobrescribir el metodo de la interfaz que es compare
	public static Comparator<Pelicula> comparadorDuracion = new Comparator<Pelicula>() {
		//En este caso, el método compare() está comparando dos objetos de tipo Pelicula basándose en su duración.
		//Sobrescribiendo el método "compare" de la interfaz 
		@Override
		public int compare(Pelicula pelicula1, Pelicula pelicula2) {
			//Aca toy coparado dos objetos por su duracion usando el metodo compareTo
			//Mayor a menor
			return pelicula2.getDuracion().compareTo(pelicula1.getDuracion());
		}
	};
	
	public static Comparator<Pelicula> comparadorTitulo = new Comparator<Pelicula>() {
		//En este caso, el método compare() está comparando dos objetos de tipo Pelicula basándose en su titulo.
		//Sobrescribiendo el método "compare" de la interfaz 
		@Override
		public int compare(Pelicula pelicula1, Pelicula pelicula2) {
			//Aca toy coparado dos objetos por su titulo usando el metodo compareTo
			return pelicula1.getTitulo().compareTo(pelicula2.getTitulo());
		}
	};
	
	public static Comparator<Pelicula> comparadorDirector = new Comparator<Pelicula>() {
		//En este caso, el método compare() está comparando dos objetos de tipo Pelicula basándose en su director.
		//Sobrescribiendo el método "compare" de la interfaz 
		@Override
		public int compare(Pelicula pelicula1, Pelicula pelicula2) {
			//Aca toy coparado dos objetos por su director usando el metodo compareTo
			return pelicula1.getDirector().compareTo(pelicula2.getDirector());
		}
	};
	
	
}
