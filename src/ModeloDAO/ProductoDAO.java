package ModeloDAO;

import ConexionSQL.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Modelo.Producto;


public class ProductoDAO {
     /**
     * **************************************************
     * metodo para guardar un nuevo producto
     * **************************************************
     
    public boolean guardar(Producto objeto) {
        boolean respuesta = false;
        Connection cn = ConexionSQL.Conectar.getConexion();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into PRODUCTOS values(?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setString(2, objeto.getNombre());
            consulta.setInt(3, objeto.getStock());
            consulta.setDouble(4, objeto.getPrecio());
            consulta.setString(5, objeto.getDescripcion());
            consulta.setInt(6, objeto.getStock());
            consulta.setString(7, objeto.getDescripcion());
            consulta.setInt(8, objeto.getStock());
            

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar producto: " + e);
        }

        return respuesta;
    }

    /**
     * ********************************************************************
     * metodo para consultar si el producto ya esta registrado en la BBDD
     * ********************************************************************
     */
    /**
    public boolean existeProducto(String producto) {
        
        boolean respuesta = false;
        String sql = "select NOM_PRODUC from PRODUCTOS where NOM_PRODUC = '" + producto + "';";
        Statement st;

        try {
            Connection cn = ConexionSQL.Conectar.getConexion();
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
    
     /**
     * **************************************************
     * metodo para actualizar un producto
     * **************************************************
     */
    /**
    public boolean actualizar(Producto objeto, int idProducto) {
        /**
    
        boolean respuesta = false;
        Connection cn = ConexionSQL.Conectar.getConexion();
        try {

            PreparedStatement consulta = cn.prepareStatement("update PRODUCTOS set NOM_PRODUC=?, CANTIDAD = ?, PRECIO = ?, DESCRIPCION= ?, IGV = ?, ESTADO = ?, categorias_ID_CATEGORIA = ?  where ID_PRODUCTO ='" + idProducto + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setInt(2, objeto.getStock());
            consulta.setDouble(3, objeto.getPrecio());
            consulta.setString(4, objeto.getDescripcion());
            consulta.setInt(5, objeto.getStock());
            consulta.setString(6, objeto.getDescripcion());
            consulta.setInt(7, objeto.getStock());
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar producto: " + e);
        }
        
        return respuesta;
    }
    */
    
        
    /**
     * **************************************************
     * metodo para eliminar un producto
     * **************************************************
     */
    /**
    public boolean eliminar(int idProducto) {
        /**
        boolean respuesta = false;
        Connection cn = ConexionSQL.Conectar.getConexion();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from PRODUCTOS where ID_PRODUCTO ='" + idProducto + "'");
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
    */
    
    
    /**
     * **************************************************
     * metodo para actualizar stock un producto
     * **************************************************
     */
    
    
    /**
     public boolean actualizarStock(Producto object, int idProducto) {
         
     }
        boolean respuesta = false;
        Connection cn = ConexionSQL.Conectar.getConexion();
        try {
            PreparedStatement consulta = cn.prepareStatement("update PRODUCTOS set CANTIDAD=? where ID_PRODUCTO ='" + idProducto + "'");
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
    */
}
