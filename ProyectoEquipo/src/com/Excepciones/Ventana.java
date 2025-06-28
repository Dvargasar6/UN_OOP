package com.Excepciones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.ArrayList;

public class Ventana extends JFrame implements ActionListener {
    private JTextField txtNombreEquipo, txtUniversidad, txtLenguaje; //txtTamano;
    private JTextField txtNombreProg, txtApellidoProg;
    private JTextArea areaResultados;
    private JButton btnAgregarProg, btnMostrarEquipo, boton_crear_equipo;
    private EquipoMaratonProgramacion equipo;
    //private ArrayList<Programador> programadoresTemp;

    public Ventana() {
        setTitle("Registro de Equipo de Maratón");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        //programadoresTemp = new ArrayList<>();

        // Panel de datos del equipo
        JPanel panelEquipo = new JPanel(new GridLayout(4, 2, 5, 5));
        panelEquipo.setBorder(BorderFactory.createTitledBorder("Datos del Equipo"));
        
        panelEquipo.add(new JLabel("Nombre del equipo:"));
        txtNombreEquipo = new JTextField();
        panelEquipo.add(txtNombreEquipo);
        
        panelEquipo.add(new JLabel("Universidad:"));
        txtUniversidad = new JTextField();
        panelEquipo.add(txtUniversidad);
        
        panelEquipo.add(new JLabel("Lenguaje de programación:"));
        txtLenguaje = new JTextField();
        panelEquipo.add(txtLenguaje);

        //panelEquipo.add(new JLabel("Tamano del equipo:"));
        boton_crear_equipo = new JButton("Crear equipo");
        boton_crear_equipo.addActionListener(this);
        panelEquipo.add(boton_crear_equipo);

        // Panel de programadores
        JPanel panelProgramadores = new JPanel(new GridLayout(4, 2, 5, 5));
        panelProgramadores.setBorder(BorderFactory.createTitledBorder("Agregar Programador"));
        panelProgramadores.setPreferredSize(new Dimension(300, 200));
        
        panelProgramadores.add(new JLabel("Nombre:"));
        txtNombreProg = new JTextField();
        panelProgramadores.add(txtNombreProg);
        
        panelProgramadores.add(new JLabel("Apellidos:"));
        txtApellidoProg = new JTextField();
        panelProgramadores.add(txtApellidoProg);
        
        btnAgregarProg = new JButton("Agregar");
        btnAgregarProg.addActionListener(this);
        panelProgramadores.add(btnAgregarProg);

        // Panel de botones
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        btnMostrarEquipo = new JButton("Mostrar Equipo");
        btnMostrarEquipo.addActionListener(this);
        panelBotones.add(btnMostrarEquipo);

        // Área de resultados
        areaResultados = new JTextArea(8, 25);
        areaResultados.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaResultados);

        // Agregar componentes al frame
        add(panelEquipo, BorderLayout.NORTH);
        add(panelProgramadores, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);
        add(scroll, BorderLayout.EAST);

        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAgregarProg) {
            try {
                String nombre = txtNombreProg.getText().trim();
                String apellido = txtApellidoProg.getText().trim();
                
                // Validar campos
                EquipoMaratonProgramacion.validarCampo(nombre);
                EquipoMaratonProgramacion.validarCampo(apellido);
                
                // Crear programador
                Programador p = new Programador(nombre, apellido);
                equipo.añadir(p);
                
                areaResultados.append("Programador agregado: " + nombre + " " + apellido + "\n");
                txtNombreProg.setText("");
                txtApellidoProg.setText("");

                
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getSource() == boton_crear_equipo){
            try {
                // Crear equipo con los datos ingresados
                equipo = new EquipoMaratonProgramacion(
                    txtNombreEquipo.getText(),
                    txtUniversidad.getText(),
                    txtLenguaje.getText()
                );

                System.out.println("Equipo creado");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println("Equipo no creado");
            }
            
        } 
        else if (e.getSource() == btnMostrarEquipo) {
            try {
                // Crear equipo con los datos ingresados
                
                // Agregar programadores al equipo
                
                
                // Mostrar información del equipo
                areaResultados.append("\n=== EQUIPO REGISTRADO ===\n");
                areaResultados.append("Nombre: " + equipo.nombreEquipo + "\n");
                areaResultados.append("Universidad: " + equipo.universidad + "\n");
                areaResultados.append("Lenguaje: " + equipo.lenguajeProgramacion + "\n");
                areaResultados.append("Programadores:\n");
                
                for (int i = 0; i < equipo.tamañoEquipo; i++) {
                    areaResultados.append("- " + equipo.programadores[i].nombre + " " + 
                                        equipo.programadores[i].apellidos + "\n");
                }
                
                areaResultados.append("Equipo completo: " + equipo.estáLleno() + "\n");
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ventana gui = new Ventana();
            gui.setVisible(true);
        });
    }
}

