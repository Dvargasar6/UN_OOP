package com.Inmuebles;

public class CasaRural extends Casa{

    protected int distancia_cabecera;
    protected int altitud;
    protected static double valor_area = 1500000;

    public CasaRural(int id_inmobiliario, int area, String direccion, int no_habitaciones, int no_banos, int no_pisos, int distancia_cabecera, int altitud){
        super(id_inmobiliario, area, direccion, no_habitaciones, no_banos, no_pisos);
        this.distancia_cabecera = distancia_cabecera;
        this.altitud = altitud;
    }

    double precioVenta(){
        precio = super.precioVenta(valor_area);
        return precio;
    }

    void imprimir(){
        super.imprimir();
        System.out.println("Distancia a la cabecera municipal : "+distancia_cabecera+" km.");
        System.out.println("Altitud : "+altitud+" m.s.n.m.");
        precioVenta();
        System.out.println("Precio : $ "+precio);
    }
}