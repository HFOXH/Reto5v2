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
public class Requerimiento_3Dao {
 public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        // Su código
        ArrayList<Requerimiento_3> respuesta = new ArrayList<Requerimiento_3>();
        Connection conexion = JDBCUtilities.getConnection();
        String consulta3 = "SELECT l.Cargo, MAX(l.Salario) FROM Lider l\n" + "GROUP BY Cargo\n"
                + "HAVING MAX(l.Salario)>=700000;";
        Statement statement = conexion.createStatement();
        ResultSet rset = statement.executeQuery(consulta3);
        while (rset.next()) {
            Requerimiento_3 requerimiento3 = new Requerimiento_3(rset.getString("Cargo"), rset.getInt("MAX(l.Salario)"));
            respuesta.add(requerimiento3);
        }

        return respuesta;
    }
}
