package main.java.Ejercicios.mx.unam.fesa.ico.t13.I2.view;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal2 extends JFrame {
    private JPanel pnlPanel1;
    private JPanel pnlPanel2;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JButton btnSaludar;
    private JLabel lblSalida;

    public VentanaPrincipal2() {
        super("Ejercicio 2 MVC");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(1000, 800);
        getContentPane().setLayout(new GridLayout(2,1));

        pnlPanel1 = new JPanel();
        pnlPanel1.setBackground(new Color(255,255,255));
        pnlPanel2 = new JPanel();
        pnlPanel2.setBackground(new Color(158, 81, 81));

        lblNombre = new JLabel("Nombre: ");
        txtNombre = new JTextField(20);
        btnSaludar = new JButton("Saludar");
        lblSalida = new JLabel("Salida: ");

        pnlPanel2.add(lblNombre);
        pnlPanel2.add(txtNombre);
        pnlPanel2.add(btnSaludar);
        pnlPanel2.add(lblSalida);

        getContentPane().add(pnlPanel1,0);
        getContentPane().add(pnlPanel2,1);
    }

    public JPanel getPnlPanel1() {
        return pnlPanel1;
    }

    public void setPnlPanel1(JPanel pnlPanel1) {
        this.pnlPanel1 = pnlPanel1;
    }

    public JPanel getPnlPanel2() {
        return pnlPanel2;
    }

    public void setPnlPanel2(JPanel pnlPanel2) {
        this.pnlPanel2 = pnlPanel2;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JButton getBtnSaludar() {
        return btnSaludar;
    }

    public void setBtnSaludar(JButton btnSaludar) {
        this.btnSaludar = btnSaludar;
    }

    public JLabel getLblSalida() {
        return lblSalida;
    }

    public void setLblSalida(JLabel lblSalida) {
        this.lblSalida = lblSalida;
    }
}
