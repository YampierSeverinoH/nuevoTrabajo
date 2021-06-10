
package Interfaces;

public class ClsTrabajador {
   
    private int idTrabajador;
    private float sueldo;
    private int idPersona;
    private int idSucursal;

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setdTrabajador(int dTrabajador) {
        this.idTrabajador = dTrabajador;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public ClsTrabajador() {
    }

    public ClsTrabajador(int dTrabajador, float sueldo, int idPersona, int idSucursal) {
        this.idTrabajador = dTrabajador;
        this.sueldo = sueldo;
        this.idPersona = idPersona;
        this.idSucursal = idSucursal;
    }
    public ClsTrabajador( float sueldo, int idPersona, int idSucursal) {
        
        this.sueldo = sueldo;
        this.idPersona = idPersona;
        this.idSucursal = idSucursal;
    }

    @Override
    public String toString() {
        return idTrabajador+" - "+"Nombre";
    }
    
    
    
}
