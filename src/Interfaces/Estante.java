
package Interfaces;

public class Estante {
    private int idEstante;
    private String codigo;
    private String estado;
    private int idAlmacen;

    public int getIdEstante() {
        return idEstante;
    }

    public void setIdEstante(int idEstante) {
        this.idEstante = idEstante;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(int idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public Estante() {
    }

    public Estante(int idEstante, String codigo, String estado, int idAlmacen) {
        this.idEstante = idEstante;
        this.codigo = codigo;
        this.estado = estado;
        this.idAlmacen = idAlmacen;
    }

    @Override
    public String toString() {
        return "Estante{" + "idEstante=" + idEstante + ", codigo=" + codigo + ", estado=" + estado + ", idAlmacen=" + idAlmacen + '}';
    }
    
    
    
    
    
}
