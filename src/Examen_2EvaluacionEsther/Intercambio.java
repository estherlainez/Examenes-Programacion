package Examen_2EvaluacionEsther;

/**
 * Esta clase nos muestra alumnos de otros paises que han venido a
 * nuestro centro
 * @author Esther
 *
 */
public class Intercambio extends Estudiante{

	String nif;
	String pais;
	double horasA�o;
	private int cod;
	private static int codigo;
	
	public Intercambio(String n, String d,double h,int e,String p) {
		super(n, d,h,e);
		this.nif=n;
		this.edad=e;
		this.pais=p;
		this.cod=codigo;
		codigo++;
	}
	
	@Override
	/**
	 * @param le pasamos las horas al dia
	 * @return horasA�o nos muestra las horas al a�o de cada estudiante
	 */
	public double CalcularHoras(int horas) {
		double horasA�o=horas*5*10;
		return horasA�o;
		
	}

	@Override
	/**
	 * @return nos informara de todos los datos de los estudiantes
	 */
	public String toString() {
		return super.toString()+"Intercambio [nif=" + nif + ", pais=" + pais + ", horasA�o=" + horasA�o + ", cod=" + cod + "]\n";
	}
	
}
