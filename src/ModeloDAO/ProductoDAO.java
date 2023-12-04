package ModeloDAO;

import ConexionSQL.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Modelo.Producto;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {

    public boolean guardar(Producto objeto) {
        boolean respuesta = false;
        Connection cn = Conectar.getConexion();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into PRODUCTO values(null,?,?,?,?,?)");
            consulta.setString(1, objeto.getProdnom());
            consulta.setString(2, objeto.getProddes());
            consulta.setDouble(3, objeto.getProdpre());
            consulta.setInt(4, objeto.getStock());
            consulta.setInt(5, objeto.getCatcod());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar producto: " + e);
        }

        return respuesta;
    }

    public boolean existeProducto(String producto) {

        boolean respuesta = false;
        String sql = "select prod_nom from PRODUCTO where prod_nom = '" + producto + "';";
        Statement st;

        try {
            Connection cn = Conectar.getConexion();
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

    public boolean actualizar(Producto objeto, int idProducto) {

        boolean respuesta = false;
        Connection cn = Conectar.getConexion();
        try {

            PreparedStatement consulta = cn.prepareStatement("update PRODUCTO set prod_nom=?, prod_des= ?, prod_pre= ?, prod_stk= ?, cat_cod= ?  where prod_cod='" + idProducto + "'");
            consulta.setString(1, objeto.getProdnom());
            consulta.setString(2, objeto.getProddes());
            consulta.setDouble(3, objeto.getProdpre());
            consulta.setInt(4, objeto.getStock());
            consulta.setInt(5, objeto.getCatcod());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar producto: " + e);
        }

        return respuesta;
    }

    public boolean eliminar(int idProducto) {

        boolean respuesta = false;
        Connection cn = Conectar.getConexion();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from PRODUCTO where prod_cod='" + idProducto + "'");
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

    public boolean actualizarStock(Producto object, int idProducto) {

        boolean respuesta = false;
        Connection cn = Conectar.getConexion();
        try {
            PreparedStatement consulta = cn.prepareStatement("update PRODUCTO set prod_stk=? where prod_cod='" + idProducto + "'");
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

    public List<Producto> lista() {
        Connection cn = Conectar.getConexion();
        String sql = "select p.prod_cod, p.prod_nom, p.prod_stk, p.prod_pre, p.prod_des, c.cat_nom from PRODUCTO As p, CATEGORIA As c where p.cat_cod= c.cat_cod";
        List<Producto> lista = new ArrayList();
        try {
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Producto b = new Producto();
                b.setProdcod(rs.getInt(1));
                b.setProdnom(rs.getString(2));
                b.setStock(rs.getInt(3));
                b.setProdpre(rs.getDouble(4));
                b.setProddes(rs.getString(5));
                b.setCategoria(rs.getString(6));
                lista.add(b);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lista;
    }
}
