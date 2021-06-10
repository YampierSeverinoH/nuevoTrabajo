
package Datos;

import Interfaces.ClsPrestatario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class prestatarioDAO {
        public ArrayList<ClsPrestatario> listadoPrestatario() throws Exception{
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "";
        ArrayList<ClsPrestatario> lista = new ArrayList();
        try {
            sql = "SELECT * FROM prestatario";
            cn = Conexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while( rs.next()){
                ClsPrestatario obj = new ClsPrestatario( rs.getInt("idPrestatario"), rs.getString("razonSocial"), rs.getString("DescDir"), 
                                                 rs.getString("ruc"), rs.getBoolean("estadoPs")  );
                lista.add(obj);
            }
        } catch (Exception ex) {
               throw ex;
        }
        return lista;
    }
}
