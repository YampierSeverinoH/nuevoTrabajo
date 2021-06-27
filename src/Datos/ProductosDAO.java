/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Interfaces.ClsSucursal;
import Interfaces.Producto;
import Interfaces.sp_cBuscarSocio;
import Interfaces.VentaProducto;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author yam_g
 */
public class ProductosDAO {
        public ArrayList<Producto> listaProductosVenta() throws Exception{
     ArrayList<Producto> lista = new ArrayList();
     
     Producto p ;
         try {
            CallableStatement cst = Conexion.
                                  getConexion().prepareCall( "{ call sp_ListarProductosVenta()}" );
            //cst.setString();
            cst.execute();
            Conexion.getConexion().close();
            ResultSet rs = cst.getResultSet();
            while( rs.next()){
                 p  = new Producto(
                         rs.getInt("idProducto"), 
                         rs.getString("nombre"),
                         rs.getString("descripcion"),
                         rs.getFloat("precio"),
                         rs.getInt("stock"), 
                         rs.getString("descripcionM"),
                         rs.getString("descPres"));
                 lista.add(p);
             }
         } catch (Exception ex) {
                throw ex;
         }
         return lista;
}
        public Producto ProductoSeleccion(int num) throws Exception{
     Producto Result=new Producto();
         try {
            CallableStatement cst = Conexion.
                                  getConexion().prepareCall( "{call sp_buscarProductoID(?)}" );
            cst.setInt(1,num);
            cst.execute();
            Conexion.getConexion().close();
            ResultSet rs = cst.getResultSet();
            while( rs.next()){
                 Result = new Producto( 
                         rs.getInt("idProducto"), 
                         rs.getString("nombre"),
                         rs.getString("descripcion"),
                         rs.getFloat("precio"),
                         rs.getInt("stock"),
                         rs.getInt("estado"),
                         rs.getString("decEst"),
                         rs.getString("imgen"),
                         rs.getInt("idLinea"),
                         rs.getInt("idMarca"),
                         rs.getInt("idPresentacion"),
                         rs.getInt("idEstante"),
                         rs.getInt("idUniMedidas"),
                         rs.getFloat("descuento"));
                 //lista.add(obj);
             }
         } catch (Exception ex) {
                throw ex;
         }
         return Result;
}
}
