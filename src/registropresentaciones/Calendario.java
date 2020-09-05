/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registropresentaciones;

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
    public void setFechas(TreeMap fechas) {
        this.fechas = fechas;
    }
    
    //GETTERS
    public TreeMap getFechas() {
        return fechas;
    }
    
    //METODOS
    public void addFecha( Fecha fecha){
        fechas.put(fecha.genKeyFecha() , fecha);
    }
    
}
