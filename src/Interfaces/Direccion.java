
package Interfaces;

public class Direccion {
    private int idDireccion;
    private String descripcionD;
    private boolean estado;
    private String Principal;
    private int idPersona;

    public int getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getDescripcionD() {
        return descripcionD;
    }

    public void setDescripcionD(String descripcionD) {
        this.descripcionD = descripcionD;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getPrincipal() {
        return Principal;
    }

    public void setPrincipal(String Principal) {
        this.Principal = Principal;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public Direccion() {
    }

    public Direccion(int idDireccion, String descripcionD, boolean estado, String Principal, int idPersona) {
        this.idDireccion = idDireccion;
        this.descripcionD = descripcionD;
        this.estado = estado;
        this.Principal = Principal;
        this.idPersona = idPersona;
    }

    @Override
    public String toString() {
        return "Direccion{" + "idDireccion=" + idDireccion + ", descripcionD=" + descripcionD + ", estado=" + estado + ", Principal=" + Principal + ", idPersona=" + idPersona + '}';
    }
    
    
    
    
}
