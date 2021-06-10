package Datos;

import Interfaces.ClsTrabajador;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TrabajadorDao {

    public ArrayList<ClsTrabajador> cargarTrabajador() throws Exception {
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "";
        ArrayList<ClsTrabajador> lista = new ArrayList();
        try {
            sql = "SELECT * FROM trabajador";
            cn = Conexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                ClsTrabajador obj = new ClsTrabajador(rs.getInt("idTrabajador"), rs.getFloat("sueldo"),
                        rs.getInt("idPersona"), rs.getInt("idSucursal"));
                lista.add(obj);

            }
        } catch (Exception ex) {
            throw ex;
        }
        return lista;
    }

    public ArrayList<ClsTrabajador> listadoTrabajdor() throws Exception {
        ArrayList<ClsTrabajador> lista = new ArrayList();
        try {
            CallableStatement cst = Conexion.
                    getConexion().prepareCall("{ call sp_ListarTrabajador()}");
            //cst.setString();
            cst.execute();
            Conexion.getConexion().close();
            ResultSet rs = cst.getResultSet();
            while (rs.next()) {
                ClsTrabajador obj = new ClsTrabajador(
                        rs.getInt("idTrabajador"),
                        rs.getInt("sueldo"),
                        rs.getInt("idPersona"),
                        rs.getInt("idSucursal"));
                lista.add(obj);
            }
        } catch (Exception ex) {
            throw ex;
        }
        return lista;
    }

}
