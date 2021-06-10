
package Interfaces;

import oracle.jrockit.jfr.events.Bits;

public class Telefono {
    private int idTelefono;
    private String numero;
    private int Principal;
    private int estado;
    private int idPersona;

    public int getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(int idTelefono) {
        this.idTelefono = idTelefono;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getPrincipal() {
        return Principal;
    }

    public void setPrincipal(int Principal) {
        this.Principal = Principal;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public Telefono() {
    }

     public Telefono(int idTelefono, String numero, int Principal, int estado, int idPersona) {
        this.idTelefono = idTelefono;
        this.numero = numero;
        this.Principal = Principal;
        this.estado = estado;
        this.idPersona = idPersona;
    }
    
    public Telefono(String numero, int Principal, int estado, int idPersona) {
        this.numero = numero;
        this.Principal = Principal;
        this.estado = estado;
        this.idPersona = idPersona;
    }

    @Override
    public String toString() {
        return "Telefono{" + "idTelefono=" + idTelefono + ", numero=" + numero + ", Principal=" + Principal + ", estado=" + estado + ", idPersona=" + idPersona + '}';
    }

    
    
}
