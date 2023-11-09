package vista;

//import controlador.Reportes;
import ModeloDAO.UsuarioDAO;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;

public class FrmMenu extends javax.swing.JFrame {

    
    
    public static JDesktopPane jDesktopPane_menu;
    
    public FrmMenu() {
        initComponents();

        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("LIMA CAKES - PASTELERIA");

        this.setLayout(null);
        jDesktopPane_menu = new JDesktopPane();

        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDesktopPane_menu.setBounds(0, 0, ancho, (alto - 110));
        this.add(jDesktopPane_menu);
        

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imgs/panaderia.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_nuevo_usuario = new javax.swing.JMenuItem();
        jMenuItem_gestionar_usuario = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3_nuevo_producto = new javax.swing.JMenuItem();
        jMenuItem_gestionar_producto = new javax.swing.JMenuItem();
        jMenuItem_actualizar_stock = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        btnTecnicos = new javax.swing.JMenu();
        jMenuItem_nuevo_tecnico = new javax.swing.JMenuItem();
        jMenuItem_gestionar_tecnicos = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem_nuevo_cliente = new javax.swing.JMenuItem();
        jMenuItem_gestionar_cliente = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem_nueva_categoria = new javax.swing.JMenuItem();
        jMenuItem_gestionar_categorias = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem_nueva_venta = new javax.swing.JMenuItem();
        jMenuItem_gestionar_ventas = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_nueva_venta1 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem_reportes_clientes = new javax.swing.JMenuItem();
        jMenuItem_reportes_categorias = new javax.swing.JMenuItem();
        jMenuItem_reportes_productos = new javax.swing.JMenuItem();
        jMenuItem_reportes_ventas = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem_ver_historial = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem_cerrar_sesion = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        jMenuItem15.setText("jMenuItem15");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenuBar1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuBar1.setMaximumSize(new java.awt.Dimension(1000, 32768));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(1250, 30));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Menu Usuarios.png"))); // NOI18N
        jMenu1.setText("Usuarios");
        jMenu1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_nuevo_usuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItem_nuevo_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Nuevo Usuario.png"))); // NOI18N
        jMenuItem_nuevo_usuario.setText("Nuevo Usuario");
        jMenuItem_nuevo_usuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem_nuevo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_usuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_nuevo_usuario);

        jMenuItem_gestionar_usuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItem_gestionar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MUsuarios.png"))); // NOI18N
        jMenuItem_gestionar_usuario.setText("Menú Usuario");
        jMenuItem_gestionar_usuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem_gestionar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_usuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_gestionar_usuario);
        jMenu1.add(jSeparator3);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pastel.png"))); // NOI18N
        jMenu2.setText("Productos");
        jMenu2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem3_nuevo_producto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItem3_nuevo_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Nuevo Producto.png"))); // NOI18N
        jMenuItem3_nuevo_producto.setText("Venta - Nuevo Producto");
        jMenuItem3_nuevo_producto.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem3_nuevo_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3_nuevo_productoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3_nuevo_producto);

        jMenuItem_gestionar_producto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItem_gestionar_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Gestionar Producto.png"))); // NOI18N
        jMenuItem_gestionar_producto.setText("Venta - Gestionar Productos");
        jMenuItem_gestionar_producto.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_gestionar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_productoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_gestionar_producto);

        jMenuItem_actualizar_stock.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItem_actualizar_stock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Actualizar Stock.png"))); // NOI18N
        jMenuItem_actualizar_stock.setText("Venta - Actualizar Stock");
        jMenuItem_actualizar_stock.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_actualizar_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_actualizar_stockActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_actualizar_stock);
        jMenu2.add(jSeparator1);

        jMenuBar1.add(jMenu2);

        btnTecnicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tecnico.png"))); // NOI18N
        btnTecnicos.setText("Proveedores");
        btnTecnicos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnTecnicos.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_nuevo_tecnico.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItem_nuevo_tecnico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Nuevo Tecnico.png"))); // NOI18N
        jMenuItem_nuevo_tecnico.setText("Nuevo Proveedor");
        jMenuItem_nuevo_tecnico.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem_nuevo_tecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_tecnicoActionPerformed(evt);
            }
        });
        btnTecnicos.add(jMenuItem_nuevo_tecnico);

        jMenuItem_gestionar_tecnicos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItem_gestionar_tecnicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Gestionar Clientes.png"))); // NOI18N
        jMenuItem_gestionar_tecnicos.setText("Gestionar Proveedor");
        jMenuItem_gestionar_tecnicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_tecnicosActionPerformed(evt);
            }
        });
        btnTecnicos.add(jMenuItem_gestionar_tecnicos);
        btnTecnicos.add(jSeparator4);

        jMenuBar1.add(btnTecnicos);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clientes.png"))); // NOI18N
        jMenu3.setText("Clientes");
        jMenu3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_nuevo_cliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItem_nuevo_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Nuevo Cliente.png"))); // NOI18N
        jMenuItem_nuevo_cliente.setText("Nuevo Cliente");
        jMenuItem_nuevo_cliente.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem_nuevo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_clienteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_nuevo_cliente);

        jMenuItem_gestionar_cliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItem_gestionar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Gestionar Clientes.png"))); // NOI18N
        jMenuItem_gestionar_cliente.setText("Gestionar Clientes");
        jMenuItem_gestionar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_clienteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_gestionar_cliente);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias.png"))); // NOI18N
        jMenu4.setText("Categorias");
        jMenu4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_nueva_categoria.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItem_nueva_categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Nueva Categoria.png"))); // NOI18N
        jMenuItem_nueva_categoria.setText("Nueva Categoria");
        jMenuItem_nueva_categoria.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_nueva_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nueva_categoriaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_nueva_categoria);

        jMenuItem_gestionar_categorias.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItem_gestionar_categorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Gestionar Categorias.png"))); // NOI18N
        jMenuItem_gestionar_categorias.setText("Gestionar Categorias");
        jMenuItem_gestionar_categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_categoriasActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_gestionar_categorias);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturar.png"))); // NOI18N
        jMenu5.setText("Facturar");
        jMenu5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_nueva_venta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItem_nueva_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Nueva Venta.png"))); // NOI18N
        jMenuItem_nueva_venta.setText("Nueva Venta");
        jMenuItem_nueva_venta.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_nueva_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nueva_ventaActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_nueva_venta);

        jMenuItem_gestionar_ventas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItem_gestionar_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Gestionar Ventas.png"))); // NOI18N
        jMenuItem_gestionar_ventas.setText("Gestionar Ventas");
        jMenuItem_gestionar_ventas.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_gestionar_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_ventasActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_gestionar_ventas);
        jMenu5.add(jSeparator2);

        jMenuItem_nueva_venta1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItem_nueva_venta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Nueva Venta.png"))); // NOI18N
        jMenuItem_nueva_venta1.setText("Gestionar insumos");
        jMenuItem_nueva_venta1.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_nueva_venta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nueva_venta1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_nueva_venta1);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Reportes.png"))); // NOI18N
        jMenu6.setText("Reportes");
        jMenu6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_reportes_clientes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItem_reportes_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Reportes2.png"))); // NOI18N
        jMenuItem_reportes_clientes.setText("Reportes Clientes");
        jMenuItem_reportes_clientes.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_reportes_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reportes_clientesActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_reportes_clientes);

        jMenuItem_reportes_categorias.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItem_reportes_categorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Reportes2.png"))); // NOI18N
        jMenuItem_reportes_categorias.setText("Reportes Categorias");
        jMenuItem_reportes_categorias.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_reportes_categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reportes_categoriasActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_reportes_categorias);

        jMenuItem_reportes_productos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItem_reportes_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Reportes2.png"))); // NOI18N
        jMenuItem_reportes_productos.setText("Reportes Productos");
        jMenuItem_reportes_productos.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_reportes_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reportes_productosActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_reportes_productos);

        jMenuItem_reportes_ventas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItem_reportes_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Reportes2.png"))); // NOI18N
        jMenuItem_reportes_ventas.setText("Reportes Ventas");
        jMenuItem_reportes_ventas.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_reportes_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reportes_ventasActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_reportes_ventas);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Historial2.png"))); // NOI18N
        jMenu7.setText("Historial");
        jMenu7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenu7.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_ver_historial.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItem_ver_historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jMenuItem_ver_historial.setText("Ver Historial");
        jMenuItem_ver_historial.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItem_ver_historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ver_historialActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem_ver_historial);

        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cerrar Sesion.png"))); // NOI18N
        jMenu8.setText("Cerrar Sesión");
        jMenu8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenu8.setPreferredSize(new java.awt.Dimension(200, 40));

        jMenuItem_cerrar_sesion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItem_cerrar_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cerrar Sesion 2.png"))); // NOI18N
        jMenuItem_cerrar_sesion.setText("Cerrar Sesión");
        jMenuItem_cerrar_sesion.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItem_cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_cerrar_sesionActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem_cerrar_sesion);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_reportes_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reportes_ventasActionPerformed
