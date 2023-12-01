/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDAO;

import ConexionSQL.Conectar;
import Modelo.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author djcor
 */
public class IngredienteDAO {

    public boolean guardar(Ingrediente objeto) {
        boolean respuesta = false;
        Connection cn = Conectar.getConexion();
        try {

            PreparedStatement consulta = cn.prepareStatement("INSERT INTO ingredientes (prod_cod, ins_cod, ing_can) VALUES (?, ?, ?);");
            consulta.setInt(1, objeto.getIdProducto());
            consulta.setInt(2, objeto.getIdInsumo());
            consulta.setInt(3, objeto.getCantidad());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar producto: " + e);
        }

        return respuesta;
    }

    public int buscaridproducto(String nom) {
        Connection cn = Conectar.getConexion();
        String sql = "select prod_cod, prod_nom from producto where prod_nom = ?";
        int a = 0;
        try {
            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, nom);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                a = rs.getInt(1);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return a;
    }

    public int buscaridinsumo(String nom) {
        Connection cn = Conectar.getConexion();
        String sql = "select ins_cod, ins_nom from insumos where ins_nom= ?";
        int a = 0;
        try {
            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, nom);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                a = rs.getInt(1);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return a;
    }

    public List<Ingrediente> lista() {
        Connection cn = Conectar.getConexion();
        String sql = "select i.prod_cod, p.prod_nom, i.ins_cod, s.ins_nom, i.ing_can from ingredientes i inner JOIN producto p on i.prod_cod= p.prod_cod INNER JOIN insumos s on s.ins_cod=i.ins_cod";
        List<Ingrediente> lista = new ArrayList();
        try {
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Ingrediente b = new Ingrediente();
                b.setIdProducto(rs.getInt(1));
                b.setNombreproducto(rs.getString(2));
                b.setIdInsumo(rs.getInt(3));
                b.setNombreinsumo(rs.getString(4));
                b.setCantidad(rs.getInt(5));
                lista.add(b);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return lista;

    }
}
