package tareasPOO.tarea10;

import java.awt.*;

public class VentanaBorderLayout extends Frame {

    Button bot1,bot2,bot3,bot4;
    public VentanaBorderLayout(){
        super("Ventana con Border Layout");
        setSize(1000,800);
        setLayout(new BorderLayout());
        setResizable(false);
        setVisible(true);
        bot1=new Button("Norte");
        bot2=new Button("Sur");
        bot3=new Button("Este");
        bot4=new Button("Oeste");

        add("North",bot1);
        add("South",bot2);
        add("East",bot3);
        add("West",bot4);
    }
}