//        Reportes reporte = new Reportes();
//        reporte.ReportesVentas();
    }//GEN-LAST:event_jMenuItem_reportes_ventasActionPerformed

    private void jMenuItem_nueva_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nueva_categoriaActionPerformed
        InterCategoria interCategoria = new InterCategoria();
        jDesktopPane_menu.add(interCategoria);
        int width = jDesktopPane_menu.getWidth();
        int height = jDesktopPane_menu.getHeight();
        int x = (width - interCategoria.getWidth()) / 2;
        int y = (height - interCategoria.getHeight()) / 2;
        interCategoria.setBounds(x, y, interCategoria.getWidth(), interCategoria.getHeight());
        interCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nueva_categoriaActionPerformed

    private void jMenuItem_gestionar_categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_categoriasActionPerformed
        InterGestionarCategoria interGestionarCategoria = new InterGestionarCategoria();
        int width = jDesktopPane_menu.getWidth();
        int height = jDesktopPane_menu.getHeight();
        int x = (width - interGestionarCategoria.getWidth()) / 2;
        int y = (height - interGestionarCategoria.getHeight()) / 2;
        interGestionarCategoria.setBounds(x, y, interGestionarCategoria.getWidth(), interGestionarCategoria.getHeight());
        jDesktopPane_menu.add(interGestionarCategoria);
        interGestionarCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_categoriasActionPerformed

    private void jMenuItem_nuevo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_clienteActionPerformed
        InterCliente interCliente = new InterCliente();
        int width = jDesktopPane_menu.getWidth();
        int height = jDesktopPane_menu.getHeight();
        int x = (width - interCliente.getWidth()) / 2;
        int y = (height - interCliente.getHeight()) / 2;
        interCliente.setBounds(x, y, interCliente.getWidth(), interCliente.getHeight());
        jDesktopPane_menu.add(interCliente);
        interCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nuevo_clienteActionPerformed

    private void jMenuItem_gestionar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_clienteActionPerformed
        InterGestionarCliente interGestionarCliente = new InterGestionarCliente();
        int width = jDesktopPane_menu.getWidth();
        int height = jDesktopPane_menu.getHeight();
        int x = (width - interGestionarCliente.getWidth()) / 2;
        int y = (height - interGestionarCliente.getHeight()) / 2;
        interGestionarCliente.setBounds(x, y, interGestionarCliente.getWidth(), interGestionarCliente.getHeight());
        jDesktopPane_menu.add(interGestionarCliente);
        interGestionarCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_clienteActionPerformed

    private void jMenuItem_cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_cerrar_sesionActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem_cerrar_sesionActionPerformed

    private void jMenuItem_nuevo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_usuarioActionPerformed
        InterUsuario interUsuario = new InterUsuario();
        jDesktopPane_menu.add(interUsuario);
        int width = jDesktopPane_menu.getWidth();
        int height = jDesktopPane_menu.getHeight();
        int x = (width - interUsuario.getWidth()) / 2;
        int y = (height - interUsuario.getHeight()) / 2;
        interUsuario.setBounds(x, y, interUsuario.getWidth(), interUsuario.getHeight());
        interUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nuevo_usuarioActionPerformed

    private void jMenuItem_gestionar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_usuarioActionPerformed
        InterGestionarUsuario interGestionarUsuario = new InterGestionarUsuario();
        jDesktopPane_menu.add(interGestionarUsuario);
        int width = jDesktopPane_menu.getWidth();
        int height = jDesktopPane_menu.getHeight();
        int x = (width - interGestionarUsuario.getWidth()) / 2;
        int y = (height - interGestionarUsuario.getHeight()) / 2;
        interGestionarUsuario.setBounds(x, y, interGestionarUsuario.getWidth(), interGestionarUsuario.getHeight());
        interGestionarUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_usuarioActionPerformed

    private void jMenuItem_nueva_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nueva_ventaActionPerformed
        InterFacturacion interFacturacion = new InterFacturacion();
        jDesktopPane_menu.add(interFacturacion);
        int width = jDesktopPane_menu.getWidth();
        int height = jDesktopPane_menu.getHeight();
        int x = (width - interFacturacion.getWidth()) / 2;
        int y = (height - interFacturacion.getHeight()) / 2;
        interFacturacion.setBounds(x, y, interFacturacion.getWidth(), interFacturacion.getHeight());
        interFacturacion.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nueva_ventaActionPerformed

    private void jMenuItem_gestionar_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_ventasActionPerformed
        InterGestionarVentas interGestionarVentas = new InterGestionarVentas();
        jDesktopPane_menu.add(interGestionarVentas);
        int width = jDesktopPane_menu.getWidth();
        int height = jDesktopPane_menu.getHeight();
        int x = (width - interGestionarVentas.getWidth()) / 2;
        int y = (height - interGestionarVentas.getHeight()) / 2;
        interGestionarVentas.setBounds(x, y, interGestionarVentas.getWidth(), interGestionarVentas.getHeight());

        interGestionarVentas.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_ventasActionPerformed

    private void jMenuItem_reportes_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reportes_clientesActionPerformed
