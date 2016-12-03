/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritages1;

import javax.swing.JOptionPane;

/**
 *
 * @author berna
 */
public class Heritages1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tipoP;
        String nom, tip, cat;
        double pre, vol;
        Producto p;
        tipoP = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de Producto que desea crear. \n1. Producto Base \2. Producto Especial"));
        nom = JOptionPane.showInputDialog("Ingrese el Nombre del Producto");
        tip = JOptionPane.showInputDialog("Ingrese el Tipo del Producto");
        pre = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Precio del Producto"));
        if(tipoP == 1)
        {    
            p = new Producto(nom, tip, pre);
        }
        else
        {
            cat = JOptionPane.showInputDialog("Ingrese la Categoria del Producto");
            vol = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Volumen del Producto"));
            p = new ProductoEspecial(vol, cat, nom, tip, pre);
        }
        JOptionPane.showMessageDialog(null, p.toString());
    }
    
}
