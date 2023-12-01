/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDAO;

import ConexionSQL.Conectar;
import Modelo.Insumos;
import Modelo.Producto;
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
public class InsumoDAO {
    public boolean guardar(Insumos objeto) {
        boolean respuesta = false;
        Connection cn = Conectar.getConexion();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into insumos values(null,?,?,?,?)");
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getDescripcion());
            consulta.setInt(3, objeto.getStock());
            consulta.setInt(4, objeto.getIdProveedor());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar producto: " + e);
        }

        return respuesta;
    }

    public boolean existeProducto(String insumo) {

        boolean respuesta = false;
        String sql = "select ins_nom from insumos where ins_nom= '" + insumo + "';";
        Statement st;

        try {
            Connection cn = Conectar.getConexion();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar producto: " + e);
        }
        return respuesta;
    }

    public boolean actualizar(Insumos objeto, int idInsumo) {

        boolean respuesta = false;
        Connection cn = Conectar.getConexion();
        try {

            PreparedStatement consulta = cn.prepareStatement("update insumos set ins_nom=?, ins_des= ?, ins_stk= ?, pro_cod= ? where ins_cod='" + idInsumo + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getDescripcion());
            consulta.setInt(3, objeto.getStock());
            consulta.setInt(4, objeto.getIdProveedor());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar producto: " + e);
        }

        return respuesta;
    }

    public boolean eliminar(int idInsumo) {

        boolean respuesta = false;
        Connection cn = Conectar.getConexion();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from insumos where ins_cod='" + idInsumo + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar producto: " + e);
        }

        return respuesta;

    }

    public boolean actualizarStock(Insumos object, int idInsumo) {

        boolean respuesta = false;
        Connection cn = Conectar.getConexion();
        try {
            PreparedStatement consulta = cn.prepareStatement("update insumos set ins_stk=? where ins_cod='" + idInsumo + "'");
            consulta.setInt(1, object.getStock());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar stock del producto: " + e);
        }
        return respuesta;
    }

    public List<Insumos> lista() {
        Connection cn = Conectar.getConexion();
        String sql = "select p.ins_cod, p.ins_nom, p.ins_des, p.ins_stk, c.pro_nom from insumos As p, proveedor As c where p.pro_cod= c.pro_cod";
        List<Insumos> lista = new ArrayList();
        try {
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Insumos b = new Insumos();
                b.setIdInsumos(rs.getInt(1));
                b.setNombre(rs.getString(2));
                b.setDescripcion(rs.getString(3));
                b.setStock(rs.getInt(4));
                b.setNombreproveedor(rs.getString(5));
                lista.add(b);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return lista;

    }
}
