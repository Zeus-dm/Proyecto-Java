/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registropresentaciones;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/**
 *
 * @author rafae
 */
public class Calendario {
    
    private TreeMap fechas;
    
    //CONSTRUCTOR
    public Calendario() {
        fechas = new TreeMap();
    }
    
    //SETTERS
    /*Ingresa cada fecha en el calendario si no existe, si existe ingresa las presentaciones a la fecha existente*/
    public void setFechas(TreeMap mapFechas) {
        for( Iterator it = mapFechas.keySet().iterator(); it.hasNext();) {
            
            String key = (String)it.next();
            Fecha f = (Fecha)mapFechas.get(key);
            
            Fecha aux = (Fecha)fechas.get(key);
            if( aux == null ){
                fechas.put(key, f);
            }else{
                for(Presentacion x: f.getListaPresentaciones()){
                    aux.addPresentacion(x);
                }
            }
        }
    }
    
    //GETTERS
    public TreeMap getFechas() {
        return fechas;
    }
    
    //METODOS
    public void addFecha( Fecha fecha){
        fechas.put(fecha.genKeyFecha() , fecha);
    }
    
    /*actualiza el calendario concluyendo todas las presentaciones y fechas las cuales esten antes que la fecha actual*/
    public void actualizarCalendario(){
        String fecha = "";
        
        Calendar c1 = Calendar.getInstance();
        String dia = Integer.toString(c1.get(Calendar.DATE));
        String mes = Integer.toString(c1.get(Calendar.MONTH)+1);
        String anio = Integer.toString(c1.get(Calendar.YEAR));
        
        if( mes.length() == 1 && dia.length() == 1){
            fecha = anio+"/0"+mes+"/0"+dia;
        }else if( dia.length() == 1){
            fecha = anio+"/"+mes+"/0"+dia;
        }else if( mes.length() == 1){
            fecha = anio+"/0"+mes+"/"+dia;
        }
        
        for( Iterator it = fechas.keySet().iterator(); it.hasNext();) { 
            String key = (String)it.next();
            Fecha f = (Fecha)fechas.get(key);
            
            if( f.genKeyFecha().compareTo(fecha) < 0){
                for( Presentacion x: f.getListaPresentaciones() ){
                    if(!x.getEstado().equals("CLD")){
                        x.terminarPresentacion();
                    }
                }
            }else{
                break;
            }
        }
    }
    
    /*actualiza el calendario retornando un mapa de fechas donde sus presentaciones tenga el estado @compare*/
    public TreeMap actualizarCalendario( String compare ){
        
        TreeMap fechasElim = new TreeMap();
        List<Presentacion> aEliminar = new ArrayList<>();
        List<Fecha> fEliminar = new ArrayList<>();
        
        for( Iterator it = fechas.keySet().iterator(); it.hasNext();) {
            
            String key = (String)it.next();
            Fecha f = (Fecha)fechas.get(key);
            
            for( Presentacion x: f.getListaPresentaciones() ){
                if( x.getEstado().equals(compare)){
                    Fecha auxFecha = (Fecha) fechasElim.get(key);
                    if( auxFecha == null ){
                        auxFecha = new Fecha( f.getDia(), f.getMes(), f.getAnio());
                        auxFecha.addPresentacion(x);
                        fechasElim.put(auxFecha.genKeyFecha(), auxFecha);
                    }else{
                        auxFecha.addPresentacion(x);
                    }
                    aEliminar.add(x);
                }  
            }
            
            for( Presentacion s: aEliminar){
                f.getListaPresentaciones().remove(s);
            }
            aEliminar.clear();
            
            if(f.getListaPresentaciones().isEmpty()){ //elimina una fecha si esta no tiene ninguna presentacion
                fEliminar.add(f);
            }
	}
        
        for( Fecha s: fEliminar){
            fechas.remove( s.genKeyFecha() );
        }
        fEliminar.clear();
        
        return fechasElim;
    }
    
    
}
