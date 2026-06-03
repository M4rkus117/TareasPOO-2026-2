package main.java.Ejercicios.mx.unam.fesa.ico.proyectoFinal.controller;

import main.java.Ejercicios.mx.unam.fesa.ico.proyectoFinal.model.CartaYugi;
import main.java.Ejercicios.mx.unam.fesa.ico.proyectoFinal.model.ModeloDefaultComboCartas;
import main.java.Ejercicios.mx.unam.fesa.ico.proyectoFinal.model.ModeloTablaYugi;
import main.java.Ejercicios.mx.unam.fesa.ico.proyectoFinal.utileria.CartasArchivo;
import main.java.Ejercicios.mx.unam.fesa.ico.proyectoFinal.view.VentanaYugi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorYugi extends MouseAdapter {
    private VentanaYugi vista;
    private ModeloTablaYugi modeloTabla;
    private ModeloDefaultComboCartas modeloDefaultComboCartas;
    private CartasArchivo archivo;
    private int filaEnEdicion = -1;

    public ControladorYugi(VentanaYugi view) {
        this.vista = view;
        this.modeloTabla = new ModeloTablaYugi();

        //Mi intencion era agregar un filro de cartas usando el combobox, pero no supe como :(
        //tambien quería añadir un JFileChooser pero no vi claro como ni en donde ponerlo
        this.modeloDefaultComboCartas = new ModeloDefaultComboCartas();
        archivo = new CartasArchivo("cartasLista.dat");

        this.vista.getTablaCartas().setModel(modeloTabla);
        this.vista.getComboBox().setModel(modeloDefaultComboCartas);

        this.vista.getMenuItem1().addMouseListener(this);
        this.vista.getMenuItem2().addMouseListener(this);

        this.vista.getBtnAgregar().addMouseListener(this);
        this.vista.getBtnModificarRegistro().addMouseListener(this);
        this.vista.getBtnBorrarRegistro().addMouseListener(this);

        this.vista.getBtnCambiarColor().addMouseListener(this);
        this.vista.getBtnGuardarArchivo().addMouseListener(this);
        this.vista.getBtnLeerArchivo().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==this.vista.getBtnCambiarColor()){
            JColorChooser colorChooser = new JColorChooser();
            int resutado = JOptionPane.showConfirmDialog(this.vista,colorChooser
            , "Selecciona un color",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (resutado == JOptionPane.OK_OPTION) {
                Color color = colorChooser.getColor();
                System.out.println("El color seleccionado es " + color.toString());
                this.vista.getPanel1().setBackground(color);
            } else {
                System.out.println("No se seleccionó ningún color.");
            }
        }

        if (e.getSource() == this.vista.getBtnAgregar()) {

            if (filaEnEdicion != -1) {
                guardarModificacion();
                return;
            }

            JOptionPane.showMessageDialog(this.vista,"Agregando nueva carta");
            CartaYugi cartaYugi = new CartaYugi();
            try {
                cartaYugi.setNombre(this.vista.getTxtNombreCarta().getText());
                cartaYugi.setAtributo(this.vista.getTxtAtributo().getText());
                cartaYugi.setNivel(Integer.parseInt(this.vista.getTxtNivel().getText()));
                cartaYugi.setTipo(this.vista.getTxtTipo().getText());
                cartaYugi.setAtk(Integer.parseInt(this.vista.getTxtAtk().getText()));
                cartaYugi.setDef(Integer.parseInt(this.vista.getTxtDef().getText()));
                cartaYugi.setClasificacion(obtenerClasificacion());

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this.vista, "Algunos datos no son un número");
                cartaYugi = new CartaYugi(
                        this.vista.getTxtNombreCarta().getText(),
                        this.vista.getTxtAtributo().getText(),
                        0, this.vista.getTxtTipo().getText(),
                        0, 0, "Ninguna");
            }

            if (this.vista.validar()) {
                modeloTabla.addCarta(cartaYugi);
                this.vista.getTablaCartas().updateUI();
                this.vista.limpiar();
            } else {
                JOptionPane.showMessageDialog(this.vista, "Faltan datos");
            }
        }

        //Eliminar registros
        if (e.getSource() == this.vista.getBtnBorrarRegistro()) {
            int filaSeleccionada = this.vista.getTablaCartas().getSelectedRow();

            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this.vista,
                        "Selecciona una carta de la tabla para eliminarla.");
                return;
            }

            String nombreCarta = modeloTabla.getCarta(filaSeleccionada).getNombre();
            int confirmacion = JOptionPane.showConfirmDialog(
                    this.vista,
                    "¿Deseas eliminar la carta \"" + nombreCarta + "\"?",
                    "Confirmar eliminación",
                    JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                modeloTabla.removeCarta(filaSeleccionada);
                this.vista.getTablaCartas().updateUI();
                this.vista.limpiar();
                filaEnEdicion = -1;
                JOptionPane.showMessageDialog(this.vista,"Carta eliminada");
            }
        }

        //Modificar registros
        if (e.getSource() == this.vista.getBtnModificarRegistro()) {
            int filaSeleccionada = this.vista.getTablaCartas().getSelectedRow();

            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this.vista,
                        "Selecciona una carta de la tabla para modificarla.");
                return;
            }

            // Cargar los datos de la carta seleccionada en el formulario
            CartaYugi carta = modeloTabla.getCarta(filaSeleccionada);
            this.vista.getTxtNombreCarta().setText(carta.getNombre());
            this.vista.getTxtAtributo().setText(carta.getAtributo());
            this.vista.getTxtNivel().setText(String.valueOf(carta.getNivel()));
            this.vista.getTxtTipo().setText(carta.getTipo());
            this.vista.getTxtAtk().setText(String.valueOf(carta.getAtk()));
            this.vista.getTxtDef().setText(String.valueOf(carta.getDef()));
            seleccionarRadioBtn(carta.getClasificacion());

            // Guardar la fila que se esta editando y avisar al usuario
            filaEnEdicion = filaSeleccionada;
            this.vista.getBtnAgregar().setText("Guardar cambios");
            JOptionPane.showMessageDialog(this.vista,
                    "Edita los campos y presiona \"Guardar cambios\".");
        }

        //Guardar archivo
        if (e.getSource() == this.vista.getBtnGuardarArchivo()) {
            JOptionPane.showMessageDialog(this.vista, "Guardando archivo...");
            archivo.escribirAlumnos(modeloTabla.getCartas());
            this.vista.getTablaCartas().updateUI();
        }

        // Leer archivo
        if (e.getSource() == this.vista.getBtnLeerArchivo()) {
            JOptionPane.showMessageDialog(this.vista, "Leyendo archivo...");
            modeloTabla.setCartas(archivo.leerAlumnos());
            this.vista.getTablaCartas().updateUI();
        }
    }

    private void guardarModificacion() {
        if (!this.vista.validar()) {
            JOptionPane.showMessageDialog(this.vista, "Faltan datos");
            return;
        }
        try {
            CartaYugi carta = modeloTabla.getCarta(filaEnEdicion);
            carta.setNombre(this.vista.getTxtNombreCarta().getText());
            carta.setAtributo(this.vista.getTxtAtributo().getText());
            carta.setNivel(Integer.parseInt(this.vista.getTxtNivel().getText()));
            carta.setTipo(this.vista.getTxtTipo().getText());
            carta.setAtk(Integer.parseInt(this.vista.getTxtAtk().getText()));
            carta.setDef(Integer.parseInt(this.vista.getTxtDef().getText()));
            carta.setClasificacion(obtenerClasificacion());

            this.vista.getTablaCartas().updateUI();
            this.vista.limpiar();
            this.vista.getBtnAgregar().setText("Agregar"); // restaurar etiqueta
            filaEnEdicion = -1;
            JOptionPane.showMessageDialog(this.vista, "Carta modificada correctamente.");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this.vista, "Nivel, ATK y DEF deben ser números.");
        }
    }

    private String obtenerClasificacion() {
        if (this.vista.getRdbtn1().isSelected()) return "Efecto";
        if (this.vista.getRdbtn2().isSelected()) return "Ritual";
        if (this.vista.getRdbtn3().isSelected()) return "Fusión";
        if (this.vista.getRdbtn4().isSelected()) return "Sincronía";
        return "Ninguna";
    }

    private void seleccionarRadioBtn(String clasificacion) {
        switch (clasificacion) {
            case "Efecto"   -> this.vista.getRdbtn1().setSelected(true);
            case "Ritual"   -> this.vista.getRdbtn2().setSelected(true);
            case "Fusión"   -> this.vista.getRdbtn3().setSelected(true);
            case "Sincronía"-> this.vista.getRdbtn4().setSelected(true);
        }
    }
}

