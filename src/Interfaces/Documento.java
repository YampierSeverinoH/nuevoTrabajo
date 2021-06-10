
package Interfaces;

public class Documento {
    
    private int idDocumento;
    private String nDocumento ;
    private String Primario;
    private  String EstadoD ;
    private  int idTipoDoc ;
    private  int idPersona ;

    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getnDocumento() {
        return nDocumento;
    }

    public void setnDocumento(String nDocumento) {
        this.nDocumento = nDocumento;
    }

    public String getPrimario() {
        return Primario;
    }

    public void setPrimario(String Primario) {
        this.Primario = Primario;
    }

    public String getEstadoD() {
        return EstadoD;
    }

    public void setEstadoD(String EstadoD) {
        this.EstadoD = EstadoD;
    }

    public int getIdTipoDoc() {
        return idTipoDoc;
    }

    public void setIdTipoDoc(int idTipoDoc) {
        this.idTipoDoc = idTipoDoc;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public Documento() {
    }

    public Documento(int idDocumento, String nDocumento, String Primario, String EstadoD, int idTipoDoc, int idPersona) {
        this.idDocumento = idDocumento;
        this.nDocumento = nDocumento;
        this.Primario = Primario;
        this.EstadoD = EstadoD;
        this.idTipoDoc = idTipoDoc;
        this.idPersona = idPersona;
    }

    @Override
    public String toString() {
        return "Documento{" + "idDocumento=" + idDocumento + ", nDocumento=" + nDocumento + ", Primario=" + Primario + ", EstadoD=" + EstadoD + ", idTipoDoc=" + idTipoDoc + ", idPersona=" + idPersona + '}';
    }
    
    
}