//        Reportes reporte = new Reportes();
//        reporte.ReportesClientes();
    }//GEN-LAST:event_jMenuItem_reportes_clientesActionPerformed

    private void jMenuItem_reportes_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reportes_productosActionPerformed
//        Reportes reporte = new Reportes();
//        reporte.ReportesProductos();
    }//GEN-LAST:event_jMenuItem_reportes_productosActionPerformed

    private void jMenuItem_reportes_categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reportes_categoriasActionPerformed
//        Reportes reporte = new Reportes();
//        reporte.ReportesCategorias();
    }//GEN-LAST:event_jMenuItem_reportes_categoriasActionPerformed

    private void jMenuItem_ver_historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ver_historialActionPerformed
        InterGraficas interGraficas = new InterGraficas();
        jDesktopPane_menu.add(interGraficas);
        int width = jDesktopPane_menu.getWidth();
        int height = jDesktopPane_menu.getHeight();
        int x = (width - interGraficas.getWidth()) / 2;
        int y = (height - interGraficas.getHeight()) / 2;
        interGraficas.setBounds(x, y, interGraficas.getWidth(), interGraficas.getHeight());
        interGraficas.setVisible(true);
    }//GEN-LAST:event_jMenuItem_ver_historialActionPerformed

    private void jMenuItem_nuevo_tecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_tecnicoActionPerformed
        // TODO add your handling code here:
        InterProveedores interProveedores = new InterProveedores();
        jDesktopPane_menu.add(interProveedores);
        int width = jDesktopPane_menu.getWidth();
        int height = jDesktopPane_menu.getHeight();
        int x = (width - interProveedores.getWidth()) / 2;
        int y = (height - interProveedores.getHeight()) / 2;
        interProveedores.setBounds(x, y, interProveedores.getWidth(), interProveedores.getHeight());

        interProveedores.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nuevo_tecnicoActionPerformed

    private void jMenuItem_gestionar_tecnicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_tecnicosActionPerformed
