
package Interfaces;

import java.sql.Date;

public class ClsPersona {
    private int idPersona;
    private String nombre;
    private String apellidos;
    private String sexo;
    private Date fechaNacimiento;

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ClsPersona() {
    }

    public ClsPersona(int idPersona, String nombre, String apellidos, String sexo, Date fechaNacimiento) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return  idPersona + "-" + nombre + ", " + apellidos ;
    }
    
    
}
