
package ModeloDAO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Modelo.Usuario;
import vista.FrmMenu;
import vista.Login;
import vista.Registro;

public class UsuarioDAO implements ActionListener {
    //metodos m = new metodos();
    Usuario usuario = new Usuario();
    Login log = new Login();
    Registro reg = new Registro();
    
    public UsuarioDAO(Registro reg, Login log, Usuario u){
        this.reg = reg;
        this.log = log;
        this.usuario = u;
        
        this.reg.btnRegistrar.addActionListener(this);
        this.log.btnEntrar.addActionListener(this);
    }
    
    
    public void Registrar(){
//        usuario.setUsu_nombre(reg.txt_nombre.getText());
//        usuario.setUsu_dni(reg.txt_dni.getText());
//        usuario.setUsu_correo(reg.txt_correo.getText());
//        usuario.setUsu_tipo((String)(reg.cbx_rol.getSelectedItem()));
//        usuario.setUsu_contra(reg.txt_pwd.getText());
//        
//        if (m.registrarUsuario(usuario)) {
//            JOptionPane.showMessageDialog(null,"Usuario registrado");
//        }else{
//            JOptionPane.showMessageDialog(null,"Usuario registrado");
//        
//        }
    }
    
    public void Ingresar(){
//        String nombre = log.txtUsuario.getText();
//        String contra = log.pwdContra.getText();
//        
//        if (m.Atenticacion(nombre, contra)) {
//            System.out.println("entrooo");
//            JOptionPane.showMessageDialog(null, "Bienvenido");
//            FrmMenu menu = new FrmMenu();
//            menu.setVisible(true);
//            Login log = new Login();
//            log.dispose();
//        }else{
//            JOptionPane.showMessageDialog(null, "Datos incorrectos");
//        }
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == reg.btnPrueba) {
//            Registrar();
//        }
//        
//        if (e.getSource() == log.btnEntrar) {
//            Ingresar();
//        }
    }
    
   
}
