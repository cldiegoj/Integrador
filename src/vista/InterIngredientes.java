package vista;

//import controlador.Ctrl_Usuario;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import Modelo.Usuario;


public class InterIngredientes extends javax.swing.JInternalFrame {
    
    public InterIngredientes() {
        initComponents();
        
        this.setTitle("Registro de ingredientes");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbxRol = new javax.swing.JComboBox<>();
        txt_nombre2 = new javax.swing.JTextField();
        cbxRol1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 198, 89));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRAR CANTIDADES ");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 30));

        jPanel2.setBackground(new java.awt.Color(252, 248, 232));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, null, null));
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 140, 30));

        btnAtras.setBackground(new java.awt.Color(255, 255, 255));
        btnAtras.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(0, 0, 0));
        btnAtras.setText("Atrás");
        btnAtras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, null, null));
        btnAtras.setContentAreaFilled(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel2.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 170, 30));

        jLabel12.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Insumo:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 60, -1));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Producto:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 70, 30));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Cantidad:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 80, -1));

        cbxRol.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        cbxRol.setForeground(new java.awt.Color(0, 0, 0));
        cbxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione ingrediente" }));
        cbxRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxRolActionPerformed(evt);
            }
        });
        jPanel2.add(cbxRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 170, 30));

        txt_nombre2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        jPanel2.add(txt_nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 100, 30));

        cbxRol1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        cbxRol1.setForeground(new java.awt.Color(0, 0, 0));
        cbxRol1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione producto" }));
        cbxRol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxRol1ActionPerformed(evt);
            }
        });
        jPanel2.add(cbxRol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 170, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 7, 610, 170));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 630, 190));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 670, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //        if (txt_nombre.getText().isEmpty() || txt_apellido.getText().isEmpty() || txt_usuario.getText().isEmpty()
            //                || txt_password.getText().isEmpty() || txt_telefono.getText().isEmpty()) {
            //            JOptionPane.showMessageDialog(null, "Completa todos los campos");
            //        } else {
            //            //validamos si el usuaro ya esta registrado
            //            Usuario usuario = new Usuario();
            //            Ctrl_Usuario controlUsuario = new Ctrl_Usuario();
            //            if (!controlUsuario.existeUsuario(txt_usuario.getText().trim())) {
                //                //enviamos datos del usuario
                //                usuario.setNombre(txt_nombre.getText().trim());
                //                usuario.setApellido(txt_apellido.getText().trim());
                //                usuario.setUsuario(txt_usuario.getText().trim());
                //                usuario.setPassword(txt_password.getText().trim());
                //                usuario.setTelefono(txt_telefono.getText().trim());
                //                usuario.setEstado("Activo");
                //
                //                if (controlUsuario.guardar(usuario)) {
                    //                    JOptionPane.showMessageDialog(null, "¡Usuario Registrado!");
                    //                } else {
                    //                    JOptionPane.showMessageDialog(null, "¡Error al registrar Usuario!");
                    //                }
                //            } else {
                //                JOptionPane.showMessageDialog(null, "El Usuario ya esta registrado, ingrese otro.");
                //            }
            //        }
        //        this.Limpiar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbxRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxRolActionPerformed

    private void cbxRol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxRol1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxRol1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JComboBox<String> cbxRol;
    public javax.swing.JComboBox<String> cbxRol1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JTextField txt_nombre2;
    // End of variables declaration//GEN-END:variables
     /**
     *
     * Metodo para limpiar campos
     */
    private void Limpiar() {
        
    }
    
}
