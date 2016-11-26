/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosplanos1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author berna
 */
public class ArchivosPlanos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        int suma =0;
        
        FileReader fr = null;
        try {
            fr = new FileReader("numeros.txt");
        } catch (FileNotFoundException e) {
            System.err.println(e.toString());
        }

        BufferedReader br = new BufferedReader(fr);
        String s;
        try {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                suma += Integer.parseInt(s);
            }
        } catch (IOException e) {
            System.err.println(e.toString());
        }

        try {
            br.close();
            fr.close();
        } catch (IOException e) {
            System.err.println(e.toString());
        }

        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("resultados.txt");
            pw = new PrintWriter(fw);
            pw.println(suma);
        } catch (FileNotFoundException e) {
            System.err.println(e.toString());
        }
        try {
            pw.close();
            fw.close();
        } catch (IOException e) {
            System.err.println(e.toString());
        }

    }

}
