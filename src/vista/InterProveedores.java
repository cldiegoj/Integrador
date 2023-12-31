package vista;

//import controlador.Ctrl_Tecnicos;
import Modelo.Proveedor;
import ModeloDAO.ProveedorDAO;
import java.awt.Color;
import javax.swing.JOptionPane;

//import java.awt.Color;
//import java.awt.Dimension;
//import java.text.SimpleDateFormat;
//import java.time.Instant;
//import java.util.Date;
//import java.util.HashSet;
//import java.util.Set;
//import javax.swing.JOptionPane;
//import modelo.Tecnicos;
/**
 *
 * @author ediso
 */
public class InterProveedores extends javax.swing.JInternalFrame {

    public InterProveedores() {
        initComponents();

        this.setTitle("Nuevo Proveedor - Lima Cakes");

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
        jButton_Guardar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_ruc = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(252, 248, 232));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Guardar.setBackground(new java.awt.Color(252, 248, 232));
        jButton_Guardar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jButton_Guardar.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Guardar.setText("GUARDAR");
        jButton_Guardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, null, null));
        jButton_Guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 150, 30));

        btnAtras.setBackground(new java.awt.Color(252, 248, 232));
        btnAtras.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(0, 0, 0));
        btnAtras.setText("ATRÁS");
        btnAtras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, null, null));
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 150, 30));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 80, -1));

        txt_nombre.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 200, -1));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Descripción:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 80, -1));

        txt_descripcion.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        txt_descripcion.setForeground(new java.awt.Color(0, 0, 0));
        txt_descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descripcionActionPerformed(evt);
            }
        });
        jPanel1.add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 200, -1));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("RUC");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 80, -1));

        txt_ruc.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        txt_ruc.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_ruc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 200, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 560, 220));

        jPanel2.setBackground(new java.awt.Color(255, 198, 89));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENÚ - PROVEEDORES");
        jPanel2.add(jLabel1);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GuardarActionPerformed

        Proveedor proveedor = new Proveedor();
        ProveedorDAO proveedordao = new ProveedorDAO();
        if (!txt_nombre.getText().isEmpty() && !txt_descripcion.getText().isEmpty() && !txt_ruc.getText().isEmpty()) {
            //JOptionPane.showMessageDialog(null, "Correcto");

            if (!proveedordao.existeTecnico(txt_nombre.getText().trim())) {

                proveedor.setNombre(txt_nombre.getText().trim());
                proveedor.setDescripcion(txt_descripcion.getText().trim());
                proveedor.setRuc(Integer.parseInt(txt_ruc.getText().trim()));
                
                if (proveedordao.guardar(proveedor)) {
                    JOptionPane.showMessageDialog(null, "Registro Guardado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Guardar");
                }

            } else {
                JOptionPane.showMessageDialog(null, "El tecnico ya esta registrado en la Base de Datos.");
                txt_nombre.setBackground(Color.white);
                txt_descripcion.setBackground(Color.white);
                txt_ruc.setBackground(Color.white);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Completa todos los campos");
            txt_nombre.setBackground(Color.red);
            txt_descripcion.setBackground(Color.red);
            txt_ruc.setBackground(Color.red);
        }
        //metodo limpiar
        this.Limpiar();
    }//GEN-LAST:event_jButton_GuardarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void txt_descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descripcionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton jButton_Guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_ruc;
    // End of variables declaration//GEN-END:variables
     /**
     *
     * Metodo para limpiar campos
     */
    private void Limpiar() {
        txt_nombre.setText("");
        txt_descripcion.setText("");
        txt_ruc.setText("");
    }

}
