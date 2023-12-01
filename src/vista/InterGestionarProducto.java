package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
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
import ModeloDAO.*;
import Modelo.*;
import ConexionSQL.*;
import java.util.List;

/**
 *
 * @author ediso
 */
public class InterGestionarProducto extends javax.swing.JInternalFrame {

    private int idProducto;
    int obtenerIdCategoriaCombo = 0;

    public InterGestionarProducto() {
        initComponents();

        this.setTitle("Gestionar Productos");
        //Cargar tabla
        this.CargarTablaProductos();
        this.CargarComboCategoria();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton_eliminar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jButton_actualizar = new javax.swing.JButton();
        jComboBox_categoria = new javax.swing.JComboBox<>();
        txt_cantidad = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_productos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 198, 89));
        jPanel4.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENÚ - ADMINISTRACIÓN DE PRODUCTOS");
        jPanel4.add(jLabel1);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 30));

        jPanel2.setBackground(new java.awt.Color(252, 248, 232));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_eliminar.setBackground(new java.awt.Color(255, 255, 255));
        jButton_eliminar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        jButton_eliminar.setForeground(new java.awt.Color(0, 0, 0));
        jButton_eliminar.setText("ELIMINAR");
        jButton_eliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, null));
        jButton_eliminar.setContentAreaFilled(false);
        jButton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 130, 30));

        btnAtras.setBackground(new java.awt.Color(255, 255, 255));
        btnAtras.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(0, 0, 0));
        btnAtras.setText("ATRÁS");
        btnAtras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, null));
        btnAtras.setContentAreaFilled(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel2.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 130, 30));

        jButton_actualizar.setBackground(new java.awt.Color(255, 255, 255));
        jButton_actualizar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        jButton_actualizar.setForeground(new java.awt.Color(0, 0, 0));
        jButton_actualizar.setText("ACTUALIZAR");
        jButton_actualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, null));
        jButton_actualizar.setContentAreaFilled(false);
        jButton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 130, 30));

        jComboBox_categoria.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        jComboBox_categoria.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione categoria:", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 180, 30));

        txt_cantidad.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        txt_cantidad.setForeground(new java.awt.Color(255, 255, 255));
        txt_cantidad.setEnabled(false);
        jPanel2.add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 90, 30));

        txt_nombre.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 190, 30));

        jLabel12.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Nombre:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 50, 30));

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Precio:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 50, 20));

        jLabel13.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Cantidad:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 70, 30));

        jLabel15.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Categoria:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 70, -1));

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Descripción:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 80, 20));

        txt_precio.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        txt_precio.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 100, 30));

        txt_descripcion.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        txt_descripcion.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 190, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_productos.setForeground(new java.awt.Color(0, 102, 102));
        jTable_productos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_productos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 720, 190));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 740, 210));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 840, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed
        ProductoDAO productodao = new ProductoDAO();
        if (idProducto == 0) {
            JOptionPane.showMessageDialog(null, "¡Seleccione un Producto!");
        } else {
            if (!productodao.eliminar(idProducto)) {
                JOptionPane.showMessageDialog(null, "¡Producto Eliminado!");
                this.CargarTablaProductos();
                this.CargarComboCategoria();
                this.Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "¡Error al eliminar producto!");
            }
        }
    }//GEN-LAST:event_jButton_eliminarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void jButton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarActionPerformed

        Producto producto = new Producto();
        ProductoDAO productodao = new ProductoDAO();
        String categoria = "";
        categoria = jComboBox_categoria.getSelectedItem().toString().trim();

        //validar campos
        if (txt_nombre.getText().isEmpty() || txt_cantidad.getText().isEmpty() || txt_precio.getText().isEmpty() || txt_descripcion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        } else {
            if (categoria.equalsIgnoreCase("Seleccione categoria:")) {
                JOptionPane.showMessageDialog(null, "Seleccione categoria");
            } else {
                try {
                    producto.setProdnom(txt_nombre.getText().trim());
                    producto.setStock(Integer.parseInt(txt_cantidad.getText().trim()));
                    String precioTXT = "";
                    double Precio = 0.0;
                    precioTXT = txt_precio.getText().trim();
                    boolean aux = false;
                    /*
                                    *Si el usuario ingresa , (coma) como punto decimal,
                                    lo transformamos a punto (.)
                     */
                    for (int i = 0; i < precioTXT.length(); i++) {
                        if (precioTXT.charAt(i) == ',') {
                            String precioNuevo = precioTXT.replace(",", ".");
                            Precio = Double.parseDouble(precioNuevo);
                            aux = true;
                        }
                    }
                    //evaluar la condicion
                    if (aux == true) {
                        producto.setProdpre(Precio);
                    } else {
                        Precio = Double.parseDouble(precioTXT);
                        producto.setProdpre(Precio);
                    }

                    producto.setProddes(txt_descripcion.getText().trim());

                    //idcategoria - cargar metodo que obtiene el id de categoria
                    this.IdCategoria();
                    producto.setCatcod(obtenerIdCategoriaCombo);

                    if (productodao.actualizar(producto, idProducto)) {
                        JOptionPane.showMessageDialog(null, "Registro Actualizado");
                        this.CargarComboCategoria();
                        this.CargarTablaProductos();
                        this.Limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al Actualizar");
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    System.out.println("Error en: " + e);
                }
            }

        }
    }//GEN-LAST:event_jButton_actualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton jButton_actualizar;
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JComboBox<String> jComboBox_categoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_productos;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables

    /*
     * *****************************************************
     * metodo para limpiar
     * *****************************************************
     */
    private void Limpiar() {
        txt_nombre.setText("");
        txt_cantidad.setText("");
        txt_precio.setText("");
        txt_descripcion.setText("");
        jComboBox_categoria.setSelectedItem("Seleccione categoria:");
    }

    /*
     * *****************************************************
     * metodo para cargar las categorias en el JCombox
     * *****************************************************
     */
    private void CargarComboCategoria() {
        Connection cn = Conectar.getConexion();
        String sql = "select cat_cod, cat_nom, cat_des from CATEGORIA";
        Statement st;

        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_categoria.removeAllItems();
            jComboBox_categoria.addItem("Seleccione categoria:");
            while (rs.next()) {
                jComboBox_categoria.addItem(rs.getString("cat_nom"));
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al cargar categorias");
        }
    }

    /*
     * *****************************************************
     * metodo para mostrar todos los productos registrados
     * *****************************************************
     */
    String descripcionCategoria = "";
    double precio = 0.0;

    private void CargarTablaProductos() {
        DefaultTableModel model = new DefaultTableModel();

        InterGestionarProducto.jTable_productos = new JTable(model);
        InterGestionarProducto.jScrollPane1.setViewportView(InterGestionarProducto.jTable_productos);

        model.addColumn("N°");//ID
        model.addColumn("NOMBRE");
        model.addColumn("CANTIDAD");
        model.addColumn("PRECIO");
        model.addColumn("DESCRIPCION:");
        model.addColumn("CATEGORIA");
        
        
        Object[] fila = new Object[6];
        ProductoDAO productodao = new ProductoDAO();
        List<Producto> lista = productodao.lista();

        for (Producto x : lista) {
            fila[0] = x.getProdcod();
            fila[1] = x.getProdnom();
            fila[2] = x.getStock();
            fila[3] = x.getProdpre();
            fila[4] = x.getProddes();
            fila[5] = x.getCategoria();
            model.addRow(fila);
        }

        //evento para obtener campo al cual el usuario da click
        //y obtener la interfaz que mostrara la informacion general
        jTable_productos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_productos.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idProducto = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosProductoSeleccionado(idProducto);//metodo
                }
            }
        });
    }

    /*
     * **************************************************
     * Metodo para calcular Iva
     * **************************************************
     */
 /*
     * **************************************************
     * Metodo que envia datos seleccionados
     * **************************************************
     */
    private void EnviarDatosProductoSeleccionado(int idProducto) {
        try {
            Connection con = Conectar.getConexion();
            PreparedStatement pst = con.prepareStatement(
                    "select prod_nom, prod_stk, prod_pre, prod_des, cat_cod from PRODUCTO where prod_cod= '" + idProducto + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txt_nombre.setText(rs.getString(1));
                txt_cantidad.setText(rs.getString(2));
                txt_precio.setText(rs.getString(3));
                txt_descripcion.setText(rs.getString(4));
                int idCate = rs.getInt(5);
                jComboBox_categoria.setSelectedItem(relacionarCategoria(idCate));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al seleccionar producto: " + e);
        }
    }

    /*
     * **************************************************
     * Metodo para relacionar categorias
     * **************************************************
     */
    private String relacionarCategoria(int idCategoria) {

        String sql = "select cat_nom from CATEGORIA where cat_cod= '" + idCategoria + "'";
        Statement st;
        try {
            Connection cn = Conectar.getConexion();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                descripcionCategoria = rs.getString("cat_nom");
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("¡Error al obtener el ID de la categoria!");
        }
        return descripcionCategoria;
    }

    /**
     *
     * Metodo para obtener id categoria
     */
    private int IdCategoria() {
        String sql = "select * from CATEGORIA where cat_nom = '" + this.jComboBox_categoria.getSelectedItem() + "'";
        Statement st;
        try {
            Connection cn = Conectar.getConexion();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                obtenerIdCategoriaCombo = rs.getInt("cat_cod");
            }
        } catch (SQLException e) {
            System.out.println("Error al obener id categoria");
        }
        return obtenerIdCategoriaCombo;
    }
}
