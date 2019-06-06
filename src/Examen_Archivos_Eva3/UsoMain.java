package Examen_Archivos_Eva3;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;









public class UsoMain {

	private static Scanner teclado;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
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
		
		File f = new File("c:\\archivos\\ejercicioArchivos.dat");
		
		
		Estudiante s=null;
		Trabajador j=null;
		int i=0,a=0;
		if(f.exists()) {
			try {
				FileInputStream filein = new FileInputStream(f);
				ObjectInputStream objectin = new ObjectInputStream(filein);
				
				while(true){
							
					arrayE[i]=(Estudiante) objectin.readObject();
					i++;
						
					System.out.println("Estudiante "+s);
					
					arrayT[a]=(Trabajador) objectin.readObject();			
					a++;
					
					
					System.out.println("Trabajador "+j);
				}
				
			}catch(EOFException e) {
				
				System.out.println("Fin del fichero");
			}catch(IOException ex) {
				System.out.println("Algo falla"+ex.getMessage());
				
			}
			
		}else {
			arrayE[0]=new Estudiante ("Esther Lainez", "calle su casa", 37, "66777888-R", 4);
			i++;
			arrayE[1]=new Estudiante ("Jorge Rivas", "calle su casa", 37, "56789098-R", 3);
			i++;
			arrayE[2]=new Estudiante ("Javi Falces", "calle su casa", 37, "678909876-R", 2);
			i++;
			
			arrayT[0]=new Trabajador ("Paqui Garcia", "calle su casa",  "Profesor", 10);
			a++;
			arrayT[1]=new Trabajador ("Antonio Gomez", "calle su casa",  "Profesor", 21);
			a++;
		}
		
		FileOutputStream fileout = new FileOutputStream(f);
		ObjectOutputStream objectout = new ObjectOutputStream(fileout);
		
		Estudiante p = null;
		Trabajador t=null;
		
		
		try {
			ObjectOutputStream stream= new ObjectOutputStream(fileout);
					for( i=0;i<arrayE.length;i++) {
						objectout.writeObject(p);
					}
					for( i=0;i<arrayT.length;i++) {
						objectout.writeObject(t);
					}
					
			
					if (stream != null){
						stream.close () ;	
					}
					
		}catch(EOFException e) {
				System.out.println("Fin del fichero");
		}catch(IOException ex) {
				System.out.println("Algo ha fallado");
		
		}
			
		
		
	
		
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
