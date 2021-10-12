/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import asignaturas.modelos.Asignatura;
import espacios.modelos.Espacio;
import java.util.ArrayList;
import javax.swing.UIManager;
import personas.modelos.Cargo;
import personas.modelos.Docente;
import personas.modelos.NoDocente;
import personas.modelos.Personal;
import recursos.modelos.Recurso;

/**
 *
 * @author root
 */
public class Principal1 {
    public static void main(String[] args) {
//        ArrayList<Docente> docentes = new ArrayList<>();
//        ArrayList<NoDocente> nodocentes = new ArrayList<>();
        ArrayList<Personal> personal = new ArrayList<>();
        ArrayList<Recurso> recursos = new ArrayList<>();
        
        
        
        
//        JFrame ventana = new JFrame("Ventana JFrame");
//        ventana.setSize(300, 400);
//        ventana.setResizable(false);
//        ventana.setLocationRelativeTo(null);
//        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        ventana.setVisible(true);

//        VentanaJFrame ventanaJFrame = new VentanaJFrame();
//        ventana.setLocationRelativeTo(null);
//        ventana.setVisible(true);
//        int opcion = JOptionPane.showConfirmDialog(null,
// 		"¿Desea borrar el espacio especificado?", 
// 		"Reservas", 
// 		JOptionPane.YES_NO_OPTION);
        
        //System.out.println(opcion);
        
        
//        int opcion = JOptionPane.showOptionDialog(null,
//            "¿Desea borrar el espacio especificado?", 
//            "Reservas", JOptionPane.YES_NO_OPTION, 
//            JOptionPane.QUESTION_MESSAGE, null, 
//            new Object[] {"Sí", "No"}, "No");      

//        JOptionPane.showMessageDialog(null, 
//                "No se puede borrar el espacio", 
//                "Reservas", 
// 		JOptionPane.ERROR_MESSAGE);
        
//        if (opcion == JOptionPane.YES_OPTION)
//            System.out.println("Se eligió Yes");
//        else
//            System.out.println("Se eligió No");
        
//        VentanaJDialog ventanaJDialog = new VentanaJDialog(ventanaJFrame, false);

//        VentanaAEspacio ventana = new VentanaAEspacio();
//        asignarLookAndFeel("Nimbus");
//        VentanaADocente ventana = new VentanaADocente();

//        Docente d = new Docente("Nombre", "Apellido", 1, Cargo.ADG);
//        d.mostrar();

//            personal.add(new Docente("Nombre1", "Apellido1", 1, Cargo.ADG));
//            personal.add(new Docente("Nombre2", "Apellido2", 2, Cargo.ADG));
//            
//            personal.add(new NoDocente("Nombre3", "Apellido3", 3));
//            personal.add(new NoDocente("Nombre4", "Apellido4", 4));
            
//          for(Docente d : docentes) {
//              d.mostrar();
//          }
//          
//          for(NoDocente nd : nodocentes) {
//              nd.mostrar();
//          }

//            for(Personal p : personal) {
//                p.mostrar();
//            }
            
            Recurso r1 = new Recurso("Ventilador");
            Recurso r2 = new Recurso("ventilador");
            
            recursos.add(r1);
            if(!recursos.contains(r2))
                recursos.add(r2);
            
            for(Recurso r : recursos)
                r.mostrar();
            
//            if (r1.equals(r2))
//                System.out.println("Iguales");
//            else
//                System.out.println("Distintos");
            
    }

    public static void asignarLookAndFeel(String laf) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (laf.equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                }
            }
        } catch (Exception e) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } 
            catch (Exception e2) {
            }
        }
    }    
}
