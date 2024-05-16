package Interfaces;

//implementando la interfaz autenticable es como un sello
//de quienes pueden usar esa interfaz.
public class Administrador extends Funcionario implements Autenticable{
	
	private AutenticacionUtil util;
	
	public Administrador(){
		this.util = new AutenticacionUtil();
	}
	
	@Override
	public double getBonificacion() {
		return super.getSalario();
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
	}

}
