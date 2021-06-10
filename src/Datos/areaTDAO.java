package Datos;

import Interfaces.ClsAreaT;
import Interfaces.ClsPrestatario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class areaTDAO {

    public ArrayList<ClsAreaT> listadoAreaT() throws Exception {
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "";
        ArrayList<ClsAreaT> lista = new ArrayList();
        try {
            sql = "SELECT * FROM areat";
            cn = Conexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                ClsAreaT obj = new ClsAreaT(rs.getInt("idArea"),
                        rs.getInt("estadoA"), rs.getString("descArea"));
                lista.add(obj);
            }

        } catch (Exception ex) {
            throw ex;
        }
        return lista;
    }

}
