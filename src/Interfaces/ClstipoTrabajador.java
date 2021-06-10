
package Interfaces;
public class ClstipoTrabajador {
    private int idTipTrab;
    private int estadoTT;
    private String descTipoTrab;

    public int getIdTipTrab() {
        return idTipTrab;
    }

    public void setIdTipTrab(int idTipTrab) {
        this.idTipTrab = idTipTrab;
    }

    public int getEstadoTT() {
        return estadoTT;
    }

    public void setEstadoTT(int estadoTT) {
        this.estadoTT = estadoTT;
    }

    public String getDescTipoTrab() {
        return descTipoTrab;
    }

    public void setDescTipoTrab(String descTipoTrab) {
        this.descTipoTrab = descTipoTrab;
    }

    public ClstipoTrabajador() {
    }

    public ClstipoTrabajador(int idTipTrab, int estadoTT, String descTipoTrab) {
        this.idTipTrab = idTipTrab;
        this.estadoTT = estadoTT;
        this.descTipoTrab = descTipoTrab;
    }

    @Override
    public String toString() {
        return idTipTrab + " " + descTipoTrab;
    }
    
    
    
    
}
