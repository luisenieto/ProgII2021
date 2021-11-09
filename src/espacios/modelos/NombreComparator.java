/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espacios.modelos;

import java.util.Comparator;

/**
 *
 * @author root
 */
public class NombreComparator implements Comparator<Espacio> {

    @Override
    public int compare(Espacio e1, Espacio e2) {
        return e1.verNombre().compareTo(e2.verNombre());
    }
    
}
