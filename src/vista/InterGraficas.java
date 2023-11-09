package vista;

import java.awt.Dimension;
import javax.swing.JTextField;
import static vista.FrmMenu.jDesktopPane_menu;


public class InterGraficas extends javax.swing.JInternalFrame {
    
    public static String fecha_inicio = "", fecha_fin = "";

    public InterGraficas() {
        initComponents();
       
        this.setTitle("Historial de Ventas - Lima cakes");

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
        jDateChooser_fecha_inicio = new com.toedter.calendar.JDateChooser();
        jDateChooser_fecha_fin = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton_Guardar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Fecha inicio:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 100, -1));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fecha Fin:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 100, -1));

        jDateChooser_fecha_inicio.setBackground(new java.awt.Color(0, 102, 102));
        jDateChooser_fecha_inicio.setForeground(new java.awt.Color(255, 255, 255));
        jDateChooser_fecha_inicio.setDateFormatString("yyyy-MM-dd");
        jDateChooser_fecha_inicio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jDateChooser_fecha_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 140, -1));

        jDateChooser_fecha_fin.setBackground(new java.awt.Color(0, 102, 102));
        jDateChooser_fecha_fin.setForeground(new java.awt.Color(255, 255, 255));
        jDateChooser_fecha_fin.setDateFormatString("yyyy-MM-dd");
        jDateChooser_fecha_fin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jDateChooser_fecha_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 140, -1));

        jPanel1.setBackground(new java.awt.Color(255, 198, 89));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Gráfica de Ventas");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 30));

        jPanel2.setBackground(new java.awt.Color(252, 248, 232));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Guardar.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Guardar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jButton_Guardar.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jButton_Guardar.setText("Graficar Ventas");
        jButton_Guardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, null, null));
        jButton_Guardar.setContentAreaFilled(false);
        jButton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GuardarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 160, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GuardarActionPerformed

        fecha_inicio = ((JTextField) jDateChooser_fecha_inicio.getDateEditor().getUiComponent()).getText();
        fecha_fin = ((JTextField) jDateChooser_fecha_fin.getDateEditor().getUiComponent()).getText();

        InterGraficaVentas interGraficaVentas = new InterGraficaVentas();
        jDesktopPane_menu.add(interGraficaVentas);
        int width = jDesktopPane_menu.getWidth();
        int height = jDesktopPane_menu.getHeight();
        int x = (width - interGraficaVentas.getWidth()) / 2;
        int y = (height - interGraficaVentas.getHeight()) / 2;
        interGraficaVentas.setBounds(x, y, interGraficaVentas.getWidth(), interGraficaVentas.getHeight());
        interGraficaVentas.setVisible(true);

    }//GEN-LAST:event_jButton_GuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Guardar;
    private com.toedter.calendar.JDateChooser jDateChooser_fecha_fin;
    private com.toedter.calendar.JDateChooser jDateChooser_fecha_inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables


}
