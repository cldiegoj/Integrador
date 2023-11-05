
package main;

import conexion.Conectar;
import controlador.usu_controlador;
import modelo.Usuario;
import vista.Registro;
import vista.Login;

public class main {

    public static void main(String[] args) {
        Conectar c = new Conectar();
        c.getConexion();
        
        Usuario u = new Usuario();
        Registro reg = new Registro();
        Login log = new Login();
        controlador.usu_controlador usu_c = new usu_controlador(reg,log, u);
        log.setVisible(true);
        
    }

}
