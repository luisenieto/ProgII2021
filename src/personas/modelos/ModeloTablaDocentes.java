/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas.modelos;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author root
 */
public class ModeloTablaDocentes extends AbstractTableModel {
    private ArrayList<String> nombresColumnas = new ArrayList<>();
    private ArrayList<Docente> docentes = new ArrayList<>();
    
    public ModeloTablaDocentes() {
        this.nombresColumnas.add("Nombre");
        this.nombresColumnas.add("Apellido");
        this.nombresColumnas.add("Legajo");
        this.nombresColumnas.add("Cargo");        
        
        this.docentes.add(new Docente("Nombre1", "Apellido1", 1, Cargo.TITULAR));
        this.docentes.add(new Docente("Nombre2", "Apellido2", 2, Cargo.ASOCIADO));
        this.docentes.add(new Docente("Nombre3", "Apellido3", 3, Cargo.ADG));
        this.docentes.add(new Docente("Nombre4", "Apellido4", 4, Cargo.JTP));
    }

    @Override
    public int getRowCount() {
        return this.docentes.size();
    }

    @Override
    public int getColumnCount() {
        return this.nombresColumnas.size();
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        Docente d = this.docentes.get(fila);
        switch(columna) {
            case 0: return d.getNombre();
            case 1: return d.getApellido();
            case 2: return d.getLegajo();
            case 3: return d.getCargo();
            default: return d.getNombre();
        }
    }

    @Override
    public String getColumnName(int columna) {
        return this.nombresColumnas.get(columna);
    }
    
    
    
}
