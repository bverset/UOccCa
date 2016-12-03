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
    int categoria;

    public ProductoEspecial(String nombre, Double Precio, int tipo,Double volume, int categoria) {
        super(nombre, Precio, tipo);
        this.volume = volume;
        this.categoria = categoria;
    }



    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
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

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

     
}
