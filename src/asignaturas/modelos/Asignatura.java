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

    public Asignatura(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.docentes = new ArrayList<>();
    }
    
    public void agregarDocente(Docente d) {        
        this.docentes.add(d);
        //d.agregarAsignatura(this);
    }
    
    public void mostrar() {
        System.out.println("Código: " + this.codigo + " nombre: " + this.nombre);
        for(Docente d : this.docentes) {
            System.out.println(d.getApellido() + ", " + d.getNombre());
        }
    }
    
}
