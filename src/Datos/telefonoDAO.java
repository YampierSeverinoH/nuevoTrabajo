
package Datos;


import java.sql.CallableStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import Interfaces.Telefono;
import java.util.ArrayList;


public class telefonoDAO {

    public ArrayList<Telefono> listadoTelefonos() throws Exception{
     Connection cn = null;
     Statement st = null;
     ResultSet rs = null;
     String sql = "";
     ArrayList<Telefono> lista = new ArrayList();
     try {
         sql = "SELECT * FROM telefono";
         cn = Conexion.getConexion();
         st = cn.createStatement();
         rs = st.executeQuery(sql);
         while( rs.next()){
             Telefono obj = new Telefono( rs.getInt("idTelefono"), rs.getString("numero"), 
                                                rs.getInt("principal"), rs.getInt("Estado"), 
                                                rs.getInt("idPersona") );
             lista.add(obj);
         }
     } catch (Exception ex) {
            throw ex;
     }
     return lista;
    }    
    
    public ArrayList<Telefono> buscarTelefono( String numero ) throws Exception{
        ArrayList<Telefono> lista = new ArrayList();
         try {
            CallableStatement cst = Conexion.
                                  getConexion().prepareCall( "{ call sp_buscarTelefono( ? )}" );
            cst.setString( 1, numero );
            cst.execute();
            Conexion.getConexion().close();
            ResultSet rs = cst.getResultSet();
            while( rs.next()){
                 Telefono obj = new Telefono( rs.getInt("idTelefono"), rs.getString("numero"), 
                                                    rs.getInt("principal"), rs.getInt("Estado"), 
                                                    rs.getInt("idPersona") );
                 lista.add(obj);
             }
         } catch (Exception ex) {
                throw ex;
         }
         return lista;
    }  
    
    
    
    /*public void registrarTelefono( Telefono tel) throws Exception{
        Connection cn = null;
        Statement st = null;
        String sql = "";
        try {
            sql = "insert into telefono( numero, principal, estado, idpersona ) "+ 
                  "values('" + tel.getNumero() + "','" + tel.getPrincipal() + "'," + tel.getEstado() + "," +
                   tel.getIdPersona() + ")";
            cn = Conexion.getConexion();
            st = cn.createStatement();
            st.executeUpdate( sql );
            cn.close();
        } 
        catch (Exception ex) {
            throw ex;
        }
    }*/
    
    public void agregarTelefono( Telefono tel) throws Exception{
        try {
            CallableStatement cst = Conexion.
                                getConexion().prepareCall( "{ call sp_registrarTelefono( ?, ?, ?, ? )}" );
            cst.setString( 1, tel.getNumero()  );
            cst.setInt( 2, tel.getPrincipal() );
            cst.setInt(3, tel.getEstado());
            cst.setInt(4, tel.getIdPersona());
            cst.execute();
            Conexion.getConexion().close();
        } 
        catch (Exception ex) {
            throw ex;
        }
    }    
    
      public void modificarTelefono( Telefono tel) throws Exception{
        try {
            CallableStatement cst = Conexion.
                                getConexion().prepareCall( "{ call sp_modificarTelefono(?, ?, ?, ?, ? )}" );
            cst.setInt( 1, tel.getIdTelefono() );
            cst.setString( 2, tel.getNumero() );
            cst.setInt( 3, tel.getPrincipal() );
            cst.setInt(4, tel.getEstado() );
            cst.setInt(5, tel.getIdPersona());
            cst.execute();
            Conexion.getConexion().close();
        } 
        catch (Exception ex) {
            throw ex;
        }
    } 
    
}
