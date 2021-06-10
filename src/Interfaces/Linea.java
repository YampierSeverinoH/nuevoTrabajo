
package Interfaces;

public class Linea {
    private int idLinea;
    private String descriocionL;

    public int getIdLinea() {
        return idLinea;
    }

    public void setIdLinea(int idLinea) {
        this.idLinea = idLinea;
    }

    public String getDescriocionL() {
        return descriocionL;
    }

    public void setDescriocionL(String descriocionL) {
        this.descriocionL = descriocionL;
    }

    public Linea() {
    }

    public Linea(int idLinea, String descriocionL) {
        this.idLinea = idLinea;
        this.descriocionL = descriocionL;
    }

    @Override
    public String toString() {
        return "Linea{" + "idLinea=" + idLinea + ", descriocionL=" + descriocionL + '}';
    }
    
    
}
