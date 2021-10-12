/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos.modelos;

import java.util.Objects;

/**
 *
 * @author root
 */
public class Recurso {
    private String nombre;

    public Recurso(String nombre) {
        this.nombre = nombre;
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

//    @Override
//    public String toString() {
//        return this.nombre;
//    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.nombre);
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
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Recurso other = (Recurso) obj;
        return this.nombre.toLowerCase().equals(other.nombre.toLowerCase());
//        if (!Objects.equals(this.nombre.toLowerCase(), other.nombre.toLowerCase())) {
//            return false;
//        }
//        return true;
    }
    
    public void mostrar() {
        System.out.println(this.nombre);
    }
    
}
