package Formulario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class VentanaPrincipal extends JFrame implements ActionListener {

    private Container contenedor;
    private JTextField campo_nombre, campo_numero, campo_nuevo_nombre, campo_nuevo_numero;
    private JLabel label_nombre, label_numero, label_nuevo_nombre, label_nuevo_numero;
    private JButton boton_crear, boton_leer, boton_actualizar, boton_eliminar;
    private JTextArea resultados;

    public VentanaPrincipal() {

        inicio();
        setTitle("Formulario");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

    }

    private void inicio() {

        contenedor = getContentPane();
        contenedor.setLayout(null);

        label_nombre = new JLabel();
        label_nombre.setText("Nombre:");
        label_nombre.setBounds(60, 20, 200, 23);
        campo_nombre = new JTextField();
        campo_nombre.setBounds(160, 20, 200, 23);

        label_numero = new JLabel();
        label_numero.setText("Numero:");
        label_numero.setBounds(60, 50, 200, 23);
        campo_numero = new JTextField();
        campo_numero.setBounds(160, 50, 200, 23);

        label_nuevo_nombre = new JLabel();
        label_nuevo_nombre.setText("Nuevo nombre:");
        label_nuevo_nombre.setBounds(60, 80, 200, 23);
        campo_nuevo_nombre = new JTextField();
        campo_nuevo_nombre.setBounds(160, 80, 200, 23);

        label_nuevo_numero = new JLabel();
        label_nuevo_numero.setText("Nuevo numero:");
        label_nuevo_numero.setBounds(60, 110, 200, 23);
        campo_nuevo_numero = new JTextField();
        campo_nuevo_numero.setBounds(160, 110, 200, 23);

        boton_crear = new JButton();
        boton_crear.setText("Crear");
        boton_crear.setBounds(40, 160, 80, 23);
        boton_crear.addActionListener(this);
        contenedor.add(boton_crear);

        boton_leer = new JButton();
        boton_leer.setText("Leer");
        boton_leer.setBounds(130, 160, 80, 23);
        boton_leer.addActionListener(this);
        contenedor.add(boton_leer);

        boton_actualizar = new JButton();
        boton_actualizar.setText("Actualizar");
        boton_actualizar.setBounds(220, 160, 100, 23);
        boton_actualizar.addActionListener(this);
        contenedor.add(boton_actualizar);

        boton_eliminar = new JButton();
        boton_eliminar.setText("Eliminar");
        boton_eliminar.setBounds(330, 160, 100, 23);
        boton_eliminar.addActionListener(this);
        contenedor.add(boton_eliminar);

        resultados = new JTextArea(8,25);
        resultados.setEditable(false);
        JScrollPane scroll = new JScrollPane(resultados);
        scroll.setBounds(60, 200, 400, 150);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);


        contenedor.add(label_nombre);
        contenedor.add(campo_nombre);

        contenedor.add(label_numero);
        contenedor.add(campo_numero);

        contenedor.add(label_nuevo_nombre);
        contenedor.add(campo_nuevo_nombre);

        contenedor.add(label_nuevo_numero);
        contenedor.add(campo_nuevo_numero);

        contenedor.add(scroll);


    }

    public void accion_crear(java.awt.event.ActionEvent evento) {

        try {
            String nombre = String.valueOf(campo_nombre.getText());
            long numero = Long.parseLong(campo_numero.getText());

            String nameNumberString;
            String name;
            long number;

            File file = new File("/mnt/SF2/Programming/Git/UN_OOP/proyectoCRUD/Formulario.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            boolean found = false;

            while (raf.getFilePointer() < raf.length()) {

                nameNumberString = raf.readLine();
                String[] lineSplit = nameNumberString.split("!");
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);

                if (name.equals(nombre)
                        || number == numero) {
                    found = true;
                    break;
                }
            }
            if (found == false) {

                nameNumberString = nombre + "!"
                        + String.valueOf(numero);

                raf.writeBytes(nameNumberString);
                raf.writeBytes(System.lineSeparator());
                System.out.println("Usuario añadido.");
                resultados.append("-------------------------------\n");
                resultados.append("Usuario añadido.\n");
                resultados.append("-------------------------------\n");
                raf.close();
            } else {
                raf.close();
                System.out.println("El usuario ingresado ya existe");
                resultados.append("-------------------------------\n");
                resultados.append("El nombre o el numero ya existe.\n");
                resultados.append("-------------------------------\n");
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al acceder al archivo: " + ex.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        } catch (NumberFormatException nef) {

            System.out.println(nef);
        }
    }

    public void accion_leer(java.awt.event.ActionEvent evento) {

        try {
            String nameNumberString;
            String name;
            long number;

            File file = new File("/mnt/SF2/Programming/Git/UN_OOP/proyectoCRUD/Formulario.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            RandomAccessFile raf = new RandomAccessFile(file, "rw");

            resultados.append("-------------------------------\n");

            while (raf.getFilePointer() < raf.length()) {

                nameNumberString = raf.readLine();
                String[] lineSplit = nameNumberString.split("!");

                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);

                System.out.println(
                        "Nombre: " + name + "\n"
                                + "Numero: " + number + "\n");
                
                resultados.append("Nombre: " + name + "\n"
                                + "Numero: " + number + "\n");
                
            }

            resultados.append("-------------------------------\n");
        }

        catch (IOException ioe) {

            System.out.println(ioe);
        } catch (NumberFormatException nef) {

            System.out.println(nef);
        }
    }


    public void accion_actualizar(java.awt.event.ActionEvent evento){

        try {

            String nombre = String.valueOf(campo_nombre.getText());
            long numero = Long.parseLong(campo_numero.getText());

            String nuevo_nombre = String.valueOf(campo_nuevo_nombre.getText());
            long nuevo_numero = Long.parseLong(campo_nuevo_numero.getText());

            String nameNumberString;
            String name;
            long number;
            int index;


            File file = new File("/mnt/SF2/Programming/Git/UN_OOP/proyectoCRUD/Formulario.txt");

            if (!file.exists()) {

                file.createNewFile();
            }

            RandomAccessFile raf
                = new RandomAccessFile(file, "rw");
            boolean found = false;

            while (raf.getFilePointer() < raf.length()) {

                nameNumberString = raf.readLine();

                String[] lineSplit
                    = nameNumberString.split("!");


                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);

                if (name.equals(nombre)
                    || number == numero) {
                    found = true;
                    break;
                }
            }

            if (found == true) {


                File tmpFile = new File("temp.txt");


                RandomAccessFile tmpraf
                    = new RandomAccessFile(tmpFile, "rw");

                raf.seek(0);

                while (raf.getFilePointer()
                       < raf.length()) {

                    nameNumberString = raf.readLine();

                    index = nameNumberString.indexOf('!');
                    name = nameNumberString.substring(
                        0, index);


                    if (name.equals(nombre)) {

                        nameNumberString
                            = nuevo_nombre + "!"
                              + String.valueOf(nuevo_numero);
                    }

                    tmpraf.writeBytes(nameNumberString);
                    tmpraf.writeBytes(
                        System.lineSeparator());
                }

                raf.seek(0);
                tmpraf.seek(0);

                while (tmpraf.getFilePointer()
                       < tmpraf.length()) {
                    raf.writeBytes(tmpraf.readLine());
                    raf.writeBytes(System.lineSeparator());
                }


                raf.setLength(tmpraf.length());


                tmpraf.close();
                raf.close();


                tmpFile.delete();

                System.out.println("Usuario actualizado.");
                resultados.append("-------------------------------\n");
                resultados.append("Usuario actualizado\n");
                resultados.append("-------------------------------\n");
            }


            else {
                raf.close();
                System.out.println("El usuario ingresado no existe.");
                resultados.append("-------------------------------\n");
                resultados.append("El usuario ingresado no existe.\n");
                resultados.append("-------------------------------\n");
            }
        }
        catch (IOException ioe) {
            System.out.println(ioe);
        }

        catch (NumberFormatException nef) {
            System.out.println(nef);
        }
        
    }


    public void accion_eliminar(java.awt.event.ActionEvent evento){

        try {

            String nombre = String.valueOf(campo_nombre.getText());
            long numero = Long.parseLong(campo_numero.getText());

            String nameNumberString;
            String name;
            long number;
            int index;


            File file = new File("/mnt/SF2/Programming/Git/UN_OOP/proyectoCRUD/Formulario.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            RandomAccessFile raf
                = new RandomAccessFile(file, "rw");
            boolean found = false;

            while (raf.getFilePointer() < raf.length()) {


                nameNumberString = raf.readLine();

                String[] lineSplit
                    = nameNumberString.split("!");

                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);

                if (name.equals(nombre)) {
                    found = true;
                    break;
                }
            }

            if (found == true) {

                File tmpFile = new File("temp.txt");

                RandomAccessFile tmpraf
                    = new RandomAccessFile(tmpFile, "rw");

                raf.seek(0);

                while (raf.getFilePointer()
                       < raf.length()) {

                    nameNumberString = raf.readLine();

                    index = nameNumberString.indexOf('!');
                    name = nameNumberString.substring(
                        0, index);

                    if (name.equals(nombre)) {
                        continue;
                    }

                    tmpraf.writeBytes(nameNumberString);
                    tmpraf.writeBytes(
                        System.lineSeparator());
                }

                raf.seek(0);
                tmpraf.seek(0);


                while (tmpraf.getFilePointer()
                       < tmpraf.length()) {
                    raf.writeBytes(tmpraf.readLine());
                    raf.writeBytes(System.lineSeparator());
                }


                raf.setLength(tmpraf.length());


                tmpraf.close();
                raf.close();

                tmpFile.delete();

                System.out.println("Usuario eliminado.");
                resultados.append("-------------------------------\n");
                resultados.append("Usuario eliminado.\n");
                resultados.append("-------------------------------\n");
            }

            else {
                raf.close();
                System.out.println("El usuario ingresado no existe.");
                resultados.append("-------------------------------\n");
                resultados.append("El usuario ingresado no existe.\n");
                resultados.append("-------------------------------\n");
            }
        }
        catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == boton_crear) {
            accion_crear(evento);
        }

        if (evento.getSource() == boton_leer) {
            accion_leer(evento);
        }

        if(evento.getSource() == boton_actualizar){
            accion_actualizar(evento);
        }

        if(evento.getSource() == boton_eliminar){
            accion_eliminar(evento);
        }

    }

}
