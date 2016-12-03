/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractas1;

/**
 *
 * @author berna
 */
public class Contratista extends Empleado{

    String empresaContratista;
    int cantitadProyectosRelaizasod;

    public Contratista(String empresaContratista, int cantitadProyectosRelaizasod, String cedula, String nombre, String area, Double salarioBase) {
        super(cedula, nombre, area, salarioBase);
        this.empresaContratista = empresaContratista;
        this.cantitadProyectosRelaizasod = cantitadProyectosRelaizasod;
    }
           
    @Override
    Double BonoAnual() {
       Double bonoanual = 0.0;
        if (cantitadProyectosRelaizasod<4) bonoanual = salarioBase*0.7;
        else if (cantitadProyectosRelaizasod>=10) bonoanual = salarioBase*1.4;
        else if (cantitadProyectosRelaizasod>=4) bonoanual = salarioBase*1.1;
        return bonoanual;
    }
   String Tostring(){
    return super.Tostring() + " tiene bono anual de : "+ BonoAnual() + " Empresa contratista " + empresaContratista;
    }
}
