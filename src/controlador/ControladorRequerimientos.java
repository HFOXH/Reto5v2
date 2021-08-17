/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.sql.SQLException;
import java.util.ArrayList;
import Modelos.Requerimiento_1;
import Modelos.Requerimiento_1Dao;
import Modelos.Requerimiento_2;
import Modelos.Requerimiento_2Dao;
import Modelos.Requerimiento_3;
import Modelos.Requerimiento_3Dao;
/**
 *
 * @author Santiago
 */
public class ControladorRequerimientos {
    private final Requerimiento_1Dao requerimiento1Dao;
    private final Requerimiento_2Dao requerimiento2Dao;
    private final Requerimiento_3Dao requerimiento3Dao;
     public ControladorRequerimientos() {
        this.requerimiento1Dao = new Requerimiento_1Dao();
        this.requerimiento2Dao = new Requerimiento_2Dao();
        this.requerimiento3Dao = new Requerimiento_3Dao();
 
    }
      public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
        // Su código
        return this.requerimiento1Dao.requerimiento1();

    }
      public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
        // Su código
        return this.requerimiento2Dao.requerimiento2();

    }
      public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
        // Su código
        return this.requerimiento3Dao.requerimiento3();

    }
}
