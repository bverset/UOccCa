/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaprioridadpacientes;

import java.util.Comparator;

/**
 *
 * @author berna
 */
public class Pacientes {

    String nombre, identificacion, sintomas;
    int prioridad;

    public Pacientes() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    
    public String toString(){
        return ("nombre " + nombre+ "identificacion " +identificacion+ "sintomas " +sintomas+"prioridad " +prioridad);
    }

}

class Priorodadpatientes implements Comparator<Pacientes> {

    @Override
    public int compare(Pacientes o1, Pacientes o2) {
        if (o1.getPrioridad() < o2.getPrioridad()) {
            return -1;
        } else if (o1.getPrioridad() > o2.getPrioridad()) {
            return 1;
        } else {
            return 0;
        }

    }
}
