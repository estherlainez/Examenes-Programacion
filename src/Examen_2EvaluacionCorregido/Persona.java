package Examen_2EvaluacionCorregido;


abstract class Persona {
	
	private String nombre;
	private String direccion;
	private double horasAlAnio;
		
	public Persona(String n, String d, int horas) {
		this.nombre=n;
		this.direccion=d;
		horasAlAnio=calcularHorasAlAnio(horas);
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

	public double getHorasAlAnio() {
		return horasAlAnio;
	}



	public void setHorasAlAnio(double horasAlAnio) {
		this.horasAlAnio = horasAlAnio;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", direccion=" + direccion + ", horasAlAnio=" + horasAlAnio + "]";
	}

	abstract double calcularHorasAlAnio(int horas);
	
}

