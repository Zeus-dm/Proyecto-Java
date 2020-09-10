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
public class RegistroPresentaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Calendario progreso = new Calendario();
        Calendario cancelados = new Calendario();
        
        Expositor expo1 = new Expositor("Diego", 34, "Masculino", "Chile", "diego.nose@gmail.com");
        Asistente asist1 = new Asistente("Jose","Operario de Luces");
        
        Presentacion seguridad = new Presentacion("Seguridad", 120, expo1 ); //crea la presentacion
        seguridad.addAsistente(asist1);
        
        Fecha f10_04_2020 = new Fecha(10, 04, 2020); //crea la fecha
        f10_04_2020.addPresentacion(seguridad); //inserta la presentacion a la fecha
        
        progreso.addFecha(f10_04_2020);  //inserta la fecha en el calendario
        
        Expositor expo2 = new Expositor("Juan", 22, "Masculino", "Colombia", "Juan.nose@gmail.com");
        Asistente asist2 = new Asistente("Miguel", "Sonido");
        Asistente asist3 = new Asistente("josefa", "Ornamental");
        
        Presentacion fotosintesis = new Presentacion("Fotosintesis", 180, expo2 ); //crea la presentacion
        fotosintesis.addAsistente(asist2);
        fotosintesis.addAsistente(asist3);
        
        Presentacion largaVida = new Presentacion();
        largaVida.setTema("Larga Vida");
        largaVida.getExpositor().setNombre("Alberto");
        
        Fecha f26_03_2020 = new Fecha(26, 03, 2020); //crea la fecha
        f26_03_2020.addPresentacion(fotosintesis); //inserta la presentacion a la fecha
        f26_03_2020.addPresentacion(largaVida);
        
        progreso.addFecha(f26_03_2020);  //inserta la fecha en el calendario

        //largaVida.cldPresentacion();
        //seguridad.cldPresentacion();
        
        cancelados.setFechas( progreso.actualizarCalendario( "CLD" ) );

        //mostrar
        for( Iterator it = progreso.getFechas().keySet().iterator(); it.hasNext();) { 
            String key = (String)it.next();
            Fecha f = (Fecha)progreso.getFechas().get(key);
            
            System.out.println("\nEl dia "+f.getFecha()+" tienes estas presentaciones: ");
            
            for( Presentacion x: f.getListaPresentaciones() ){
            
                System.out.print( "Tema: "+x.getTema()+", Duracion: "+x.getDuracion()+" min , Expositor: "+x.getExpositor().getNombre()+", Asistentes: "  );
            
                for( Asistente h: x.getListaAsistentes() ){
                    System.out.print( h.getNombre()+"("+h.getCargo()+"), ");
                }
                System.out.print("\n");
            }

        }
        
        largaVida.cldPresentacion();
        seguridad.cldPresentacion();
        
        //fotosintesis.cldPresentacion();
        
        cancelados.setFechas( progreso.actualizarCalendario( "CLD" ) );
        
        System.out.print("\nEstos fueron cancelados") ;
        
        for( Iterator it = cancelados.getFechas().keySet().iterator(); it.hasNext();) { 
            String key = (String)it.next();
            Fecha f = (Fecha)cancelados.getFechas().get(key);
            
            System.out.println("\nEl dia "+f.getFecha()+" tienes estas presentaciones: ");
            
            for( Presentacion x: f.getListaPresentaciones() ){
            
                System.out.print( "Tema: "+x.getTema()+", Duracion: "+x.getDuracion()+" min , Expositor: "+x.getExpositor().getNombre()+", Asistentes: "  );
            
                for( Asistente h: x.getListaAsistentes() ){
                    System.out.print( h.getNombre()+"("+h.getCargo()+"), ");
                }
                System.out.print("\n");
            }

	}
        
        //mostrar
        System.out.println("\nSe actualizo el progreso:");
        
        for( Iterator it = progreso.getFechas().keySet().iterator(); it.hasNext();) { 
            String key = (String)it.next();
            Fecha f = (Fecha)progreso.getFechas().get(key);
            
            System.out.println("\nEl dia "+f.getFecha()+" tienes estas presentaciones: ");
            
            for( Presentacion x: f.getListaPresentaciones() ){
            
                System.out.print( "Tema: "+x.getTema()+", Duracion: "+x.getDuracion()+" min , Expositor: "+x.getExpositor().getNombre()+", Asistentes: "  );
            
                for( Asistente h: x.getListaAsistentes() ){
                    System.out.print( h.getNombre()+"("+h.getCargo()+"), ");
                }
                System.out.print("\n");
            }

        }
        
        

    }
    
}
