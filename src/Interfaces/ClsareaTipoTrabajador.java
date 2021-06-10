
package Interfaces;


public class ClsareaTipoTrabajador {
    private int idAreaTipTrab;
    private String fecha;
    private int estado;
    private int idArea;
    private int idTipTrab;
    private int idTrabajador;

    public int getIdAreaTipTrab() {
        return idAreaTipTrab;
    }

    public void setIdAreaTipTrab(int idAreaTipTrab) {
        this.idAreaTipTrab = idAreaTipTrab;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public int getIdTipTrab() {
        return idTipTrab;
    }

    public void setIdTipTrab(int idTipTrab) {
        this.idTipTrab = idTipTrab;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public ClsareaTipoTrabajador() {
    }

    public ClsareaTipoTrabajador(int idAreaTipTrab, String fecha, int estado, int idArea, int idTipTrab, int idTrabajador) {
        this.idAreaTipTrab = idAreaTipTrab;
        this.fecha = fecha;
        this.estado = estado;
        this.idArea = idArea;
        this.idTipTrab = idTipTrab;
        this.idTrabajador = idTrabajador;
    }

    @Override
    public String toString() {
        return "areaTipoTrabajador{" + "idAreaTipTrab=" + idAreaTipTrab + ", fecha=" + fecha + ", estado=" + estado + ", idArea=" + idArea + ", idTipTrab=" + idTipTrab + ", idTrabajador=" + idTrabajador + '}';
    }
    
    
    
    
}
