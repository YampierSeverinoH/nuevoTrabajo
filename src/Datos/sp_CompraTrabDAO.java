/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Interfaces.sp_cBuscarTrabajador;
import java.sql.CallableStatement;
import java.sql.ResultSet;

/**
 *
 * @author yam_g
 */
public class sp_CompraTrabDAO {
    public sp_cBuscarTrabajador listadoTrabajador(String num) throws Exception{
     sp_cBuscarTrabajador Result=new sp_cBuscarTrabajador();
         try {
            CallableStatement cst = Conexion.
                                  getConexion().prepareCall( "{call sp_CbusacarTrabajador(?)}" );
            cst.setString(1,num);
            cst.execute();
            Conexion.getConexion().close();
            ResultSet rs = cst.getResultSet();
            while( rs.next()){
                 Result = new sp_cBuscarTrabajador( 
                         rs.getInt("idTrabajador"), 
                         rs.getString("nombre"),
                         rs.getString("apellidos"),
                         rs.getString("nDocumento"));
                 //lista.add(obj);
             }
         } catch (Exception ex) {
                throw ex;
         }
         return Result;
}
}
