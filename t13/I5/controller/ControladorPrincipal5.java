package main.java.Ejercicios.mx.unam.fesa.ico.t13.I5.controller;

import main.java.Ejercicios.mx.unam.fesa.ico.t13.I5.model.ModeloTablaPhone;
import main.java.Ejercicios.mx.unam.fesa.ico.t13.I5.model.Phone;
import main.java.Ejercicios.mx.unam.fesa.ico.t13.I5.view.VentanaPrincipal5;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class ControladorPrincipal5 implements MouseListener {
    private VentanaPrincipal5 vista;
    private ModeloTablaPhone modelo;

    public ControladorPrincipal5(VentanaPrincipal5 view) {
        this.vista = view;
        this.vista.getBtnSaludar().addMouseListener(this);
        this.vista.getBtnSaludar().addMouseListener(this);
        this.vista.getBtnAgregarPhone().addMouseListener(this);
        this.vista.getTblPhone().addMouseListener(this);

        ArrayList<Phone> tels = new ArrayList<>();
        tels.add(new Phone("Apple", "IPhone 15", 17500f));
        tels.add(new Phone("Samsung", "Galaxy S27", 15200));
        modelo=new ModeloTablaPhone(tels);
        this.vista.getTblPhone().setModel(modelo);
        this.vista.getTblPhone().updateUI();
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

        if(e.getSource()==this.vista.getBtnAgregarPhone()){
            System.out.println("Agregando phone presionado");
            Phone phone =null;
            try{
                phone = new Phone(this.vista.getTxtMarca().getText(),
                        this.vista.getTxtModelo().getText(),
                        Float.parseFloat(this.vista.getTxtPrecio().getText()));
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(this.vista,"El precio no es un número");
                this.vista.getTxtPrecio().setText("0");
                phone = new Phone(
                        this.vista.getTxtMarca().getText(),
                        this.vista.getTxtModelo().getText(),
                        0.0f);
            }
            if(this.vista.validar()){
                modelo.agregarTelefono(phone);
                this.vista.getTblPhone().updateUI();
                this.vista.limpiar();
            }else{
                JOptionPane.showMessageDialog(this.vista,"Faltan datos");
            }

        }

        if(e.getSource()==this.vista.getTblPhone()){
            Phone phone=modelo.getTelefono(this.vista.getTblPhone().getSelectedRow());
            System.out.println(phone.toString());
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
