package Datos;

import Interfaces.ClsPresentacion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PresentacionDAO {

    public ArrayList<ClsPresentacion> listaPresentacion() throws Exception {
        ArrayList<ClsPresentacion> lista = new ArrayList();

        ClsPresentacion pr;
        try {
            CallableStatement cst = Conexion.
                    getConexion().prepareCall("{ call sp_ListaPresentacion()}");
            //cst.setString();
            cst.execute();
            Conexion.getConexion().close();
            ResultSet rs = cst.getResultSet();
            while (rs.next()) {
                pr = new ClsPresentacion(
                        rs.getInt("idPresentacion"),
                        rs.getString("descPres"),
                        rs.getInt("cant")
                );

                lista.add(pr);
            }
        } catch (Exception ex) {
            throw ex;
        }
        return lista;
    }

}
