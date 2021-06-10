
package Interfaces;

public class Email {
    private int idEmail;
    private String descripcionE;
    private String Principal;
    private boolean estadoE;
    private int idPersona;

    public int getIdEmail() {
        return idEmail;
    }

    public void setIdEmail(int idEmail) {
        this.idEmail = idEmail;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getPrincipal() {
        return Principal;
    }

    public void setPrincipal(String Principal) {
        this.Principal = Principal;
    }

    public boolean isEstadoE() {
        return estadoE;
    }

    public void setEstadoE(boolean estadoE) {
        this.estadoE = estadoE;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public Email() {
    }

    public Email(int idEmail, String descripcionE, String Principal, boolean estadoE, int idPersona) {
        this.idEmail = idEmail;
        this.descripcionE = descripcionE;
        this.Principal = Principal;
        this.estadoE = estadoE;
        this.idPersona = idPersona;
    }

    @Override
    public String toString() {
        return "Email{" + "idEmail=" + idEmail + ", descripcionE=" + descripcionE + ", Principal=" + Principal + ", estadoE=" + estadoE + ", idPersona=" + idPersona + '}';
    }
    
    
    
}
