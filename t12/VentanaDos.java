package main.java.Ejercicios.mx.unam.fesa.ico.t12;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VentanaDos extends JFrame {
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JLabel etiqueta;
    private JButton bot;
    private JComboBox<String> combobox;

    public VentanaDos(){
        super("Ventana con paneles");
        setVisible(true);
        setSize(720,480);
        layout=new GridLayout(2,2);
        getContentPane().setLayout(layout);
        panel1=new JPanel();
        panel1.setBackground(Color.green);
        panel2=new JPanel();
        panel2.setBackground(Color.black);
        panel3=new JPanel();
        panel3.setBackground(Color.cyan);
        panel4=new JPanel();
        panel4.setBackground(Color.yellow);
        etiqueta=new JLabel("Etiqueta");
        bot=new JButton("Botón");
        combobox=new JComboBox<>();

        ArrayList<String> nombres =new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Ramiro");
        nombres.add("Pancho");
        nombres.add("Pedro");
        nombres.add("MAria");
        ModeloComboNombres modelo=new ModeloComboNombres(nombres);
        combobox.setModel(modelo);

        panel1.add(etiqueta);
        panel2.add(bot);
        panel3.add(combobox);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        getContentPane().add(panel1);
        getContentPane().add(panel2);
        getContentPane().add(panel3);
        getContentPane().add(panel4);

    }

}
