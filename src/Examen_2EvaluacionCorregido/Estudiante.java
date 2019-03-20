package Examen_2EvaluacionCorregido;
public class Estudiante extends Persona implements Comparable {
	
	private static int codigoSiguiente=1;
	private int codigo;
	private int edad;
	private String nif;
	
	

	public Estudiante (String n, String d, int e, String nif, int horas) {
		super(n, d, horas);
		this.edad=e;
		this.nif=nif;
		this.codigo=Estudiante.codigoSiguiente;
		Estudiante.codigoSiguiente++;
	}
	
	
	
	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public String getNif() {
		return nif;
	}



	public void setNif(String nif) {
		this.nif = nif;
	}



	 double calcularHorasAlAnio (int horas) {
		return horas*7*10;
		
	}



	
	
	@Override
	public String toString() {
		return super.toString()+"Estudiante [codigo=" + codigo + ", edad=" + edad + ", nif=" + nif + "]";
	}



	public int compareTo (Object e) {
		Estudiante  obj= (Estudiante) e;
		if (this.getNombre().compareTo(obj.getNombre())<0) return -1;
		if (this.getNombre().compareTo(obj.getNombre())>0) return 1;
		return 0;
	}



}
