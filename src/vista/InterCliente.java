package vista;

import ModeloDAO.ClienteDAO;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import Modelo.Cliente;


public class InterCliente extends javax.swing.JInternalFrame {

    public InterCliente() {
        initComponents();

        this.setTitle("Nuevo Cliente - Lima Cakes");

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
        jPanel1 = new javax.swing.JPanel();
        jButton_Guardar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 198, 89));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENÚ - CLIENTES");
        jPanel2.add(jLabel1);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 30));

        jPanel1.setBackground(new java.awt.Color(252, 248, 232));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Guardar.setBackground(new java.awt.Color(252, 248, 232));
        jButton_Guardar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        jButton_Guardar.setText("GUARDAR");
        jButton_Guardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, null));
        jButton_Guardar.setContentAreaFilled(false);
        jButton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 170, 30));

        btnAtras.setBackground(new java.awt.Color(252, 248, 232));
        btnAtras.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        btnAtras.setText("ATRÁS");
        btnAtras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, null));
        btnAtras.setContentAreaFilled(false);
        btnAtras.setHideActionText(true);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 150, 30));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombres:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 60, -1));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Apellidos:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 60, -1));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Teléfono:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 60, -1));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Dirección");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 60, -1));

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Correo electronico:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 60, -1));

        txt_apellido.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        txt_apellido.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 200, -1));

        txt_nombre.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 200, -1));

        txt_telefono.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 200, -1));

        txt_direccion.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        txt_direccion.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 200, -1));

        txt_correo.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        txt_correo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 200, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 670, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GuardarActionPerformed
        
        Cliente cliente = new Cliente();
        ClienteDAO controlCliente = new ClienteDAO();

        if (!txt_nombre.getText().isEmpty() && !txt_apellido.getText().isEmpty() && !txt_direccion.getText().isEmpty()) {
            //JOptionPane.showMessageDialog(null, "Correcto");

            if (!controlCliente.existeCliente(txt_direccion.getText().trim())) {

                cliente.setNombre(txt_nombre.getText().trim());
                cliente.setApellidos(txt_apellido.getText().trim());
                cliente.setTelefono(Integer.parseInt(txt_telefono.getText().trim()));
                cliente.setDireccion(txt_direccion.getText().trim());
                cliente.setCorreo(txt_correo.getText().trim());

                if (controlCliente.guardar(cliente)) {
                    JOptionPane.showMessageDialog(null, "Registro Guardado");
                    txt_nombre.setBackground(Color.green);
                    txt_apellido.setBackground(Color.green);
                    txt_direccion.setBackground(Color.green);
                    txt_telefono.setBackground(Color.green);
                    txt_correo.setBackground(Color.green);
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Guardar");
                }

            } else {
                JOptionPane.showMessageDialog(null, "El cliente ya esta registrado en la Base de Datos.");
                txt_nombre.setBackground(Color.white);
                txt_apellido.setBackground(Color.white);
                txt_direccion.setBackground(Color.white);
                txt_telefono.setBackground(Color.white);
                txt_correo.setBackground(Color.white);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Completa todos los campos");
            txt_nombre.setBackground(Color.red);
            txt_apellido.setBackground(Color.red);
            txt_direccion.setBackground(Color.red);
            txt_telefono.setBackground(Color.red);
            txt_correo.setBackground(Color.red);
        }
        //metodo limpiar
        this.Limpiar();
    }//GEN-LAST:event_jButton_GuardarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton jButton_Guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
     /**
     *
     * Metodo para limpiar campos
     */
    private void Limpiar() {
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_direccion.setText("");
        txt_telefono.setText("");
        txt_correo.setText("");
    }

}
