/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Interfaces.ClsSucursal;
import Interfaces.sp_cBuscarSocio;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author yam_g
 */
public class sp_CompraSocioDAO {
    public sp_cBuscarSocio listadoSocio(String num) throws Exception{
     sp_cBuscarSocio Result=new sp_cBuscarSocio();
         try {
            CallableStatement cst = Conexion.
                                  getConexion().prepareCall( "{call sp_CbuscarSocio(?)}" );
            cst.setString(1,num);
            cst.execute();
            Conexion.getConexion().close();
            ResultSet rs = cst.getResultSet();
            while( rs.next()){
                 Result = new sp_cBuscarSocio( 
                         rs.getInt("idSocio"), 
                         rs.getString("razonSocial"),
                         rs.getString("ruc"),
                         rs.getString("nombre"),
                         rs.getString("nDocumento"), 
                         rs.getString("descripcionD"));
                 //lista.add(obj);
             }
         } catch (Exception ex) {
                throw ex;
         }
         return Result;
}
}
