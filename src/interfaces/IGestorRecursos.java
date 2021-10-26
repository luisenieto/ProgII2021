/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

public interface IGestorRecursos {
    public static final String EXITO = "Se creó y guardó el recurso";
    public static final String RECURSO_DUPLICADO = "Ya existe un recurso con ese nombre";
    public static final String NOMBRE_INCORRECTO = "No se pudo crear el recurso porque está mal el nombre";

    public abstract String nuevoRecurso(String nombre);
    public abstract void mostrarRecursos();
}
