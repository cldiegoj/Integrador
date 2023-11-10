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

    private String idInsumos;
    private String nombre;
    private String descripcion;
    private int stock;
    private String idProveedor;

    public Insumos() {
    }

    public Insumos(String idInsumos, String nombre, String descripcion, int stock, String idProveedor) {
        this.idInsumos = idInsumos;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.stock = stock;
        this.idProveedor = idProveedor;
    }

    public String getIdInsumos() {
        return idInsumos;
    }

    public void setIdInsumos(String idInsumos) {
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

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

}
