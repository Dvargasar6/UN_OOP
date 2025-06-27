package com.Excepciones;

public class Vendedor {
    private String nombre;
    private String apellidos;
    private int edad;

    public Vendedor(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    String imprimir() {
        return "Nombre del vendedor =" + nombre + "\nApellidos del vendedor = " + apellidos+"\nEdad del vendedor = " + edad;
    }


        public void verificarEdad(int edad) {
        if (edad > 0 && edad < 18) {
            throw new IllegalArgumentException("El vendedor debe ser mayor de 18 años.");
        } 
        if (edad >= 18 && edad < 120) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("La edad no puede ser negativa ni mayor a 120.");
        }
    }





}