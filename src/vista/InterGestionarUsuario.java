package vista;

//import conexion.Conexion;
//import controlador.Ctrl_Cliente;
//import controlador.Ctrl_Usuario;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ediso
 */
public class InterGestionarUsuario extends javax.swing.JInternalFrame {

    private int idUsuario = 0;

    public InterGestionarUsuario() {
        initComponents();
        
        this.setTitle("Gestionar Usuarios");
        //Cargar tabla
//        this.CargarTablaUsuarios();

          }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_dni = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_contraseña = new javax.swing.JTextField();
        jButton_actualizar = new javax.swing.JButton();
        jButton_eliminar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cbxRol = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 198, 89));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENÚ - ADMINISTRADOR DE USUARIOS");
        jPanel2.add(jLabel1);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 30));

        jPanel3.setBackground(new java.awt.Color(252, 248, 232));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Correo electronico:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 120, -1));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Dni:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 30, -1));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombres:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 60, -1));

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Rol:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 30, -1));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Contraseña:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 80, -1));

        txt_nombre.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 280, -1));

        txt_dni.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        txt_dni.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 280, -1));

        txt_correo.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        txt_correo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 280, -1));

        txt_contraseña.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        txt_contraseña.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 280, -1));

        jButton_actualizar.setBackground(new java.awt.Color(252, 248, 232));
        jButton_actualizar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        jButton_actualizar.setForeground(new java.awt.Color(0, 0, 0));
        jButton_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/guardar-el-archivo.png"))); // NOI18N
        jButton_actualizar.setText("GUARDAR");
        jButton_actualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, null, null));
        jButton_actualizar.setContentAreaFilled(false);
        jButton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizarActionPerformed(evt);
            }
        });
        jPanel3.add(jButton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 150, 30));

        jButton_eliminar.setBackground(new java.awt.Color(252, 248, 232));
        jButton_eliminar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        jButton_eliminar.setForeground(new java.awt.Color(0, 0, 0));
        jButton_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/eliminar.png"))); // NOI18N
        jButton_eliminar.setText("ELIMINAR");
        jButton_eliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, null, null));
        jButton_eliminar.setContentAreaFilled(false);
        jButton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminarActionPerformed(evt);
            }
        });
        jPanel3.add(jButton_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 150, 30));

        btnAtras.setBackground(new java.awt.Color(252, 248, 232));
        btnAtras.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(0, 0, 0));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/volver-flecha-izquierda.png"))); // NOI18N
        btnAtras.setText("ATRÁS");
        btnAtras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, null, null));
        btnAtras.setContentAreaFilled(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel3.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 150, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 17, 590, 160));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 630, 190));

        cbxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione su rol", "Administrador", "Empleado" }));
        jPanel3.add(cbxRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 280, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 710, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarActionPerformed
        //        Usuario usuario = new Usuario();
        //        Ctrl_Usuario controlUsuario = new Ctrl_Usuario();
        //
        //        if (idUsuario == 0) {
            //            JOptionPane.showMessageDialog(null, "¡Seleccione un Usuario!");
            //        } else {
            //            if (txt_nombre.getText().isEmpty() || txt_apellido.getText().isEmpty() || txt_usuario.getText().isEmpty()
                //                    || txt_password.getText().isEmpty() || txt_telefono.getText().isEmpty()) {
                //                JOptionPane.showMessageDialog(null, "¡Completa todos los campos!");
                //
                //            } else {
                //                usuario.setNombre(txt_nombre.getText().trim());
                //                usuario.setApellido(txt_apellido.getText().trim());
                //                usuario.setUsuario(txt_usuario.getText().trim());
                //                usuario.setPassword(txt_password.getText().trim());
                //                usuario.setTelefono(txt_telefono.getText().trim());
                //                usuario.setEstado("Activo");
                //
                //                if(controlUsuario.actualizar(usuario, idUsuario)){
                    //                    JOptionPane.showMessageDialog(null, "¡Actualizacion Exitosa!");
                    //                    this.Limpiar();
                    //                    this.CargarTablaUsuarios();
                    //                    idUsuario = 0;
                    //
                    //                }else{
                    //                    JOptionPane.showMessageDialog(null, "¡Error al Actualizar usuario!");
                    //                }
                //            }
            //        }
    }//GEN-LAST:event_jButton_actualizarActionPerformed

    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed

        //        Ctrl_Usuario controlUsuario = new Ctrl_Usuario();
        //        if (idUsuario == 0) {
            //            JOptionPane.showMessageDialog(null, "¡Seleccione un usuario!");
            //        } else {
            //            if (!controlUsuario.eliminar(idUsuario)) {
                //                JOptionPane.showMessageDialog(null, "¡Usuario Eliminado!");
                //                this.CargarTablaUsuarios();
                //                this.Limpiar();
                //                idUsuario = 0;
                //            } else {
                //                JOptionPane.showMessageDialog(null, "¡Error al eliminar usuario!");
                //                this.Limpiar();
                //            }
            //        }
    }//GEN-LAST:event_jButton_eliminarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    public javax.swing.JComboBox<String> cbxRol;
    private javax.swing.JButton jButton_actualizar;
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JTextField txt_contraseña;
    public javax.swing.JTextField txt_correo;
    public javax.swing.JTextField txt_dni;
    public javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables

    /*
     * *****************************************************
     * metodo para limpiar
     * *****************************************************
     */
    private void Limpiar() {
        txt_nombre.setText("");
    }


    /*
     * *****************************************************
     * metodo para mostrar todos los clientes registrados
     * *****************************************************
     */
