package Examen_2EvaluacionCorregido;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class UsoMain {

	private static Scanner teclado;

	public static void main(String[] args) {
		int opcion;
		teclado = new Scanner (System.in);
		System.out.println("1. Crear objetos en un array de 5 posiciones de trabajadores, y estudiantes");
		
		Estudiante arrayE[]=new Estudiante[5];
		arrayE[0]=new Intercambio ("Nicolas", "calle su casa", 25, "99888777-W", "Italia", 2);
		arrayE[1]=new Intercambio ("Pierre ", "calle su casa", 25, "33444555-F", "Francia", 2);
		arrayE[2]=new Estudiante("Jorge ", "calle su casa", 20, "44555666-F", 4);
		arrayE[3]=new Estudiante("Esther Lainez", "calle su casa", 37, "66777888-R", 4);
		arrayE[4]=new Estudiante("Coral Guillot", "calle su casa", 20, "22333444-E", 4);
		
		
		Trabajador arrayT[]=new Trabajador[5];
		arrayT[0]=new Profesor ("Paqui Garcia", "calle su casa","SS123", "Informatica de gestión", "Profesor", 10);
		arrayT[1]=new Personal ("Alberto ", "calle su casa","SS123", "Jefe Estudios", 8);
		arrayT[2]=new Profesor("Anotnio ", "calle su casa", "SS123","Sistemas", "Profesor", 10);
		arrayT[3]=new Personal("Tomas", "calle su casa", "SS123", "Administrativo", 8);
		arrayT[4]=new Profesor ("maria", "calle su casa","SS123", "Sistemas", "Profesor", 10);
		
			
		do {						
			System.out.println("MENU");
			System.out.println("1. Calcular las horas de trabajo en total de trabajadores y estudiantes");
			System.out.println("2. Mostrar los estudiantes ordenados por nombre");
			System.out.println("3. Mostrar todos los estudiantes ordenados por edad");
			System.out.println("4. Salir");
			System.out.println("Introduzca la opcion: ");
			opcion=teclado.nextInt();
			switch (opcion) {
			
			case 1: {
				double contador=0;
				for (Estudiante e: arrayE) {
					System.out.println("El estudiante "+e.getNombre()+" trabaja "+e.getHorasAlAnio());
					contador=contador+e.getHorasAlAnio();
				}
				System.out.println("El total de estudiantes suma: "+contador+"\n\n");
				
				contador=0;
				for (Trabajador e: arrayT) {
					System.out.println("El Trabajador "+e.getNombre()+" trabaja "+e.getHorasAlAnio());
					contador=contador+e.getHorasAlAnio();
				}
				System.out.println("El total de trabajadores suma: "+contador);
				
				break;
			}
			case 2: {
				Arrays.sort(arrayE);
				for (Estudiante e: arrayE) {
					System.out.println(e.toString());
				}
				
				
				
				break;
			}
			
			case 3: {
				Arrays.sort(arrayE, new Comparator () {
					public int compare (Object o1, Object o2) {
						Estudiante c1=(Estudiante)o1;
						Estudiante c2=(Estudiante)o2;
						if (c1.getEdad()<c2.getEdad())return -1;
						if (c1.getEdad()>c2.getEdad())return 1;
						return 0;
						
					}
				}
			);
				System.out.println(" Por nombres: "+Arrays.toString(arrayE));
				
				break;
			}
			
		default:{
				
				break;
			}
			}
			
		}while (opcion!=4);

	}

}
