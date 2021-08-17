/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelos.Requerimiento_1;
import Modelos.Requerimiento_2;
import Modelos.Requerimiento_3;
import controlador.ControladorRequerimientos;
import java.util.ArrayList;

/**
 *
 * @author Santiago
 */
public class VistasRequerimientos {
   public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1() {

        System.out.println("----------Listado de Proyectos de la ciudad de Pereira----------");
        try {
            // Su código
            ArrayList<Requerimiento_1> requerimiento1 = controlador.consultarRequerimiento1();

            // Encabezado del resultado
            System.out
                    .println("Constructora Ciudad Banco_Vinculado Porcentaje_Cuota_Inicial Clasificacion Fecha_Inicio");

            // Cada VO cargado, mostrarlo en la vista
            for (Requerimiento_1 proyecto : requerimiento1) {
                System.out.printf("%s %s %s %f %s %s %n",

                        proyecto.getConstructora(), proyecto.getCiudad(), proyecto.getBanco(), proyecto.getPorcentaje(),
                        proyecto.getClasificacion(), proyecto.getFecha());

            }

        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }
    public static void requerimiento2() {
    try {
            // Su código
            ArrayList<Requerimiento_2> requerimiento2 = controlador.consultarRequerimiento2();
            System.out.println("----------Listado de compras----------");
            // Encabezado del resultado
            System.out.println("Proveedor Constructora Pagado");
            // Cada VO cargado, mostrarlo en la vista
            for (Requerimiento_2 proyecto : requerimiento2) {
                System.out.printf("%s %s %s",

                        proyecto.getProveedor(), proyecto.getConstructora(), proyecto.getPagado());
            }
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }
    public static void requerimiento3() {
    try {
            // Su código
            ArrayList<Requerimiento_3> requerimiento3 = controlador.consultarRequerimiento3();
            System.out.println("----------Cargo y el máximo de los salarios----------");
            // Encabezado del resultado
            System.out.println("Cargo MAX(l.Salario)");
            // Cada VO cargado, mostrarlo en la vista
            for (Requerimiento_3 proyecto : requerimiento3) {
                System.out.printf("%s %n",

                        proyecto.getCargo(), proyecto.getMaxSalario());
            }
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }
}
