package Examen_Archivos_Eva3;

public class Trabajador extends Persona {

	private String numSS;

	public Trabajador(String n, String d, String num, int horas) {
		super(n, d, horas);
		this.numSS=num;
		
		
		
	}

	
	public double calcularHorasAlAnio(int HorasEstudio) {
		
		return HorasEstudio*5*10;
	}


	public String getNumSS() {
		return numSS;
	}


	public void setNumSS(String numSS) {
		this.numSS = numSS;
	}
	
	
	
}