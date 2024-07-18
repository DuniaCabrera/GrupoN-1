/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oscar
 */
public class Doctor {
    public class Doctor extends Persona {
  
    private String especialidad;
    
    public Doctor(String nombre, int edad, String especialidad) {
        // Llamada al constructor de la superclase Persona
        super(nombre, edad);
        this.especialidad = especialidad;
    }
    
    // Método para obtener la especialidad
    public String getEspecialidad() {
        return especialidad;
    }
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("Especialidad: " + especialidad);
    }
  }
}
    

