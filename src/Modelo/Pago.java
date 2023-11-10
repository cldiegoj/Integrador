/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author djcor
 */
public class Pago {

    private String idPago;
    private String comprobante;
    private double igv;
    private double total;
    private Date fecha;
    private String idRecibo;

    public Pago() {
    }

    public Pago(String idPago, String comprobante, double igv, double total, Date fecha, String idRecibo) {
        this.idPago = idPago;
        this.comprobante = comprobante;
        this.igv = igv;
        this.total = total;
        this.fecha = fecha;
        this.idRecibo = idRecibo;
    }

    public String getIdPago() {
        return idPago;
    }

    public void setIdPago(String idPago) {
        this.idPago = idPago;
    }

    public String getComprobante() {
        return comprobante;
    }

    public void setComprobante(String comprobante) {
        this.comprobante = comprobante;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getIdRecibo() {
        return idRecibo;
    }

    public void setIdRecibo(String idRecibo) {
        this.idRecibo = idRecibo;
    }

}
