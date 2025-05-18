package com.Inmuebles;

public class Vivienda extends Inmueble{

    protected int no_habitaciones;
    protected int no_banos;

    public Vivienda(int id_inmobiliario, int area, String direccion, int no_habitaciones, int no_banos){
        super(id_inmobiliario, area, direccion);
        this.no_habitaciones = no_habitaciones;
        this.no_banos = no_banos;
    }

    void imprimir(){
        super.imprimir();
        System.out.println("Numero de habitaciones : "+no_habitaciones);
        System.out.println("Numero de banos : "+no_banos);
    }

}