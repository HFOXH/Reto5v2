/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Util.JDBCUtilities;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Santiago
 */
public class Requerimiento_2Dao {
public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        // Su código
        ArrayList<Requerimiento_2> respuesta = new ArrayList<Requerimiento_2>();
        Connection conexion = JDBCUtilities.getConnection();
        String consulta2 = "SELECT c.Proveedor, p.Constructora, c.Pagado  FROM Compra c\n" +
        "INNER JOIN Proyecto p\n" +
        "ON c.ID_Proyecto = p.ID_Proyecto \n" +
        "WHERE (c.Proveedor='Homecenter' or c.Proveedor='JUMBO') AND (c.Pagado ='Si' and p.Constructora LIKE '%S.A.')\n" + "ORDER BY c.Proveedor ASC;";
        Statement statement = conexion.createStatement();
        ResultSet rset = statement.executeQuery(consulta2);
        while (rset.next()) {
            Requerimiento_2 requerimiento2 = new Requerimiento_2(rset.getString("Proveedor"), rset.getString("Constructora"), rset.getString("Pagado"));
            respuesta.add(requerimiento2);
        }

        return respuesta;
    }
}
