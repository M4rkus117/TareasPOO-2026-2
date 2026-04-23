package main.java.Ejercicios.mx.unam.fesa.ico.t4;
import main.java.Ejercicios.mx.unam.fesa.ico.t4.Semaforo;
import main.java.Ejercicios.mx.unam.fesa.ico.t4.subclase.Luz;
public class puruebast4 {
    public static void main(String[] args) {
        Luz luz0 = new Luz("Rojo",true);
        Luz luz1 = new Luz("Amarillo",false);
        Luz luz2 = new Luz("Verde",false);
        Semaforo s1 = new Semaforo();
        System.out.println(s1);
        s1.setModelo("2025");
        s1.setL0(luz0);
        s1.setL1(luz1);
        s1.setL2(luz2);
        System.out.println(s1);
        s1.estado();
        System.out.println("----------------------------------");
        s1.cambiarLuz(1);
        s1.estado();
        System.out.println("----------------------------------");
        s1.cambiarLuz(2);
        s1.estado();

    }
}
