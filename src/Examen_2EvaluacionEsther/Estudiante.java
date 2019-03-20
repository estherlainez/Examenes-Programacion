package Examen_2EvaluacionEsther;
/**
 * @author Esther
 *
 */
public class Estudiante  extends Persona {
	
		String nif;
		int edad;
		private int cod;
		private static int codigo;
		
		Estudiante(String n, String d, double h,int e){
			super(n,d,h);
			this.edad=e;
			this.cod=codigo;
			codigo++;
			
		}

		public String getNif() {
			return nif;
		}

		public void setNif(String nif) {
			this.nif = nif;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public int getCod() {
			return cod;
		}

		

		public void setCod(int cod) {
			this.cod = cod;
		}

		public static int getCodigo() {
			return codigo;
		}

		public static void setCodigo(int codigo) {
			Estudiante.codigo = codigo;
		}

		
		@Override
		/**
		 * @return nos devolvera las horas al año que trabaja cada uno
		 * @param pasamos las horas del dia
		 */
		public double CalcularHoras(int horas) {
			double horasAño=horas*5*10;
			return horasAño;
			
		}
		@Override
		public String toString() {
			return super.toString()+"Estudiante [nif=" + nif + ", edad=" + edad + ", cod=" + cod + "]\n";
		}
}
