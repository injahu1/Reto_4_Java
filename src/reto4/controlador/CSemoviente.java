
package reto4.controlador;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import reto4.modelo.Semoviente;

public class CSemoviente {

    public static  ArrayList <Semoviente> puente = new ArrayList();
 
       public static Semoviente se=new Semoviente(00,"", "", "", CEmpleado.em);

    
    //ArrayList<Semoviente> semovientes, ArrayList<Empleado> empleados
         public static void registrarSemoviente( Integer iden,String raza, String colo, String prop, Integer enca, JTable Tabla) {

        boolean veriplaca=false;
        boolean verien=false;
        String cadena;

        int xsave=0;

        se=new Semoviente(iden,raza, colo, prop, CEmpleado.em);
        se.setSemovientes(puente);
             
    if(iden>0){}
    else{
        JOptionPane.showMessageDialog (null , "¡No se puede completar la operación!\n\n Por favor ingrese identificación correcta ", "Error",0);
        return ;
    }
    
    veriplaca=false;
    for(int x=0;x<se.getSemovientes().size();x++){
    if(se.getSemovientes().get(x).getIdSemoviente()==iden){
    veriplaca=true;
    }
    }
                 
               if(veriplaca==true){
                     
                   JOptionPane.showMessageDialog (null , "¡Semoviente ya existe!\n\n\n ", "Error",0);
                   return;
                }
                else{
                    //System.out.println("Ingrese la raza del semoviente: "); 
                   // raza=lector.next();
                    //System.out.println("Ingrese el color del semoviente: "); 
                    //color=lector.next();
                    
                    //System.out.println("Ingrese el propósito del semoviente (Carne ó Leche): ");  
                    
                    if(raza.equals("")||colo.equals("")){
                        
 JOptionPane.showMessageDialog (null , "¡Por favor diligenciar todos los campos!\n\n\n ", "Error",0);
 return;
                    }
                
                    if((prop.equals("Carne"))||(prop.equals("carne"))||(prop.equals("CARNE"))){
                        cadena="Carne";
                        }
                    else if (prop.equals("Leche")||(prop.equals("leche"))||(prop.equals("LECHE"))){
                        cadena="Leche";
                        }
                    else{
                         JOptionPane.showMessageDialog (null , "¡Propósito incorrecto!\n\n\n ", "Error",0);
                    return;
                    }
                    
                  
  //  System.out.println("Ingrese el documento del encargado: ");
  
    if(enca>0){}
    else{//System.out.println("Ingreso incorrecto"); 
        JOptionPane.showMessageDialog (null , "¡No se puede completar la operación!\n\n Encargado incorrecto ", "Error",0);
        return;
    }

                     verien=false;
         for(int x=0;x<CEmpleado.em.getEmpleados().size();x++){             
                 if(CEmpleado.em.getEmpleados().get(x).getDocumento()==enca){
                 verien=true;
                 xsave=x;
                 break;
                 }
         }
        if(verien==true){
                        se=new Semoviente(iden,raza, colo, cadena, CEmpleado.em.getEmpleados().get(xsave));
                        //semovientes.add(se);
                        //se.getSemovientes().add(se);
                        se.setSemovientes(puente);
                        puente=se.getSemovientes();
                        
                        puente.add(se);
                        
                         DefaultTableModel modelo= (DefaultTableModel) Tabla.getModel();
                        
                        modelo.setRowCount(0);

                       // Tabla.setVisible(true);
                          //Tabla.setModel(modelo);
                          Object[] fila=new Object[5];
                      
                          fila[0]=se.getIdSemoviente();
                          fila[1]=se.getRaza();
                          fila[2]=se.getColor();
                          fila[3]=se.getProposito();
                          fila[4]=se.getEmpleado().getNombre();
                          modelo.addRow(fila);
   
                        //JOptionPane.showMessageDialog (null , "¡Nornmandia!\n\n ¡Semoviente registrado!", "Error",0);
       }     
        else{JOptionPane.showMessageDialog (null , "¡No existe ese empleado ", "Error",0);}
                }
 
    }

