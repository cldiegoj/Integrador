/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author djcor
 */
public class Proveedor {

    private String idProveedor;
    private String nombre;
    private String descripcion;
    private int ruc;

    public Proveedor() {
    }

    public Proveedor(String idProveedor, String nombre, String descripcion, int ruc) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ruc = ruc;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
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

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

}
