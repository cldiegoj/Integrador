/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author djcor
 */
public class Detalle_Recibo extends Producto{

    private String idDetalle;
    private int cantidad;
    private Producto producto;
    private double subtotal;
    

    public Detalle_Recibo() {
    }

    public Detalle_Recibo(String idDetalle, int cantidad, Producto producto, double subtotal) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.producto = producto;
        this.subtotal = subtotal;
    }

    

    public String getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(String idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

   
    public double precioSubtotal() {
        return cantidad*super.getProdpre();
    }
    
  
    public Object[] registrarItem(){
        Object[] Fila ={idDetalle,super.getProdcod(),super.getProdnom(),cantidad, super.getProdpre(), precioSubtotal()};
        return Fila;
    }


}
