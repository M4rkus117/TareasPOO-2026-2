package main.java.Ejercicios.mx.unam.fesa.ico.proyectoFinal.model;

import javax.swing.*;
import java.util.ArrayList;

public class ModeloDefaultComboCartas extends DefaultComboBoxModel {

    public ModeloDefaultComboCartas(ArrayList opciones) {
        super(opciones.toArray());
    }

    public ModeloDefaultComboCartas() {
        super();

    }
}