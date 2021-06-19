
package Interfaces;

public class detalleCompra {
    private int idDetCompra ;
    private float descuento ;
    private float precio ;
    private int cantidad ;
    private float subtotal ;
    private int idCompra ;
    private int idProducto ;

    public int getIdDetCompra() {
        return idDetCompra;
    }

    public void setIdDetCompra(int idDetCompra) {
        this.idDetCompra = idDetCompra;
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

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public detalleCompra() {
    }

    public detalleCompra(int idDetCompra, float descuento, float precio, int cantidad, float subtotal, int idCompra, int idProducto) {
        this.idDetCompra = idDetCompra;
        this.descuento = descuento;
        this.precio = precio;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.idCompra = idCompra;
        this.idProducto = idProducto;
    }

    public detalleCompra(float descuento, float precio, int cantidad, float subtotal, int idCompra, int idProducto) {
        this.descuento = descuento;
        this.precio = precio;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.idCompra = idCompra;
        this.idProducto = idProducto;
    }

    public detalleCompra(float descuento, float precio, int cantidad, float subtotal, int idProducto) {
        this.descuento = descuento;
        this.precio = precio;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.idProducto = idProducto;
    }

    @Override
    public String toString() {
        return "detalleCompra{" + "idDetCompra=" + idDetCompra + ", descuento=" + descuento + ", precio=" + precio + ", cantidad=" + cantidad + ", subtotal=" + subtotal + ", idCompra=" + idCompra + ", idProducto=" + idProducto + '}';
    }
    
    
    
}
