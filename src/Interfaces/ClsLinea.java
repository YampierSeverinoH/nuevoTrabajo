
package Interfaces;

public class ClsLinea {
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

    public ClsLinea() {
    }

    public ClsLinea(int idLinea, String descriocionL) {
        this.idLinea = idLinea;
        this.descriocionL = descriocionL;
    }

    @Override
    public String toString() {
        return idLinea + "-" + descriocionL ;
    }
    
    
}
