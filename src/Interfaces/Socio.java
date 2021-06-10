
package Interfaces;


public class Socio {
    private int idSocio;
    private int idPrestatario;
    private int idRepresentante;
    private boolean estado;
    private String fecha;
    private String baja;

    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public int getIdPrestatario() {
        return idPrestatario;
    }

    public void setIdPrestatario(int idPrestatario) {
        this.idPrestatario = idPrestatario;
    }

    public int getIdRepresentante() {
        return idRepresentante;
    }

    public void setIdRepresentante(int idRepresentante) {
        this.idRepresentante = idRepresentante;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getBaja() {
        return baja;
    }

    public void setBaja(String baja) {
        this.baja = baja;
    }

    public Socio() {
    }

    public Socio(int idSocio, int idPrestatario, int idRepresentante, boolean estado, String fecha, String baja) {
        this.idSocio = idSocio;
        this.idPrestatario = idPrestatario;
        this.idRepresentante = idRepresentante;
        this.estado = estado;
        this.fecha = fecha;
        this.baja = baja;
    }

    @Override
    public String toString() {
        return "Socio{" + "idSocio=" + idSocio + ", idPrestatario=" + idPrestatario + ", idRepresentante=" + idRepresentante + ", estado=" + estado + ", fecha=" + fecha + ", baja=" + baja + '}';
    }
    
    
}
