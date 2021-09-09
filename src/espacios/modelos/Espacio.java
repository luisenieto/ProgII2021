/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espacios.modelos;

/**
 *
 * @author root
 */
public class Espacio {
    private String nombre;
    private int capacidad;
    private String tipo;
    private boolean habilitado;

    public Espacio(String n, int c, String t, boolean h) {
        nombre = n;
        capacidad = c;
        tipo = t;
        habilitado = h;
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
    
    
}
