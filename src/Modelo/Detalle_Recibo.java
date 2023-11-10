/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author djcor
 */
public class Detalle_Recibo {

    private String idDetalle;
    private int cantidad;
    private String idProducto;

    public Detalle_Recibo() {
    }

    public Detalle_Recibo(String idDetalle, int cantidad, String idProducto) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.idProducto = idProducto;
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

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

}
