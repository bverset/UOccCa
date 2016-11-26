/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaprioridadpacientes;

import java.util.PriorityQueue;
import javax.swing.JOptionPane;

/**
 *
 * @author berna
 */
public class ColaPrioridadPacientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Priorodadpatientes pacPrior = new Priorodadpatientes();
        PriorityQueue<Pacientes> pacQueue = new PriorityQueue(pacPrior);

        int numeros;
        numeros = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor",
                "Numeros de pacientes", JOptionPane.QUESTION_MESSAGE));

        for (int i = 0; i < numeros; i++) {
            Pacientes p = new Pacientes();
            p.setNombre(JOptionPane.showInputDialog(null, "Valor",
                    "Nombre", JOptionPane.QUESTION_MESSAGE));
            p.setIdentificacion(JOptionPane.showInputDialog(null, "Valor",
                    "Identificacion", JOptionPane.QUESTION_MESSAGE));
            p.setSintomas(JOptionPane.showInputDialog(null, "Valor",
                    "Sintomas", JOptionPane.QUESTION_MESSAGE));
            p.setPrioridad(Integer.parseInt(JOptionPane.showInputDialog(null, "Valor",
                    "Prioridad", JOptionPane.QUESTION_MESSAGE)));

            pacQueue.offer(p);
        }

        while (!pacQueue.isEmpty()) {
            JOptionPane.showMessageDialog(null,pacQueue.poll().toString());
        }

    }

}
