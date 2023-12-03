package ModeloDAO;

import ConexionSQL.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Modelo.Categoria;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class CategoriaDAO {
   
    public boolean guardarCategoria(Categoria objeto) {
    boolean respuesta = false;
    Connection cn = Conectar.getConexion();
    
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into categoria values(null,?,?)");
            consulta.setString(1, objeto.getCat_nom());
            consulta.setString(2, objeto.getCat_des());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar categoría: " + e);
        }
    
    return respuesta;
}

public boolean existeCategoria(String categoria) {
    boolean respuesta = false;
    String sql = "SELECT cat_nom FROM categoria WHERE cat_nom = '"+ categoria +"';";
    Statement st;
        
    try {
            Connection cn = Conectar.getConexion();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar categoria: " + e);
        }
        return respuesta;
}

public boolean actualizarCategoria(Categoria objeto, int idCategoria) {
    boolean respuesta = false;
    Connection cn = Conectar.getConexion();
    try {
        PreparedStatement consulta = cn.prepareStatement(
                "update categoria set cat_nom = ?, cat_des = ? where cat_cod='" + idCategoria + "'");
        consulta.setString(1, objeto.getCat_nom());
        consulta.setString(2, objeto.getCat_des());
            
        if (consulta.executeUpdate() > 0) {
            respuesta = true;
        }
        cn.close();
    } catch (SQLException e) {
        System.out.println("Error al actualizar categoría: " + e);
    }
    return respuesta;
}

    public boolean eliminarCategoria(int idCategoria) {
        boolean respuesta = false;
        Connection cn = Conectar.getConexion();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from categoria where cat_cod ='" + idCategoria + "'");
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
    
    
       public DefaultTableModel obtenerCategorias() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripción");

        Connection cn = Conectar.getConexion();

        String sql = "SELECT * FROM CATEGORIA";

        try (PreparedStatement statement = cn.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                String catCod = resultSet.getString("cat_cod");
                String catNom = resultSet.getString("cat_nom");
                String catDes = resultSet.getString("cat_des");

                Object[] fila = {catCod, catNom, catDes};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener categorías: " + e);
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e);
            }
        }

        return modelo;
    }
    
}
    
    
