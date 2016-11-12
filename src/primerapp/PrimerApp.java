/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerapp;

/**
 *
 * @author berna
 */
public class PrimerApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double primerparcial;
        primerparcial = 15*4.2;
        double segundoparcial;
        segundoparcial = 15*3.8;
        double tercerparcial;
        tercerparcial = 20*4;
        double quartoparcial;
        quartoparcial = 20*3.2;
        double quintoparcial;
        quintoparcial = 20*3.9;
        double sextoparcial;
        sextoparcial = 10*4.8;
        
        double calificacionFinal;
        calificacionFinal = (primerparcial+segundoparcial+tercerparcial+quartoparcial+quintoparcial+sextoparcial)/100;
        
        System.out.println("Cuotacion final:" + calificacionFinal + " Parcial:" + parcial());
    }
    
    public static double parcial() {
    double test = 2.3;
    return test;
}
    
}
