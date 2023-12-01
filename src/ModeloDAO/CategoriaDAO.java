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
    
    // Verificar si la descripción ya existe
    if (!existeDescripcionCategoria(objeto.getCat_des())) {
        try {
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO CATEGORIA VALUES(?,?,?)");
            consulta.setString(1, null);
            consulta.setString(2, objeto.getCat_nom());
            consulta.setString(3, objeto.getCat_des());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar categoría: " + e);
        }
    } else {
        System.out.println("Ya existe una categoría con la misma descripción.");
    }
    return respuesta;
}

private boolean existeDescripcionCategoria(String descripcion) {
    boolean respuesta = false;
    String sql = "SELECT cat_des FROM CATEGORIA WHERE cat_des = ?";
    
    try (Connection cn = Conectar.getConexion();
         PreparedStatement consulta = cn.prepareStatement(sql)) {
        consulta.setString(1, descripcion);
        ResultSet rs = consulta.executeQuery();
        respuesta = rs.next();
    } catch (SQLException e) {
        System.out.println("Error al consultar descripción de categoría: " + e);
    }
    
    return respuesta;
}

public boolean actualizarCategoria(Categoria categoria) {
    boolean respuesta = false;
    Connection cn = Conectar.getConexion();
    try {
        PreparedStatement consulta = cn.prepareStatement(
                "UPDATE CATEGORIA SET cat_nom = ?, cat_des = ? WHERE cat_cod = ?");
        consulta.setString(1, categoria.getCat_nom());
        consulta.setString(2, categoria.getCat_des());
        consulta.setInt(3, categoria.getCat_cod());

        if (consulta.executeUpdate() > 0) {
            respuesta = true;
        }
        cn.close();
    } catch (SQLException e) {
        System.out.println("Error al actualizar categoría: " + e);
    }
    return respuesta;
}

    public boolean eliminarCategoria(String codigoCategoria) {
        boolean respuesta = false;
        Connection cn = Conectar.getConexion();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "DELETE FROM CATEGORIA WHERE cat_cod ='" + codigoCategoria + "'");
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
    
    
