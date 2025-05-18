package com.Inmuebles;


public class Apartaestudio extends Apartamento{

    protected static double valor_area = 1500000;


    public Apartaestudio(int id_inmobiliario, int area, String direccion){
        super(id_inmobiliario, area, direccion, 1, 1);
    }

    double precioVenta(){
        precio = super.precioVenta(valor_area);
        return precio;
    }

    void imprimir(){
        super.imprimir();
        precioVenta();
        System.out.println("Precio : $ "+precio);
    }
}