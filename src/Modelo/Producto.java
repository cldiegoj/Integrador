/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author kevfe
 */
public class Producto {
    private int prodcod;
    private int stock;
    private String prodnom;
    private String proddes;
    private String catcod;
    private double prodpre;

    public Producto() {
    }

    public Producto(int prodcod, int stock, String prodnom, String proddes, String catcod, double prodpre) {
        this.prodcod = prodcod;
        this.stock = stock;
        this.prodnom = prodnom;
        this.proddes = proddes;
        this.catcod = catcod;
        this.prodpre = prodpre;
    }
    
    
    
    public int getProdcod() {
        return prodcod;
    }

    public void setProdcod(int prodcod) {
        this.prodcod = prodcod;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getProdnom() {
        return prodnom;
    }

    public void setProdnom(String prodnom) {
        this.prodnom = prodnom;
    }

    public String getProddes() {
        return proddes;
    }

    public void setProddes(String proddes) {
        this.proddes = proddes;
    }

    public String getCatcod() {
        return catcod;
    }

    public void setCatcod(String catcod) {
        this.catcod = catcod;
    }

    public double getProdpre() {
        return prodpre;
    }

    public void setProdpre(double prodpre) {
        this.prodpre = prodpre;
    }
    
    
}
