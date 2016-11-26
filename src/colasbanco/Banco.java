/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colasbanco;

/**
 *
 * @author berna
 */
public class Banco {
    
    String nombre, cedula, tipoTransaccion;
    Double monto;

    public Banco() {
    }

    public Banco(String nombre, String cedula, String tipoTransaccion, Double monto) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.tipoTransaccion = tipoTransaccion;
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }
    
    
}
