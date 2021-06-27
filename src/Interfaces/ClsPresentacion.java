
package Interfaces;

public class ClsPresentacion {
    private int idPresentacion;
    private  String descPres;
    private  int cant ;

    public int getIdPresentacion() {
        return idPresentacion;
    }

    public void setIdPresentacion(int idPresentacion) {
        this.idPresentacion = idPresentacion;
    }
//modificado 2.2
    public String getDescPres() {
        return descPres;
    }

    public void setDescPres(String descPres) {
        this.descPres = descPres;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public ClsPresentacion() {
    }

    public ClsPresentacion(int idPresentacion, String descPres, int cant) {
        this.idPresentacion = idPresentacion;
        this.descPres = descPres;
        this.cant = cant;
    }

    @Override
    public String toString() {
        return idPresentacion + " " + descPres ;
    }
    
    
    
}
