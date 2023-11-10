package ModeloDAO;

import ConexionSQL.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Modelo.Categoria;

/**
 *
 * @author Edison Zambrano - © Programador Fantasma
 */
public class CategoriaDAO {

    /**
     * **************************************************
     * metodo para guardar una nueva categoria
     * **************************************************
     */
    public boolean guardar(Categoria objeto) {
        boolean respuesta = false;
        Connection cn = ConexionSQL.Conectar.getConexion();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into CATEGORIAS values(?,?,?)");
            consulta.setString(1, objeto.getIdCategoria());
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getDescripcion());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar categoría: " + e);
        }

        return respuesta;
    }

    /**
     * ********************************************************************
     * metodo para consultar si la categoria registrado ya existe
     * ********************************************************************
     */
    public boolean existeCategoria(String categoria) {
        boolean respuesta = false;
        String sql = "select DESCRIPCION from CATEGORIAS where DESCRIPCION = '" + categoria + "';";
        Statement st;

        try {
            Connection cn = ConexionSQL.Conectar.getConexion();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar categoría: " + e);
        }
        return respuesta;
    }
    
     /**
     * **************************************************
     * metodo para actualizar una nueva categoria
     * **************************************************
     */
    public boolean actualizar(Categoria objeto, int idCategoria) {
        boolean respuesta = false;
        Connection cn = ConexionSQL.Conectar.getConexion();
        try {

            PreparedStatement consulta = cn.prepareStatement("update CATEGORIAS set DESCRIPCION=? where ID_CATEGORIA ='" + idCategoria + "'");
            consulta.setString(1, objeto.getDescripcion());
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al actualizar categoría: " + e);
        }

        return respuesta;
    }
    
    
    /**
     * **************************************************
     * metodo para eliminar una nueva categoria
     * **************************************************
     */
    public boolean eliminar(int idCategoria) {
        boolean respuesta = false;
        Connection cn = ConexionSQL.Conectar.getConexion();
        try {

            PreparedStatement consulta = cn.prepareStatement(
                    "delete from CATEGORIAS where ID_CATEGORIA ='" + idCategoria + "'");
            consulta.executeUpdate();
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al eliminar categoría: " + e);
        }

        return respuesta;
    }
}
