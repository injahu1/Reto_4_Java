/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto4.controlador;

import reto4.vista.Vreto4;

/**
 *
 * @author Injah
 */
public class ControladorPantallas {
    
    private static Vreto4 pantallaEmpleado;
    
    public static void abrirPantallaVreto4(){
        pantallaEmpleado=new Vreto4();
        pantallaEmpleado.setVisible(true);
        pantallaEmpleado.setLocationRelativeTo(null);
        
        
    }
    
        public static void cerrarPantallaVreto4(){
        //pantallaEmpleado=new Vreto4();
        pantallaEmpleado.setVisible(false);
        pantallaEmpleado=null;
        
        
    }
    
}
