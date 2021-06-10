
package Interfaces;

public class ClsSucursal {
    private int idSucursal;
    private String nombre;
    private String direccion;
    private int estado;
    private String descEst; 
    private int PrincipalSuc;
    private String telefono;
    private String correo;

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getDescEst() {
        return descEst;
    }

    public void setDescEst(String descEst) {
        this.descEst = descEst;
    }

    public int getPrincipalSuc() {
        return PrincipalSuc;
    }

    public void setPrincipalSuc(int PrincipalSuc) {
        this.PrincipalSuc = PrincipalSuc;
    }



    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ClsSucursal() {
    }

    public ClsSucursal(int idSucursal, String nombre, String direccion, int estado,String descEst, int PrincipalSuc, String telefono, String correo) {
        this.idSucursal = idSucursal;
        this.nombre = nombre;
        this.direccion = direccion;
        this.estado = estado;
        this.descEst=descEst;
        this.PrincipalSuc = PrincipalSuc;
        this.telefono = telefono;
        this.correo = correo;
    }
    public ClsSucursal(String nombre, String direccion, int estado,String descEst, int PrincipalSuc, String telefono, String correo) {
        
        this.nombre = nombre;
        this.direccion = direccion;
        this.estado = estado;
        this.descEst=descEst;
        this.PrincipalSuc = PrincipalSuc;
        this.telefono = telefono;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return idSucursal +" - "+nombre;
    }
    
    
    
}
