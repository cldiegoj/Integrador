package vista;

import controlador.Ctrl_Tecnicos;
import java.awt.Color;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import modelo.Tecnicos;

/**
 *
 * @author ediso
 */
public class InterTecnicos extends javax.swing.JInternalFrame {

    public InterTecnicos() {
        initComponents();
        
        this.setTitle("Nuevo Cliente - Sistema Biker");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_DNI = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        jButton_Guardar = new javax.swing.JButton();
        txt_direccion = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dc_fecha = new com.toedter.calendar.JDateChooser();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombres:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 90, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Fecha de Nac.:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 120, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("DNI:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 90, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Teléfono:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 90, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Dirección:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 90, -1));

        txt_nombre.setBackground(new java.awt.Color(0, 102, 102));
        txt_nombre.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 200, -1));

        txt_apellido.setBackground(new java.awt.Color(0, 102, 102));
        txt_apellido.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        txt_apellido.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 200, -1));

        txt_DNI.setBackground(new java.awt.Color(0, 102, 102));
        txt_DNI.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        txt_DNI.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 200, -1));

        txt_telefono.setBackground(new java.awt.Color(0, 102, 102));
        txt_telefono.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 200, -1));

        jButton_Guardar.setBackground(new java.awt.Color(0, 102, 102));
        jButton_Guardar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButton_Guardar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Guardar.png"))); // NOI18N
        jButton_Guardar.setText("Guardar");
        jButton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 130, 50));

        txt_direccion.setBackground(new java.awt.Color(0, 102, 102));
        txt_direccion.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        txt_direccion.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 200, -1));

        btnAtras.setBackground(new java.awt.Color(0, 102, 102));
        btnAtras.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Atras.png"))); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 130, 50));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menú - Tecnicos");
        jPanel2.add(jLabel1);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 30));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Apellidos:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 90, -1));
        getContentPane().add(dc_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 200, 30));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 510, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GuardarActionPerformed

        Tecnicos tecnicos = new Tecnicos();
        Ctrl_Tecnicos controlTecnicos = new Ctrl_Tecnicos();
        String fechaActual = "";
        Date date = new Date();
        fechaActual = new SimpleDateFormat("yyyy/MM/dd").format(date);
        if (!txt_nombre.getText().isEmpty() && !txt_apellido.getText().isEmpty() && !txt_DNI.getText().isEmpty()) {
            //JOptionPane.showMessageDialog(null, "Correcto");

            if (!controlTecnicos.existeTecnico(txt_DNI.getText().trim())) {

                tecnicos.setNombre(txt_nombre.getText().trim());
                tecnicos.setApellido(txt_apellido.getText().trim());
                tecnicos.setDNI(txt_DNI.getText().trim());
                tecnicos.setFech_tec(fechaActual);
                tecnicos.setDireccion(txt_direccion.getText().trim());
                tecnicos.setTelefono(txt_telefono.getText().trim());
               tecnicos.setEstado("Activo");

                if (controlTecnicos.guardar(tecnicos)) {
                    JOptionPane.showMessageDialog(null, "Registro Guardado");
              } else {
                    JOptionPane.showMessageDialog(null, "Error al Guardar");
                }

            } else {
                JOptionPane.showMessageDialog(null, "El tecnico ya esta registrado en la Base de Datos.");
                txt_nombre.setBackground(Color.white);
                txt_apellido.setBackground(Color.white);
                txt_DNI.setBackground(Color.white);
                txt_telefono.setBackground(Color.white);
                txt_direccion.setBackground(Color.white);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Completa todos los campos");
            txt_nombre.setBackground(Color.red);
            txt_apellido.setBackground(Color.red);
            txt_DNI.setBackground(Color.red);
            txt_telefono.setBackground(Color.red);
            txt_direccion.setBackground(Color.red);
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
    private com.toedter.calendar.JDateChooser dc_fecha;
    private javax.swing.JButton jButton_Guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_DNI;
    private javax.swing.JTextField txt_apellido;
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
        
        txt_DNI.setText("");
        txt_telefono.setText("");
        txt_direccion.setText("");
    }

}
