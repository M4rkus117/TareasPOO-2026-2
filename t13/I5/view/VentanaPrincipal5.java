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
    //Smartphone
    private JLabel lblMarca;
    private JTextField txtMarca;
    private JLabel lblModelo;
    private JTextField txtModelo;
    private JLabel lblPrecio;
    private JTextField txtPrecio;
    private JButton btnAgregarPhone;
    private JScrollPane scrollPane;
    private JTable tblPhone;


    public VentanaPrincipal5(){
        super("Ventana Ejercicio MVC 5");
        setVisible(true);
        setSize(720,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(2,1));

        //Se crean paneles
        pnlPanel1 = new JPanel();
        pnlPanel1.setBackground(new Color(213, 122, 228));
        pnlPanel2 = new JPanel();
        pnlPanel2.setBackground(new Color(20, 200, 204));

        //Se crean componentes
        lblNombre = new JLabel("Inserte su nombre: ");
        txtNombre = new JTextField(20);
        btnSaludar = new JButton("Saludar");
        lblSalida = new JLabel("");
        lblMarca = new JLabel("Marca: ");
        txtMarca = new JTextField(30);
        lblModelo = new JLabel("ModeloTablaYugi: ");
        txtModelo = new JTextField(30);
        btnAgregarPhone = new JButton("Agregar");
        lblPrecio = new JLabel("Precio: $");
        txtPrecio = new JTextField(12);
        scrollPane= new JScrollPane(tblPhone);
        scrollPane.setPreferredSize(new Dimension(400,200));
        tblPhone= new JTable();
        scrollPane.setViewportView(tblPhone);

        //Se agregan componentes
        pnlPanel1.add(lblNombre);
        pnlPanel1.add(txtNombre);
        pnlPanel1.add(btnSaludar);
        pnlPanel1.add(lblSalida);

        pnlPanel1.add(lblMarca);
        pnlPanel1.add(txtMarca);
        pnlPanel1.add(lblModelo);
        pnlPanel1.add(txtModelo);
        pnlPanel1.add(lblPrecio);
        pnlPanel1.add(txtPrecio);
        pnlPanel1.add(btnAgregarPhone);

        pnlPanel2.add(scrollPane);

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

    public JLabel getLblMarca() {
        return lblMarca;
    }

    public void setLblMarca(JLabel lblMarca) {
        this.lblMarca = lblMarca;
    }

    public JTextField getTxtMarca() {
        return txtMarca;
    }

    public void setTxtMarca(JTextField txtMarca) {
        this.txtMarca = txtMarca;
    }

    public JLabel getLblModelo() {
        return lblModelo;
    }

    public void setLblModelo(JLabel lblModelo) {
        this.lblModelo = lblModelo;
    }

    public JTextField getTxtModelo() {
        return txtModelo;
    }

    public void setTxtModelo(JTextField txtModelo) {
        this.txtModelo = txtModelo;
    }

    public JLabel getLblPrecio() {
        return lblPrecio;
    }

    public void setLblPrecio(JLabel lblPrecio) {
        this.lblPrecio = lblPrecio;
    }

    public JTextField getTxtPrecio() {
        return txtPrecio;
    }

    public void setTxtPrecio(JTextField txtPrecio) {
        this.txtPrecio = txtPrecio;
    }

    public JButton getBtnAgregarPhone() {
        return btnAgregarPhone;
    }

    public void setBtnAgregarPhone(JButton btnAgregarPhone) {
        this.btnAgregarPhone = btnAgregarPhone;
    }

    public JTable getTblPhone() {
        return tblPhone;
    }

    public void setTblPhone(JTable tblPhone) {
        this.tblPhone = tblPhone;
    }
    public void limpiar(){
        txtNombre.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtPrecio.setText("");
    }
    public boolean validar(){
        return !txtMarca.getText().isEmpty() && !txtModelo.getText().isEmpty()&&!txtPrecio.getText().isEmpty();
    }
}
