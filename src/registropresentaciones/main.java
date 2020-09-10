/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registropresentaciones;

import java.util.Iterator;


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
        
        Expositor expo1 = new Expositor("Diego", 34, "Masculino", "Chile", "diego.nose@gmail.com");
        Asistente asist1 = new Asistente("Jose","Operario de Luces");
        
        Presentacion seguridad = new Presentacion("Seguridad", 120, expo1 ); //crea la presentacion
        seguridad.addAsistente(asist1);
        
        Fecha f10_04_2020 = new Fecha("10", "04", "2020"); //crea la fecha
        f10_04_2020.addPresentacion(seguridad); //inserta la presentacion a la fecha
        
        progreso.addFecha(f10_04_2020);  //inserta la fecha en el calendario
        
        //---------------------------
        
        Expositor expo2 = new Expositor("Juan", 22, "Masculino", "Colombia", "Juan.nose@gmail.com");
        Asistente asist2 = new Asistente("Miguel", "Sonido");
        Asistente asist3 = new Asistente("josefa", "Ornamental");

        Presentacion fotosintesis = new Presentacion("Fotosintesis", 180, expo2 ); //crea la presentacion
        fotosintesis.addAsistente(asist2);
        fotosintesis.addAsistente(asist3);
        
        Presentacion largaVida = new Presentacion();
        largaVida.setTema("Larga Vida");
        largaVida.getExpositor().setNombre("Alberto");
        
        Fecha f26_03_2020 = new Fecha("26", "3", "2020"); //crea la fecha
        f26_03_2020.addPresentacion(fotosintesis); //inserta la presentacion a la fecha
        f26_03_2020.addPresentacion(largaVida);
        
        progreso.addFecha(f26_03_2020);  //inserta la fecha en el calendario
        
        //--------------------------
        
        Presentacion ejemplo = new Presentacion();
        ejemplo.setTema("ejemplo");
        ejemplo.getExpositor().setNombre("Huachipato");
        ejemplo.getExpositor().setEdad(34);
        
        Fecha f03_12_2020 = new Fecha("3", "12", "2020");
        f03_12_2020.addPresentacion(ejemplo);
        
        progreso.addFecha(f03_12_2020);
        
        //---------------------------
        
        //mostrar
        mostrarDatos( progreso );
        
        //fotosintesis.cancelarPresentacion();
        largaVida.cancelarPresentacion();
        //seguridad.cancelarPresentacion();
        
        progreso.actualizarCalendario();
        
        cancelados.setFechas( progreso.actualizarCalendario( "CLD" ));
        terminados.setFechas(progreso.actualizarCalendario("TMD"));
        
        System.out.println("\nEstos fueron cancelados") ;
        mostrarDatos( cancelados );
        
        System.out.println("\nEstos fueron terminados") ;
        mostrarDatos( terminados );
        
        //mostrar
        System.out.println("\nSe actualizo el progreso:");
        mostrarDatos( progreso );
        
        progreso.actualizarCalendario();
        
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
    }
    
}
