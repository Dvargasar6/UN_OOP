package com.Excepciones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel texto_nombre, texto_apellido, texto_edad;
    private JTextField campo_nombre, campo_apellido, campo_edad;
    private JButton boton_guardar;
    public String entrada_nombre, entrada_apellido;
    public int entrada_edad;

    public Ventana() {

        inicio();
        setTitle("Crear vendedor");
        setSize(280, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {

        contenedor = getContentPane();
        contenedor.setLayout(null);

        int parametro = 20;

        texto_nombre = new JLabel();
        texto_nombre.setText("Nombre");
        texto_nombre.setBounds(20, parametro, 135, 23);

        campo_nombre = new JTextField();
        campo_nombre.setBounds(135, parametro, 135, 23);

        texto_apellido = new JLabel();
        texto_apellido.setText("Apellido");
        texto_apellido.setBounds(20, parametro + 30, 135, 23);

        campo_apellido = new JTextField();
        campo_apellido.setBounds(135, parametro + 30, 135, 23);

        texto_edad = new JLabel();
        texto_edad.setText("Edad");
        texto_edad.setBounds(20, parametro + 60, 135, 23);

        campo_edad = new JTextField();
        campo_edad.setBounds(135, parametro + 60, 135, 23);

        boton_guardar = new JButton();
        boton_guardar.setText("Crear vendedor");
        boton_guardar.setBounds(70, 140, 150, 23);
        boton_guardar.addActionListener(this);

        contenedor.add(texto_nombre);
        contenedor.add(campo_nombre);
        contenedor.add(texto_apellido);
        contenedor.add(campo_apellido);
        contenedor.add(texto_edad);
        contenedor.add(campo_edad);
        contenedor.add(boton_guardar);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == boton_guardar) {
            try {
                entrada_nombre = campo_nombre.getText();
                entrada_apellido = campo_apellido.getText();
                entrada_edad = Integer.parseInt(campo_edad.getText());

                Vendedor vendedor = new Vendedor(entrada_nombre, entrada_apellido, entrada_edad);
                vendedor.verificarEdad(entrada_edad);
                System.out.println(entrada_edad < 18);
                VentanaVendedor ventana_vendedor = new VentanaVendedor(entrada_nombre, entrada_apellido, entrada_edad);
                ventana_vendedor.setVisible(true);

            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(this,
                        e.getMessage(),
                        "Error en edad", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}