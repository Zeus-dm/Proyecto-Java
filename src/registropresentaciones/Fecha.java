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
public class Fecha {
    
    private int dia, mes, anio;
    private List<Presentacion> listaPresentaciones;
    
    //CONSTRUCTOR
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        listaPresentaciones = new ArrayList<>();
    }
    
    //SETTERS
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public void setListaPresentaciones(List<Presentacion> listaPresentaciones) {
        this.listaPresentaciones = listaPresentaciones;
    }
    
    //GETTERS
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAnio() {
        return anio;
    }
    public List<Presentacion> getListaPresentaciones() {
        return listaPresentaciones;
    }
    
    //METODOS
    public void addPresentacion( Presentacion presentacion){
        listaPresentaciones.add(presentacion);
    }
    public String getFecha(){
        return dia+"/"+mes+"/"+anio;
    }

}
