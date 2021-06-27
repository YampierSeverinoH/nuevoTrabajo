package Datos;

import Interfaces.ClsUsuario;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UsuarioD {

    public ArrayList<ClsUsuario> listaUsuario() throws Exception {
        ArrayList<ClsUsuario> Usuario = new ArrayList();

        ClsUsuario us;
        try {
            CallableStatement cst = Conexion.
                    getConexion().prepareCall("{ call sp_ListaUsuario()}");
            //cst.setString();
            cst.execute();
            Conexion.getConexion().close();
            ResultSet rs = cst.getResultSet();
            while (rs.next()) {
                us = new ClsUsuario(
                        rs.getInt("idUsuario"),
                        rs.getString("descripcion"),
                        rs.getString("pass"),
                        rs.getByte("estado"),
                        rs.getString("decEst"),
                        rs.getString("creacion"),
                        rs.getString("baja"),
                        rs.getInt("idPersona"),
                        rs.getString("imagen"));

                Usuario.add(us);
            }
        } catch (Exception ex) {
            throw ex;
           
        }
         return Usuario;
        }
    
        public void agregarUsuario(ClsUsuario usu) throws Exception {
        try {
            CallableStatement cst = Conexion.getConexion().prepareCall("{call sp_registrarUsuario(?, ?, ?, ?, ?, ?, ?, ?)}");
            cst.setString(1, usu.getDescripcion());
            cst.setString(2, usu.getPass());
            cst.setInt(3, usu.getEstado());
            cst.setString(4, usu.getDecEst());
             cst.setString(5, usu.getCreacion());
             cst.setString(6, usu.getBaja());
             cst.setInt(7, usu.getIdPersona());
             cst.setString(8, usu.getImagen());
;

            cst.execute();
            Conexion.getConexion().close();

        } catch (Exception ex) {
            throw ex;
        }
    }

    
    
    
    
}