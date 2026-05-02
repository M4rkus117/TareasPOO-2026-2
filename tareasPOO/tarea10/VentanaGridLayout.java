package tareasPOO.tarea10;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaGridLayout extends Frame {
    Button b1 =new Button("Presióname");
    Button b2 =new Button("En segundo lugar este");
    Button b3 =new Button("Luego este");
    Button b4 =new Button("Por último a este");

    public VentanaGridLayout(){
        super("Ventana Grid Layout");
        setSize(1000,800);
        setResizable(false);
        setVisible(true);
        setLayout(new GridLayout(3,2));

        add(b1,0);
        add(b2,1);
        add(b3,2);
        add(b4,3);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }
}
