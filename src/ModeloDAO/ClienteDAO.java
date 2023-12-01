package ModeloDAO;

import ConexionSQL.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Modelo.Cliente;
import javax.swing.JOptionPane;

public class ClienteDAO {

    public boolean guardar(Cliente objeto) {
        boolean respuesta = false;
        Connection cn = Conectar.getConexion();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into cliente values(?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getApellidos());
            consulta.setInt(4, objeto.getTelefono());
            consulta.setString(5, objeto.getDni());// en la columna cli_dir
            consulta.setString(6, objeto.getCorreo());
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar cliente: " + e);
        }
        return respuesta;
    }

    public boolean existeCliente(String dni) {
        boolean respuesta = false;
        String sql = "select cli_dni from cliente where usr_name = '" + dni + "';";
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

    public boolean actualizar(Cliente objeto, int idCliente) {
        boolean respuesta = false;
        Connection cn = Conectar.getConexion();
        try {

            PreparedStatement consulta = cn.prepareStatement("UPDATE cliente SET cli_nom = ?, cli_ape = ?, cli_tel = ?, cli_dir = ?, cli_cor = ? where cli_cod ='" + idCliente + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getApellidos());
            consulta.setInt(3, objeto.getTelefono());
            consulta.setString(4, objeto.getDni());
            consulta.setString(5, objeto.getCorreo());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar cliente: " + e);
        }
        return respuesta;

    }

    public boolean eliminar(int idCliente) {

        boolean respuesta = false;
        Connection cn = Conectar.getConexion();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from cliente where cli_cod ='" + idCliente + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar cliente: " + e);
        }
        return respuesta;

    }

}
