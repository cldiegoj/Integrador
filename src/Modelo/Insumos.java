/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author djcor
 */
public class Insumos {

    private int idInsumos;
    private String nombre;
    private String descripcion;
    private int stock;
    private int idProveedor;
    private String nombreproveedor;

    public Insumos() {
    }

    public Insumos(int idInsumos, String nombre, String descripcion, int stock, int idProveedor) {
        this.idInsumos = idInsumos;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.stock = stock;
        this.idProveedor = idProveedor;
    }

    public int getIdInsumos() {
        return idInsumos;
    }

    public void setIdInsumos(int idInsumos) {
        this.idInsumos = idInsumos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreproveedor() {
        return nombreproveedor;
    }

    public void setNombreproveedor(String nombreproveedor) {
        this.nombreproveedor = nombreproveedor;
    }

}
