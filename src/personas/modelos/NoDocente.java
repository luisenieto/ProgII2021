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
    private String cx;
    
    public NoDocente(String nombre, String apellido, int legajo, String cx) {
        super(nombre, apellido, legajo);
        this.cx = cx;
    }

    public String getCx() {
        return cx;
    }

    public void setCx(String cx) {
        this.cx = cx;
    }
    
    
    
    @Override
    public void mostrar() {
        System.out.println(this.getNombre() + ", " + this.getApellido() + " (" + this.getLegajo() + ")");
    }

    @Override
    public String queSoy() {
        return "soy un no docente";
    }    
}
