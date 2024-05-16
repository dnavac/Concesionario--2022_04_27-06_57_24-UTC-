/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario.venta;

public class Venta {
    
    String nombrecompleto, cedula;
    double precio;
    int cantidad;

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public String getCedula() {
        return cedula;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
}
