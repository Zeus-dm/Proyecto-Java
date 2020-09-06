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
public class Asistente {
    
    private String nombre;
    private String cargo;
    
    //CONSTRUCTORES
    public Asistente( String nombre){
        this.nombre = nombre;
        cargo = "N/a";
    }
    
    public Asistente( String nombre, String cargo){
        this.nombre = nombre;
        this.cargo = cargo;
    }
    
    //SETTERS
    public void setNombre( String nombre ){
        this.nombre = nombre;
    }
    public void setCargo( String cargo ){
        this.cargo = cargo;
    }
    
    //GETTERS
    public String getNombre(){
        return nombre;
    }
    public String getCargo(){
        return cargo;
    }
    
}
