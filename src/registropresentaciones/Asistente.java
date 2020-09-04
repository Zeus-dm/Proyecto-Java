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
    private int edad;
    private String genero;
    private String cargo;
    
    //CONSTRUCTORES
    public Asistente(){
        nombre = "";
        edad = 18;
        genero = "";
        cargo = "";
    }
    
    public Asistente( String nombre, int edad, String genero, String cargo){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.cargo = cargo;
    }
    
    //SETTERS
    public void setNombre( String nombre ){
        this.nombre = nombre;
    }
    public void setEdad( int edad ){
        this.edad = edad;
    }
    public void setGenero( String genero ){
        this.genero = genero;
    }
    public void setCargo( String cargo ){
        this.cargo = cargo;
    }
    
    //GETTERS
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getGenero(){
        return genero;
    }
    public String getCargo(){
        return cargo;
    }
    
}
