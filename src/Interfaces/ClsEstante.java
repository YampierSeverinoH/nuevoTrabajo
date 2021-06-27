
package Interfaces;

public class ClsEstante {
    private int idEstante;
    private String codigo;
    private int estado;
    private String desEst;
    private int idAlmacen;

    @Override
    public String toString() {
        return  idEstante + " " + codigo;
    }

    public ClsEstante(int idEstante, String codigo, int estado, String desEst, int idAlmacen) {
        this.idEstante = idEstante;
        this.codigo = codigo;
        this.estado = estado;
        this.desEst = desEst;
        this.idAlmacen = idAlmacen;
    }

    public ClsEstante() {
    }

    public int getIdEstante() {
        return idEstante;
    }

    public void setIdEstante(int idEstante) {
        this.idEstante = idEstante;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getDesEst() {
        return desEst;
    }

    public void setDesEst(String desEst) {
        this.desEst = desEst;
    }

    public int getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(int idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

   
    
}
