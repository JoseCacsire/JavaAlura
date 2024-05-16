	package Ejercicioo1;
	
	import java.util.Scanner;
	
	public class Libro {
		private int ISBN;
		private String titulo;
		private String autor;
		private int numeroPaginas;
		
		public Libro() {
		}
	
		public Libro(int iSBN, String titulo, String autor, int numeroPaginas) {
			ISBN = iSBN;
			this.titulo = titulo;
			this.autor = autor;
			this.numeroPaginas = numeroPaginas;
		}
		
		public void cargarValores() {
			//Scanner scanner = new Scanner(System.in).useDelimiter("\n");
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			System.out.print("Ingrese el ISBN del libro: ");
			ISBN = scanner.nextInt();
			System.out.print("Ingrese el titulo del libro: ");
			titulo = scanner.next();
			System.out.print("Ingrese el autor del libro: ");
			autor = scanner.next();
			System.out.println("Ingrese el número de páginas del libro: ");
			numeroPaginas = scanner.nextInt();
		}
	
		public int getISBN() {
			return ISBN;
		}
	
		public void setISBN(int iSBN) {
			ISBN = iSBN;
		}
	
		public String getTitulo() {
			return titulo;
		}
	
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
	
		public String getAutor() {
			return autor;
		}
	
		public void setAutor(String autor) {
			this.autor = autor;
		}
	
		public int getNumeroPaginas() {
			return numeroPaginas;
		}
	
		public void setNumeroPaginas(int numeroPaginas) {
			this.numeroPaginas = numeroPaginas;
		}
		
		
	}
