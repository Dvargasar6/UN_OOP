package com.Inmuebles;


public class Main{
    public static void main(String[] args) {

        System.out.println("*CASA RURAL:");

        int id_rural = 10000;
        int area_rural = 100;
        String direccion_rural = "Direccion rural";
        int banos_rural = 3;
        int habitaciones_rural = 5;
        int pisos_rural = 2;
        int distancia_cabecera = 10;
        int altitud = 2000;

        CasaRural casa_rural = new CasaRural(id_rural, area_rural, direccion_rural, habitaciones_rural, banos_rural, pisos_rural, distancia_cabecera, altitud);
        casa_rural.imprimir();

        System.out.println("*CASA INDEPENDIENTE:");

        int id_ind = 20000;
        int area_ind = 100;
        String direccion_ind = "Direccion ind";
        int banos_ind = 2;
        int habitaciones_ind = 3;
        int pisos_ind = 1;

        CasaIndependiente casa_ind = new CasaIndependiente(id_ind, area_ind, direccion_ind, habitaciones_ind, banos_ind, pisos_ind);
        casa_ind.imprimir();


        System.out.println("*CASA EN CONJUNTO:");

        int id_conjunto = 30000;
        int area_conjunto = 50;
        String direccion_conjunto = "Direccion conjunto";
        int banos_conjunto = 2;
        int habitaciones_conjunto = 4;
        int pisos_conjunto = 2;
        double administracion_conjunto = 1000000;
        boolean areas_comunes = true;

        CasaConjunto casa_conjunto = new CasaConjunto(id_conjunto, area_conjunto, direccion_conjunto, habitaciones_conjunto, banos_conjunto, pisos_conjunto, administracion_conjunto, areas_comunes);
        casa_conjunto.imprimir();


        System.out.println("*APARTAESTUDIO:");

        int id_apartaestudio = 40000;
        int area_apartaestudio = 20;
        String direccion_apartaestudio = "Direccion apartaestudio";

        Apartaestudio apartaestudio = new Apartaestudio(id_apartaestudio, area_apartaestudio, direccion_apartaestudio);
        apartaestudio.imprimir();


        System.out.println("*APARTAMENTO FAMILIAR:");

        int id_apartamento = 40000;
        int area_apartamento = 20;
        String direccion_apartamento = "Direccion apartamento";
        int banos_apartamento = 2;
        int habitaciones_apartamento = 4;
        double administracion_apartamento = 1000000;

        ApartamentoFamiliar apartamento = new ApartamentoFamiliar(id_apartamento, area_apartamento, direccion_apartamento,habitaciones_apartamento,banos_apartamento,administracion_apartamento);
        apartamento.imprimir();

        System.out.println("*OFICINA:");

        int id_oficina = 50000;
        int area_oficina = 20;
        String direccion_oficina = "Direccion oficina";
        boolean oficina_gubernamental = true;

        Oficina oficina = new Oficina(id_oficina, area_oficina, direccion_oficina,tipo.INTERNO,oficina_gubernamental);
        oficina.imprimir();

        System.out.println("*LOCAL:");

        int id_local = 50000;
        int area_local = 20;
        String direccion_local = "Direccion local";
        String centro_comercial = "El Tesoro";

        LocalComercial local = new LocalComercial(id_local, area_local, direccion_local,tipo.INTERNO,centro_comercial);
        local.imprimir();




        




    }
}