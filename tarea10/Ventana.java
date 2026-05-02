package tareasPOO.tarea10;

import java.awt.*;
import java.awt.Button;
import java.awt.TextField;
import java.awt.FlowLayout;

public class Ventana extends Frame {
    Button boton1;
    TextField texto;
    FlowLayout layout;

    public Ventana (){

    }
    public Ventana (String titulo, int ancho, int alto){
        super(titulo);
        setSize(ancho, alto);
        setVisible(true);
        boton1=new Button("Opción 1");
        texto=new TextField(8);
        layout=new FlowLayout();
        setLayout(layout);

        add(boton1);
        add(texto);
    }

}
