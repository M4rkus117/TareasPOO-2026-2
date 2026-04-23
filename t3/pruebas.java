package main.java.Ejercicios.mx.unam.fesa.ico.t3;

import main.java.Ejercicios.mx.unam.fesa.ico.composicion.Monitor;
import main.java.Ejercicios.mx.unam.fesa.ico.composicion.Mouse;
import main.java.Ejercicios.mx.unam.fesa.ico.composicion.Procesador;
import main.java.Ejercicios.mx.unam.fesa.ico.composicion.Teclado;

public class pruebas {
    public static void main(String[] args) {
        Computadora c1= new Computadora();
        System.out.println(c1);
        c1.setModelo("T800");
        c1.setMarca("Lenovo");
        System.out.println(c1);
        Teclado t1 = new Teclado("T1000","Kingston", 101);
        Monitor m1 = new Monitor("2800Q", "BenQ", 120,"4K");
        Procesador p1 = new Procesador(4, 3.7f, "Ryzen", "3");
        Mouse mo1= new Mouse("Logitech","T100");
        c1.setTeclado(t1);
        c1.setMonitor(m1);
        c1.setProcesador(p1);
        c1.setMouse(mo1);
        System.out.println(c1);
        c1.getProcesador().setMarca("Intel");
        c1.getProcesador().setModelo("i7");
        System.out.println(c1);
    }
}
