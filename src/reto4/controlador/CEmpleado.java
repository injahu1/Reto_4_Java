/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto4.controlador;


import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import reto4.modelo.Empleado;

/**
 *
 * @author Injah
 */
public class CEmpleado {
    //public static  ArrayList <Empleado> empleados = new ArrayList();
    public static  ArrayList <Empleado> puente2 = new ArrayList();
    public static LocalDate f=LocalDate.now();
      public static Empleado em=new Empleado(0, "", "", "", f);
     // static DefaultTableModel modelo= new DefaultTableModel();
    
     public static void registrarEmpleado(Integer docu,String nomb, String tele, String dire, String fech , JTable Tabla) {
        //int documento=0;
        //String nombre;
     //String telefono;
       // String direccion;
      //  String proposito;
     //   String[]propo={"","",""};
   
        boolean veriplaca=false; 
        LocalDate fecha=LocalDate.now();
        //Empleado 
        em=new Empleado(docu, nomb, tele, dire, fecha);
  em.setEmpleados(puente2);
          
    //System.out.println("Ingrese el número de documento del empleado: ");
  
    if(docu>0){}
    else{ JOptionPane.showMessageDialog (null , "¡No se puede completar la operación!\n\n Por favor ingrese documento valido  ", "Error",0); 
    return;}

 
  
   
    int xx=0;
    veriplaca=false;
    for(int x=0;x<em.getEmpleados().size();x++){
    if(em.getEmpleados().get(x).getDocumento()==docu){
        
    veriplaca=true;
    xx=x;
    break;
    }

    }
                 
               if(veriplaca==true){
                    JOptionPane.showMessageDialog (null , "¡Normandia!\n\nEmpleado ya existe! ", "Error",0); 
                    return;
                }
                else{
          if(nomb.equals("")||tele.equals("")||dire.equals("")){
                        
 JOptionPane.showMessageDialog (null , "¡Por favor diligenciar todos los campos!\n\n\n ", "Error",0);
 return;
                    }
                    
                    //System.out.println("Ingrese la fecha de contrato del empleado (AAAA-MM-DD): ");  
                    try{fecha=LocalDate.parse(fech);
                    
                    }
                    catch(Exception g){
                       JOptionPane.showMessageDialog (null , "¡Normandia!\n\nFecha incorrecta", "Error",0); 
                       return;}
                    
                    //    LocalDate fe =LocalDate.now();
                         em= new Empleado(docu,nomb, tele, dire, fecha);
                        //Semoviente se=new Semoviente(placa,raza, color, cadena, em);
                        //empleados.add(em);
                        //em.getEmpleados().add(em);
                       // em.setEmpleados((em.getEmpleados().add(em)));
                        em.setEmpleados(puente2);
                        
                       puente2=em.getEmpleados();
                       puente2.add(em);
                       //em.setEmpleados(puente2);
                       
        
                        //puente2.add(em);
                        
                        DefaultTableModel modelo= (DefaultTableModel) Tabla.getModel();
                        
                        modelo.setRowCount(0);

                       // Tabla.setVisible(true);
                          //Tabla.setModel(modelo);
                          Object[] fila=new Object[5];
                      
                          fila[0]=em.getDocumento();
                          fila[1]=em.getNombre();
                          fila[2]=em.getTelefono();
                          fila[3]=em.getDireccion();
                          fila[4]=em.getFechaContrato();
                          modelo.addRow(fila);
                          //Tabla.setValueAt(Object aValue, 0, 0);
                        // Tabla.setModel(modelo);
                         
                         // Tabla.setModel(modelo);
                        //JOptionPane.showMessageDialog (null , "¡Normandia!\n\n¡Empleado registrado!", "Error",1); 
                       // System.out.println("\nNormandia");
                        //System.out.println("¡Empleado registrado!\n\n\n");
                        }
              
               
    }
    
       public static void consultarEmpleado(Integer docu,JTable Tabla) {
       boolean veriplaca=false;
         //int documento=0;
         int xguarde=0;
     //em.setEmpleados(puente2);
                
                veriplaca=false;
         for(int x=0;x<em.getEmpleados().size();x++){
                 
                 if(em.getEmpleados().get(x).getDocumento()==docu){
                 veriplaca=true;
                 xguarde=x;
                 break;
                 }
                 
                 

         //System.out.println(veriplaca  );
         }
             //  System.out.println("v es igual a: "+v); 
        if(veriplaca==true){

                    
                        DefaultTableModel modelo= (DefaultTableModel) Tabla.getModel();
                        
                        modelo.setRowCount(0);

                       // Tabla.setVisible(true);
                          //Tabla.setModel(modelo);
                          Object[] fila=new Object[5];
                      
                          fila[0]=em.getEmpleados().get(xguarde).getDocumento();
                          fila[1]=em.getEmpleados().get(xguarde).getNombre();
                          fila[2]=em.getEmpleados().get(xguarde).getTelefono();
                          fila[3]=em.getEmpleados().get(xguarde).getDireccion();
                          fila[4]=em.getEmpleados().get(xguarde).getFechaContrato();
                          modelo.addRow(fila);
                    
                }
                else{
                     JOptionPane.showMessageDialog (null , "¡Normandia!\n\nEmpleado no existe! ", "Error",0); 
                    
                }
    }  
    
