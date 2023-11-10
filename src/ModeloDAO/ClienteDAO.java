package ModeloDAO;

import ConexionSQL.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Modelo.Cliente;


public class ClienteDAO {
 
    public boolean guardar(Cliente objeto) {
        boolean respuesta = false;
        Connection cn = ConexionSQL.Conectar.getConexion();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into CLIENTES values(?,?,?,?,?,?)");
            consulta.setString(1, objeto.getIdCliente());//id
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getApellido());
            consulta.setInt(4, objeto.getTelefono());
            consulta.setString(5, objeto.getDireccion());
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
 
    public boolean existeCliente(String idcliente) {
        boolean respuesta = false;
        String sql = "select ID_CLIENTE from CLIENTES where ID_CLIENTE = '" + idcliente + "';";
        Statement st;
        try {
            Connection cn = ConexionSQL.Conectar.getConexion();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar cliente: " + e);
        }
        return respuesta;
    }
  
    public boolean actualizar(Cliente objeto, int idCliente) {
        boolean respuesta = false;
        Connection cn = ConexionSQL.Conectar.getConexion();
        try {

            PreparedStatement consulta = cn.prepareStatement("update CLIENTES set NOMBRES = ?, APELLIDOS = ?, DNI = ?, TELEFONO= ?, DIRECCION = ?, ESTADO = ? where ID_CLIENTE ='" + idCliente + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getApellido());
            consulta.setString(3, objeto.getApellido());
            consulta.setString(4, objeto.getApellido());
            consulta.setString(5, objeto.getDireccion());
            consulta.setString(6, objeto.getApellido());

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
        Connection cn = ConexionSQL.Conectar.getConexion();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from CLIENTES where ID_CLIENTE ='" + idCliente + "'");
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
