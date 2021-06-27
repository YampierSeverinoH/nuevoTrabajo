package Interfaces;

public class ClsUsuario {

    private int idUsuario;
    private String descripcion;
    private String pass;
    private byte estado;
    private String decEst;
    private String creacion;
    private String baja;
    private int idPersona;
    private String imagen;

    public ClsUsuario(String descripcion, String pass, byte estado, String decEst, String creacion, String baja, int idPersona, String imagen) {
        this.descripcion = descripcion;
        this.pass = pass;
        this.estado = estado;
        this.decEst = decEst;
        this.creacion = creacion;
        this.baja = baja;
        this.idPersona = idPersona;
        this.imagen = imagen;
    }

 

    @Override
    public String toString() {
        return "ClsUsuario{" + "idUsuario=" + idUsuario + ", descripcion=" + descripcion + ", pass=" + pass + ", estado=" + estado + ", decEst=" + decEst + ", creacion=" + creacion + ", baja=" + baja + ", idPersona=" + idPersona + ", imagen=" + imagen + '}';
    }

    public ClsUsuario(int idUsuario, String descripcion, String pass, byte estado, String decEst, String creacion, String baja, int idPersona, String imagen) {
        this.idUsuario = idUsuario;
        this.descripcion = descripcion;
        this.pass = pass;
        this.estado = estado;
        this.decEst = decEst;
        this.creacion = creacion;
        this.baja = baja;
        this.idPersona = idPersona;
        this.imagen = imagen;
    }

    public ClsUsuario() {
    }

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

    public byte getEstado() {
        return estado;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
    }

    public String getDecEst() {
        return decEst;
    }

    public void setDecEst(String decEst) {
        this.decEst = decEst;
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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
    
    
}
