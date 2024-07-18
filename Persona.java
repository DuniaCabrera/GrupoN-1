/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persona;

/**
 *
 * @author user
 */
public class Persona {

    //Atributos.
    
    private String Nombre;
    private int Edad;
    
    
    
    //Establecer y obtener.
    
    public void establecerNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public String obtenerNombre(){
        return this.Nombre;
    }
    
     public void establecerEdad(int Edad){
        this.Edad = Edad;
    }
    public int obtenerEdad(){
        return this.Edad;
    }
   
 
    
   
  
}