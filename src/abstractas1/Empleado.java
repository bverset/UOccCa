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
abstract class Empleado {
    String cedula, nombre, area;
    Double salarioBase;

    public Empleado(String cedula, String nombre, String area, Double salarioBase) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.area = area;
        this.salarioBase = salarioBase;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    abstract Double BonoAnual ();
    
    String Tostring(){
    return "Nombre empleado es " + nombre;
    }
}
