/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos.modelos;

import interfaces.IGestorRecursos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author root
 */
public class GestorRecursos implements IGestorRecursos {
//    private ArrayList<Recurso> recursos = new ArrayList<>();
//    private LinkedList<Recurso> recursos = new LinkedList<>();
    private List<Recurso> recursos = new ArrayList<>();
//    private Set<Recurso> recursos = new HashSet<>();
    private static GestorRecursos instancia;
    
    private GestorRecursos() {
        
    }
    
    public static GestorRecursos instanciar() {
        if (instancia == null)
            instancia = new GestorRecursos();
        return instancia;
    }
    
//    private Recurso[] recursos = new Recurso[100];
    
    @Override
    public String nuevoRecurso(String nombre) {
        if ((nombre != null) && (!nombre.isEmpty())) {
            Recurso r = new Recurso(nombre);
            if(!this.recursos.contains(r)) {
                this.recursos.add(r);
                return EXITO;
            }
            else
                return RECURSO_DUPLICADO;
        }
        return 
            NOMBRE_INCORRECTO;        
    }

    @Override
    public void mostrarRecursos() {
        Collections.sort(this.recursos);
        System.out.println("Recursos");
        System.out.println("--------");
//        for(int i = 0; i < this.recursos.size(); i++) {
//            Recurso r = this.recursos.get(i);
//            r.mostrar();
//        }
        for(Recurso r : this.recursos)
            r.mostrar();
    }
    
}
