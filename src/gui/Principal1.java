/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.UIManager;

/**
 *
 * @author root
 */
public class Principal1 {
    public static void main(String[] args) {
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
        asignarLookAndFeel("Nimbus");
        VentanaADocente ventana = new VentanaADocente();
        
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
