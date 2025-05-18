package com.Inmuebles;

public class Oficina extends Local{

    protected static double valor_area = 3500000;
    protected boolean gubernamental;

    public Oficina(int id_inmobiliario, int area, String direccion, tipo tipo_local, boolean gubernamental){
        super(id_inmobiliario, area, direccion,tipo_local);
        this.gubernamental = gubernamental;
    }

    double precioVenta(){
        precio = super.precioVenta(valor_area);
        return precio;
    }

    void imprimir(){
        super.imprimir();
        precioVenta();
        System.out.println("Precio : $ "+precio);
        System.out.println("Oficina gubernamental : "+gubernamental);
    }
}