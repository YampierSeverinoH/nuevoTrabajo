
package Interfaces;

public class RolUser {
    private int idRolUser;
    private String estado ;
    private int idRol ;
    private String inicio ;
    private String baja ;
    private int idUsuario ;

    public int getIdRolUser() {
        return idRolUser;
    }

    public void setIdRolUser(int idRolUser) {
        this.idRolUser = idRolUser;
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

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getBaja() {
        return baja;
    }

    public void setBaja(String baja) {
        this.baja = baja;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public RolUser() {
    }

    public RolUser(int idRolUser, String estado, int idRol, String inicio, String baja, int idUsuario) {
        this.idRolUser = idRolUser;
        this.estado = estado;
        this.idRol = idRol;
        this.inicio = inicio;
        this.baja = baja;
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "RolUser{" + "idRolUser=" + idRolUser + ", estado=" + estado + ", idRol=" + idRol + ", inicio=" + inicio + ", baja=" + baja + ", idUsuario=" + idUsuario + '}';
    }
    
    
    
    
    
}
