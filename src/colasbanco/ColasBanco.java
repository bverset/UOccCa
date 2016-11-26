/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colasbanco;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author berna
 */
public class ColasBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Queue<Banco> bancoQueue = new LinkedList<>();
        String[] tipoTransaccionl = new String[]{"Retiro", "Consignacion", "Traslado"};
        int numeros;
        numeros = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor",
                "Numeros de clientes", JOptionPane.QUESTION_MESSAGE));

        for (int i = 0; i < numeros; i++) {
            Banco b = new Banco();
            b.setNombre(JOptionPane.showInputDialog(null, "Valor",
                    "Nombre", JOptionPane.QUESTION_MESSAGE));
            b.setCedula(JOptionPane.showInputDialog(null, "Valor",
                    "Cedula", JOptionPane.QUESTION_MESSAGE));
            b.setMonto(Double.parseDouble(JOptionPane.showInputDialog(null, "Valor",
                    "Monto", JOptionPane.QUESTION_MESSAGE)));
            b.setTipoTransaccion((String) JOptionPane.showInputDialog(null, "Valor",
                    "Sexo", JOptionPane.WARNING_MESSAGE, null, tipoTransaccionl, "Seleccione"));

            bancoQueue.offer(b);
        }

        while (!bancoQueue.isEmpty()) {
            Banco b = bancoQueue.poll();
            JOptionPane.showMessageDialog(null, "Nombre (" + b.getNombre() + ") " + "Cedula (" + b.getCedula()+ ") " + "Monto (" + b.getMonto() + ") " +"Tipo transaccion (" + b.getTipoTransaccion()+ ") ");
        }

    }

}
