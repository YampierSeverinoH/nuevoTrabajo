
package Datos;

import Interfaces.ClsEstante;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EstanteDAO {
       public ArrayList<ClsEstante> listaEstante() throws Exception {
        ArrayList<ClsEstante> Estante = new ArrayList();

        ClsEstante st;
        try {
            CallableStatement cst = Conexion.
                    getConexion().prepareCall("{ call sp_ListaEstante()}");
            //cst.setString();
            cst.execute();
            Conexion.getConexion().close();
            ResultSet rs = cst.getResultSet();
            while (rs.next()) {
                st = new ClsEstante(
                        rs.getInt("idEstante"),
                        rs.getString("codigo"),
                        rs.getInt("estado"),
                         rs.getString("decEst"),
                         rs.getInt("idAlmacen"));

                Estante.add(st);
            }
        } catch (Exception ex) {
            throw ex;
        }
        return Estante;
    }
} 

