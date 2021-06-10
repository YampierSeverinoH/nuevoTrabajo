
package Interfaces;

public class Almacen {
    private int idAlmacen;
    private String Descripcion;
    private String codigo;
    private String telefono;
    private int estado;
    private String decEst;

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getDecEst() {
        return decEst;
    }

    public void setDecEst(String decEst) {
        this.decEst = decEst;
    }
    private int idTrabajador;
    private int idSucursal;

    public int getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(int idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public Almacen() {
    }

    public Almacen(int idAlmacen, String Descripcion, String codigo, String telefono, int estado,String descEst ,int idTrabajador, int idSucursal) {
        this.idAlmacen = idAlmacen;
        this.Descripcion = Descripcion;
        this.codigo = codigo;
        this.telefono = telefono;
        this.estado = estado;
        this.idTrabajador = idTrabajador;
        this.idSucursal = idSucursal;
        this.decEst=descEst;
    }
    public Almacen( String Descripcion, String codigo, String telefono, int estado,String descEst ,int idTrabajador, int idSucursal) {
        this.Descripcion = Descripcion;
        this.codigo = codigo;
        this.telefono = telefono;
        this.estado = estado;
        this.idTrabajador = idTrabajador;
        this.idSucursal = idSucursal;
        this.decEst=descEst;
    }

    @Override
    public String toString() {
        return "Almacen{" + "idAlmacen=" + idAlmacen + ", Descripcion=" + Descripcion + ", codigo=" + codigo + ", telefono=" + telefono + ", estado=" + estado + ", idTrabajador=" + idTrabajador + ", idSucursal=" + idSucursal + '}';
    }
    
    
}
