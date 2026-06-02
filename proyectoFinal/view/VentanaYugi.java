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
    //Aquí  falta declarar los RadioButton y su grupo
    //Asimismo, fata incluir combobox, menuitem, JFileChooser, JColorChooser, JCheckBox
    //También aplicar el reloj


    private JButton btnAgregar;

    private JScrollPane scrollPane;
    private JTable tablaAlumnos;

    private JButton btnGuardarArchivo;
    private JButton btnLeerArchivo;

    public VentanaYugi(){
        //Configuración de la ventana
        super("Ventana de Alumnos");
        this.getContentPane().setLayout(new GridLayout(2,1));

        //creacion de componentes
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel1.setBackground(new Color(218, 96, 96));
        panel2.setBackground(new Color(39, 197, 158));

        lblNombreCarta = new JLabel("Numero de cuenta: ");
        txtNombreCarta = new JTextField(10);
        lblAtributo = new JLabel("Nombre: ");
        txtAtributo = new JTextField(10);
        lblNivel = new JLabel("Apellido: ");
        txtNivel = new JTextField(10);
        lblTipo = new JLabel("Promedio: ");
        txtTipo = new JTextField(10);
        btnAgregar= new JButton("Agregar");
        btnGuardarArchivo= new JButton("Guardar en archivo");
        btnLeerArchivo= new JButton("Leer de archivo");

        //Modelo temporalmente para pruebas

        //ModeloTablaAlumno modelo= new ModeloTablaAlumno();

        tablaAlumnos = new JTable();
        //tablaAlumnos.setModel(modelo);
        scrollPane= new JScrollPane(tablaAlumnos);
        scrollPane.setPreferredSize(new Dimension(500,200));

        //Agregar componentes a los paneles
        panel1.add(lblNombreCarta);
        panel1.add(txtNombreCarta);
        panel1.add(lblAtributo);
        panel1.add(txtAtributo);
        panel1.add(lblNivel);
        panel1.add(txtNivel);
        panel1.add(lblTipo);
        panel1.add(txtTipo);
        panel1.add(btnAgregar);

        panel2.add(scrollPane);
        panel2.add(btnGuardarArchivo);
        panel2.add(btnLeerArchivo);

        //Agregar los paneles a la ventana
        this.getContentPane().add(panel1);
        this.getContentPane().add(panel2);

        //configuracion final
        setVisible(true);
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
