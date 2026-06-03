package main.java.Ejercicios.mx.unam.fesa.ico.proyectoFinal.view;
import javax.swing.*;
import java.awt.*;

public class VentanaYugi extends JFrame {
    private JPanel panel1;
    private JPanel panel2;

    private JLabel lblNombreCarta;
    private JTextField txtNombreCarta;
    private JLabel lblAtributo;
    private JTextField txtAtributo;
    private JLabel lblNivel;
    private JTextField txtNivel;
    private JLabel lblTipo;
    private JTextField txtTipo;
    private JLabel lblAtk;
    private JTextField txtAtk;
    private JLabel lblDef;
    private JTextField txtDef;
    private JLabel lblClasificacion;
    //RadioButton y su grupo
    private ButtonGroup btnGroupClasificacion;
    private JRadioButton rdbtn1;
    private JRadioButton rdbtn2;
    private JRadioButton rdbtn3;
    private JRadioButton rdbtn4;

    //demás componentes
    private JColorChooser colorChooser;
    private JComboBox comboBox;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem menuItem1;
    private JMenuItem menuItem2;
    private JFileChooser chooser;

    private JScrollPane scrollPane;
    private JTable tablaCartas;

    private JButton btnAgregar;
    private JButton btnModificarRegistro;
    private JButton btnBorrarRegistro;
    private JButton btnCambiarColor;
    private JButton btnGuardarArchivo;
    private JButton btnLeerArchivo;


