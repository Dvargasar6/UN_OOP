package com.Inmuebles;


public class ApartamentoFamiliar extends Apartamento{

    protected static double valor_area = 2000000;
    protected double administracion;


    public ApartamentoFamiliar(int id_inmobiliario, int area, String direccion, int no_habitaciones, int no_banos,double administracion){
        super(id_inmobiliario, area, direccion, no_habitaciones, no_banos);
        this.administracion = administracion;
    }

    double precioVenta(){
        precio = super.precioVenta(valor_area);
        return precio;
    }

    void imprimir(){
        super.imprimir();
        System.out.println("Administracion : $ "+administracion);
        precioVenta();
        System.out.println("Precio : $ "+precio);
    }
}