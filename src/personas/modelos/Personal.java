/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas.modelos;

/**
 *
 * @author root
 */
public abstract class Personal {
    private String nombre;
    private String apellido;
    private int legajo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public Personal(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }
    
    public void mostrar() {
        System.out.println(this.nombre + ", " + this.apellido + " " + this.legajo);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.legajo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass().getSuperclass() != obj.getClass().getSuperclass()) {
            return false;
        }
        Personal other = (Personal) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        return true;
    }
    
    
    public abstract String queSoy();

}
