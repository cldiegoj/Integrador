package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Producto_Alq;

/**
 *
 * @author Edison Zambrano - © Programador Fantasma
 */
public class Ctrl_Producto_Alq {
     /**
     * **************************************************
     * metodo para guardar un nuevo producto
     * **************************************************
     */
    public boolean guardar(Producto_Alq objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into PRODUCTOS_ALQ values(?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setString(2, objeto.getNom_produc());
            consulta.setDouble(3, objeto.getPrecio_por_dia());
            consulta.setInt(4, objeto.getStock());

            

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar producto alquilado: " + e);
        }

        return respuesta;
    }

    /**
     * ********************************************************************
     * metodo para consultar si el producto ya esta registrado en la BBDD
     * ********************************************************************
     */
    public boolean existeProducto(String producto) {
        boolean respuesta = false;
        String sql = "select NOM_PRODUC from PRODUCTOS_ALQ where NOM_PRODUC = '" + producto + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar producto alquilado: " + e);
        }
        return respuesta;
    }
    
     /**
     * **************************************************
     * metodo para actualizar un producto
     * **************************************************
     */
    public boolean actualizar(Producto_Alq objeto, int idProducto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update PRODUCTOS_ALQ set NOM_PRODUC = ?, PRECIO_POR_DIA = ?, STOCK = ?  where ID_PRODUCTO ='" + idProducto + "'");
            consulta.setString(1, objeto.getNom_produc());
             consulta.setDouble(2, objeto.getPrecio_por_dia());
            consulta.setInt(3, objeto.getStock());
            
            
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar producto alquilado: " + e);
        }
        return respuesta;
    }
    
    
    /**
     * **************************************************
     * metodo para eliminar un producto
     * **************************************************
     */
    public boolean eliminar(int idProducto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from PRODUCTOS_ALQ where ID_PRODUCTO ='" + idProducto + "'");
            consulta.executeUpdate();
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar producto alquilado: " + e);
        }
        return respuesta;
    }
    
    /**
     * **************************************************
     * metodo para actualizar stock un producto
     * **************************************************
     */
    
     public boolean actualizarStock(Producto_Alq object, int idProducto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update PRODUCTOS_ALQ set STOCK=? where ID_PRODUCTO ='" + idProducto + "'");
            consulta.setInt(1, object.getStock());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar stock del producto alquilado: " + e);
        }
        return respuesta;
    }
}
