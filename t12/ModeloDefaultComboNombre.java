package main.java.Ejercicios.mx.unam.fesa.ico.t12;

import javax.swing.*;
import java.util.ArrayList;

public class ModeloDefaultComboNombre extends DefaultComboBoxModel {

    public ModeloDefaultComboNombre(ArrayList nombres) {
        super(nombres.toArray());
    }

    public ModeloDefaultComboNombre() {
        super();
    }

}