        public static void eliminarEmpleado(Integer docu,JTable Tabla) {
      //  int documento=0;
        boolean veriplaca=false;
        int xplaca=0;
        String name;
        
        //em.setEmpleados(puente2);
    

     
     veriplaca=false;
    for(int x=0;x<em.getEmpleados().size();x++){
    if(em.getEmpleados().get(x).getDocumento()==docu){
    veriplaca=true;
    xplaca=x;
    break;
    }
    }
    // name=em.getEmpleados().get(xplaca).getNombre();
                if(veriplaca==true){
                      DefaultTableModel modelo= (DefaultTableModel) Tabla.getModel();
                        
                        modelo.setRowCount(0);

                       // Tabla.setVisible(true);
                          //Tabla.setModel(modelo);
                          Object[] fila=new Object[5];
                      
                           fila[0]=em.getEmpleados().get(xplaca).getDocumento();
                          fila[1]=em.getEmpleados().get(xplaca).getNombre();
                          fila[2]=em.getEmpleados().get(xplaca).getTelefono();
                          fila[3]=em.getEmpleados().get(xplaca).getDireccion();
                          fila[4]=em.getEmpleados().get(xplaca).getFechaContrato();
                          modelo.addRow(fila);
                    em.getEmpleados().remove(xplaca);
                   
                  //  System.out.println("Se ha eliminado el empleado: "+name+"\n\n\n");
                    
                }
                else{
                      JOptionPane.showMessageDialog (null , "¡Normandia!\n\n¡Empleado no existe! ", "Error",0); 
                    
                }
    }
        
        public static void modificarEmpleado(Integer docu,String nomb, String tele, String dire, String fech , JTable Tabla){
            
            
              boolean veriplaca=false; 
        LocalDate fecha=LocalDate.now();
        //Empleado 
        em=new Empleado(docu, nomb, tele, dire, fecha);
  em.setEmpleados(puente2);
          
    //System.out.println("Ingrese el número de documento del empleado: ");
  
    if(docu>0){}
    else{ JOptionPane.showMessageDialog (null , "¡No se puede completar la operación!\n\n Por favor ingrese documento valido", "Error",0); 
    return;}
    

 
  
   
   int xx=0;
    veriplaca=false;
    for(int x=0;x<em.getEmpleados().size();x++){
    if(em.getEmpleados().get(x).getDocumento()==docu){
        
    veriplaca=true;
    xx=x;
    break;
    }

    }
                 
               if(veriplaca==true){
                   
                   if(nomb.equals("")||tele.equals("")||dire.equals("")){
                        
 JOptionPane.showMessageDialog (null , "¡Por favor diligenciar todos los campos!\n\n\n ", "Error",0);
 return;
                    }
                   try{fecha=LocalDate.parse(fech);
                    
                    }
                    catch(Exception g){
                       JOptionPane.showMessageDialog (null , "¡Normandia!\n\nFecha incorrecta", "Error",0); 
                       return;}
                   
                     em= new Empleado(docu,nomb, tele, dire, fecha);
                        //Semoviente se=new Semoviente(placa,raza, color, cadena, em);
                        //empleados.add(em);
                        //em.getEmpleados().add(em);
                       // em.setEmpleados((em.getEmpleados().add(em)));
                        em.setEmpleados(puente2);
                        
                       puente2=em.getEmpleados();
                       puente2.set(xx,em);
                       //em.setEmpleados(puente2);
                       
        
                        //puente2.add(em);
                        
                        DefaultTableModel modelo= (DefaultTableModel) Tabla.getModel();
                        
                        modelo.setRowCount(0);

                       // Tabla.setVisible(true);
                          //Tabla.setModel(modelo);
                          Object[] fila=new Object[5];
                      
                          fila[0]=em.getDocumento();
                          fila[1]=em.getNombre();
                          fila[2]=em.getTelefono();
                          fila[3]=em.getDireccion();
                          fila[4]=em.getFechaContrato();
                          modelo.addRow(fila);
                   
                }
                else{
          JOptionPane.showMessageDialog (null , "¡Normandia!\n\nEmpleado no existe! ", "Error",0); 
           return;
                    
        
                        }
              
            
        }
       
}


