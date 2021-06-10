
package Interfaces;

public class RolAcceso {
    private int idRolAcceso;
    private String estado ;
    private int idRol ;
    private int idAcceso ;

    public int getIdRolAcceso() {
        return idRolAcceso;
    }

    public void setIdRolAcceso(int idRolAcceso) {
        this.idRolAcceso = idRolAcceso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public int getIdAcceso() {
        return idAcceso;
    }

    public void setIdAcceso(int idAcceso) {
        this.idAcceso = idAcceso;
    }

    public RolAcceso() {
    }

    public RolAcceso(int idRolAcceso, String estado, int idRol, int idAcceso) {
        this.idRolAcceso = idRolAcceso;
        this.estado = estado;
        this.idRol = idRol;
        this.idAcceso = idAcceso;
    }

    @Override
    public String toString() {
        return "RolAcceso{" + "idRolAcceso=" + idRolAcceso + ", estado=" + estado + ", idRol=" + idRol + ", idAcceso=" + idAcceso + '}';
    }
    
    
}
