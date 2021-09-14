/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas.modelos;

import asignaturas.modelos.Asignatura;
import java.util.ArrayList;

/**
 *
 * @author root
 */
public class Docente {
    private String nombre;
    private String apellido;
    private int legajo;
    private ArrayList<Asignatura> asignaturas;

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

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public Docente(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.asignaturas = new ArrayList<>();
    }
    
    public void agregarAsignatura(Asignatura a) {
        this.asignaturas.add(a);
        //a.agregarDocente(this);
    }
    
    
    public void mostrar() {
        System.out.println(this.apellido + ", " + this.nombre);
        for(Asignatura a : this.asignaturas) {
            System.out.println(a.getNombre());
        }
    }
    
}
