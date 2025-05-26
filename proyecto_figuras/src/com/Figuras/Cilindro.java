package com.Figuras;

public class Cilindro extends FiguraGeometrica{
    private double radio;
    private double altura;

    public Cilindro(double radio, double altura){
        this.radio = radio;
        this.altura = altura;
        this.setVolumen(volumen());
        this.setSuperficie(superficie());
    }

    public double volumen(){
        double volumen = Math.PI*altura*Math.pow(radio,2);
        return volumen;
    }

    public double superficie(){
        double superficie = 2*Math.PI*(radio*altura+Math.pow(radio,2));
        return superficie;
    }
}