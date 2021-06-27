package Datos;

import Interfaces.ClsMarca;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MarcaDAO {

    public ArrayList<ClsMarca> listaMarca() throws Exception {
        ArrayList<ClsMarca> lista = new ArrayList();

        ClsMarca mr;
        try {
            CallableStatement cst = Conexion.
                    getConexion().prepareCall("{ call sp_ListaMarca()}");
            //cst.setString();
            cst.execute();
            Conexion.getConexion().close();
            ResultSet rs = cst.getResultSet();
            while (rs.next()) {
                mr = new ClsMarca(
                        rs.getInt("idMarca"),
                        rs.getString("descripcionM"));

                lista.add(mr);
            }
        } catch (Exception ex) {
            throw ex;
        }
        return lista;
    }
}
