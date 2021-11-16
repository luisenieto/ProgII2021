/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import espacios.modelos.Espacio;
import java.io.IOException;
import java.util.Comparator;

/**
 *
 * @author root
 */
public interface IGestorEspacios {
    public static final String ERROR_NOMBRE = "El nombre del espacio es inválido";
    public static final String ERROR_CAPACIDAD = "La capacidad del espacio es inválida";
    public static final String ERROR_TIPO = "El tipo de espacio es inválido";
    public static final String EXITO = "Espacio creado";
    public static final String DUPLICADO = "Ya existe ese espacio";
    
    public abstract String nuevoEspacio(String nombre, int capacidad, String tipo, boolean habilitado);
    public abstract void mostrarEspacios(Comparator<Espacio> cmp);
    public abstract Espacio obtenerEspacio(int pos) throws IOException, InterruptedException;
    public abstract void m3() throws IOException;
    public abstract void m4() throws IOException;
}
