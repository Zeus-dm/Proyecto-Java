/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registropresentaciones;


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
        
        
        //mostrar
        for( Fecha f: calendario.getFechas() ){

            System.out.println("El dia "+f.getDia()+"/"+f.getMes()+"/"+f.getAnio()+" tienes estas presentaciones: ");
            
            for( Presentacion x: f.getListaPresentaciones() ){
            
                System.out.print( "Tema: "+x.getTema()+", Duracion: "+x.getDuracion()+" min , Expositor: "+x.getExpositor().getNombre()+", Asistentes: "  );
            
                for( Asistente h: x.getListaAsistentes() ){
                    System.out.println( h.getNombre()+"("+h.getCargo()+"), ");
                }
            }
        }

    }
    
}
