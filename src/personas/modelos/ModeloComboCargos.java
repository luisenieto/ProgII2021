/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas.modelos;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author root
 */
public class ModeloComboCargos extends DefaultComboBoxModel {
    public ModeloComboCargos() {
        for(Cargo cargo : Cargo.values()) {
            this.addElement(cargo);
        }
    }
    
    public Cargo obtenerCargo() {
        return (Cargo)this.getSelectedItem();
    }
}
