/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas.modelos;

import asignaturas.modelos.Asignatura;
import java.util.ArrayList;
import personas.modelos.Cargo;
import personas.modelos.Cargo;
import personas.modelos.Personal;
import personas.modelos.Personal;

/**
 *
 * @author root
 */
public class Docente extends Personal {
    private Cargo cargo;
    private ArrayList<Asignatura> asignaturas;

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Docente(String nombre, String apellido, int legajo, Cargo cargo) {
        super(nombre, apellido, legajo);
        this.cargo = cargo;        
    }
    
    public void asignarNombre(String n) {
        this.setNombre(n);
    }
    
    public void mostrar() {
        //System.out.println(this.nombre + ", " + this.apellido + " " + this.legajo);
    }
    
    //@Override
    public int mostrar(int x) {        
        System.out.println(this.cargo);
        //super.mostrar();
        return 0;
    }
    
}
