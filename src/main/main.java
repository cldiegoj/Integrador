
package main;

import ConexionSQL.Conectar;
import ModeloDAO.UsuarioDAO;
import Modelo.Usuario;
import vista.Registro;
import vista.Login;

public class main {

    public static void main(String[] args) {
        Conectar c = new Conectar();
        c.getConexion();
        
        Usuario u = new Usuario();
        Registro reg = new Registro();
        Login log = new Login();
        ModeloDAO.UsuarioDAO usu_c = new UsuarioDAO(reg,log, u);
        log.setVisible(true);
        
    }

}
