package Listas;

public class MiClase {
	// Variables de instancia
    private int numero;
    private String mensaje;

    // Constructor
    public MiClase(int numero, String mensaje) {
        this.numero = numero;
        this.mensaje = mensaje;
    }


	@Override
    public String toString() {
    	return "Numero = " + numero + ", Mensaje = " + mensaje;
    }	
    
    // Métodos de instancia
    public void imprimirMensaje() {
        System.out.println(mensaje);
    }

    public int sumar(int otroNumero) {
        return numero + otroNumero;
    }

    // Método getter para la variable 'numero'
    public int getNumero() {
        return numero;
    }

    // Método setter para la variable 'numero'
    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Método getter para la variable 'mensaje'
    public String getMensaje() {
        return mensaje;
    }

    // Método setter para la variable 'mensaje'
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
