package com.Excepciones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.ArrayList;

public class Ventana extends JFrame implements ActionListener {
    private JTextField texto_equipo, texto_universidad, texto_lenguaje, texto_nombre, texto_apellido;
    private JTextArea resultados;
    private JButton boton_agregar, boton_mostrar, boton_crear_equipo;
    private EquipoMaratonProgramacion equipo;


    public Ventana() {
        setTitle("Registro de Equipo de Maratón");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        //programadoresTemp = new ArrayList<>();

        // Panel de datos del equipo
        JPanel panel_equipo = new JPanel(new GridLayout(4, 2, 5, 5));
        panel_equipo.setBorder(BorderFactory.createTitledBorder("Datos del Equipo"));
        
        panel_equipo.add(new JLabel("Nombre del equipo:"));
        texto_equipo = new JTextField();
        panel_equipo.add(texto_equipo);
        
        panel_equipo.add(new JLabel("Universidad:"));
        texto_universidad = new JTextField();
        panel_equipo.add(texto_universidad);
        
        panel_equipo.add(new JLabel("Lenguaje de programación:"));
        texto_lenguaje = new JTextField();
        panel_equipo.add(texto_lenguaje);

        //panel_equipo.add(new JLabel("Tamano del equipo:"));
        boton_crear_equipo = new JButton("Crear equipo");
        boton_crear_equipo.addActionListener(this);
        panel_equipo.add(boton_crear_equipo);

        // Panel de programadores
        JPanel panel_programadores = new JPanel(new GridLayout(4, 2, 5, 5));
        panel_programadores.setBorder(BorderFactory.createTitledBorder("Agregar Programador"));
        panel_programadores.setPreferredSize(new Dimension(300, 200));
        
        panel_programadores.add(new JLabel("Nombre:"));
        texto_nombre = new JTextField();
        panel_programadores.add(texto_nombre);
        
        panel_programadores.add(new JLabel("Apellidos:"));
        texto_apellido = new JTextField();
        panel_programadores.add(texto_apellido);
        
        boton_agregar = new JButton("Agregar");
        boton_agregar.addActionListener(this);
        panel_programadores.add(boton_agregar);

        // Panel de botones
        JPanel panel_botones = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        boton_mostrar = new JButton("Mostrar Equipo");
        boton_mostrar.addActionListener(this);
        panel_botones.add(boton_mostrar);

        // Área de resultados
        resultados = new JTextArea(8, 25);
        resultados.setEditable(false);
        JScrollPane scroll = new JScrollPane(resultados);

        // Agregar componentes al frame
        add(panel_equipo, BorderLayout.NORTH);
        add(panel_programadores, BorderLayout.CENTER);
        add(panel_botones, BorderLayout.SOUTH);
        add(scroll, BorderLayout.EAST);

        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton_agregar) {
            try {
                String nombre = texto_nombre.getText().trim();
                String apellido = texto_apellido.getText().trim();
                
                // Validar campos
                EquipoMaratonProgramacion.validarCampo(nombre);
                EquipoMaratonProgramacion.validarCampo(apellido);
                
                // Crear programador
                Programador p = new Programador(nombre, apellido);
                equipo.añadir(p);
                
                resultados.append("Programador agregado: " + nombre + " " + apellido + "\n");
                texto_nombre.setText("");
                texto_apellido.setText("");

                
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getSource() == boton_crear_equipo){
            try {
                // Crear equipo con los datos ingresados
                equipo = new EquipoMaratonProgramacion(
                    texto_equipo.getText(),
                    texto_universidad.getText(),
                    texto_lenguaje.getText()
                );

                System.out.println("Equipo creado");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println("Equipo no creado");
            }
            
        } 
        else if (e.getSource() == boton_mostrar) {
            try {
                // Crear equipo con los datos ingresados
                
                // Agregar programadores al equipo
                
                
                // Mostrar información del equipo
                resultados.append("\n=== EQUIPO REGISTRADO ===\n");
                resultados.append("Nombre: " + equipo.nombreEquipo + "\n");
                resultados.append("Universidad: " + equipo.universidad + "\n");
                resultados.append("Lenguaje: " + equipo.lenguajeProgramacion + "\n");
                resultados.append("Programadores:\n");
                
                for (int i = 0; i < equipo.tamañoEquipo; i++) {
                    resultados.append("- " + equipo.programadores[i].nombre + " " + 
                                        equipo.programadores[i].apellidos + "\n");
                }
                
                resultados.append("Equipo completo: " + equipo.estáLleno() + "\n");
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ventana ventana = new Ventana();
            ventana.setVisible(true);
        });
    }
}

