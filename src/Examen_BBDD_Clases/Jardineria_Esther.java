package Examen_BBDD_Clases;

import java.sql.*;
import java.util.*;
import java.util.Scanner;




public class Jardineria_Esther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conexion cn = new Conexion();
		String sql;
			
			Scanner teclado = new Scanner (System.in);
			int opcion;
			do {
				System.out.println("Menu: ");
				System.out.println("1.Consultar las oficinas que tenemos en España ");
				System.out.println("2.Modificar en oficinas para que esean ahora Estados Unidos");
				System.out.println("3.Mostara clientes segun la ciudad elegida por el usuario");
				System.out.println("4.Salir");
				System.out.print("Introduzca la opcion elegida: ");
				opcion=teclado.nextInt();
				switch (opcion) {
				
				case 1:{
					
					
					try {
						sql = "select * from oficinas WHERE oficinas.Pais =?";
						PreparedStatement sentencia= cn.conector.prepareStatement (sql);
						
						String pais="España";
						sentencia.setString (1, "España");
					
					
						 ResultSet rs= sentencia.executeQuery();
						 while (rs.next()) {
								for (int i=1;i<=rs.getMetaData().getColumnCount();i++) {
									System.out.print(rs.getString(i)+"\t");
								}
						 }	
							System.out.println(" ");
						
					}catch (Exception e) {
						System.out.println("error");
						e.printStackTrace();
					}
					
					
					
					break;
				}
				
					
				case 2:{
						
					sql="UPDATE oficinas SET Pais = 'ESTADOS UNIDOS' WHERE oficinas.Pais = 'EEUU'";

					
					try {
						
						Statement st = cn.conector.createStatement();
						if(st.executeUpdate(sql)==1) {
							System.out.println("la consulta se ha realizado con éxito");
						}
						st.close();
					}catch (Exception e) {
						System.out.println("noConecta");
						e.printStackTrace();
					}
				
					String sql1="SELECT * FROM OFICINAS";
					Conexion.Select(sql1);
					break;
				}
				
				
				case 3:{
					System.out.println("Que ciudad va a consultar?");
					teclado.nextLine();
					String ciudadUsuario = teclado.nextLine();
					System.out.println("Usted ha introducido la ciudad....."+ciudadUsuario+"  ");
					
					
					try {
						 PreparedStatement sentencia= cn.conector.prepareStatement
								 ("Select * from clientes where clientes.Ciudad=? ");
						 sentencia.setString(1, "ciudadUsuario");
						
						 ResultSet rs= sentencia.executeQuery();
						
						 while (rs.next()) {
								for (int i=1;i<=rs.getMetaData().getColumnCount();i++) {
									System.out.print(rs.getString(i)+"\t");
								}
						 }	
						System.out.println(" ");
					
				}catch(Exception e) {
					System.out.println("No conecta");
					e.printStackTrace();
				}
			
					
				break;
				}
				
				
				case 4:{
					try {
						cn.conector.close();
					}catch (Exception e) {
						e.printStackTrace();
					}
				break;
				}
				
				default: {
					System.out.println("Opcion no valida.Pruebe otra vez");
				}
				}
			}while(opcion!=4);
			
		
	}


}
