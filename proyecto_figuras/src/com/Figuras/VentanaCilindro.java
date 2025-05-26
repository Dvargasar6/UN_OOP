package com.Figuras;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCilindro extends JFrame implements ActionListener{
    private Container contenedor;
    private JLabel radio, altura, volumen, superficie;
    private JTextField campo_radio, campo_altura;
    private JButton calcular;

    public VentanaCilindro(){
        inicio();
        setTitle("Cilindro");
        setSize(500,200);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void inicio(){
        contenedor = getContentPane();
        contenedor.setLayout(null);

        radio = new JLabel();
        radio.setText("Radio (cm):");
        radio.setBounds(20,20,135,23);
        campo_radio = new JTextField();
        campo_radio.setBounds(100,20,135,23);

        altura = new JLabel();
        altura.setText("Altura (cm):");
        altura.setBounds(20,50,135,23);
        campo_altura = new JTextField();
        campo_altura.setBounds(100,50,135,23);

        calcular = new JButton();
        calcular.setText("Calcular");
        calcular.setBounds(100, 80, 135, 23);
        calcular.addActionListener(this);

        volumen = new JLabel();
        volumen.setText("Volumen (cm3):");
        volumen.setBounds(20,110,150,23);

        superficie = new JLabel();
        superficie.setText("Superficie (cm2):");
        superficie.setBounds(20,140,150,23);

        contenedor.add(radio);
        contenedor.add(campo_radio);
        contenedor.add(altura);
        contenedor.add(campo_altura);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);        
    }

    public void actionPerformed(ActionEvent evento){
        if(evento.getSource()==calcular){
            boolean error = false;
            double radio = 0;
            double altura = 0;

            try{
                radio = Double.parseDouble(campo_radio.getText());
                altura = Double.parseDouble(campo_altura.getText());
                Cilindro cilindro = new Cilindro(radio, altura);
                volumen.setText("Volumen: "+String.format("%.2f", cilindro.volumen())+" cm3");
                superficie.setText("Superficie: "+String.format("%.2f", cilindro.superficie())+"cm2");
            }catch (Exception e){
                error = true;
            }finally{
                if(error){
                    JOptionPane.showMessageDialog(null,"Campo nulo o error en formato de numero","Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
}