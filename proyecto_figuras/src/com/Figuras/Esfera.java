package com.Figuras;

public class Esfera extends FiguraGeometrica{
    private double radio;
    
    public Esfera(double radio){
        this.radio = radio;
        this.setVolumen(volumen());
        this.setSuperficie(superficie());
    }

    public double volumen(){
        double volumen = 4.0*Math.PI*Math.pow(radio,3.0)/3.0;
        return volumen;
    }

    public double superficie(){
        double superficie = 4.0*Math.PI*Math.pow(radio,2.0);
        return superficie;
    }
}