package Examen_2EvaluacionCorregido;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_9Abril {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		String ruta= "c:\\archivos\\original.txt";
		File original =new File(ruta);
		String ruta1="c:\\archivos\\copia.txt";
		File copia =new File(ruta1);
		
		if(original.exists()) {
			try {
				BufferedReader fi = new BufferedReader (new FileReader(original));
				BufferedWriter f=new BufferedWriter (new FileWriter(copia));

				String caracter=fi.readLine();
				f.write("sobreescribo: "+caracter);
				f.newLine();
				
				while (caracter!=null) { 
					System.out.println(caracter);
					caracter=fi.readLine();
					f.write(" "+caracter);
					f.newLine();
				}
					
				
				fi.close();
				f.close();
				}catch(IOException ex) {
					System.out.println("el archivo no se puede abrir");
				}
			
		}
		
		
	}

}
