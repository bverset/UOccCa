/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritages1;

/**
 *
 * @author berna
 */
public class Producto {
    String nombre;
    Double Precio;
    int tipo;

    public Producto(String nombre, Double Precio, int tipo) {
        this.nombre = nombre;
        this.Precio = Precio;
        this.tipo = tipo;
    }


    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
    
}
