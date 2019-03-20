package Examen_1Evaluacion;
import java.util.Scanner;
import java.util.Arrays;
public class examen_corregido_1evaluacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int filas=7; 
		int columnas=3;
		int opcion=0;
		int notas[][]=new int[filas][columnas];
		double mediaAlumno=0;
		do {
			System.out.println("\t MENU");
			System.out.println("1.INTRODUCIR Y MOSTRAR DATOS");
			System.out.println("2.MEDIA DE UN ALUMNO CONCRETO");
			System.out.println("3.MEDIA DE TODOS LOS ALUMNOS");
			System.out.println("4.SALIR");
			System.out.println("Introduzca opcion");
			opcion=teclado.nextInt();
			switch(opcion) {
				case 1:
					for(int i=0;i<filas;i++) {
						for(int j=0;j<columnas;j++) {
							notas[i][j]=(int)(Math.random()*11);
							System.out.print(notas[i][j]+"\t");
						}
						System.out.println("\n");
					}
					break;
				case 2:
					/*1)Obtener numero de alumnos
					 * 2)Calcular la media
					 * Public static duble mediaAlumno(int numAlumno,Array);
					 * 3)Imprimir resultado
					 */
					System.out.println("Introduzca numero de alumno al que le calcularemos la media,este sera de 0 a 6");
					int numAlumno=teclado.nextInt();
					mediaAlumno=mediaAlumno(numAlumno,notas);
					System.out.println("La media del alumno "+ numAlumno+" es de "+ mediaAlumno);
					break;
				case 3:
					medias(notas);
					break;
				case 4: 
					System.out.println("SALIR");
					break;
				default:{
					System.out.println("Error,ha elegido una opcion erronea");
				}
			}
			
		}while(opcion!=4);
	}
	
	public static double mediaAlumno(int n,int v[][] ) {
		double media=0;
		int suma=v[n][0]+v[n][1]+v[n][2];
		media=(double) suma/3;
		
		return media;
	}
	
	public static void medias(int  v[][]) {
		int sumaFila=0;
		int filas=7;
		int columnas=3;
		double mediaFila;
		for(int i=0;i<filas;i++) {
			sumaFila=0;
			for(int j=0;j<columnas;j++) {
				System.out.print(v[i][j]+"   ");
				sumaFila=sumaFila+v[i][j];
			}
			mediaFila=(double)sumaFila/3;
			System.out.println("   "+mediaFila+"   \n");
		
		}
	}

}
