package Datos;

import Interfaces.ClsProductos;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductosD {

    public ArrayList<ClsProductos> listaProductos() throws Exception {
        ArrayList<ClsProductos> lista = new ArrayList();

        ClsProductos pr;
        try {
            CallableStatement cst = Conexion.
                    getConexion().prepareCall("{ call sp_ListaProductos()}");
            //cst.setString();
            cst.execute();
            Conexion.getConexion().close();
            ResultSet rs = cst.getResultSet();
            while (rs.next()) {
                pr = new ClsProductos(
                        rs.getInt("idProducto"),
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getFloat("precio"),
                        rs.getInt("stock"),
                        rs.getInt("estado"),
                        rs.getString("decEst"),
                        rs.getString("imgen"),
                        rs.getInt("idLinea"),
                        rs.getInt("idMarca"),
                        rs.getInt("idPresentacion"),
                        rs.getInt("idEstante"),
                        rs.getInt("idUniMedidas"));

                lista.add(pr);
            }
        } catch (Exception ex) {
            throw ex;
        }
        return lista;
    }

    public void agregarProducto(ClsProductos pro) throws Exception {
        try {
            CallableStatement cst = Conexion.getConexion().prepareCall("{call sp_registrarProducto(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
            cst.setString(1, pro.getNombre());
            cst.setString(2, pro.getDescripcion());
            cst.setFloat(3, pro.getPrecio());
            cst.setInt(4, pro.getStock());
            cst.setInt(5, pro.getEstado());
            cst.setString(6, pro.getDescripcion());
             cst.setString(7, pro.getImgen());
             cst.setInt(8, pro.getIdLinea());
             cst.setInt(9, pro.getIdMarca());
             cst.setInt(10, pro.getIdPresentacion());
             cst.setInt(11, pro.getIdEstante());
             cst.setInt(12, pro.getIdUniMedidas());

            cst.execute();
            Conexion.getConexion().close();

        } catch (Exception ex) {
            throw ex;
        }
    }

}
