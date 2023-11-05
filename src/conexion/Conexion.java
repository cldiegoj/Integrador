package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ediso
 */
public class Conexion {

    //conexion local
public static Connection conectar() {
    try {
        // Desactivar SSL agregando useSSL=false a la URL
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_biker_utp?useSSL=false", "root", "repoio2611");
        return cn;
    } catch (SQLException e) {
        System.out.println("Error en la conexion local " + e);
    }
    return null;
}

}
