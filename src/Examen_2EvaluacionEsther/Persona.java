package Examen_2EvaluacionEsther;
/**
 * @author Esther
 *Esta es una clase abstracta que a partir de ella vamos a crear otras clases para trabajar
 */
public  abstract class Persona {

	String nombre;
	String direccion;
	double horas;//horas que hace al dia
	


	public Persona(String n, String d, double h) {
		this.nombre=n;
		this.direccion=d;
		this.horas=h;
	}




	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", direccion=" + direccion + ", horas=" + horas + "]\n\n";
	}




	public double getHoras() {
		return horas;
	}




	public void setHoras(double horas) {
		this.horas = horas;
	}




	public abstract double CalcularHoras(int horas);


	
}