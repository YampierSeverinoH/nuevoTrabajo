/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Interfaces.ClsSucursal;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author yam_g
 */
public class SucursalDAO {
          public ArrayList<ClsSucursal> listadoSucursal() throws Exception{
     ArrayList<ClsSucursal> lista = new ArrayList();
         try {
            CallableStatement cst = Conexion.
                                  getConexion().prepareCall( "{ call sp_ListarSucursal()}" );
            //cst.setString();
            cst.execute();
            Conexion.getConexion().close();
            ResultSet rs = cst.getResultSet();
            while( rs.next()){
                 ClsSucursal obj = new ClsSucursal( 
                         rs.getInt("idSucursal"), 
                         rs.getString("nombre"),
                         rs.getString("direccion"),
                         rs.getInt("estado"),
                         rs.getString("decEst"), 
                         rs.getInt("PrincipalSuc"),
                         rs.getString("telefono"),
                         rs.getString("correo"));
                 lista.add(obj);
             }
         } catch (Exception ex) {
                throw ex;
         }
         return lista;
}
}
