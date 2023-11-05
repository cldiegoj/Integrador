package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Tecnicos;

/**
 *
 * @author Edison Zambrano - © Programador Fantasma
 */
public class Ctrl_Tecnicos {
 
    public boolean guardar(Tecnicos objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into TECNICOS values(?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getApellido());
            consulta.setString(4, objeto.getDNI());
            consulta.setString(5, objeto.getFech_tec());
            consulta.setString(6, objeto.getDireccion());
            consulta.setString(7, objeto.getTelefono());
            consulta.setString(8, objeto.getEstado());
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar tecnico: " + e);
        }
        return respuesta;
    }
 
    public boolean existeTecnico(String idTecnico) {
        boolean respuesta = false;
        String sql = "select ID_TECNICO from TECNICOS where ID_TECNICO = '" + idTecnico + "';";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
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
  
    public boolean actualizar(Tecnicos objeto, int idTecnico) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update TECNICOS set NOM_TEC = ?, APE_TEC = ?, DNI = ?,FECH_TEC = ?, DIREC_TEC = ?, TELEFONO = ?, ESTADO = ? where ID_TECNICO ='" + idTecnico + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getApellido());
            consulta.setString(3, objeto.getDNI());
            consulta.setString(4, objeto.getFech_tec());
            consulta.setString(5, objeto.getDireccion());
            consulta.setString(6, objeto.getTelefono());
            consulta.setString(7, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar tecnico: " + e);
        }
        return respuesta;
    }

    public boolean eliminar(int idTecnico) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from TECNICOS where ID_TECNICO ='" + idTecnico + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar tecnico: " + e);
        }
        return respuesta;
    }

}
