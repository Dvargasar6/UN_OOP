package com.Excepciones;


public class EquipoMaratonProgramacion {
    String nombreEquipo;
    String universidad;
    String lenguajeProgramacion;
    Programador[] programadores;
    int tamañoEquipo;

    public EquipoMaratonProgramacion(String nombreEquipo, String universidad, String lenguajeProgramacion) {
        this.nombreEquipo = nombreEquipo;
        this.universidad = universidad;
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.programadores = new Programador[3];
        this.tamañoEquipo = 0;
    }

    boolean estáLleno() {
        return tamañoEquipo == programadores.length;
    }

    void añadir(Programador programador) throws Exception {
        if (estáLleno()) {
            throw new Exception("El equipo está completo. No se pudo agregar programador.");
        }
        programadores[tamañoEquipo] = programador;
        tamañoEquipo++;
    }

    static void validarCampo(String campo) throws Exception {
        if (campo.length() >= 20) {
            throw new Exception("El campo no puede tener 20 o más caracteres.");
        }
        
        for (int j = 0; j < campo.length(); j++) {
            char c = campo.charAt(j);
            if (Character.isDigit(c)) {
                throw new Exception("El nombre no puede tener dígitos.");
            }
        }
    }
}