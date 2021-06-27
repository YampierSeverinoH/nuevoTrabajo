/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author yam_g
 */
public class sp_cBuscarSocio {
    private int idSocio;
    private String RazonSocial;
    private String Ruc;
    private String nombre;
    private String dni;
    private String direccion;

    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    public String getRuc() {
        return Ruc;
    }

    public void setRuc(String Ruc) {
        this.Ruc = Ruc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public sp_cBuscarSocio(int idSocio, String RazonSocial, String Ruc, String nombre, String dni, String direccion) {
        this.idSocio = idSocio;
        this.RazonSocial = RazonSocial;
        this.Ruc = Ruc;
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
    }

    public sp_cBuscarSocio() {
    }

    @Override
    public String toString() {
        return "sp_cBuscarSocio{" + "idSocio=" + idSocio + ", RazonSocial=" + RazonSocial + ", Ruc=" + Ruc + ", nombre=" + nombre + ", dni=" + dni + ", direccion=" + direccion + '}';
    }
    
    
}
