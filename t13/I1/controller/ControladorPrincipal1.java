package main.java.Ejercicios.mx.unam.fesa.ico.t13.I1.controller;

import main.java.Ejercicios.mx.unam.fesa.ico.t13.I1.view.VentanaPrincipal1;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorPrincipal1 implements MouseListener {
    private VentanaPrincipal1 view;


    public  ControladorPrincipal1(VentanaPrincipal1 vista) {
        this.view=vista;
        this.view.getBtnSaludar().addMouseListener(this);
        this.view.getLblIndicacion().addMouseListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==this.view.getBtnSaludar()){
            System.out.println("Botón saludar clicked");
            this.view.getLblSalida().setText("Hola "+this.view.getTxtEntrada().getText());
        }
        if(e.getSource()==this.view.getLblIndicacion()){
            System.out.println("lblIndicacion clicked");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("¿Qué miras?");

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
