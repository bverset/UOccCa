/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack1;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author berna
 */
public class Stack1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack<Integer> enteros = new Stack<>();

        int numeros;
        numeros = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor",
                "Numeros de enteros", JOptionPane.QUESTION_MESSAGE));

        for (int i = 0; i < numeros; i++) {
            enteros.push(Integer.parseInt(JOptionPane.showInputDialog(null, "Valor",
                    "Enteros", JOptionPane.QUESTION_MESSAGE)));
        }

        int sizestack = enteros.size();
        for (int i = 0; i < numeros; i++) {
            JOptionPane.showMessageDialog(null, "Enteros (" + (sizestack - i) + ") = " + enteros.pop());
        }
    }

}
