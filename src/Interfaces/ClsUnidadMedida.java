
package Interfaces;


public class ClsUnidadMedida {
    private int idUniMedidas;
    private String DescripcionUni;
    private String abreviatura;

    @Override
    public String toString() {
        return idUniMedidas + " " + DescripcionUni ;
    }

    public ClsUnidadMedida(int idUniMedidas, String DescripcionUni, String abreviatura) {
        this.idUniMedidas = idUniMedidas;
        this.DescripcionUni = DescripcionUni;
        this.abreviatura = abreviatura;
    }

    public ClsUnidadMedida() {
    }

    public int getIdUniMedidas() {
        return idUniMedidas;
    }

    public void setIdUniMedidas(int idUniMedidas) {
        this.idUniMedidas = idUniMedidas;
    }

    public String getDescripcionUni() {
        return DescripcionUni;
    }

    public void setDescripcionUni(String DescripcionUni) {
        this.DescripcionUni = DescripcionUni;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }
 
}
