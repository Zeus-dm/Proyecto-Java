/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registropresentaciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafae
 */
public class Calendario {
    
    private List<Fecha> fechas;
    
    //CONSTRUCTOR
    public Calendario() {
        fechas = new ArrayList<>();
    }
    
    //SETTERS
    public void setFechas(List<Fecha> fechas) {
        this.fechas = fechas;
    }
    
    //GETTERS
    public List<Fecha> getFechas() {
        return fechas;
    }
    
    //METODOS
    public void addFecha( Fecha fecha){
        fechas.add(fecha);
    }
    
}
