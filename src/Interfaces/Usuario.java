
package Interfaces;


public class Usuario {
    private int idUsuario ;
    private String descripcion ;
    private String pass ;
    private String estado ;
    private String creacion ;
    private String baja ;
    private int idPersona ;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCreacion() {
        return creacion;
    }

    public void setCreacion(String creacion) {
        this.creacion = creacion;
    }

    public String getBaja() {
        return baja;
    }

    public void setBaja(String baja) {
        this.baja = baja;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public Usuario() {
    }

    public Usuario(int idUsuario, String descripcion, String pass, String estado, String creacion, String baja, int idPersona) {
        this.idUsuario = idUsuario;
        this.descripcion = descripcion;
        this.pass = pass;
        this.estado = estado;
        this.creacion = creacion;
        this.baja = baja;
        this.idPersona = idPersona;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", descripcion=" + descripcion + ", pass=" + pass + ", estado=" + estado + ", creacion=" + creacion + ", baja=" + baja + ", idPersona=" + idPersona + '}';
    }
    
    
    
    
}
