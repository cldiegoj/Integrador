/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class metodos {
     public static boolean registrarUsuario(Usuario x) {

        Connection con = ConexionSQL.Conectar.getConexion();
        PreparedStatement ps = null;
        
        String sql = "insert into usuario (usu_dni, usu_nom, usu_correo, usu_contra, usu_tipo) values (?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,x.getUsu_dni());
            ps.setString(2,x.getUsu_nombre());
            ps.setString(3,x.getUsu_correo());
            ps.setString(4,x.getUsu_contra());
            ps.setString(5,x.getUsu_tipo());
            ps.execute();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    return false;
    }
    
    public static boolean Atenticacion(String nombre, String contra){
        Connection con = ConexionSQL.Conectar.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String sql = "select * from usuario where usu_nom=? and usu_contra=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, contra);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                con.close();
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        
        }
       return false;
    }
}