    public VentanaYugi(){
        //Configuración de la ventana
        super("Ventana de Cartas de Monstruo");
        this.getContentPane().setLayout(new GridLayout(2,1));

        //creacion de componentes
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel1.setBackground(new Color(218, 96, 96));
        panel2.setBackground(new Color(39, 197, 158));


        //Menú
        menuBar=new JMenuBar();
        menu=new JMenu("Archivo");
        menuItem1=new JMenuItem("Abrir");
        menuItem2 =new JMenuItem("Salir");
        menu.add(menuItem1);
        menu.add(menuItem2);
        menuBar.add(menu);

        //Label y TextField
        lblNombreCarta = new JLabel("Nombre: ");
        txtNombreCarta = new JTextField(15);
        lblAtributo = new JLabel("Atributo: ");
        txtAtributo = new JTextField(6);
        lblNivel = new JLabel("Nivel: ");
        txtNivel = new JTextField(6);
        lblTipo = new JLabel("Tipo: ");
        txtTipo = new JTextField(15);
        lblAtk = new JLabel("Ataque: ");
        txtAtk= new JTextField(6);
        lblDef = new JLabel("Defensa: ");
        txtDef= new JTextField(6);
        lblClasificacion = new JLabel("Clasificacion: ");

        //RadioButton y ButtonGroup
        rdbtn1=new JRadioButton("Efecto");
        rdbtn2=new JRadioButton("Ritual");
        rdbtn3=new JRadioButton("Fusión");
        rdbtn4=new JRadioButton("Sincronía");
        btnGroupClasificacion=new ButtonGroup();
        btnGroupClasificacion.add(rdbtn1);
        btnGroupClasificacion.add(rdbtn2);
        btnGroupClasificacion.add(rdbtn3);
        btnGroupClasificacion.add(rdbtn4);

        //Botones
        btnAgregar= new JButton("Agregar");
        btnModificarRegistro=new JButton("Modificar");
        btnBorrarRegistro=new JButton("Borrar");
        btnCambiarColor=new JButton("Cambiar color del fondo");
        btnGuardarArchivo= new JButton("Guardar en archivo");
        btnLeerArchivo= new JButton("Leer de archivo");

        colorChooser = new JColorChooser();
        comboBox=new JComboBox<>();


        tablaCartas = new JTable();
        scrollPane= new JScrollPane(tablaCartas);
        scrollPane.setPreferredSize(new Dimension(500,200));

        //Agregar componentes a los paneles
        panel1.add(menuBar);
        panel1.add(lblNombreCarta);
        panel1.add(txtNombreCarta);
        panel1.add(lblAtributo);
        panel1.add(txtAtributo);
        panel1.add(lblNivel);
        panel1.add(txtNivel);
        panel1.add(lblTipo);
        panel1.add(txtTipo);
        panel1.add(lblAtk);
        panel1.add(txtAtk);
        panel1.add(lblDef);
        panel1.add(txtDef);
        panel1.add(lblClasificacion);
        panel1.add(rdbtn1);
        panel1.add(rdbtn2);
        panel1.add(rdbtn3);
        panel1.add(rdbtn4);
        panel1.add(comboBox);
        panel1.add(btnAgregar);
        panel1.add(btnCambiarColor);

        panel2.add(scrollPane);
        panel2.add(btnGuardarArchivo);
        panel2.add(btnLeerArchivo);
        panel2.add(btnModificarRegistro);
        panel2.add(btnBorrarRegistro);

        //Agregar los paneles a la ventana
        this.getContentPane().add(panel1);
        this.getContentPane().add(panel2);

        //configuracion final
        setVisible(true);
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JLabel getLblNombreCarta() {
        return lblNombreCarta;
    }

    public void setLblNombreCarta(JLabel lblNombreCarta) {
        this.lblNombreCarta = lblNombreCarta;
    }

    public JTextField getTxtNombreCarta() {
        return txtNombreCarta;
    }

    public void setTxtNombreCarta(JTextField txtNombreCarta) {
        this.txtNombreCarta = txtNombreCarta;
    }

    public JLabel getLblAtributo() {
        return lblAtributo;
    }

    public void setLblAtributo(JLabel lblAtributo) {
        this.lblAtributo = lblAtributo;
    }

    public JTextField getTxtAtributo() {
        return txtAtributo;
    }

    public void setTxtAtributo(JTextField txtAtributo) {
        this.txtAtributo = txtAtributo;
    }

    public JLabel getLblNivel() {
        return lblNivel;
    }

    public void setLblNivel(JLabel lblNivel) {
        this.lblNivel = lblNivel;
    }

    public JTextField getTxtNivel() {
        return txtNivel;
    }

    public void setTxtNivel(JTextField txtNivel) {
        this.txtNivel = txtNivel;
    }

    public JLabel getLblTipo() {
        return lblTipo;
    }

    public void setLblTipo(JLabel lblTipo) {
        this.lblTipo = lblTipo;
    }

    public JTextField getTxtTipo() {
        return txtTipo;
    }

    public void setTxtTipo(JTextField txtTipo) {
        this.txtTipo = txtTipo;
    }

    public JLabel getLblAtk() {
        return lblAtk;
    }

    public void setLblAtk(JLabel lblAtk) {
        this.lblAtk = lblAtk;
    }

    public JTextField getTxtAtk() {
        return txtAtk;
    }

    public void setTxtAtk(JTextField txtAtk) {
        this.txtAtk = txtAtk;
    }

    public JLabel getLblDef() {
        return lblDef;
    }

    public void setLblDef(JLabel lblDef) {
        this.lblDef = lblDef;
    }

    public JTextField getTxtDef() {
        return txtDef;
    }

    public void setTxtDef(JTextField txtDef) {
        this.txtDef = txtDef;
    }

    public JLabel getLblClasificacion() {
        return lblClasificacion;
    }

    public void setLblClasificacion(JLabel lblClasificacion) {
        this.lblClasificacion = lblClasificacion;
    }

    public ButtonGroup getBtnGroupClasificacion() {
        return btnGroupClasificacion;
    }

    public void setBtnGroupClasificacion(ButtonGroup btnGroupClasificacion) {
        this.btnGroupClasificacion = btnGroupClasificacion;
    }

    public JRadioButton getRdbtn1() {
        return rdbtn1;
    }

    public void setRdbtn1(JRadioButton rdbtn1) {
        this.rdbtn1 = rdbtn1;
    }

    public JRadioButton getRdbtn2() {
        return rdbtn2;
    }

    public void setRdbtn2(JRadioButton rdbtn2) {
        this.rdbtn2 = rdbtn2;
    }

    public JRadioButton getRdbtn3() {
        return rdbtn3;
    }

    public void setRdbtn3(JRadioButton rdbtn3) {
        this.rdbtn3 = rdbtn3;
    }

    public JRadioButton getRdbtn4() {
        return rdbtn4;
    }

    public void setRdbtn4(JRadioButton rdbtn4) {
        this.rdbtn4 = rdbtn4;
    }

    public JColorChooser getColorChooser() {
        return colorChooser;
    }

    public void setColorChooser(JColorChooser colorChooser) {
        this.colorChooser = colorChooser;
    }

    public JComboBox getComboBox() {
        return comboBox;
    }

    public void setComboBox(JComboBox comboBox) {
        this.comboBox = comboBox;
    }

    //Se borraron getters and setters de MenuBar

    public JMenu getMenu() {
        return menu;
    }

    public void setMenu(JMenu menu) {
        this.menu = menu;
    }

    public JMenuItem getMenuItem1() {
        return menuItem1;
    }

    public void setMenuItem1(JMenuItem menuItem1) {
        this.menuItem1 = menuItem1;
    }

    public JMenuItem getMenuItem2() {
        return menuItem2;
    }

    public void setMenuItem2(JMenuItem menuItem2) {
        this.menuItem2 = menuItem2;
    }

    public JFileChooser getChooser() {
        return chooser;
    }

    public void setChooser(JFileChooser chooser) {
        this.chooser = chooser;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    public JTable getTablaCartas() {
        return tablaCartas;
    }

    public void setTablaCartas(JTable tablaCartas) {
        this.tablaCartas = tablaCartas;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnModificarRegistro() {
        return btnModificarRegistro;
    }

    public void setBtnModificarRegistro(JButton btnModificarRegistro) {
        this.btnModificarRegistro = btnModificarRegistro;
    }

    public JButton getBtnBorrarRegistro() {
        return btnBorrarRegistro;
    }

    public void setBtnBorrarRegistro(JButton btnBorrarRegistro) {
        this.btnBorrarRegistro = btnBorrarRegistro;
    }

    public JButton getBtnCambiarColor() {
        return btnCambiarColor;
    }

    public void setBtnCambiarColor(JButton btnCambiarColor) {
        this.btnCambiarColor = btnCambiarColor;
    }

    public JButton getBtnGuardarArchivo() {
        return btnGuardarArchivo;
    }

    public void setBtnGuardarArchivo(JButton btnGuardarArchivo) {
        this.btnGuardarArchivo = btnGuardarArchivo;
    }

    public JButton getBtnLeerArchivo() {
        return btnLeerArchivo;
    }

    public void setBtnLeerArchivo(JButton btnLeerArchivo) {
        this.btnLeerArchivo = btnLeerArchivo;
    }

    public void limpiar(){
        txtNombreCarta.setText("");
        txtAtributo.setText("");
        txtNivel.setText("");
        txtTipo.setText("");
        txtAtk.setText("");
        txtDef.setText("");
    }
    public boolean validar(){
        return !txtNombreCarta.getText().isEmpty() && !txtAtributo.getText().isEmpty()
                &&!txtNivel.getText().isEmpty()&&!txtTipo.getText().isEmpty() &&!txtAtk.getText().isEmpty()
                &&!txtDef.getText().isEmpty();
    }

}
