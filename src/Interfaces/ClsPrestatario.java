package Interfaces;

public class ClsPrestatario {

    private int idPrestatario;
    private String razonSocial;
    private String DescDir;
    private String ruc;
    private boolean estadoPs;
// se modifico el cambioo a todo el codigo xd
    public int getIdPrestatario() {
        return idPrestatario;
    }

     public void setIdPrestatario(int idPrestatario) {
        this.idPrestatario = idPrestatario;
    }

     public String getrazonSocial() {
        return razonSocial;
    }

    public void setrazonSocial(String DescDir) {
        this.razonSocial = DescDir;
    }  
     
     
     public String getDescDir() {
        return DescDir;
    }

    public void setDescDir(String DescDir) {
        this.DescDir = DescDir;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public boolean isEstadoPs() {
        return estadoPs;
    }

    public void setEstadoPs(boolean estadoPs) {
        this.estadoPs = estadoPs;
    }

    public ClsPrestatario() {
    }

    public ClsPrestatario(int idPrestatario,String razonSocial, String DescDir, String ruc, boolean estadoPs) {
        this.idPrestatario = idPrestatario;
        this.razonSocial = razonSocial;
        this.DescDir = DescDir;
        this.ruc = ruc;
        this.estadoPs = estadoPs;
    }

    @Override
    public String toString() {
        return idPrestatario + " " + razonSocial;
    }

}
