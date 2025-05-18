package com.Inmuebles;

public class CasaConjunto extends CasaUrbana{

    protected static double valor_area = 2500000;
    protected double administracion;
    protected boolean areas_comunes;

    public CasaConjunto(int id_inmobiliario, int area, String direccion, int no_habitaciones, int no_banos, int no_pisos, double administracion, boolean areas_comunes){
        super(id_inmobiliario, area, direccion, no_habitaciones, no_banos, no_pisos);
        this.administracion = administracion;        
        this.areas_comunes = areas_comunes;
    }

    double precioVenta(){
        precio = super.precioVenta(valor_area);
        return precio;
    }

    void imprimir(){
        super.imprimir();
        precioVenta();
        System.out.println("Precio : $ "+precio);
        System.out.println("El valor de la administracion es : $ "+administracion);
        System.out.println("Incluye areas comunes : "+areas_comunes);
    }
}