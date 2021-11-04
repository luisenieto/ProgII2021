/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import javax.swing.JTextField;

/**
 *
 * @author root
 */
public class Controlador1 implements IControlador {
    private static Controlador1 instancia;
    private Ventana v;

    private Controlador1() {
        v = new Ventana(this);
    }
    
    public static Controlador1 instanciar() {
        if (instancia == null)
            instancia = new Controlador1();
        return instancia;
    }
    
    @Override
    public void btnAceptarClic(ActionEvent evt) {
        JTextField campo = v.verCampoTexto();
        String cadena = campo.getText();
        System.out.println(cadena);
    }
    
    @Override
    public void btnCancelarClic(ActionEvent evt) {
        System.out.println("Cancelar");
    }
}
