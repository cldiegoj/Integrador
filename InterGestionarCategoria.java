package vista;

import ConexionSQL.Conectar;
import ModeloDAO.CategoriaDAO;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Modelo.Categoria;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class InterGestionarCategoria extends javax.swing.JInternalFrame {
    
    private int idCategoria;
    private CategoriaDAO categoriaDAO;
    private DefaultTableModel modeloTabla;
    
    public InterGestionarCategoria() {
        initComponents();
       
        this.setTitle("Gestionar Categorias - Lima Cakes");
        this.categoriaDAO = new CategoriaDAO();
        this.modeloTabla = new DefaultTableModel();
        jTable_categorias.setModel(modeloTabla);
        CargarTablaCategorias();
        
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(jTable_categorias.getModel());
    jTable_categorias.setRowSorter(sorter);

    // Configura el listener para el evento de cambio en el texto del campo de búsqueda
    txt_busqueda.getDocument().addDocumentListener(new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            actualizarFiltro();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            actualizarFiltro();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            actualizarFiltro();
        }
    });
        
    }

    private void actualizarFiltro() {
    // Obtén el texto de búsqueda
    String textoBusqueda = txt_busqueda.getText();

    // Configura el filtro
    RowFilter<TableModel, Object> filtro = RowFilter.regexFilter("(?i)" + textoBusqueda);

    // Aplica el filtro al TableRowSorter
    TableRowSorter<TableModel> sorter = (TableRowSorter<TableModel>) jTable_categorias.getRowSorter();
    sorter.setRowFilter(filtro);
}
    
    private void CargarTablaCategorias() {
       
  DefaultTableModel modelo = categoriaDAO.obtenerCategorias();
    jTable_categorias.setModel(modelo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_actualizar1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_categorias = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txt_busqueda = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        jButton_cargar = new javax.swing.JButton();
        jButton_eliminar = new javax.swing.JButton();
        jButton_Modificar = new javax.swing.JButton();

        jButton_actualizar1.setBackground(new java.awt.Color(252, 248, 232));
        jButton_actualizar1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jButton_actualizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/guardar-el-archivo.png"))); // NOI18N
        jButton_actualizar1.setText("Actualizar");
        jButton_actualizar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, null, null));
        jButton_actualizar1.setContentAreaFilled(false);
        jButton_actualizar1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton_actualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizar1ActionPerformed(evt);
            }
        });

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 198, 89));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENÚ - GESTIÓN DE CATEGORIAS");
        jPanel4.add(jLabel1);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 30));

        jPanel2.setBackground(new java.awt.Color(252, 248, 232));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_categorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Producto"
            }
        ));
        jScrollPane1.setViewportView(jTable_categorias);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 330, 120));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 350, 140));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Busqueda");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        txt_busqueda.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        txt_busqueda.setForeground(new java.awt.Color(0, 102, 102));
        txt_busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_busquedaActionPerformed(evt);
            }
        });
        jPanel2.add(txt_busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 240, -1));

        btnAtras.setBackground(new java.awt.Color(252, 248, 232));
        btnAtras.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/volver-flecha-izquierda.png"))); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, null, null));
        btnAtras.setContentAreaFilled(false);
        btnAtras.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel2.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 90, 30));

        jButton_cargar.setBackground(new java.awt.Color(252, 248, 232));
        jButton_cargar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jButton_cargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/teclas.png"))); // NOI18N
        jButton_cargar.setText("Cargar Categorias");
        jButton_cargar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, null, null));
        jButton_cargar.setContentAreaFilled(false);
        jButton_cargar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cargarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 150, 30));

        jButton_eliminar.setBackground(new java.awt.Color(252, 248, 232));
        jButton_eliminar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jButton_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/eliminar.png"))); // NOI18N
        jButton_eliminar.setText("Eliminar");
        jButton_eliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, null, null));
        jButton_eliminar.setContentAreaFilled(false);
        jButton_eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 120, 30));

        jButton_Modificar.setBackground(new java.awt.Color(252, 248, 232));
        jButton_Modificar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jButton_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/guardar-el-archivo.png"))); // NOI18N
        jButton_Modificar.setText("Modificar");
        jButton_Modificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, null, null));
        jButton_Modificar.setContentAreaFilled(false);
        jButton_Modificar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ModificarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 130, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 580, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void jButton_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cargarActionPerformed
  CargarTablaCategorias();
    }//GEN-LAST:event_jButton_cargarActionPerformed

    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed
   
                  int filaSeleccionada = jTable_categorias.getSelectedRow();

        if (filaSeleccionada != -1) {
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar la Categoría?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                String codigoCategoria = jTable_categorias.getValueAt(filaSeleccionada, 0).toString();

                try {
                    if (categoriaDAO.eliminarCategoria(codigoCategoria)) {
                        JOptionPane.showMessageDialog(null, "Categoría eliminada correctamente");
                        CargarTablaCategorias();
                    } else {
                        JOptionPane.showMessageDialog(null, "Categoría eliminada correctamente");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error al eliminar la Categoría");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");
        }
        
        
    }//GEN-LAST:event_jButton_eliminarActionPerformed

    private void txt_busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_busquedaActionPerformed
        
        
        

        
    }//GEN-LAST:event_txt_busquedaActionPerformed

    private void jButton_actualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_actualizar1ActionPerformed

    private void jButton_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ModificarActionPerformed
    
        
        int filaSeleccionada = jTable_categorias.getSelectedRow();

        if (filaSeleccionada != -1) {
            String codigoCategoria = jTable_categorias.getValueAt(filaSeleccionada, 0).toString();
            String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre:");
            String nuevaDescripcion = JOptionPane.showInputDialog("Ingrese la nueva descripción:");

            try {
                Categoria categoria = new Categoria(nuevoNombre, nuevaDescripcion);
                categoria.setCat_cod(codigoCategoria);

                if (categoriaDAO.actualizarCategoria(categoria)) {
                    JOptionPane.showMessageDialog(null, "Categoría actualizada correctamente");
                    CargarTablaCategorias();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al actualizar la Categoría");
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al actualizar la Categoría");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila para actualizar");
        }
                                                   
          
    }//GEN-LAST:event_jButton_ModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton jButton_Modificar;
    private javax.swing.JButton jButton_actualizar1;
    private javax.swing.JButton jButton_cargar;
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_categorias;
    private javax.swing.JTextField txt_busqueda;
    // End of variables declaration//GEN-END:variables

    /*
     * *****************************************************
     * metodo para mostrar todos las categorias registradas
     * *****************************************************
     */
   // private void CargarTablaCategorias() {
