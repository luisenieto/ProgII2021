/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas.modelos;

/**
 *
 * @author root
 */
public class NoDocente extends Personal {
    public NoDocente(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
    }

    @Override
    public void mostrar() {
        System.out.println(this.getNombre() + ", " + this.getApellido());
    }
    
    
}