package com.Inmuebles;

public class LocalComercial extends Local{

    protected String centro_comercial;
    protected static double valor_area = 3000000;

    public LocalComercial(int id_inmobiliario, int area, String direccion, tipo tipo_local, String centro_comercial){
        super(id_inmobiliario, area, direccion,tipo_local);
        this.centro_comercial = centro_comercial;
    }

    double precioVenta(){
        precio = super.precioVenta(valor_area);
        return precio;
    }

    void imprimir(){
        super.imprimir();
        precioVenta();
        System.out.println("Precio : $ "+precio);
        System.out.println("Centro comercial : "+centro_comercial);
    }
}