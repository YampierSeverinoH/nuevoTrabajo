/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Interfaces.Compra;
import java.sql.CallableStatement;
import java.sql.ResultSet;

/**
 *
 * @author Usuario
 */
public class CompraDAO {
    public int AgregaCompra(Compra c) throws Exception {
         int data=-1;
        try {
           
            CallableStatement cst = Conexion.
                    getConexion().prepareCall("{call sp_registrarCompra( ?, ?, ?, ?, ?);}");
           cst.setString(1, c.getFecha());
            cst.setFloat(2, c.getTotalC());
            cst.setString(3, c.getEstado());
            cst.setInt(4, c.getIdSocio());
            cst.setInt(5, c.getIdTrabajador());
            cst.execute();
            Conexion.getConexion().close();
            ResultSet rs = cst.getResultSet();
            while( rs.next()){
                data=rs.getInt("Identity");
            }

        } catch (Exception ex) {
            throw ex;
        }
    return data;
    }
}
