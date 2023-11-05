/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


/**
 *
 * @author kevfe
 */
public class Producto_Alq {

    /**
     * @return the id_producto
     */
    
        // Tabla productos_alq
    private int id_producto;
    private String nom_produc;
    private Double precio_por_dia;
    private int stock;
    
    //Tabla Det_alquiler
    private int id_alquiler;
    private String fech_ini;
    private String fech_fin;
    private int id_cliente;
    //idproducto se repite
    private String estado;
    
    // Constructor
    public Producto_Alq(int auxIdDetalle, int par, int idProducto, String nombre, int parseInt, double precioUnitario, double subtotal, double descuento, double igv, double totalPagar, String activo) {
        this.id_producto = 0;
        this.nom_produc = "";
        this.precio_por_dia = 0.0;
        this.stock = 0;
        
        this.id_alquiler = 0;
        this.fech_ini = "";
        this.fech_fin = "";
        this.id_cliente = 0;
        this.id_producto = 0;
        this.estado = "";
    }
    
        // Constructor
    public Producto_Alq(int id_producto, String nom_produc, Double precio_por_dia, int stock) {
        this.id_producto = id_producto;
        this.nom_produc = nom_produc;
        
        this.precio_por_dia = precio_por_dia;
        this.stock = stock;
    }
    
        // Constructor
    public Producto_Alq(int id_alquiler, String fech_ini, String fech_fin, int id_cliente, int id_producto, String estado) {
        this.id_alquiler = id_alquiler;
        this.fech_ini = fech_ini;
        this.fech_fin = fech_fin;
        this.id_cliente = id_cliente;
        this.id_producto = id_producto;
        this.estado = estado;
    }

    public Producto_Alq() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public int getId_producto() {
        return id_producto;
    }

    /**
     * @param id_producto the id_producto to set
     */
    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    /**
     * @return the nom_produc
     */
    public String getNom_produc() {
        return nom_produc;
    }

    /**
     * @param nom_produc the nom_produc to set
     */
    public void setNom_produc(String nom_produc) {
        this.nom_produc = nom_produc;
    }

    public Double getPrecio_por_dia() {
        return precio_por_dia;
    }

    /**
     * @param precio_por_dia the precio_por_dia to set
     */
    public void setPrecio_por_dia(Double precio_por_dia) {
        this.precio_por_dia = precio_por_dia;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the id_alquiler
     */
    public int getId_alquiler() {
        return id_alquiler;
    }

    /**
     * @param id_alquiler the id_alquiler to set
     */
    public void setId_alquiler(int id_alquiler) {
        this.id_alquiler = id_alquiler;
    }

    /**
     * @return the fech_ini
     */
    public String getFech_ini() {
        return fech_ini;
    }

    /**
     * @param fech_ini the fech_ini to set
     */
    public void setFech_ini(String fech_ini) {
        this.fech_ini = fech_ini;
    }

    /**
     * @return the fech_fin
     */
    public String getFech_fin() {
        return fech_fin;
    }

    /**
     * @param fech_fin the fech_fin to set
     */
    public void setFech_fin(String fech_fin) {
        this.fech_fin = fech_fin;
    }

    /**
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
