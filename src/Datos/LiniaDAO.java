
package Datos;

import Interfaces.ClsLinea;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class LiniaDAO {
    public ArrayList<ClsLinea> listaLinea() throws Exception {
        ArrayList<ClsLinea> lista = new ArrayList();

        ClsLinea ln;
        try {
            CallableStatement cst = Conexion.
                    getConexion().prepareCall("{ call sp_ListaLinia()}");
            //cst.setString();
            cst.execute();
            Conexion.getConexion().close();
            ResultSet rs = cst.getResultSet();
            while (rs.next()) {
                ln = new ClsLinea(
                        rs.getInt("idLinea"),
                        rs.getString("descriocionL"));

                lista.add(ln);
            }
        } catch (Exception ex) {
            throw ex;
        }
        return lista;
    }
    
}
