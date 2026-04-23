package main.java.Ejercicios.mx.unam.fesa.ico.t4;

import main.java.Ejercicios.mx.unam.fesa.ico.t4.subclase.Luz;

public class Semaforo {
    private String modelo;
    private Luz l0;
    private Luz l1;
    private Luz l2;

    public Semaforo() {
    }

    public Semaforo(String modelo, Luz l0, Luz l1, Luz l2) {
        this.modelo = modelo;
        this.l0 = l0;
        this.l1 = l1;
        this.l2 = l2;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Luz getL0() {
        return l0;
    }

    public void setL0(Luz l0) {
        this.l0 = l0;
    }

    public Luz getL1() {
        return l1;
    }

    public void setL1(Luz l1) {
        this.l1 = l1;
    }

    public Luz getL2() {
        return l2;
    }

    public void setL2(Luz l2) {
        this.l2 = l2;
    }

    @Override
    public String toString() {
        return "Semaforo{" +
                "modelo='" + modelo + '\'' +
                ", l0=" + l0 +
                ", l1=" + l1 +
                ", l2=" + l2 +
                '}';
    }
    public void cambiarLuz(int luz) {
        switch (luz) {
            case 0:
                l0.encender();
                l1.apagar();
                l2.apagar();
                break;
            case 1:
                l0.apagar();
                l1.encender();
                l2.apagar();
                break;
            case 2:
                l0.apagar();
                l1.apagar();
                l2.encender();
            default:
                System.out.println("Escoge una luz valida.");

        }
    }
    public void estado(){
        System.out.println("Luz roja esta encendida..." + l0.isEncendido());
        System.out.println("Luz amarilla esta encendida..." + l1.isEncendido());
        System.out.println("Luz verde esta encendida..." + l2.isEncendido());
    }
}