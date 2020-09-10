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
public class Presentacion {
    
    private String tema;
    private int duracion;
    private Expositor expositor;
    private List<Asistente> listaAsistentes;
    private String estado; // PGS = Progreso, CLD = Cancelado, CCD = Concluido
    
    //CONSTRUCTORES
    public Presentacion(){
        tema = "";
        duracion = 60;
        expositor = new Expositor();
        listaAsistentes = new ArrayList<>();
        estado = "PGS";
    }
    
    public Presentacion( String tema, int duracion, Expositor expositor){
        this.tema = tema;
        this.duracion = duracion;
        this.expositor = expositor;
        this.listaAsistentes = new ArrayList<>();
        this.estado = "PGS";
    }
    
    //SETTERS
    public void setTema(String tema) {
        this.tema = tema;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public void setExpositor(Expositor expositor) {
        this.expositor = expositor;
    }
    public void setListaAsistentes(List<Asistente> listaAsistentes) {
        this.listaAsistentes = listaAsistentes;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    //GETTERS
    public String getTema() {
        return tema;
    }
    public int getDuracion() {
        return duracion;
    }
    public Expositor getExpositor() {
        return expositor;
    }
    public List<Asistente> getListaAsistentes() {
        return listaAsistentes;
    }
    public String getEstado() {
        return estado;
    }
    
    //METODOS
    public void addAsistente( Asistente asistente){
        listaAsistentes.add(asistente);
    }
    public void cldPresentacion(){
        estado = "CLD"; // CLD = cancelado
    }
    public void ccdPresentacion(){
        estado = "CCD"; // CLD = cancelado
    }
    
}
