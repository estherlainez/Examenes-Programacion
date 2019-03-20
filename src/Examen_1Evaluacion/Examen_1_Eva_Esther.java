package Examen_1Evaluacion;

import java.util.Scanner;
import java.util.Arrays;
public class Examen_1_Eva_Esther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int i=0,j=0;
		int opcion=0;
		int filas=3,columnas=7;
		int alumnos=7,trimestre=3;
		int numeroAlumno=0;
		double alumno_buscar=0,alumno=0;
		int sumaAlumno=0,sumaTotal=0;
		double mediaAlumnos=0,mediaAlumno=0;
		int notas[][]=new int [3][7];

		//mostrar notas
		for(i=0;i<trimestre;i++) {
			for(j=0;j<alumnos;j++) {
				notas[i][j]=(int)(Math.random()*10+1);
				System.out.print(notas[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("MENU");
		System.out.println("1.Notas de los alumnos");
		System.out.println("2.Media de un alumno");
		System.out.println("3.Media de los alumnos");
		System.out.println("4.Salir");
		//menu
		do {
			System.out.println("Inserte opcion");
			opcion=teclado.nextInt();
			switch(opcion){
				case 1:
					System.out.println("mostramos las notas de los alumnos");
					for(i=0;i<trimestre;i++) {
						for(j=0;j<alumnos;j++) {
						notas[i][j]=(int)(Math.random()*10+1);
						System.out.print(notas[i][j]+"\t");
						}
						System.out.println();	
					}
					
				break;
				case 2 :
					System.out.println("calcularemos la media del alumno");
					for(i=0;i<trimestre;i++) {
						for(j=0;j<alumnos;j++) {
						System.out.print(notas[i][j]+"\t");
						
						}
						System.out.println();
						
					}
					//alumno=mediaAlumno(numeroAlumno,notas);
				break;
				case 3:
					System.out.println("calcularemos las medias de los alumnos");
					//Hago la suma de las columnas, con este resultado, calculo en el
					//procedimiento la media total de la columna
					for(i=0;i<alumnos;i++) {
						sumaAlumno=0;
						for(j=0;j<trimestre;j++) {
							sumaAlumno=sumaAlumno+notas[j][i];
							System.out.print(notas[j][i]+"\t");
						}
						System.out.println(sumaAlumno+" \t");
						mediaAlumnos(notas,sumaAlumno);
					}
					
					
					
					break;
				case 4:
					System.out.println("Salir");
			}
		}while(opcion!=4);
	}

	public static void mediaAlumnos(int notas[][],int sumaAlumno) {
	
		double media=sumaAlumno/3;
		System.out.println("La media del  alumno es de:  " + media );
	}
	
	public static double mediaAlumno(int numeroAlumno,int notas[][]) {
		int alumno=0,i=0,j=0,trimestre=0,alumnos=0;
		for(i=0;i<trimestre;i++) {
			for(j=0;j<alumnos;j++) {
			System.out.print(notas[i][j]+"\t");
			
			}
			System.out.println();
		}
		alumno=numeroAlumno;
		
		while (alumno<notas.length&&notas[i][j]!=alumno) {
			i++;
			j++;
		}
		if(i<notas.length&&j<notas.length&&notas[i][j]!=alumno) {
			System.out.println("el numero "+alumno+" esta en posicion "+i+j);		
		}else {
			System.out.println("Nos hemos ido de rango");
		}
		
		return alumno;
	}
}