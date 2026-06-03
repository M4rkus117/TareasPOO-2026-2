package main.java.Ejercicios.mx.unam.fesa.ico.proyectoFinal;

import main.java.Ejercicios.mx.unam.fesa.ico.proyectoFinal.controller.ControladorYugi;
import main.java.Ejercicios.mx.unam.fesa.ico.proyectoFinal.view.VentanaYugi;

public class MainYugi {
    static void main() {
        VentanaYugi vy = new VentanaYugi();
        ControladorYugi controladorYugi=new ControladorYugi(vy);
    }
}
