package com.Inmuebles;

public class Inmueble{

    protected int id_inmobiliario;
    protected int area;
    protected String direccion;
    protected double precio;

    public Inmueble(int id_inmobiliario, int area, String direccion){
        this.id_inmobiliario = id_inmobiliario;
        this.area = area;
        this.direccion = direccion;
    }


    double precioVenta(double valor_area){
        precio = area * valor_area;
        return precio;
    }

    void imprimir(){
        System.out.println("Identificador : "+id_inmobiliario);
        System.out.println("Area : "+area+" m2");
        System.out.println("Direccion : "+direccion);
    }
}