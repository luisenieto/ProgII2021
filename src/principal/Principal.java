/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import espacios.modelos.Espacio;
import personas.modelos.Docente;
import recursos.modelos.Recurso;

/**
 *
 * @author root
 */
public class Principal {
    public static void main(String[] args) {
        Espacio e1 = new Espacio("A1", 300, "Anfiteatro", true);
        Espacio e2 = new Espacio("1-3-14", 50, "Aula", true);
//        e.nombre = "A1";
//        e.capacidad = 300;
//        e.tipo = "Anfiteatro";
//        e.habilitado = true;

        
//        System.out.println(e.verNombre());
//        System.out.println(e.getCapacidad());
//        System.out.println(e.getTipo());
//        System.out.println(e.isHabilitado());
        
//        e.mostrar(true);
        
        //Espacio e2 = new Espacio("1-3-08", 50, true);
//        e2.mostrar();
        
        Espacio e3 = new Espacio("1-3-08", 50, "Aula");
//        e3.mostrar(true);
        
       
        Docente d1 = new Docente("Juan", "Pérez", 1);
//        Asignatura a1 = new Asignatura(1, "Cálculo I");
//        a1.agregarDocente(d1);
//        d1.agregarAsignatura(a1);
//        a1.mostrar();
        //d1.mostrar();
        
//        System.out.println(a1);

        Recurso r1 = new Recurso("Ventilador");
        e1.agregarRecurso(r1, 10);
        
        Recurso r2 = new Recurso("Ventilador");
        e1.agregarRecurso(r1, 2);
    }
}
