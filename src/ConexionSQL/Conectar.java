/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {

    public static Connection getConexion(){ 
		Connection con = null;
		try {
                Class.forName("com.mysql.cj.jdbc.Driver"); 
		String url = "jdbc:mysql://localhost/basepasteleria"; 
		String usr = "root";
		String psw = ""; 
		con = DriverManager.getConnection(url,usr,psw); 
		System.out.println("ok");
		} catch (ClassNotFoundException ex)
		{ System.out.println("No hay Driver"); } 
		catch (SQLException ex) { System.out.println("Error con la BD"); }
		return con; 
		}
}
