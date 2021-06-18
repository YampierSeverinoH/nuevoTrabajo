/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author yam_g
 */
public class VentaProducto {
    private Producto p;
    private  int cantidad;

    public Producto getP() {
        return p;
    }

    public void setP(Producto p) {
        this.p = p;
    }

    public int getCantidad() {
        return cantidad;
    }

    public VentaProducto(Producto p, int cantidad) {
        this.p = p;
        this.cantidad = cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public VentaProducto() {
    }
    
}
