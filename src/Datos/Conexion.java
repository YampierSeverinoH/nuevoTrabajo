
package Datos;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion{
    private static String ruta;
    private Connection cn;
    private static String user;
    private static String password;

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Conexion() {
        
    }
       
    public static Connection getConexion() throws Exception{
        Connection cn = null;
        Conexion.ruta = "jdbc:mysql://localhost:3306/negocioyameli?autoReconnect=true";
        Conexion.user = "root";
        Conexion.password = "";        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(Conexion.ruta,Conexion.user, Conexion.password );
        }catch(Exception e){
            throw e;
        }
        return cn;
    }    
}
