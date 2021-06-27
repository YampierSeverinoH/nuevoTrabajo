/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Interfaces.ClsCliente;
import Interfaces.Usuario;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author yam_g
 */
public class UsuarioDAO {
    public Usuario  buscarcliente(String user, String pass) throws Exception {

        Usuario us = new Usuario();
        try {
            CallableStatement cst = Conexion.getConexion().prepareCall("{call sp_ValidacionUsuario(?,?)}");
            cst.setString(1, pass);
            cst.setString(2, user);
            cst.execute();
            Conexion.getConexion().close();
            ResultSet rs = cst.getResultSet();
            while (rs.next()) {
                Usuario obj = new Usuario(
                        rs.getInt("idUsuario"),
                        rs.getString("descripcion"),
                        rs.getString("Persona"));
                us=obj;
            }

        } catch (Exception ex) {
            throw ex;
        }
        return us;
    }
}
