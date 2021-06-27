package Interfaces;

public class ClsCliente {

    private int idCliente;
    private int idPrestatario;
    private int idPersona;
    private int estado;
    private String fecha;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdPrestatario() {
        return idPrestatario;
    }

    public void setIdPrestatario(int idPrestatario) {
        this.idPrestatario = idPrestatario;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int isEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ClsCliente() {
    }

    public ClsCliente(int idCliente, int idPrestatario, int idPersona, int estado, String fecha) {
        this.idCliente = idCliente;
        this.idPrestatario = idPrestatario;
        this.idPersona = idPersona;
        this.estado = estado;
        this.fecha = fecha;
    }

    public ClsCliente(int idPrestatario, int idPersona, int estado, String fecha) {
        this.idPrestatario = idPrestatario;
        this.idPersona = idPersona;
        this.estado = estado;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", idPrestatario=" + idPrestatario + ", idPersona=" + idPersona + ", estado=" + estado + ", fecha=" + fecha + '}';
    }

}
