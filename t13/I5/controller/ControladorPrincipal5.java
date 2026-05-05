package main.java.Ejercicios.mx.unam.fesa.ico.t13.I5.controller;

import main.java.Ejercicios.mx.unam.fesa.ico.t13.I5.view.VentanaPrincipal5;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorPrincipal5 implements MouseListener {
    private VentanaPrincipal5 vista;

    public ControladorPrincipal5(VentanaPrincipal5 view) {
        this.vista = view;
        this.vista.getBtnSaludar().addMouseListener(this);
        this.vista.getBtnSaludar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==this.vista.getBtnSaludar()){
           this.vista.getLblSalida().setText("Hola "+this.vista.getTxtNombre().getText());
            System.out.println("Botón presionado");
        }
        if(e.getSource()==this.vista.getPnlPanel1()){
            System.out.println("Panel 1 presionado");
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
        System.out.println("Vete con cuidado");

    }
}
