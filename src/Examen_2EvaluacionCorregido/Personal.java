package Examen_2EvaluacionCorregido;

public class Personal extends Trabajador {
	private String posicion;
	
	public Personal(String n, String d,String nss, String p, int horas) {
		super(n, d, nss, horas);
		this.posicion=p;
		
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	

}