
package Interfaces;

public class Producto {
    private int idProducto;
    private String nombre;
    private String descripcion;
    private float precio;
    private int stock;
    private String estado;
    private String imgen;
    private int idMarca ;
    private int idPresentacion ;
    private int idEstante;

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getImgen() {
        return imgen;
    }

    public void setImgen(String imgen) {
        this.imgen = imgen;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public int getIdPresentacion() {
        return idPresentacion;
    }

    public void setIdPresentacion(int idPresentacion) {
        this.idPresentacion = idPresentacion;
    }

    public int getIdEstante() {
        return idEstante;
    }

    public void setIdEstante(int idEstante) {
        this.idEstante = idEstante;
    }

    public Producto() {
    }

    public Producto(int idProducto, String nombre, String descripcion, float precio, int stock, String estado, String imgen, int idMarca, int idPresentacion, int idEstante) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.estado = estado;
        this.imgen = imgen;
        this.idMarca = idMarca;
        this.idPresentacion = idPresentacion;
        this.idEstante = idEstante;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + ", stock=" + stock + ", estado=" + estado + ", imgen=" + imgen + ", idMarca=" + idMarca + ", idPresentacion=" + idPresentacion + ", idEstante=" + idEstante + '}';
    }
    
    
    
}
