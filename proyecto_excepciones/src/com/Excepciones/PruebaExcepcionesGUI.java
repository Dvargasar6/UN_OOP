package com.Excepciones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaExcepcionesGUI{
    public static void main(String[] args) {

        JFrame ventana = new JFrame("Manejador de Excepciones");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(500, 300);
        ventana.setLayout(new BorderLayout());

        JTextArea resultado = new JTextArea();
        resultado.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultado);
    

        JPanel botonesPanel = new JPanel();
        JButton boton_division = new JButton("Realizar prueba");
        JButton boton_limpiar = new JButton("Limpiar");


        boton_division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
                try {
                    resultado.append("Ingresando al primer try\n");
                    double cociente = 10000 / 0;
                    resultado.append("Despues de la division\n");
                } catch (ArithmeticException e) {
                    resultado.append("División por cero\n");
                } finally {
                    resultado.append("Ingresando al primer finally\n\n");
                }
                try {
                    resultado.append("Ingresando al segundo try\n");
                    Object objeto = null;
                    objeto.toString();
                    resultado.append("Imprimiendo objeto\n");
                } catch (ArithmeticException e){
                    resultado.append("Division por cero\n");
                } catch (Exception e) {
                    resultado.append("Ocurrio una excepcion\n");
                } finally {
                    resultado.append("Ingresando al segundo finally\n\n");
                }
            }
        });


        boton_limpiar.addActionListener(e -> resultado.setText(""));
        botonesPanel.add(boton_division);
        botonesPanel.add(boton_limpiar);
        ventana.add(scrollPane, BorderLayout.CENTER);
        ventana.add(botonesPanel, BorderLayout.SOUTH);
        ventana.setVisible(true);
    }
}