//    private void CargarTablaUsuarios() {
//        Connection con = Conexion.conectar();
//        DefaultTableModel model = new DefaultTableModel();
//        String sql = "select * from USUARIOS";
//        Statement st;
//        try {
//            st = con.createStatement();
//            ResultSet rs = st.executeQuery(sql);
//            InterGestionarUsuario.jTable_usuarios = new JTable(model);
//            InterGestionarUsuario.jScrollPane1.setViewportView(InterGestionarUsuario.jTable_usuarios);
//
//            model.addColumn("N°");//ID
//            model.addColumn("NOMBRES");
//            model.addColumn("APELLIDOS");
//            model.addColumn("USUARIOS");
//            model.addColumn("PASSWORD");
//            model.addColumn("TELEFONO");
//            model.addColumn("ESTADO");
//
//            while (rs.next()) {
//                Object fila[] = new Object[7];
//                for (int i = 0; i < 7; i++) {
//                    fila[i] = rs.getObject(i + 1);
//                }
//                model.addRow(fila);
//            }
//            con.close();
//        } catch (SQLException e) {
//            System.out.println("Error al llenar la tabla usuarios: " + e);
//        }
//        //evento para obtener campo al cual el usuario da click
//        //y obtener la interfaz que mostrara la informacion general
//        jTable_usuarios.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                int fila_point = jTable_usuarios.rowAtPoint(e.getPoint());
//                int columna_point = 0;
//
//                if (fila_point > -1) {
//                    idUsuario = (int) model.getValueAt(fila_point, columna_point);
//                    EnviarDatosUsuarioSeleccionado(idUsuario);//metodo
//                }
//            }
//        });
//    }


    /*
     * **************************************************
     * Metodo que envia datos seleccionados
     * **************************************************
     */
//    private void EnviarDatosUsuarioSeleccionado(int idUsuario) {
//        try {
//            Connection con = Conexion.conectar();
//            PreparedStatement pst = con.prepareStatement(
//                    "select * from USUARIOS where ID_USUARIO = '" + idUsuario + "'");
//            ResultSet rs = pst.executeQuery();
//            if (rs.next()) {
//                txt_nombre.setText(rs.getString("NOMBRES"));
//                txt_apellido.setText(rs.getString("APELLIDOS"));
//                txt_usuario.setText(rs.getString("USUARIOS"));
//                txt_password.setText(rs.getString("PASSWORD"));
//                txt_telefono.setText(rs.getString("TELEFONO"));
//            }
//            con.close();
//        } catch (SQLException e) {
//            System.out.println("Error al seleccionar usuario: " + e);
//        }
//    }

}
