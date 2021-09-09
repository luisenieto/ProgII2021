/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import espacios.modelos.Espacio;

/**
 *
 * @author root
 */
public class Principal {
    public static void main(String[] args) {
        Espacio e = new Espacio("A1", 300, "Anfiteatro", true);
//        e.nombre = "A1";
//        e.capacidad = 300;
//        e.tipo = "Anfiteatro";
//        e.habilitado = true;

        
        System.out.println(e.verNombre());
        System.out.println(e.getCapacidad());
        System.out.println(e.getTipo());
        System.out.println(e.isHabilitado());
        
    }
}
