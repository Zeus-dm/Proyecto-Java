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
public class Expositor {
    
    private String nombre;
    private int edad;
    private String genero;
    private String nacionalidad;
    private String email;
    
    //CONSTRUCTORES
    public Expositor(){
        nombre = "N/a";
        edad = 18;
        genero = "N/a";
        nacionalidad = "N/a";
        email = "N/a";
    }
    
    public Expositor( String nombre, int edad, String genero, String nacionalidad, String email){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
        this.email = email;
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
    public void setNacionalidad( String nacionalidad ){
        this.nacionalidad = nacionalidad;
    }
    public void setEmail( String email ){
        this.email = email;
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
    public String getNacionalidad(){
        return nacionalidad;
    }
    public String getEmail(){
        return email;
    }
    
}
