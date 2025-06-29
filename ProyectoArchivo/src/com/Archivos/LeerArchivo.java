package com.Archivos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class LeerArchivo extends JFrame implements ActionListener {
    private JTextArea texto;
    private JButton boton_abrir, boton_limpiar;
    private JFileChooser selector_archivos;

    public LeerArchivo() {
        setTitle("Lector de Archivos de Texto");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelBotones = new JPanel(new FlowLayout());
        boton_abrir = new JButton("Abrir Archivo");
        boton_limpiar = new JButton("Limpiar");
        
        boton_abrir.addActionListener(this);
        boton_limpiar.addActionListener(this);
        
        panelBotones.add(boton_abrir);
        panelBotones.add(boton_limpiar);

        texto = new JTextArea();
        texto.setEditable(false);
        JScrollPane scroll = new JScrollPane(texto);

        selector_archivos = new JFileChooser();
        selector_archivos.setCurrentDirectory(new File(System.getProperty("user.home")));

        add(panelBotones, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);

        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton_abrir) {
            int resultado = selector_archivos.showOpenDialog(this);
            if (resultado == JFileChooser.APPROVE_OPTION) {
                File archivoSeleccionado = selector_archivos.getSelectedFile();
                leerArchivo(archivoSeleccionado.getAbsolutePath());
            }
        } else if (e.getSource() == boton_limpiar) {
            texto.setText("");
        }
    }

    private void leerArchivo(String rutaArchivo) {
        try (FileInputStream archivo = new FileInputStream(rutaArchivo);
             InputStreamReader conversor = new InputStreamReader(archivo);
             BufferedReader filtro = new BufferedReader(conversor)) {
            
            texto.setText("");
            
            String linea;
            while ((linea = filtro.readLine()) != null) {
                texto.append(linea + "\n");
            }
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, 
                "No se pudo leer el archivo: " + e.getMessage(), 
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LeerArchivo ventana = new LeerArchivo();
            ventana.setVisible(true);
        });
    }
}