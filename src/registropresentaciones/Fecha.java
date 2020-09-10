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
    
    private String dia, mes, anio;
    private List<Presentacion> listaPresentaciones;
    
    //CONSTRUCTOR
    public Fecha(String dia, String mes, String anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        listaPresentaciones = new ArrayList<>();
    }
    
    //SETTERS
    public void setDia(String dia) {
        this.dia = dia;
    }
    public void setMes(String mes) {
        this.mes = mes;
    }
    public void setAnio(String anio) {
        this.anio = anio;
    }
    public void setListaPresentaciones(List<Presentacion> listaPresentaciones) {
        this.listaPresentaciones = listaPresentaciones;
    }
    
    //GETTERS
    public String getDia() {
        return dia;
    }
    public String getMes() {
        return mes;
    }
    public String getAnio() {
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
        if( mes.length() == 1 && dia.length() == 1){
            return "0"+dia+"/0"+mes+"/"+anio;
        }else if( dia.length() == 1){
            return "0"+dia+"/"+mes+"/"+anio;
        }else if( mes.length() == 1){
            return dia+"/0"+mes+"/"+anio;
        }
        return dia+"/"+mes+"/"+anio;
    }
    
    public String genKeyFecha(){
        if( mes.length() == 1 && dia.length() == 1){
            return anio+"/0"+mes+"/0"+dia;
        }else if( dia.length() == 1){
            return anio+"/"+mes+"/0"+dia;
        }else if( mes.length() == 1){
            return anio+"/0"+mes+"/"+dia;
        }
        return anio+"/"+mes+"/"+dia;
    }
    
    public Presentacion searchPresentacion( String tema ){
        for( Presentacion x: listaPresentaciones){
            if( x.getTema().equalsIgnoreCase(tema)){
                return x;
            }
        }
        return null;
    }
    
    public List searchPresentacion( int duracion ){
        List<Presentacion> newList = new ArrayList<>();
        
        for( Presentacion x: listaPresentaciones){
            if( x.getDuracion() == duracion){
                newList.add(x);
            }
        }
        return newList;
    }

}
