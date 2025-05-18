package com.Inmuebles;

public class Local extends Inmueble{

    protected tipo tipo_local;

    public Local(int id_inmobiliario, int area, String direccion, tipo tipo_local){
        super(id_inmobiliario, area, direccion);
        this.tipo_local = tipo_local;
    }

    void imprimir(){
        super.imprimir();
        System.out.println("Tipo de local "+tipo_local);
    }
}