    public static void consultarSemoviente(Integer iden, JTable Tabla) {
        
        boolean veriplaca=false;
         //int placa=0;
         int xguarde=0;
   
                //System.out.println("Ingrese el número de placa del semoviente: "); 
              
                    if(iden>0){}
                    else{JOptionPane.showMessageDialog (null , "¡No se puede completar la operación!\n\n Por favor ingrese identificación correcta ", "Error",0);
                    return;}
           
                
                veriplaca=false;
         for(int x=0;x<se.getSemovientes().size();x++){
                 
                 if(se.getSemovientes().get(x).getIdSemoviente()==iden){
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
                      
                          fila[0]=se.getSemovientes().get(xguarde).getIdSemoviente();
                          fila[1]=se.getSemovientes().get(xguarde).getRaza();
                          fila[2]=se.getSemovientes().get(xguarde).getColor();
                          fila[3]=se.getSemovientes().get(xguarde).getProposito();
                          fila[4]=se.getSemovientes().get(xguarde).getEmpleado().getNombre();
                          modelo.addRow(fila);
                          
            
             
                    
                    
                    
                }
                else{
            JOptionPane.showMessageDialog (null , "¡No existe ese semoviente ", "Error",0);
        
                    
                }
   
    }      
    
     public static void eliminarSemoviente(Integer iden, JTable Tabla) {
     //int placa=0;
        boolean veriplaca=false;
        int xplaca=0;
    
                    if(iden>0){}
                    else{JOptionPane.showMessageDialog (null , "¡No se puede completar la operación!\n\n Por favor ingrese identificación correcta ", "Error",0);
                    return; }

     
    veriplaca=false;
    for(int x=0;x<se.getSemovientes().size();x++){
    if(se.getSemovientes().get(x).getIdSemoviente()==iden){
    veriplaca=true;
    xplaca=x;
    break;
    }
    }
     
                if(veriplaca==true){
                    
                    //System.out.println("\nNormandia");
                    //System.out.println("¡Semoviente eliminado!\n\n\n");
                    
                     DefaultTableModel modelo= (DefaultTableModel) Tabla.getModel();
                        
                        modelo.setRowCount(0);

                          Object[] fila=new Object[5];
                      
                          fila[0]=se.getSemovientes().get(xplaca).getIdSemoviente();
                          fila[1]=se.getSemovientes().get(xplaca).getRaza();
                          fila[2]=se.getSemovientes().get(xplaca).getColor();
                          fila[3]=se.getSemovientes().get(xplaca).getProposito();
                          fila[4]=se.getSemovientes().get(xplaca).getEmpleado().getNombre();
                          modelo.addRow(fila);
                    se.getSemovientes().remove(xplaca);
                    
                }
                else{ JOptionPane.showMessageDialog (null , "¡No existe ese semoviente ", "Error",0);
              
                }
        
    }

     
        public static void modificarSemoviente( Integer iden,String raza, String colo, String prop, Integer enca, JTable Tabla) {

        boolean veriplaca=false;
        boolean verien=false;
        String cadena;

        int xsave=0;

        se=new Semoviente(iden,raza, colo, prop, CEmpleado.em);
          se.setSemovientes(puente);
             
    if(iden>0){}
    else{
        JOptionPane.showMessageDialog (null , "¡No se puede completar la operación!\n\n Por favor ingrese identificación correcta ", "Error",0);
        return ;
    }
    
    int xx=0;
    veriplaca=false;
    for(int x=0;x<se.getSemovientes().size();x++){
    if(se.getSemovientes().get(x).getIdSemoviente()==iden){
        xx=x;
    veriplaca=true;
    break;
    }
    }
                 
               if(veriplaca==true){
                  
                     if(raza.equals("")||colo.equals("")){
                        
 JOptionPane.showMessageDialog (null , "¡Por favor diligenciar todos los campos!\n\n\n ", "Error",0);
 return;
                    }
                     
                      if((prop.equals("Carne"))||(prop.equals("carne"))||(prop.equals("CARNE"))){
                        cadena="Carne";
                        }
                    else if (prop.equals("Leche")||(prop.equals("leche"))||(prop.equals("LECHE"))){
                        cadena="Leche";
                        }
                    else{
                         JOptionPane.showMessageDialog (null , "¡propósito mal!\n\n\n ", "Error",0);
                    return;
                    }
                      
                          if(enca>0){}
    else{//System.out.println("Ingreso incorrecto"); 
        JOptionPane.showMessageDialog (null , "¡No se puede completar la operación!\n\n Encargado incorrecto ", "Error",0);
        return;
    }

                     verien=false;
         for(int x=0;x<CEmpleado.em.getEmpleados().size();x++){             
                 if(CEmpleado.em.getEmpleados().get(x).getDocumento()==enca){
                 verien=true;
                 xsave=x;
                 break;
                 }
         }
                   
         if(verien==true){
                        se=new Semoviente(iden,raza, colo, cadena, CEmpleado.em.getEmpleados().get(xsave));
                        //semovientes.add(se);
                        //se.getSemovientes().add(se);
                        se.setSemovientes(puente);
                        puente=se.getSemovientes();
                         puente.set(xx,se);
                  
                        
                         DefaultTableModel modelo= (DefaultTableModel) Tabla.getModel();
                        
                        modelo.setRowCount(0);

                       // Tabla.setVisible(true);
                          //Tabla.setModel(modelo);
                          Object[] fila=new Object[5];
                      
                          fila[0]=se.getIdSemoviente();
                          fila[1]=se.getRaza();
                          fila[2]=se.getColor();
                          fila[3]=se.getProposito();
                          fila[4]=se.getEmpleado().getNombre();
                          modelo.addRow(fila);
   
                        //JOptionPane.showMessageDialog (null , "¡Nornmandia!\n\n ¡Semoviente registrado!", "Error",0);
       }     
        else{JOptionPane.showMessageDialog (null , "¡No existe ese empleado ", "Error",0);}
         
                }
                else{
                   
                   JOptionPane.showMessageDialog (null , "¡Semoviente no existe!\n\n\n ", "Error",0);
                   return;
  
                }
 
    }  
     
}

