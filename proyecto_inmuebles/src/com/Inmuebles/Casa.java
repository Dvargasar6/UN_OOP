package com.Inmuebles;

public class Casa extends Vivienda{

    protected int no_pisos;

    public Casa(int id_inmobiliario, int area, String direccion, int no_habitaciones, int no_banos, int no_pisos){
        super(id_inmobiliario, area, direccion, no_habitaciones, no_banos);
        this.no_pisos = no_pisos;
    }

    void imprimir(){
        super.imprimir();
        System.out.println("Numero de pisos : "+no_pisos);
    }
}