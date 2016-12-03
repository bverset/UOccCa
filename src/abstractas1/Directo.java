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
public class Directo extends Empleado {
    int anteguidad;

    public Directo(int anteguidad, String cedula, String nombre, String area, Double salarioBase) {
        super(cedula, nombre, area, salarioBase);
        this.anteguidad = anteguidad;
    }

    @Override
    Double BonoAnual() {
       Double bonoanual = 0.0;
        if (anteguidad<3) bonoanual = salarioBase*1.2;
        else if (anteguidad>=5) bonoanual = salarioBase*2;
        else if (anteguidad>=3) bonoanual = salarioBase*1.5;
        return bonoanual;
    }
    
    String Tostring(){
    return super.Tostring() + " tiene bono anual de : " + BonoAnual() + " Anteguidad " + anteguidad;
    }
    
}
