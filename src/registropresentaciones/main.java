/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registropresentaciones;

import java.util.Iterator;
import java.util.Scanner;


/**
 *
 * @author rafae
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Calendario progreso = new Calendario();
        Calendario cancelados = new Calendario();
        Calendario terminados = new Calendario();
        //---------------------------
        
        Scanner opcion = new Scanner(System.in);
        int opc;
        
        do{
            
            System.out.println("\t\tMenu Principal");
            System.out.println("\t1-Ingresar manualmente una presentacion\n"
                             + "\t2-Eliminar una presentacion\n"
                             + "\t3-Mostrar presentaciones pendientes\n"
                             + "\t4-Mostrar presentaciones canceladas\n"
                             + "\t5-Mostrar presentaciones terminadas\n"
                             + "\t6-Salir");
            System.out.print("\tOpcion: ");
            opc = opcion.nextInt();
            
            switch( opc ){
                case 1 -> {
                    ingresarDatos( progreso );
                }
                case 2 -> {
                }
                case 3 -> {
                    progreso.actualizarCalendario();
                    cancelados.setFechas( progreso.actualizarCalendario("CLD"));
                    terminados.setFechas( progreso.actualizarCalendario("TMD"));
                    
                    System.out.println("Presentaciones Pendientes son:");
                    mostrarDatos( progreso );
                }
                case 4 -> {
                    cancelados.setFechas( progreso.actualizarCalendario("CLD"));
                    
                    System.out.println("Presentaciones Canceladas son:");
                    mostrarDatos( cancelados );
                }
                case 5 -> {
                    progreso.actualizarCalendario();
                    terminados.setFechas( progreso.actualizarCalendario("TMD"));
                    
                    System.out.println("Presentaciones Terminadas a la Fecha son:");
                    mostrarDatos( terminados );
                }
            }
        }while(opc != 6);
    }
    
    public static void ingresarDatos( Calendario calendario ){
        System.out.println("\t\tPresentacion");
        
        Scanner opcion = new Scanner(System.in);
        
        //hacer un do while para comprobar fecha con la actual.
        System.out.print("\tIngresar Fecha (dia mes año): ");
        Fecha newFecha = new Fecha( ""+opcion.nextInt(), ""+opcion.nextInt(), ""+opcion.nextInt());
        
        System.out.println("la fecha es "+newFecha.getFecha() );
        
        
        Espera();
    }
    
    public static void mostrarDatos( Calendario calendario ){
        for( Iterator it = calendario.getFechas().keySet().iterator(); it.hasNext();) { 
            String key = (String)it.next();
            Fecha f = (Fecha)calendario.getFechas().get(key);
            
            System.out.println("El dia "+f.getFecha());
            
            for( Presentacion x: f.getListaPresentaciones() ){
            
                System.out.print( "\tTema: "+x.getTema()+", Duracion: "+x.getDuracion()+" min , Expositor: "+x.getExpositor().getNombre()+", Asistentes: "  );
            
                for( Asistente h: x.getListaAsistentes() ){
                    System.out.print( h.getNombre()+"("+h.getCargo()+"), ");
                }
                System.out.print("\n");
            }
        }
        
        Espera();
    }
    
    public static void Espera(){ 
        String seguir;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Presiona Enter para continuar...");
        try{
            seguir = teclado.nextLine();
        }catch(Exception e){}
        
    }
    
    
    
}
