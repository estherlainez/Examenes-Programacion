package Examen_2EvaluacionEsther;

/**
 * @return
 * @author Esther
 * Este era el examen de evaluacion de la segunda evaluacion de programacion
 *  y dejamos alguna informacion
 *
 */
public class PersonalGestion extends Persona{

	String posicion;
	String numSS;
	public PersonalGestion(String n, String d, double ho,String num,String p) {
		super(n, d, ho);
		this.numSS=num;
		this.posicion=p;
	}
	@Override
	/**
	 * @param horas sera las horas que trabaja dia a dia cada uno
	 * @return horasAño que sera las horas que trabaja al año cada uno
	 */
	public double CalcularHoras(int horas) {
		double horasAño=horas*5*11;
		return horasAño;
		
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public String getNumSS() {
		return numSS;
	}
	public void setNumSS(String numSS) {
		this.numSS = numSS;
	}
	@Override
	public String toString() {
		return super.toString()+"PersonalGestion [posicion=" + posicion + ", numSS=" + numSS + "]\n";
	}
	

}
