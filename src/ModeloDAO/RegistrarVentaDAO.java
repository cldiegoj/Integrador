package ModeloDAO;

import ConexionSQL.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Modelo.CabeceraVenta;
import Modelo.DetalleVenta;

/**
 * @author edison
 */
public class RegistrarVentaDAO {
    
    //ultimo id de la cabecera
    public static int idCabeceraRegistrada;
    java.math.BigDecimal iDColVar;
    /**
     * **************************************************
     * metodo para guardar la cabecera de venta
     * **************************************************
     */
    public boolean guardar(CabeceraVenta objeto) {
        boolean respuesta = false;
        Connection cn = ConexionSQL.Conectar.getConexion();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into CAB_VENTAS values(?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            consulta.setInt(1, 0);//id
            consulta.setDouble(2, objeto.getValorPagar());
            consulta.setString(3, objeto.getFechaVenta());
            consulta.setInt(4, objeto.getEstado());
            consulta.setInt(5, objeto.getIdCliente());
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            
            ResultSet rs = consulta.getGeneratedKeys();
            while(rs.next()){
                iDColVar = rs.getBigDecimal(1);
                idCabeceraRegistrada = iDColVar.intValue();
            }
            
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar cabecera de venta: " + e);
        }
        return respuesta;
    }
    
     /**
     * **************************************************
     * metodo para guardar el detalle de venta
     * **************************************************
     */
    public boolean guardarDetalle(DetalleVenta objeto) {
        boolean respuesta = false;
        Connection cn = ConexionSQL.Conectar.getConexion();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into DET_VENTAS values(?,?,?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setInt(2, objeto.getCantidad());
            consulta.setDouble(3, objeto.getPrecioUnitario());
            consulta.setDouble(4, objeto.getSubTotal());
            consulta.setDouble(5, objeto.getDescuento());
            consulta.setDouble(6, objeto.getIGV());
            consulta.setDouble(7, objeto.getTotalPagar());
            consulta.setString(8, objeto.getEstado());
            consulta.setInt(9, idCabeceraRegistrada);
            consulta.setInt(10, objeto.getIdProducto());
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar detalle de venta: " + e);
        }
        return respuesta;
    }
    
    
         /**
     * **************************************************
     * metodo para actualizar un producto
     * **************************************************
     */
    public boolean actualizar(CabeceraVenta objeto, int idCabeceraVenta) {
        boolean respuesta = false;
        Connection cn = ConexionSQL.Conectar.getConexion();
        try {

            PreparedStatement consulta = cn.prepareStatement(
                    "update CAB_VENTAS set ID_CLIENTE = ?, estado = ? "
                            + "where ID_CAB_VENTA ='" + idCabeceraVenta + "'");
            consulta.setInt(1, objeto.getIdCliente());
            consulta.setInt(2, objeto.getEstado());
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar cabecera de venta: " + e);
        }
        return respuesta;
    }
}
