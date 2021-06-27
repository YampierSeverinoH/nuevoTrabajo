/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Interfaces.detalleCompra;
import java.sql.CallableStatement;

/**
 *
 * @author Usuario
 */
public class DetalleCompraDAO {
    public void AgregarDetalleCompra(detalleCompra det) throws Exception {
        try {
            CallableStatement cst = Conexion.
                    getConexion().prepareCall("{call sp_registrarDetalleCompra(?, ?, ?,?, ?, ?)}");
            cst.setFloat(1, det.getDescuento());
            cst.setFloat(2, det.getPrecio());
            cst.setInt(3, det.getCantidad());
            cst.setFloat(4,det.getSubtotal());
            cst.setInt(5, det.getIdCompra());
            cst.setInt(6, det.getIdProducto());
            cst.execute();
            Conexion.getConexion().close();

        } catch (Exception ex) {
            throw ex;
        }
    }
}
