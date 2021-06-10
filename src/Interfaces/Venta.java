
package Interfaces;

public class Venta {
    private int idVenta ;
    private String estadoV ;
    private String tipoPago;
    private  String fechar;
    private float total ;
    private int idCliente ;
    private int idTrabajador ;

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getEstadoV() {
        return estadoV;
    }

    public void setEstadoV(String estadoV) {
        this.estadoV = estadoV;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getFechar() {
        return fechar;
    }

    public void setFechar(String fechar) {
        this.fechar = fechar;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public Venta() {
    }

    public Venta(int idVenta, String estadoV, String tipoPago, String fechar, float total, int idCliente, int idTrabajador) {
        this.idVenta = idVenta;
        this.estadoV = estadoV;
        this.tipoPago = tipoPago;
        this.fechar = fechar;
        this.total = total;
        this.idCliente = idCliente;
        this.idTrabajador = idTrabajador;
    }

    @Override
    public String toString() {
        return "Venta{" + "idVenta=" + idVenta + ", estadoV=" + estadoV + ", tipoPago=" + tipoPago + ", fechar=" + fechar + ", total=" + total + ", idCliente=" + idCliente + ", idTrabajador=" + idTrabajador + '}';
    }
    
    
    
    
    
}
