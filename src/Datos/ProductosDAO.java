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
        public ArrayList<VentaProducto> listaProductosVenta(int cantidad) throws Exception{
     ArrayList<VentaProducto> lista = new ArrayList();
     VentaProducto vp;
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
                 vp=new VentaProducto(p, cantidad);
                 lista.add(vp);
             }
         } catch (Exception ex) {
                throw ex;
         }
         return lista;
}
}
