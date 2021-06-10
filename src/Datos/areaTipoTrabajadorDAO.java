package Datos;

import Interfaces.ClsareaTipoTrabajador;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class areaTipoTrabajadorDAO {

    public ArrayList<ClsareaTipoTrabajador> listadoareaTipoTrabajador() throws Exception {
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "";
        ArrayList<ClsareaTipoTrabajador> lista = new ArrayList();
        try {
            sql = "Select * from areatipotrabajador";
            cn = Conexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                ClsareaTipoTrabajador obj = new ClsareaTipoTrabajador(rs.getInt("idAreaTipTrab"), rs.getString("fecha"),
                        rs.getInt("estado"), rs.getInt("idArea"), rs.getInt("idTipTrab"), rs.getInt("idTrabajador"));
                lista.add(obj);

            }
        } catch (Exception ex) {
            throw ex;

        }
        return lista;
    }

    public ArrayList<ClsareaTipoTrabajador> listadoareaTipoTrabajadorDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
