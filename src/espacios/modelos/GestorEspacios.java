/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espacios.modelos;

import interfaces.IGestorEspacios;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author root
 */
public class GestorEspacios implements IGestorEspacios {
    private List<Espacio> espacios = new ArrayList<>();
    private static GestorEspacios instancia;
    
    private GestorEspacios() {
        
    }
    
    public static GestorEspacios instanciar() {
        if (instancia == null)
            instancia = new GestorEspacios();
        return instancia;
    }
    
    @Override
    public String nuevoEspacio(String nombre, int capacidad, String tipo, boolean habilitado) {
        if ((nombre == null) || (nombre.isEmpty()))
            return ERROR_NOMBRE;
        if (capacidad <= 0)
            return ERROR_CAPACIDAD;
        if ((tipo == null) || (tipo.isEmpty()))
            return ERROR_TIPO;
        Espacio e = new Espacio(nombre, capacidad, tipo, habilitado);
        if (!this.espacios.contains(e)) {
            this.espacios.add(e);
            return EXITO;
        }
        else
            return DUPLICADO;
    }

    @Override
    public void mostrarEspacios(Comparator<Espacio> cmp) {
        Collections.sort(this.espacios, cmp);
        for(Espacio e : this.espacios)
            e.mostrar();
    }
 
    @Override
    public Espacio obtenerEspacio(int pos) throws IOException, InterruptedException {
//        try {
            //
            //
            return this.espacios.get(pos);
            //
            //
            //
//        }
//        catch(ClassCastException e) {
//            return null;
//        }
//        catch(IndexOutOfBoundsException e) {
//            return null;
//        }
//        finally {
            //
            //
            //            
//        }
        //
        //
        //
    }

    @Override
    public void m3() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void m4() throws IOException {
        m3();        
    }
    
    
    
    
}
