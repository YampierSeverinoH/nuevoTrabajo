
package Interfaces;

public class Compra {
    
    private int idCompra;
    private String fecha ;
    private float totalC ;
    private String estado ;
    private int idSocio ;
    private int idTrabajador ;

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getTotalC() {
        return totalC;
    }

    public void setTotalC(float totalC) {
        this.totalC = totalC;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public Compra() {
    }

    public Compra(int idCompra, String fecha, float totalC, String estado, int idSocio, int idTrabajador) {
        this.idCompra = idCompra;
        this.fecha = fecha;
        this.totalC = totalC;
        this.estado = estado;
        this.idSocio = idSocio;
        this.idTrabajador = idTrabajador;
    }

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", fecha=" + fecha + ", totalC=" + totalC + ", estado=" + estado + ", idSocio=" + idSocio + ", idTrabajador=" + idTrabajador + '}';
    }
    
    
    
    
}
