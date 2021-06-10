package Interfaces;

public class Acceso {
    private int idAcceso ;
    private String descripcion ;
    private String estado ;

    public int getIdAcceso() {
        return idAcceso;
    }

    public void setIdAcceso(int idAcceso) {
        this.idAcceso = idAcceso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Acceso() {
    }

    public Acceso(int idAcceso, String descripcion, String estado) {
        this.idAcceso = idAcceso;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Acceso{" + "idAcceso=" + idAcceso + ", descripcion=" + descripcion + ", estado=" + estado + '}';
    }
    
    
    
    
    
}
