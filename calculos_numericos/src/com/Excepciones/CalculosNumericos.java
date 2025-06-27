package Excepciones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculosNumericos extends JFrame implements ActionListener {
    private JTextField campo_valor;
    private JTextArea resultados;
    private JButton boton_logaritmo, boton_raiz, boton_limpiar;

    public CalculosNumericos() {
        setTitle("Calculos Numericos");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(5, 5));


        JPanel panelEntrada = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
        panelEntrada.add(new JLabel("Valor numerico:"));
        campo_valor = new JTextField(8);
        panelEntrada.add(campo_valor);

        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        
        boton_logaritmo = new JButton("Log");
        boton_logaritmo.setPreferredSize(new Dimension(70, 30));
        
        boton_raiz = new JButton("Raíz");
        boton_raiz.setPreferredSize(new Dimension(70, 30));
        
        boton_limpiar = new JButton("Limpiar");
        boton_limpiar.setPreferredSize(new Dimension(100, 30));
        
        boton_logaritmo.addActionListener(this);
        boton_raiz.addActionListener(this);
        boton_limpiar.addActionListener(this);
        
        panelBotones.add(boton_logaritmo);
        panelBotones.add(boton_raiz);
        panelBotones.add(boton_limpiar);

        resultados = new JTextArea(5, 20);
        resultados.setEditable(false);
        resultados.setMargin(new Insets(5, 5, 5, 5));
        JScrollPane scroll = new JScrollPane(resultados);
        scroll.setPreferredSize(new Dimension(300, 100));

        add(panelEntrada, BorderLayout.NORTH);
        add(panelBotones, BorderLayout.CENTER);
        add(scroll, BorderLayout.SOUTH);
        
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton_limpiar) {
            campo_valor.setText("");
            resultados.setText("");
            return;
        }

        try {
            double valor = Double.parseDouble(campo_valor.getText().trim());
            
            if (e.getSource() == boton_logaritmo) {
                calcularLogaritmoNeperiano(valor);
            } else if (e.getSource() == boton_raiz) {
                calcularRaizCuadrada(valor);
            }
        } catch (NumberFormatException ex) {
            resultados.append("Error: El valor debe ser numerico\n");
        } catch (ArithmeticException ex) {
            resultados.append("Error: " + ex.getMessage() + "\n");
        }
    }

    private void calcularLogaritmoNeperiano(double valor) {
        if (valor <= 0) {
            throw new ArithmeticException("El valor debe ser positivo (>0)");
        }
        double resultado = Math.log(valor);
        resultados.append(String.format("ln(%.2f) = %.4f\n", valor, resultado));
    }

    private void calcularRaizCuadrada(double valor) {
        if (valor < 0) {
            throw new ArithmeticException("El valor debe ser ≥0");
        }
        double resultado = Math.sqrt(valor);
        resultados.append(String.format("√%.2f = %.4f\n", valor, resultado));
    }

    public static void main(String[] args) {
        CalculosNumericos ventana = new CalculosNumericos();
        ventana.setVisible(true);
    }
}