package herencia;

public class Funcionario {
	private String nombre;
	private String documento;
	private double salario;
	
	public Funcionario () {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getBonificacion() {
		System.out.println("Ejecutado desde funcionario");
		return this.salario * 0.05;
	}
}
