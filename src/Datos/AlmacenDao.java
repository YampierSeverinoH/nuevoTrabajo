/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Interfaces.Almacen;
import Interfaces.Telefono;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author yam_g
 */
public class AlmacenDao {
    public ArrayList<Almacen> listadoAlmacen() throws Exception{
     ArrayList<Almacen> lista = new ArrayList();
         try {
            CallableStatement cst = Conexion.
                                  getConexion().prepareCall( "{ call sp_ListarAlmacen()}" );
            //cst.setString();
            cst.execute();
            Conexion.getConexion().close();
            ResultSet rs = cst.getResultSet();
            while( rs.next()){
                 Almacen obj = new Almacen( rs.getInt("idAlmacen"),
                         rs.getString("Descripcion"),
                         rs.getString("codigo"), 
                         rs.getString("telefono"), 
                         rs.getInt("estado"),
                         rs.getString("decEst"),
                         rs.getInt("idTrabajador"), 
                         rs.getInt("idSucursal") );
                 lista.add(obj);
             }
         } catch (Exception ex) {
                throw ex;
         }
         return lista;
    }    
    
    public ArrayList<Almacen> buscarAlmacen( String codigo ) throws Exception{
        ArrayList<Almacen> lista = new ArrayList();
         try {
            CallableStatement cst = Conexion.
                                  getConexion().prepareCall( "{ call sp_BuscarAlmacen( ? )}" );
            cst.setString( 1, codigo );
            cst.execute();
            Conexion.getConexion().close();
            ResultSet rs = cst.getResultSet();
            while( rs.next()){
                 Almacen obj = new Almacen( 
                         rs.getInt("idAlmacen"), 
                         rs.getString("Descripcion"), 
                         rs.getString("codigo"), 
                         rs.getString("telefono"), 
                         rs.getInt("estado"),
                         rs.getString("decEst"),
                         rs.getInt("idTrabajador"),
                         rs.getInt("idSucursal")  );
                 lista.add(obj);
             }
         } catch (Exception ex) {
                throw ex;
         }
         return lista;
    }  
    
    public void agregarAlmacen( Almacen alm) throws Exception{
        try {
            CallableStatement cst = Conexion.
                                getConexion().prepareCall( "{ call sp_RegistrarAlmacen( ?, ?, ?, ? , ?, ?, ?)}" );
            
            cst.setString(1,alm.getDescripcion());
            cst.setString(2,alm.getCodigo());
            cst.setString(3,alm.getTelefono()); 
            cst.setInt(4,alm.getEstado());
            cst.setString(5,alm.getDecEst());
            cst.setInt(6,alm.getIdTrabajador());
            cst.setInt(7,alm.getIdSucursal()) ;
            cst.execute();
            Conexion.getConexion().close();
        } 
        catch (Exception ex) {
            throw ex;
        }
    }    
    
      public void modificarAlmacen( Almacen alm) throws Exception{
        try {
            CallableStatement cst = Conexion.
                                getConexion().prepareCall( "{ call sp_ModificarAlmacen(?, ?, ?, ? , ?, ?, ?,?)}" );
            cst.setInt( 1, alm.getIdAlmacen());
            cst.setString(2,alm.getDescripcion());
            cst.setString(3,alm.getCodigo());
            cst.setString(4,alm.getTelefono()); 
            cst.setInt(5,alm.getEstado());
            cst.setString(6,alm.getDecEst());
            cst.setInt(7,alm.getIdTrabajador());
            cst.setInt(8,alm.getIdSucursal()) ;
            cst.execute();
            Conexion.getConexion().close();
        } 
        catch (Exception ex) {
            throw ex;
        }
    } 
}
