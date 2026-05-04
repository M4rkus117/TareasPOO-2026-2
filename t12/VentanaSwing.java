package tareasPOO.t12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaSwing extends JFrame {
    private JLabel etiqueta;
    private JButton bot;
    private JTextField entrada;

    public VentanaSwing(){
        super("Primer ventana en Swing.");
        setSize(720,480);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        etiqueta=new JLabel("Inserta un número: ");
        entrada=new JTextField(15);
        bot=new JButton("Enviar");
        bot.setForeground(new Color(5,99,36));
        bot.setBackground(new Color(65, 145, 250));
        entrada.setBackground(Color.pink);

        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(etiqueta);
        getContentPane().add(entrada);
        getContentPane().add(bot);
        pack();
        bot.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double entradaCelsius= Double.parseDouble(entrada.getText());
                double gradosFarenheit=(entradaCelsius*9/5)+32;
                JOptionPane.showMessageDialog(null, "En Farenheit es: "+gradosFarenheit);
            }
        });

        entrada.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Hola desde el cuadro de diálogo.");
            }
        });

        entrada.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Hola desde el keypad");
                System.out.println("Tecla presionada: "+e.getKeyChar()+" "+e.getKeyCode());
            }
        });
    }
}
