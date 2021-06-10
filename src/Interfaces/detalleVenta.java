
package Interfaces;

public class detalleVenta {
    private int idDetVenta;
    private float descuento;
    private float precio;
    private int cantidad ;
    private float subtotal;
    private int idVenta ;
    private int idProducto ;

    public int getIdDetVenta() {
        return idDetVenta;
    }

    public void setIdDetVenta(int idDetVenta) {
        this.idDetVenta = idDetVenta;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public detalleVenta() {
    }

    public detalleVenta(int idDetVenta, float descuento, float precio, int cantidad, float subtotal, int idVenta, int idProducto) {
        this.idDetVenta = idDetVenta;
        this.descuento = descuento;
        this.precio = precio;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.idVenta = idVenta;
        this.idProducto = idProducto;
    }

    @Override
    public String toString() {
        return "detalleVenta{" + "idDetVenta=" + idDetVenta + ", descuento=" + descuento + ", precio=" + precio + ", cantidad=" + cantidad + ", subtotal=" + subtotal + ", idVenta=" + idVenta + ", idProducto=" + idProducto + '}';
    }
    
    
    
}
