/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 */
public class Usuario {
    private int Id;
    private String Nombre;

    public Usuario() {
    }

    public Usuario(int Id, String Nombre) {
        this.Id = Id;
        this.Nombre = Nombre;
    }
    
    public Usuario(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
