
package Interfaces;

public class ClsMarca {
    private int idMarca;
    private String descripcionM;

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getDescripcionM() {
        return descripcionM;
    }

    public void setDescripcionM(String descripcionM) {
        this.descripcionM = descripcionM;
    }

    public ClsMarca() {
    }

    public ClsMarca(int idMarca, String descripcionM) {
        this.idMarca = idMarca;
        this.descripcionM = descripcionM;
    }

    @Override
    public String toString() {
        return  idMarca + " " + descripcionM;
    }
    
    
}
