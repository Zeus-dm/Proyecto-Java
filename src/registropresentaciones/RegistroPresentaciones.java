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
        
        Calendario calendario = new Calendario();
        
        Expositor expo1 = new Expositor("Diego", 34, "Masculino", "Chile", "diego.nose@gmail.com");
        Asistente asist1 = new Asistente("Jose", 23, "Masculino", "Operario de Luces");
        
        Presentacion seguridad = new Presentacion("Seguridad", 120, expo1 ); //crea la presentacion
        seguridad.addAsistente(asist1);
        
        Fecha f10_04_2020 = new Fecha(10, 04, 2020); //crea la fecha
        f10_04_2020.addPresentacion(seguridad); //inserta la presentacion a la fecha
        
        calendario.addFecha(f10_04_2020);  //inserta la fecha en el calendario
        
        Expositor expo2 = new Expositor("Juan", 22, "Masculino", "Colombia", "Juan.nose@gmail.com");
        Asistente asist2 = new Asistente("Miguel", 53, "Masculino", "Sonido");
        Asistente asist3 = new Asistente("josefa", 21, "Femenino", "Ornamental");
        
        Presentacion fotosintesis = new Presentacion("Fotosintesis", 180, expo2 ); //crea la presentacion
        fotosintesis.addAsistente(asist2);
        fotosintesis.addAsistente(asist3);
        
        Presentacion largaVida = new Presentacion();
        largaVida.setTema("Larga Vida");
        
        Fecha f26_03_2020 = new Fecha(26, 03, 2020); //crea la fecha
        f26_03_2020.addPresentacion(fotosintesis); //inserta la presentacion a la fecha
        f26_03_2020.addPresentacion(largaVida);
        
        calendario.addFecha(f26_03_2020);  //inserta la fecha en el calendario
        
        //mostrar
        for( Iterator it = calendario.getFechas().keySet().iterator(); it.hasNext();) { 
            String key = (String)it.next();
            Fecha f = (Fecha)calendario.getFechas().get(key);
            
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
