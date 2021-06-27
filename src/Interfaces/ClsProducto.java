package Interfaces;

public class ClsProducto {

    private int idProducto;
    private String nombre;
    private String descripcion;
    private float precio;
    private int stock;
    private int estado;
    private String decEst;
    private String imgen;
    private int idLinea;
    private int idMarca;
    private int idPresentacion;
    private int idEstante;
    private int idUniMedidas;
    private Float descuento;
    private String descripcionM;
    private String descPres;
    private float Descuento;

    public ClsProducto(int idProducto, String nombre, String descripcion, float precio, int stock, String descripcionM, String descPres) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.descripcionM = descripcionM;
        this.descPres = descPres;
    }

    
    
    @Override
    public String toString() {
        return "ClsProducto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + ", stock=" + stock + ", estado=" + estado + ", decEst=" + decEst + ", imgen=" + imgen + ", idLinea=" + idLinea + ", idMarca=" + idMarca + ", idPresentacion=" + idPresentacion + ", idEstante=" + idEstante + ", idUniMedidas=" + idUniMedidas + ", descuento=" + descuento + '}';
    }

    public ClsProducto(int idProducto, String nombre, String descripcion, float precio, int stock, int estado, String decEst, String imgen, int idLinea, int idMarca, int idPresentacion, int idEstante, int idUniMedidas, Float descuento) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.estado = estado;
        this.decEst = decEst;
        this.imgen = imgen;
        this.idLinea = idLinea;
        this.idMarca = idMarca;
        this.idPresentacion = idPresentacion;
        this.idEstante = idEstante;
        this.idUniMedidas = idUniMedidas;
        this.descuento = descuento;
    }

    public ClsProducto() {
    }

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

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getDecEst() {
        return decEst;
    }

    public void setDecEst(String decEst) {
        this.decEst = decEst;
    }

    public String getImgen() {
        return imgen;
    }

    public void setImgen(String imgen) {
        this.imgen = imgen;
    }

    public int getIdLinea() {
        return idLinea;
    }

    public void setIdLinea(int idLinea) {
        this.idLinea = idLinea;
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

    public int getIdUniMedidas() {
        return idUniMedidas;
    }

    public void setIdUniMedidas(int idUniMedidas) {
        this.idUniMedidas = idUniMedidas;
    }

    public Float getDescuento() {
        return descuento;
    }

    public void setDescuento(Float descuento) {
        this.descuento = descuento;
    }




}
