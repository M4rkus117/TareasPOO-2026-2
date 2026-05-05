package main.java.Ejercicios.mx.unam.fesa.ico.t13.I2.controller;

import main.java.Ejercicios.mx.unam.fesa.ico.t13.I2.view.VentanaPrincipal2;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorPrincipal2 implements MouseListener {
    private VentanaPrincipal2 view;

    public ControladorPrincipal2(VentanaPrincipal2 vista) {
        this.view = vista;
        this.view.getBtnSaludar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == this.view.getBtnSaludar()){
            this.view.getLblSalida().setText("Saludos para "+this.view.getTxtNombre().getText());
            System.out.println("Botón saludar presionado");
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

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
