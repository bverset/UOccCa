/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradasalida;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo Salazar
 */
public class EntradaSalida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Ejercicio # 1
        /*String nombre, edad;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su edad");
        edad = entrada.nextLine();
        System.out.println("Su nombre es " + nombre 
                + " y tiene " + edad + " años.");*/
                
        /*System.out.print("Su nombre es ");
        System.out.print(nombre);
        System.out.print(" y tine ");
        System.out.print(edad);
        System.out.print(" años.\n");*/
        
        
        //Ejercicio # 2
        /*String nombre, edad;
        nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
        edad = JOptionPane.showInputDialog("Ingrese su Edad");
        JOptionPane.showMessageDialog(null, "Su nombre es " + nombre +
                " y su edad es de " + edad + " años.", "Resultado Final",
                JOptionPane.ERROR_MESSAGE);*/
        
        
        //Actividad Entrada y Salida
        String nombre, genero, direc, tel;
        String[] opc = new String[]{"Seleccione", "Masculino", "Femenino"};
        nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre",
                "Nombre", JOptionPane.QUESTION_MESSAGE);
        direc = JOptionPane.showInputDialog(null, "Ingrese su Dirección",
                "Dirección", JOptionPane.QUESTION_MESSAGE);
        tel = JOptionPane.showInputDialog(null, "Ingrese su Teléfono",
                "Teléfono", JOptionPane.QUESTION_MESSAGE);
        genero = (String) JOptionPane.showInputDialog(null, 
                "Seleccione su Genero", 
                "Genero", JOptionPane.QUESTION_MESSAGE, 
                null, opc, "Seleccione");
        JOptionPane.showMessageDialog(null, "Su nombre es " + nombre +
                ", vive en la dirección " + direc +
                ", su telefono es " + tel +
                " y su genero es " + genero, 
                "Mensaje Final", JOptionPane.WARNING_MESSAGE);
        
        
        
    }
    
}
