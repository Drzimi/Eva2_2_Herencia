/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_2_herencia;

/**
 *
 * @author invitado
 */
public class Persona {
    private String Nombre;
    private String apellido;
    private int Edad;

    public Persona(String Nombre, String apellido, int Edad) {
        this.Nombre = Nombre;
        this.apellido = apellido;
        this.Edad = Edad;
    }

    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    
}

