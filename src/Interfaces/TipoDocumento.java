
package Interfaces;

public class TipoDocumento {
    private int idTipoDocumento;
    private String DescTipodoc;
    private String estado;

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getDescTipodoc() {
        return DescTipodoc;
    }

    public void setDescTipodoc(String DescTipodoc) {
        this.DescTipodoc = DescTipodoc;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public TipoDocumento() {
    }

    public TipoDocumento(int idTipoDocumento, String DescTipodoc, String estado) {
        this.idTipoDocumento = idTipoDocumento;
        this.DescTipodoc = DescTipodoc;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "TipoDocumento{" + "idTipoDocumento=" + idTipoDocumento + ", DescTipodoc=" + DescTipodoc + ", estado=" + estado + '}';
    }
    
    
}
