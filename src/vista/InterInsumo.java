package vista;

//import controlador.Ctrl_Usuario;
import ConexionSQL.Conectar;
import Modelo.Insumos;
import Modelo.Producto;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import Modelo.Usuario;
import ModeloDAO.InsumoDAO;
import ModeloDAO.ProductoDAO;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InterInsumo extends javax.swing.JInternalFrame {

    int obtenerIdCategoriaCombo = 0;

    public InterInsumo() {
        initComponents();

        this.setTitle("Registro de Insumos");
        this.CargarComboCategorias();

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
        txt_nombre = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        comboProveedor = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txt_stock = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 198, 89));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NUEVO INSUMO");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 30));

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
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 170, 30));

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
        jPanel2.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 170, 30));

        jLabel12.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Nombre:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 60, -1));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Proveedor:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 70, 30));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Descripción:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 80, -1));

        txt_nombre.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        jPanel2.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 360, 30));

        txt_descripcion.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        jPanel2.add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 360, 30));

        comboProveedor.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        comboProveedor.setForeground(new java.awt.Color(0, 0, 0));
        comboProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione proveedor" }));
        comboProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProveedorActionPerformed(evt);
            }
        });
        jPanel2.add(comboProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 170, 30));

        jLabel13.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Stock:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 60, -1));

        txt_stock.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        jPanel2.add(txt_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 100, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 600, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Insumos insumo = new Insumos();
        InsumoDAO insumodao = new InsumoDAO();
        String proveedor = "";
        proveedor = comboProveedor.getSelectedItem().toString().trim();

        if (txt_nombre.getText().isEmpty() || txt_descripcion.getText().isEmpty() || txt_stock.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completa todos los campos");
        } else {
            //validamos si el usuaro ya esta registrado
            if (!insumodao.existeProducto(txt_nombre.getText().trim())) {
                if (proveedor.equalsIgnoreCase("Seleccione proveedor:")) {
                    JOptionPane.showMessageDialog(null, "Seleccione proveedor");
                } else {
                    try {
                        insumo.setNombre(txt_nombre.getText().trim());
                        insumo.setStock(Integer.parseInt(txt_stock.getText().trim()));
                        insumo.setDescripcion(txt_descripcion.getText().trim());

                        //idcategoria - cargar metodo que obtiene el id de categoria
                        this.IdProveedor();
                        insumo.setIdProveedor(obtenerIdCategoriaCombo);

                        if (insumodao.guardar(insumo)) {
                            JOptionPane.showMessageDialog(null, "Registro Guardado");
                            txt_nombre.setBackground(Color.green);
                            txt_descripcion.setBackground(Color.green);
                            txt_stock.setBackground(Color.green);
                            txt_descripcion.setBackground(Color.green);

                            this.CargarComboCategorias();
                            this.Limpiar();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al Guardar");
                        }

                    } catch (HeadlessException | NumberFormatException e) {
                        System.out.println("Error en: " + e);
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "El producto ya existe en la Base de Datos");
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void comboProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboProveedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JComboBox<String> comboProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField txt_descripcion;
    public javax.swing.JTextField txt_nombre;
    public javax.swing.JTextField txt_stock;
    // End of variables declaration//GEN-END:variables
     /**
     *
     * Metodo para limpiar campos
     */
    private void Limpiar() {
        txt_nombre.setText("");
        txt_descripcion.setText("");
        txt_stock.setText("");
    }

    private void CargarComboCategorias() {
        Connection cn = Conectar.getConexion();
        String sql = "select pro_cod, pro_nom, pro_des, pro_ruc from proveedor";
        Statement st;

        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            comboProveedor.removeAllItems();
            comboProveedor.addItem("Seleccione proveedor:");
            while (rs.next()) {
                comboProveedor.addItem(rs.getString("pro_nom"));
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al cargar proveedor");
        }
    }

    private int IdProveedor() {
        String sql = "select * from proveedor where pro_nom= '" + this.comboProveedor.getSelectedItem() + "'";
        Statement st;
        try {
            Connection cn = Conectar.getConexion();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                obtenerIdCategoriaCombo = rs.getInt("pro_cod");
            }
        } catch (SQLException e) {
            System.out.println("Error al obener id categoria");
        }
        return obtenerIdCategoriaCombo;
    }

}