//         TODO add your handling code here:
        InterGestionarProveedor interGestionarProveedor = new InterGestionarProveedor();
        jDesktopPane_menu.add(interGestionarProveedor);
        int width = jDesktopPane_menu.getWidth();
        int height = jDesktopPane_menu.getHeight();
        int x = (width - interGestionarProveedor.getWidth()) / 2;
        int y = (height - interGestionarProveedor.getHeight()) / 2;
        interGestionarProveedor.setBounds(x, y, interGestionarProveedor.getWidth(), interGestionarProveedor.getHeight());

        interGestionarProveedor.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_tecnicosActionPerformed

    private void jMenuItem_nueva_venta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nueva_venta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_nueva_venta1ActionPerformed

    private void jMenuItem3_nuevo_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3_nuevo_productoActionPerformed
        InterProducto interProducto = new InterProducto();
        int width = jDesktopPane_menu.getWidth();
        int height = jDesktopPane_menu.getHeight();
        int x = (width - interProducto.getWidth()) / 2;
        int y = (height - interProducto.getHeight()) / 2;
        interProducto.setBounds(x, y, interProducto.getWidth(), interProducto.getHeight());
        jDesktopPane_menu.add(interProducto);
        interProducto.setVisible(true);
    }//GEN-LAST:event_jMenuItem3_nuevo_productoActionPerformed

    private void jMenuItem_gestionar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_productoActionPerformed
        InterGestionarProducto interGestionarProducto = new InterGestionarProducto();
        int width = jDesktopPane_menu.getWidth();
        int height = jDesktopPane_menu.getHeight();
        int x = (width - interGestionarProducto.getWidth()) / 2;
        int y = (height - interGestionarProducto.getHeight()) / 2;
        interGestionarProducto.setBounds(x, y, interGestionarProducto.getWidth(), interGestionarProducto.getHeight());
        jDesktopPane_menu.add(interGestionarProducto);
        interGestionarProducto.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_productoActionPerformed

    private void jMenuItem_actualizar_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_actualizar_stockActionPerformed
        InterActualizarStock interActualizarStock = new InterActualizarStock();
        int width = jDesktopPane_menu.getWidth();
        int height = jDesktopPane_menu.getHeight();
        int x = (width - interActualizarStock.getWidth()) / 2;
        int y = (height - interActualizarStock.getHeight()) / 2;
        jDesktopPane_menu.add(interActualizarStock);
        interActualizarStock.setBounds(x, y, interActualizarStock.getWidth(), interActualizarStock.getHeight());
        interActualizarStock.setVisible(true);
    }//GEN-LAST:event_jMenuItem_actualizar_stockActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnTecnicos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem3_nuevo_producto;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem_actualizar_stock;
    private javax.swing.JMenuItem jMenuItem_cerrar_sesion;
    private javax.swing.JMenuItem jMenuItem_gestionar_categorias;
    private javax.swing.JMenuItem jMenuItem_gestionar_cliente;
    private javax.swing.JMenuItem jMenuItem_gestionar_producto;
    private javax.swing.JMenuItem jMenuItem_gestionar_tecnicos;
    private javax.swing.JMenuItem jMenuItem_gestionar_usuario;
    private javax.swing.JMenuItem jMenuItem_gestionar_ventas;
    private javax.swing.JMenuItem jMenuItem_nueva_categoria;
    private javax.swing.JMenuItem jMenuItem_nueva_venta;
    private javax.swing.JMenuItem jMenuItem_nueva_venta1;
    private javax.swing.JMenuItem jMenuItem_nuevo_cliente;
    private javax.swing.JMenuItem jMenuItem_nuevo_tecnico;
    private javax.swing.JMenuItem jMenuItem_nuevo_usuario;
    private javax.swing.JMenuItem jMenuItem_reportes_categorias;
    private javax.swing.JMenuItem jMenuItem_reportes_clientes;
    private javax.swing.JMenuItem jMenuItem_reportes_productos;
    private javax.swing.JMenuItem jMenuItem_reportes_ventas;
    private javax.swing.JMenuItem jMenuItem_ver_historial;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
