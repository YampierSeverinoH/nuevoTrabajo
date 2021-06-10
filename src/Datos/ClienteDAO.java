package Datos;

import java.sql.CallableStatement;
import Interfaces.ClsCliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ClienteDAO {

    public ArrayList<ClsCliente> listadoCliente() throws Exception {
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "";
        ArrayList<ClsCliente> lista = new ArrayList();
        try {
            sql = "select * from cliente";
            cn = Conexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                ClsCliente obj = new ClsCliente(rs.getInt("idCliente"),
                        rs.getInt("idPrestatario"), rs.getInt("idPersona"),
                        rs.getInt("estado"), rs.getString("fecha"));
                lista.add(obj);

            }

        } catch (Exception ex) {
            throw ex;
        }
        return lista;
    }

    public ArrayList<ClsCliente>  buscarcliente(int idPersona) throws Exception {

        ArrayList<ClsCliente> lista = new ArrayList();
        try {
            CallableStatement cst = Conexion.getConexion().prepareCall("{call sp_buscarCliente(?)}");
            cst.setInt(1, idPersona);
            cst.execute();
            Conexion.getConexion().close();
            ResultSet rs = cst.getResultSet();
            while (rs.next()) {
                ClsCliente obj = new ClsCliente(rs.getInt("idCliente"),
                        rs.getInt("idPrestatario"), rs.getInt("idPersona"),
                        rs.getInt("estado"), rs.getString("fecha"));
                lista.add(obj);

            }

        } catch (Exception ex) {
            throw ex;
        }
        return lista;
    }

    public void agregarCliente(ClsCliente cli) throws Exception {
        try {
            CallableStatement cst = Conexion.getConexion().prepareCall("{call sp_registrarCliente(?, ?, ?, ?)}");
            cst.setInt(1, cli.getIdPrestatario());
            cst.setInt(2, cli.getIdPersona());
            cst.setInt(3, cli.isEstado());
            cst.setString(4, cli.getFecha());

            cst.execute();
            Conexion.getConexion();

        } catch (Exception ex) {
            throw ex;
        }
    }

}
