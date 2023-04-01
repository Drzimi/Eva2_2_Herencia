/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_2_herencia;


public class Docente {
 private String Nombre;   
 private String Apellido;   
 private int Edad;   
 private String Plaza;   

    public Docente(String Nombre, String Apellido, int Edad, String Plaza) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Plaza = Plaza;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getPlaza() {
        return Plaza;
    }

    public void setPlaza(String Plaza) {
        this.Plaza = Plaza;
    }

    
}