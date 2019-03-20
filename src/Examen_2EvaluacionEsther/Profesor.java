package Examen_2EvaluacionEsther;

public class Profesor extends Persona {

	String especialidad;
	String numSS;
	public Profesor(String n, String d, double ho,String e,String num) {
		super(n, d, ho);
		this.especialidad=e;
		this.numSS=num;
	
	}
	@Override
	/**
	 * @return horasAño nos devuelve el total de horas al año de cada trabajador
	 * @param horas, le damos las horas trabajadas al dia
	 */
	public double CalcularHoras(int horas) {
		double horasAño=horas*5*11;
		return horasAño;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getNumSS() {
		return numSS;
	}
	public void setNumSS(String numSS) {
		this.numSS = numSS;
	}
	@Override
	public String toString() {
		return super.toString()+"Profesor [especialidad=" + especialidad + ", numSS=" + numSS + "]\n";
	}

}