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
public class Recibo {

    private String idRecibo;
    private Date fecha;
    private String idCliente;

    public Recibo() {
    }

    public Recibo(String idRecibo, Date fecha, String idCliente) {
        this.idRecibo = idRecibo;
        this.fecha = fecha;
        this.idCliente = idCliente;
    }

    public String getIdRecibo() {
        return idRecibo;
    }

    public void setIdRecibo(String idRecibo) {
        this.idRecibo = idRecibo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

}
