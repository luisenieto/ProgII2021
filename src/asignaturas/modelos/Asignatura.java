/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignaturas.modelos;

import java.util.ArrayList;
import personas.modelos.Docente;

/**
 *
 * @author root
 */
public class Asignatura {
    private int codigo;
    private String nombre;
    private ArrayList<Docente> docentes;
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrar() {
        System.out.println("Código: " + this.codigo + " nombre: " + this.nombre);
    }
    
    @Override
    public String toString() {
        return nombre + " " + codigo;
    }
    
}
