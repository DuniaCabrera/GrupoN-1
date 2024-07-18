/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deportista;

/**
 *
 * @author DELL
 */
public class Deportista extends Persona {

    // Atributos específicos de un deportista.
    private String deporte;

    // Constructor para crear un objeto Deportista.
    public Deportista(String nombre, int edad, String genero, String deporte) {
        super(nombre, edad, genero); // Se llama al constructor de la clase padre Persona.
        this.deporte = deporte;
    }

    // Métodos para obtener y establecer el deporte del deportista.
    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    // Método para imprimir la información del deportista.
    public void imprimirInformacionDeportista() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Género: " + getGenero());
        System.out.println("Deporte: " + getDeporte());
    }
}
