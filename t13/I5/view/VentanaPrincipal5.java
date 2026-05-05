package main.java.Ejercicios.mx.unam.fesa.ico.t13.I5.view;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal5 extends JFrame {
    private JPanel pnlPanel1;
    private JPanel pnlPanel2;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JButton btnSaludar;
    private JLabel lblSalida;

    public VentanaPrincipal5(){
        super("Ventana Ejercicio MVC 5");
        setVisible(true);
        setSize(720,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(2,1));

        pnlPanel1 = new JPanel();
        pnlPanel1.setBackground(new Color(213, 122, 228));
        pnlPanel2 = new JPanel();
        pnlPanel2.setBackground(new Color(20, 200, 204));

        lblNombre = new JLabel("Inserte su nombre: ");
        txtNombre = new JTextField(20);
        btnSaludar = new JButton("Saludar");
        lblSalida = new JLabel("");

        pnlPanel1.add(lblNombre);
        pnlPanel1.add(txtNombre);
        pnlPanel1.add(btnSaludar);
        pnlPanel1.add(lblSalida);

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