//        Connection con = Conexion.conectar();
//        DefaultTableModel model = new DefaultTableModel();
//        String sql = "select ID_CATEGORIA, DESCRIPCION, ESTADO from CATEGORIAS;";
//        Statement st;
//        try {
//            st = con.createStatement();
//            ResultSet rs = st.executeQuery(sql);
//            InterGestionarCategoria.jTable_categorias = new JTable(model);
//            InterGestionarCategoria.jScrollPane1.setViewportView(InterGestionarCategoria.jTable_categorias);
//
//            model.addColumn("ID_CATEGORIA");
//            model.addColumn("DESCRIPCIÓN");
//            model.addColumn("ESTADO");
//
//            while (rs.next()) {
//                Object fila[] = new Object[3];
//                for (int i = 0; i < 3; i++) {
//                    fila[i] = rs.getObject(i + 1);
//                }
//                model.addRow(fila);
//            }
//            con.close();
//        } catch (SQLException e) {
//            System.out.println("Error al llenar la tabla categorias: " + e);
//        }
//        //evento para obtener campo al cual el usuario da click
//        //y obtener la interfaz que mostrara la informacion general
//        jTable_categorias.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                int fila_point = jTable_categorias.rowAtPoint(e.getPoint());
//                int columna_point = 0;
//
//                if (fila_point > -1) {
//                    idCategoria = (int) model.getValueAt(fila_point, columna_point);
//                    EnviarDatosCategoriaSeleccionada(idCategoria);
//                }
//            }
//        });
    //}

    /*
     * **************************************************
     * Metodo que envia datos seleccionados
     * **************************************************
     */
    private void EnviarDatosCategoriaSeleccionada(int idCategoria) {
        try {
            Connection con = Conectar.getConexion();
            PreparedStatement pst = con.prepareStatement(
                    "select * from CATEGORIAS where ID_CATEGORIA = '" + idCategoria + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txt_busqueda.setText(rs.getString("DESCRIPCION"));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al seleccionar categoria: " + e);
        }
    }
}
