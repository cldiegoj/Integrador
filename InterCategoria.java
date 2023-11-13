package vista;

import ModeloDAO.CategoriaDAO;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import Modelo.Categoria;

public class InterCategoria extends javax.swing.JInternalFrame {   
  
    private CategoriaDAO categoriaDAO;
            
    public InterCategoria() {
        initComponents();
        
        this.setTitle("Nueva Categoria - Lima Cakes");
        this.categoriaDAO = new CategoriaDAO();
       

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt_descripcion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txt_Categoria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 198, 89));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel1.setText("Menú - Categorías");
        jPanel2.add(jLabel1);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 30));

        jPanel1.setBackground(new java.awt.Color(252, 248, 232));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_descripcion.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        txt_descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descripcionActionPerformed(evt);
            }
        });
        jPanel1.add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 250, 30));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel2.setText("Descripcion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        btnAtras.setBackground(new java.awt.Color(252, 248, 232));
        btnAtras.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/volver-flecha-izquierda.png"))); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, null));
        btnAtras.setContentAreaFilled(false);
        btnAtras.setPreferredSize(null);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 130, 30));

        jButton1.setBackground(new java.awt.Color(252, 248, 232));
        jButton1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/guardar-el-archivo.png"))); // NOI18N
        jButton1.setText("Guardar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, null));
        jButton1.setContentAreaFilled(false);
        jButton1.setPreferredSize(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 140, 30));

        txt_Categoria.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        txt_Categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 250, 30));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel3.setText("Categoría:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 430, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

   String nombreCategoria = txt_Categoria.getText();
String descripcionCategoria = txt_descripcion.getText();

if (nombreCategoria.isEmpty() || descripcionCategoria.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Completa todos los campos");
} else {
    try {
        Categoria nuevaCategoria = new Categoria(nombreCategoria, descripcionCategoria);
        if (categoriaDAO.guardarCategoria(nuevaCategoria)) {
            JOptionPane.showMessageDialog(null, "¡Categoría Registrada!");
        } else {
            JOptionPane.showMessageDialog(null, "¡Producto ya registrado !");
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "¡Error al procesar la Categoría!");
    }

    // Limpiar los campos de texto después de realizar la operación
    txt_Categoria.setText("");
    txt_descripcion.setText("");
}
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descripcionActionPerformed
     
        
      
        
    }//GEN-LAST:event_txt_descripcionActionPerformed

    private void txt_CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CategoriaActionPerformed
        
        
        
        
    }//GEN-LAST:event_txt_CategoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_Categoria;
    private javax.swing.JTextField txt_descripcion;
    // End of variables declaration//GEN-END:variables
}
