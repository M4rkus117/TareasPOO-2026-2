package main.java.Ejercicios.mx.unam.fesa.ico.t11;

import org.w3c.dom.Text;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaCalculadoraIMC extends Frame {
    /*private Label label;
    private TextField texto;
    private Button bot1;
    private Button bo22;
    private Label resultado;*/

    public VentanaCalculadoraIMC(){
        super("Calculadora IMC");
        setVisible(true);
        setSize(1080,920);
        setLayout(new FlowLayout());
        java.awt.TextField entrada1 =new TextField(10);
        java.awt.TextField entrada2 =new TextField(10);
        Button bot1 = new Button("Calcular IMC");
        Button bot2=new Button("Buenas");
        Label resultado=new Label("");
        Label peso=new Label("Inserte su peso en kilogramos: ");
        Label altura=new Label("Inserte su altura en metros: ");
        bot1.setSize(100,100);
        bot2.setSize(100,100);
        bot1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                double peso=Double.parseDouble(entrada1.getText());
                double altura=Double.parseDouble(entrada2.getText());
                double IMC= peso/(altura*altura);
                resultado.setText("Su IMC es: "+String.valueOf(IMC));

                System.out.println("Calculando IMC...");
            }
        });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

        add(peso);
        add(entrada1);
        add(altura);
        add(entrada2);
        add(bot1);
        add(resultado);
        pack();
    }
}
