
package Interfaces;

public class ClsAreaT {
private int idArea;
private int estadoA;
private String descArea;

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public int getEstadoA() {
        return estadoA;
    }

    public void setEstadoA(int estadoA) {
        this.estadoA = estadoA;
    }

    public String getDescArea() {
        return descArea;
    }

    public void setDescArea(String descArea) {
        this.descArea = descArea;
    }

    public ClsAreaT() {
    }

    public ClsAreaT(int idArea, int estadoA, String descArea) {
        this.idArea = idArea;
        this.estadoA = estadoA;
        this.descArea = descArea;
    }

    @Override
    public String toString() {
        return idArea + " " + descArea;
    }


    
}
