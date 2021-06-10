package Datos;

import Interfaces.ClsCliente;
import Interfaces.ClsTrabajador;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TrabajadorDao {

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
                        rs.getFloat("sueldo"),
                        rs.getInt("idPersona"),
                        rs.getInt("idSucursal"));
                lista.add(obj);
            }
        } catch (Exception ex) {
            throw ex;
        }
        return lista;
    }
    
        public void agregarTrabajador(ClsTrabajador tra) throws Exception {
        try {
            CallableStatement cst = Conexion.
                    getConexion().prepareCall("{call sp_registrarTrabajador(?, ?, ?)}");
            cst.setFloat(1, tra.getSueldo());
            cst.setInt(2, tra.getIdPersona());
            cst.setInt(3, tra.getIdSucursal());

            cst.execute();
            Conexion.getConexion().close();

        } catch (Exception ex) {
            throw ex;
        }
    }
    
    

}
