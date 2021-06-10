
package Interfaces;


public class Rol {
    private int idRol;
    private String descripcion ;
    private String estado;

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
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

    public Rol() {
    }

    public Rol(int idRol, String descripcion, String estado) {
        this.idRol = idRol;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Rol{" + "idRol=" + idRol + ", descripcion=" + descripcion + ", estado=" + estado + '}';
    }
    
    
    
    
}
