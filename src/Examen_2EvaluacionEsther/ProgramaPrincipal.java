package Examen_2EvaluacionEsther;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;


public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		double horasTrabajo=0,suma = 0;
		int opcion=0;
		
		Estudiante e1=new Estudiante("Lucas","Avenida de la Paz",8.5,20);
		Estudiante e2=new Estudiante("Jorge","Teresa Cajal",7.5,22);
		Estudiante e3=new Estudiante("Pablo","Avenida de Navarra",6.5,21);
		Intercambio e4 = new Intercambio("Juan","Camino Santigo",7.2, 33,"Italia");
		Intercambio e5=new Intercambio("Marcos","Avenida Zaragoza",6.2,30,"Rumania");
		Persona arrayPersona[]=new Persona[5];
		arrayPersona[0]=e1;
		arrayPersona[1]=e2;
		arrayPersona[2]=e3;
		arrayPersona[3]=e4;
		arrayPersona[4]=e5;
		
		Profesor p1=new Profesor("Edgar", "Avenida de la Paz", 10.5,"Sistemas Gestion","50102050");
		Profesor p2=new Profesor("Antonio", "Barrio Delicias", 11.5,"Acceso Datos","50102040");
		Profesor p3=new Profesor("Nuria", "Plaza Pilar", 12.5,"Ingles","50102060");
		PersonalGestion p4=new PersonalGestion("Tere", "Teresa Cajal", 11.5,"50102023","Conserjeria");
		PersonalGestion p5=new PersonalGestion("Pilar", "Calle Borja", 10.5,"50102013","Conserjeria");
		Persona arrayGestion[]=new Persona[5];
		arrayGestion[0]=p1;
		arrayGestion[1]=p2;
		arrayGestion[2]=p3;
		arrayGestion[3]=p4;
		arrayGestion[4]=p5;
		
		
		do {
			System.out.println("Menu");
			System.out.println("1.Calcular Horas");
			System.out.println("2.Mostrar estudiantes ordenados por edad");
			System.out.println("3.Mostrar estudiantes ordenados por nombre");
			System.out.println("4.Salir");
			opcion=teclado.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("1.Calcular Horas");
				for(int i=0;i<5;i++) {
					double horas=arrayGestion[i].getHoras();
					horasTrabajo=arrayGestion[i].CalcularHoras((int) horas);
					System.out.println("\nEl trabajador "+arrayGestion[i].toString()+" trabaja "+horasTrabajo+" horas en el año");
					suma=suma+horasTrabajo;
				}
				System.out.println("En total se ha llegado a sumar  "+ suma+ " en este año");
				
				break;
			case 2:
				System.out.println("2.Mostrar estudiantes ordenados por edad");
				Arrays.sort(arrayPersona, new Comparator() {
					public int compare(Object o1, Object o2) {
						Estudiante Ob1 = (Estudiante)o1;
						Estudiante Ob2 = (Estudiante)o2;
						if(Ob1.edad<Ob2.edad)return -1;
						if(Ob1.edad>Ob2.edad)return 1;
						return 0;
					
					}
				});
				System.out.println("Por edad: "+Arrays.toString(arrayPersona));
				break;
			case 3: 
				System.out.println("3.Mostrar estudiantes ordenados por nombre");
				Arrays.sort(arrayPersona, new Comparator() {
					public int compare(Object o1, Object o2) {
						Estudiante a1=(Estudiante)o1;
						Estudiante a2=(Estudiante)o2;
						return a1.nombre.compareTo(a2.nombre);
					}
				});
				
				System.out.println("Por nombre: "+Arrays.toString(arrayPersona));
				break;
			case 4:
				System.out.println("4.Salir");
				break;
				
			
			}
			
		}while(opcion!=4);
	}

}
