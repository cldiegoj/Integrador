package ModeloDAO;

import ConexionSQL.Conectar;
import Modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Modelo.Proveedor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Edison Zambrano - © Programador Fantasma
 */
public class ProveedorDAO {
 
    public boolean guardar(Proveedor objeto) {
        boolean respuesta = false;
        Connection cn = Conectar.getConexion();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into proveedor values(null,?,?,?)");
            consulta.setString(1, objeto.getNombre());//id
            consulta.setString(2, objeto.getDescripcion());
            consulta.setInt(3, objeto.getRuc());
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar tecnico: " + e);
        }
        return respuesta;
    }
 
    public boolean existeTecnico(String idProveedor) {
        boolean respuesta = false;
        String sql = "select pro_nom from proveedor where pro_nom= '" + idProveedor + "';";
        Statement st;
        try {
            Connection cn = Conectar.getConexion();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar tecnico: " + e);
        }
        return respuesta;
    }
  
    public boolean actualizar(Proveedor objeto, int idProveedor) {
        boolean respuesta = false;
        Connection cn = Conectar.getConexion();
        try {

            PreparedStatement consulta = cn.prepareStatement("update proveedor set pro_nom = ?, pro_des= ?, pro_ruc= ? where pro_cod='" + idProveedor + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getDescripcion());
            consulta.setInt(3, objeto.getRuc());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar proveedor: " + e);
        }
        return respuesta;
    }

    public boolean eliminar(int idProveedor) {
        boolean respuesta = false;
        Connection cn = Conectar.getConexion();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from proveedor where pro_cod='" + idProveedor + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar proveedor: " + e);
        }
        return respuesta;
    }

    
     public List<Proveedor> lista() {
        Connection cn = Conectar.getConexion();
        String sql = "select * from proveedor";
        List<Proveedor> lista = new ArrayList();
        try {
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Proveedor b = new Proveedor();
                b.setIdProveedor(rs.getInt("pro_cod"));
                b.setNombre(rs.getString("pro_nom"));
                b.setDescripcion(rs.getString("pro_des"));
                b.setRuc(rs.getInt("pro_ruc"));
                lista.add(b);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return lista;

    }
}
