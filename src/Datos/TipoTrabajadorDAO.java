package Datos;

import Interfaces.ClstipoTrabajador;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TipoTrabajadorDAO {

    public ArrayList<ClstipoTrabajador> listaTipoTrabajador() throws Exception {
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "";

        ArrayList<ClstipoTrabajador> lista = new ArrayList();
        try {
            sql = "SELECT * FROM tipotrabajador";
            cn = Conexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                ClstipoTrabajador obj = new ClstipoTrabajador(rs.getInt("idTipTrab"),
                        rs.getInt("estadoTT"), rs.getString("descTipoTrab"));
                lista.add(obj);

            }

        } catch (Exception ex) {
            throw ex;
        }
        return lista;
    }
}
