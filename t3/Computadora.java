package main.java.Ejercicios.mx.unam.fesa.ico.t3;

import main.java.Ejercicios.mx.unam.fesa.ico.composicion.Monitor;
import main.java.Ejercicios.mx.unam.fesa.ico.composicion.Mouse;
import main.java.Ejercicios.mx.unam.fesa.ico.composicion.Procesador;
import main.java.Ejercicios.mx.unam.fesa.ico.composicion.Teclado;

public class Computadora {
    private String modelo;
    private String marca;
    private Teclado teclado;
    private Procesador procesador;
    private Monitor monitor;
    private Mouse mouse;

    public Computadora() {
    }

    public Computadora(String modelo, String marca, Teclado teclado, Procesador procesador, Monitor monitor, Mouse mouse) {
        this.modelo = modelo;
        this.marca = marca;
        this.teclado = teclado;
        this.procesador = procesador;
        this.monitor = monitor;
        this.mouse = mouse;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", teclado=" + teclado +
                ", procesador=" + procesador +
                ", monitor=" + monitor +
                ", mouse=" + mouse +
                '}';
    }
}
