package com.Excepciones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaVendedor extends JFrame implements ActionListener {
    private Container contenedor;
    private JTextArea area_imprimir;
    private JButton imprimir;
    private Vendedor vendedor;
    private int edad;

    public VentanaVendedor(String entrada_nombre, String entrada_apellido, int entrada_edad) {

        this.vendedor = new Vendedor(entrada_nombre, entrada_apellido, entrada_edad);
        this.edad = entrada_edad;

        inicio();
        setTitle("Vendedor");
        setSize(280, 240);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

    }

    private void inicio() {

        contenedor = getContentPane();
        contenedor.setLayout(null);

        imprimir = new JButton();
        imprimir.setText("Imprimir");
        imprimir.setBounds(80, 170, 120, 30);
        imprimir.addActionListener(this);

        area_imprimir = new JTextArea();
        area_imprimir.setBounds(20, 20, 240, 180);
        area_imprimir.setEditable(false);

        contenedor.add(imprimir);
        contenedor.add(area_imprimir);

        contenedor.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == imprimir) {

            area_imprimir.setText(vendedor.imprimir());
            System.out.println(vendedor.imprimir());
        }
    }
}