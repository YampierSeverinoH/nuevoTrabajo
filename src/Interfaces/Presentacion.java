
package Interfaces;

public class Presentacion {
    private int idPresentacion;
    private  String descPres;
    private  int cant ;

    public int getIdPresentacion() {
        return idPresentacion;
    }

    public void setIdPresentacion(int idPresentacion) {
        this.idPresentacion = idPresentacion;
    }

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

    public Presentacion() {
    }

    public Presentacion(int idPresentacion, String descPres, int cant) {
        this.idPresentacion = idPresentacion;
        this.descPres = descPres;
        this.cant = cant;
    }

    @Override
    public String toString() {
        return "Presentacion{" + "idPresentacion=" + idPresentacion + ", descPres=" + descPres + ", cant=" + cant + '}';
    }
    
    
    
}
