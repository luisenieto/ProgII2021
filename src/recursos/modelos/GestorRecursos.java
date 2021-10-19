/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos.modelos;

import java.util.ArrayList;

/**
 *
 * @author root
 */
public class GestorRecursos {
    private ArrayList<Recurso> recursos = new ArrayList<>();
    
    
    private static GestorRecursos variable;    
    private GestorRecursos() {
        
    }    
    public static GestorRecursos instanciar() {
        if(variable == null)
            variable = new GestorRecursos();
        return variable;
    }
    
    public String crearRecurso(String nombre) {
        if ((nombre != null) && (!nombre.isEmpty())) {
            Recurso r = new Recurso(nombre);
            if(!this.recursos.contains(r)) {
                this.recursos.add(r);
                return "Recurso creado y guardado";
            }
            else
                return "Ya existe un recurso con ese nombre";
        }
        return 
            "No se pudo crear el recurso porque está mal el nombre";
    }
    
    public void mostrarRecursos() {
        for(Recurso r : this.recursos)
            r.mostrar();
    }
        
}
