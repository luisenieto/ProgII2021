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
public class Espacio {
    private String nombre;
    private int capacidad;
    private String tipo;
    private boolean habilitado;
    private ArrayList<Composicion> composiciones = new ArrayList<>();

    public Espacio(String nombre, int capacidad, String tipo, boolean habilitado) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.habilitado = habilitado;
    }
    
    public Espacio(String n, int c, boolean h) {
        this(n, c, "Aula", h);        
    }
    
    public Espacio(String n, int c, String t) {
        this(n, c, t, true);
    }    
    
    
    
    
    private boolean validarNombre(String n) {
        if (n.isEmpty())
            return false;
        else
            return true;
    }

    public String verNombre() {
        return nombre;
    }

    /**
        Este método permite asignarle el nombre a un espacio
     *  @param nombre nombre representa el nombre del espacio
    */
    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la capacidad de un espacio
     * @return entero que representa la capacidad de un espacio
     */
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
    
    public void mostrar() {
        System.out.println(this.nombre + ", " + this.capacidad + ", " + this.tipo);
    }
    
    public void mostrar(boolean mostrarHabilitado) {
        if (mostrarHabilitado)
            System.out.println(nombre + ", " + capacidad + ", " + tipo + ", habilitado: " + habilitado);
        else
            this.mostrar();
    }
    
    public void agregarRecurso(Recurso r, int cantidad) {
        Composicion c = new Composicion(r, cantidad);
        this.composiciones.add(c);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + Objects.hashCode(this.tipo);
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
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        return true;
    }
    
    public String nuevoTurno(LocalDateTime desde, LocalDateTime hasta, Docente d) {
        if (this.habilitado) { //el espacio está habilitado
            //
            return "Se creó un nuevo turno";
        }
        else
            return "No se puede crear un turno porque está deshabilitado";
    }
    
    public static void prueba() {
        
    }
    
    public static void prueba(int x) {
        
    }
    
    
    public static void prueba(int x, int y) {
        
    }
}
