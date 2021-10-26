/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos.modelos;

import interfaces.IGestorRecursos;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author root
 */
public class GestorRecursos2 implements IGestorRecursos {
    private Set<Recurso> recursos = new HashSet<>();
    private static GestorRecursos2 instancia;
    
    private GestorRecursos2() {
        
    }
    
    public static GestorRecursos2 instanciar() {
        if (instancia == null)
            instancia = new GestorRecursos2();
        return instancia;
    }

    @Override
    public String nuevoRecurso(String nombre) {
        if ((nombre != null) && (!nombre.isEmpty())) {
            Recurso r = new Recurso(nombre);
            this.recursos.add(r);
            return "Recurso creado y guardado";
        }
        return 
            "No se pudo crear el recurso porque está mal el nombre, o ya existe uno con ese nombre";
    }

    @Override
    public void mostrarRecursos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
