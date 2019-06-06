package Examen_Archivos_Eva3;

public class Intercambio extends Estudiante {
	private String paisOrigen;
	public Intercambio(String n, String d, int e, String nif, String p, int horas) {
		super(n, d, e, nif, horas);
		this.paisOrigen=p;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	@Override
	public String toString() {
		return "Intercambio [paisOrigen=" + paisOrigen + "]"+super.toString();
	}

	
		
	

}