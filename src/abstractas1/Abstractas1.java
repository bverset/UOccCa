/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractas1;

import javax.swing.JOptionPane;

/**
 *
 * @author berna
 */
public class Abstractas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tipo;
        String nom, tip, cat;
        double salBase, vol;
        Empleado e;
        tipo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de Empleado que desea crear. \n1. Directo \n2. Contratista"));
        nom = JOptionPane.showInputDialog("Ingrese el Nombre del Empleado");
        salBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Salario Base"));
        if(tipo == 1)
        {    
        int ant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la anteguidad en años"));
            e = new Contratista("Empresa",ant, "E325", nom, "Ing", salBase);
        }
        else
        {
        int pro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nombre de proyectos"));
            e = new Directo(pro, "E325", nom, "Ing", salBase);
        }
        JOptionPane.showMessageDialog(null, e.Tostring());
    }
    
}
