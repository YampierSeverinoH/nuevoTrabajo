
package Datos;

import Interfaces.ClsPersona;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class personaDAO {

    public ArrayList<ClsPersona> listadoPersonas() throws Exception{
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "";
        ArrayList<ClsPersona> lista = new ArrayList();
        try {
            sql = "SELECT * FROM Persona";
            cn = Conexion.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while( rs.next()){
                ClsPersona obj = new ClsPersona( rs.getInt("idPersona"), rs.getString("nombre"), 
                                                 rs.getString("Apellidos"), rs.getString("sexo"),
                                                 rs.getDate("fechaNacimiento")  );
                lista.add(obj);
            }
        } catch (Exception ex) {
               throw ex;
        }
        return lista;
    }  
    
}
