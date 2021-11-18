/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espacios.modelos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;
import personas.modelos.Docente;
import recursos.modelos.Recurso;

/**
 *
 * @author root
 */
public class Espacio implements Comparable<Espacio> {
    private String nombre;
    private int capacidad;
    private Tipo tipo;

    public Espacio(String nombre, int capacidad, Tipo tipo) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void mostrar() {
        System.out.println(this.nombre + ", " + this.capacidad + ", " + this.tipo);
    }

    
    @Override
    public int compareTo(Espacio e) {
//        return e.nombre.compareTo(this.nombre);
//        return this.capacidad - e.capacidad;
        return this.tipo.toString().compareTo(e.tipo.toString());
    }

    

    
  
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nombre);
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
        final Espacio other = (Espacio) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    
}
