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
public class sp_cBuscarTrabajador {
    private int idtrabajador;
    private String nombre;
    private String apellido;
    private String dni;

    public int getIdtrabajador() {
        return idtrabajador;
    }

    public void setIdtrabajador(int idtrabajador) {
        this.idtrabajador = idtrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public sp_cBuscarTrabajador(int idtrabajador, String nombre, String apellido, String dni) {
        this.idtrabajador = idtrabajador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public sp_cBuscarTrabajador() {
    }

    @Override
    public String toString() {
        return "sp_cBuscarTrabajador{" + "idtrabajador=" + idtrabajador + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }
    
}
