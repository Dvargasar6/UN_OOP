package com.Notas;

public class Notas{
    double[] lista_notas;

    public Notas(){
        lista_notas = new double[5];
    }

    double promedio(){
        double suma = 0;

        for(int i = 0; i<lista_notas.length; i++){
            suma += lista_notas[i];
        }
        double promedio = suma/lista_notas.length;
        return promedio;
    }


    double desviacion_estandar(){
        double promedio = promedio();
        double suma = 0;

        for(int i=0; i < lista_notas.length; i++){
            suma += Math.pow(lista_notas[i] - promedio,2);
        }
        double desviacion_estandar = Math.sqrt(suma/lista_notas.length);
        return desviacion_estandar;
    }

    double menor_nota(){
        double menor_nota = lista_notas[0];

        for(int i=1; i<lista_notas.length;i++){
            if(lista_notas[i] < menor_nota){
                menor_nota = lista_notas[i];
            }
        }
        return menor_nota;
    }
    
    double mayor_nota(){
        double mayor_nota = lista_notas[0];

        for(int i=1; i<lista_notas.length;i++){
            if(lista_notas[i] > mayor_nota){
                mayor_nota = lista_notas[i];
            }
        }
        return mayor_nota;
    }
}