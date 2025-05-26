package com.Figuras;

public class Piramide extends FiguraGeometrica{
    private double base;
    private double altura;
    private double apotema;

    public Piramide(double base, double altura, double apotema){
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
        this.setVolumen(volumen());
        this.setSuperficie(superficie());
    }

    public double volumen(){
        double volumen = (Math.pow(base,2.0)*altura)/3.0;
        return volumen;
    }

    public double superficie(){
        double superficie = Math.pow(base,2.0) + 2.0*base*apotema;
        return superficie;
    }
}