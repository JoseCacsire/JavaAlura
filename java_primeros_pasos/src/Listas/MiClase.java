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
    
    // M�todos de instancia
    public void imprimirMensaje() {
        System.out.println(mensaje);
    }

    public int sumar(int otroNumero) {
        return numero + otroNumero;
    }

    // M�todo getter para la variable 'numero'
    public int getNumero() {
        return numero;
    }

    // M�todo setter para la variable 'numero'
    public void setNumero(int numero) {
        this.numero = numero;
    }

    // M�todo getter para la variable 'mensaje'
    public String getMensaje() {
        return mensaje;
    }

    // M�todo setter para la variable 'mensaje'
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
