package Interfaces;

//este es tu carnet(Autenticable) para entrar a la puerta que sería el SistemaInterno
public  interface Autenticable {

	
	public  void setClave(String clave);
	
	public  boolean iniciarSesion(String clave);
	
	
}
