package Datos;

import Interfaces.ClsUnidadMedida;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UnidadMedidaDAO {

    public ArrayList<ClsUnidadMedida> listaUnidadMedida() throws Exception {
        ArrayList<ClsUnidadMedida> lista = new ArrayList();

        ClsUnidadMedida um;
        try {
            CallableStatement cst = Conexion.
                    getConexion().prepareCall("{ call sp_ListaUnidad()}");
            //cst.setString();
            cst.execute();
            Conexion.getConexion().close();
            ResultSet rs = cst.getResultSet();
            while (rs.next()) {
                um = new ClsUnidadMedida(
                        rs.getInt("idUniMedidas"),
                        rs.getString("DescripcionUni"),
                        rs.getString("abreviatura"));

                lista.add(um);
            }
        } catch (Exception ex) {
            throw ex;
        }
        return lista;
    }
}
