package Examen_BBDD_Clases;

import java.io.*;
import java.sql.*;
import java.util.*;

public class Conexion {
	 String servidor;
	 String usuario;
	 String password;
	static Connection conector;
		
	

	public Conexion() {
	
		try {
			try {
				
				Properties propiedades = new Properties ();
				
				propiedades.load(new FileInputStream
						//seria la ruta correcta con mi equipo.....
						("C:/Users/IFC/eclipse-workspace/EX12_EstherLainez/src/propiedades/properties"));
				this.servidor = propiedades.getProperty("dataBaseServer");
				this.usuario = propiedades.getProperty("dataBaseUser");
				this.password = propiedades.getProperty("dataBasePassword");
				
						 					
			}catch (FileNotFoundException e) {
				 System.out.println("Error, El archivo no exiSte");
			} catch (IOException e) {
				 System.out.println("Error, No se puede leer el archivo");
			}
			
			
			conector= DriverManager.getConnection(servidor, usuario, password);
			
			
			
		}catch (Exception e) {
			System.out.println("noConecta");
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	public static void Select (String sql) {
		try {
			Statement miStatement = conector.createStatement();
			ResultSet rs = miStatement.executeQuery(sql);
			
			while (rs.next()) {
				for (int i=1;i<=rs.getMetaData().getColumnCount();i++) {
					System.out.print(rs.getString(i)+"\t");
				}
				
				System.out.println("");
			
			}
			miStatement.close();
		}catch (Exception e) {
			System.out.println("noConecta");
			e.printStackTrace();
		}
	}
	

	

		
	}





