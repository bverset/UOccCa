/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritages1;

import java.util.logging.Logger;

/**
 *
 * @author berna
 */
public class ProductoEspecial extends Producto{
    Double volume;
    String categoria;

    public ProductoEspecial(Double volume, String categoria,String nombre, String tipo, Double Precio) {
        super(nombre, tipo, Precio);
        this.volume = volume;
        this.categoria = categoria;
    }



    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String toString()
    {
        String infoB = super.toString();
        return infoB + " con un volumen de " + this.volume + " y una categoria "
                + this.getCategoria();
    }  
     
}
