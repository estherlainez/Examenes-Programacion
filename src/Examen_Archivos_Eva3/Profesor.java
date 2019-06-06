package Examen_Archivos_Eva3;

public class Profesor extends Trabajador {
	private String titulacion;
	private String especialidad;
	
	public Profesor(String n, String d, String numSS, String t, String e, int horas) {
		super(n, d,numSS, horas);
		this.titulacion=t;
		this.especialidad=e;
		
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	
	

}
