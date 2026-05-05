package main.java.Ejercicios.mx.unam.fesa.ico.t13.I1.view;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal1 extends JFrame {
    private JPanel pnlPanel1;
    private JPanel pnlPanel2;
    private JLabel lblIndicacion;
    private JTextField txtEntrada;
    private JButton btnSaludar;
    private JLabel lblSalida;

    public VentanaPrincipal1(){
        super("Demo MVC");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(2,1));
        //Declarar los paneles
        pnlPanel1 = new JPanel();
        pnlPanel1.setBackground(new Color(224, 94, 94));
        pnlPanel2 = new JPanel();
        pnlPanel2.setBackground(new Color(59, 83, 214));

        //Declarar componentes

        lblIndicacion = new JLabel("Inserte su nombre:");
        txtEntrada = new JTextField(20);
        btnSaludar = new JButton("Saludar");
        lblSalida = new JLabel("");

        //Agregar los componentes al panel 1

        pnlPanel1.add(lblIndicacion);
        pnlPanel1.add(txtEntrada);
        pnlPanel1.add(btnSaludar);
        pnlPanel1.add(lblSalida);

        //Agregar los paneles al Frame
        getContentPane().add(pnlPanel1);
        getContentPane().add(pnlPanel2);

        setVisible(true);
        setSize(800,600);

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

    public JLabel getLblIndicacion() {
        return lblIndicacion;
    }

    public void setLblIndicacion(JLabel lblIndicacion) {
        this.lblIndicacion = lblIndicacion;
    }

    public JTextField getTxtEntrada() {
        return txtEntrada;
    }

    public void setTxtEntrada(JTextField txtEntrada) {
        this.txtEntrada = txtEntrada;
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
