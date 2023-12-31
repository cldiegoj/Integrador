/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDAO;

import ConexionSQL.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Modelo.*;

/**
 *
 * @author kevfe
 */
public class UsuarioDAO {
   
    public boolean guardarUsuario(Usuario objeto) {
        boolean respuesta = false;
        Connection cn = Conectar.getConexion();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into USUARIO values(?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setString(2, objeto.getUsr_name());
            consulta.setString(3, objeto.getUsr_pass());
            consulta.setString(4, objeto.getUsr_nom());
            consulta.setString(5, objeto.getUsr_ape());
            consulta.setString(6, objeto.getUsr_telf());
            consulta.setInt(7, objeto.getUsr_status());
            consulta.setInt(8, objeto.getCar_cod());
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar usuario: " + e);
        }
        return respuesta;
    }

    /**
     * ********************************************************************
     * metodo para consultar si el producto ya esta registrado en la BBDD
     * ********************************************************************
     */
    public boolean existeUsuario(String usuario) {
        boolean respuesta = false;
        String sql = "select usr_name from USUARIO where usr_name = '" + usuario + "';";
        Statement st;
        try {
            Connection cn = Conectar.getConexion();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar usuario: " + e);
        }
        return respuesta;
    }

    /**
     * **************************************************
     * metodo para Iniciar Sesion
     * **************************************************
     */
    public boolean loginUser(Usuario objeto) {
        boolean respuesta = false;
        Connection cn = Conectar.getConexion();
        String sql = "select  usr_name, usr_pass from USUARIO where usr_name = '" + objeto.getUsr_name()+ "' and usr_pass = '" + objeto.getUsr_pass()+ "'";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al Iniciar Sesion");
            JOptionPane.showMessageDialog(null, "Error al Iniciar Sesion");
        }
        return respuesta;
    }
    
    /**
     * **************************************************
     * metodo para actualizar un usuario
     * **************************************************
     */
    public boolean actualizar(Usuario objeto, int idUsuario) {
        boolean respuesta = false;
        Connection cn = Conectar.getConexion();
        try {

            PreparedStatement consulta = cn.prepareStatement("update USUARIO set usr_name = ?, usr_pass = ?, usr_nom = ?, usr_ape = ?, usr_telf = ?, usr_status = ?, car_cod = ? where usr_cod ='" + idUsuario + "'");
            consulta.setString(1, objeto.getUsr_name());
            consulta.setString(2, objeto.getUsr_pass());
            consulta.setString(3, objeto.getUsr_nom());
            consulta.setString(4, objeto.getUsr_ape());
            consulta.setString(5, objeto.getUsr_telf());
            consulta.setInt(6, objeto.getUsr_status());
            consulta.setInt(7, objeto.getCar_cod());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar usuario: " + e);
        }
        return respuesta;
    }

    /**
     * **************************************************
     * metodo para eliminar un usuario
     * **************************************************
     */
    public boolean eliminar(int idUsuario) {
        boolean respuesta = false;
        Connection cn = Conectar.getConexion();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from USUARIO where usr_cod ='" + idUsuario + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar usuario: " + e);
        }
        return respuesta;
    }
}
