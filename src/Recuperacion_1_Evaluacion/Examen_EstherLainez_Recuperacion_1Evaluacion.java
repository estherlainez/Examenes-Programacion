package Recuperacion_1_Evaluacion;
import java.util.*;
public class Examen_EstherLainez_Recuperacion_1Evaluacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		int filas=7,columnas=3;
		int opcion=0;
		int notas[][]=new int[filas][columnas];
		
		double mediaAlumno=0;
		
		do {
			System.out.println("Menu");
			System.out.println("1-Introducir y mostrar los datos de los alumnos");
			System.out.println("2-Media del alumno que se desea consultar");
			System.out.println("3-Media de los alumnos de la clase");
			System.out.println("4-Salir");
			System.out.println("Introduzca opcion");
			opcion=teclado.nextInt();
			switch(opcion) {
				case 1:
					System.out.println("1.Introduccion de notas y vista de los resultados de los alumnos\n");
					
					System.out.println("Resultados de la clase");
					for(int i=0;i<filas;i++) {
						for(int j=0;j<columnas;j++) {
							notas[i][j]=(int)(Math.random()*11);
							System.out.print(notas[i][j]+"\t");
						}
						System.out.println("\n");
					}
					
					System.out.println("\n");
					
					break;
					
				case 2:
					System.out.println("2.Consultar la nota media de un alumno\n");
					System.out.println("Elija un alumno de la lista (Total de 7 alumnos)para obtener sus resultados:");
					int alumno=teclado.nextInt();
					System.out.println("Usted ha elegido el alumno--->"+alumno+"\n");
					mediaAlumno=mediaAlumno(alumno,notas);
					System.out.println("La media del alumno "+ alumno+" es de --->"+ mediaAlumno+" puntos\n");
					
					break;
					
				case 3:
					System.out.println("3.Consultar la media de todos los alumnos\n");
					mediasDeLosAlumnos(notas);
					System.out.println("\n");
					
					break;
					
				case 4: 
					System.out.println("¡Que tengas un buen dia....hasta pronto!");
					
					break;
					
				default:
					
					System.out.println("Error,elija una opcion de 1 a 4");
				
			}
			
		}while(opcion!=4);
	}
	
	
	public static double mediaAlumno(int n,int notasAlumnos[][] ) {
		double mediaA=0;
		int suma=notasAlumnos[n][0]+notasAlumnos[n][1]+notasAlumnos[n][2];
		mediaA=(double) suma/3;
		
		return mediaA;
	}
	
	public static void mediasDeLosAlumnos(int  notasAlumnos[][]) {
		int sumaFila=0;
		int filas=7;
		int columnas=3;
		double mediaA;
		System.out.println("Alumnos Dam y su media ");
		for(int i=0;i<filas;i++) {
			sumaFila=0;
			for(int j=0;j<columnas;j++) {
				System.out.print(notasAlumnos[i][j]+"\t");
				sumaFila=sumaFila+notasAlumnos[i][j];
			}
			mediaA=(double)sumaFila/3;
			System.out.println("La media del alumno es de--->  "+mediaA+" puntos");

		
		}
		
	}

}
