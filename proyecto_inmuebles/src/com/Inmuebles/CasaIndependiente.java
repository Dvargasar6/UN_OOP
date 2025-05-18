package com.Inmuebles;

public class CasaIndependiente extends CasaUrbana{

    protected static double valor_area = 3000000;

    public CasaIndependiente(int id_inmobiliario, int area, String direccion, int no_habitaciones, int no_banos, int no_pisos){
        super(id_inmobiliario, area, direccion, no_habitaciones, no_banos, no_pisos);        
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