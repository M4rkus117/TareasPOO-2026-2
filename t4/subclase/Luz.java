package main.java.Ejercicios.mx.unam.fesa.ico.t4.subclase;

public class Luz {
    private String color;
    private boolean encendido;

    public Luz() {
    }

    public Luz(String color, boolean encendido) {
        this.color = color;
        this.encendido = encendido;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    @Override
    public String toString() {
        return "Luz{" +
                "color='" + color + '\'' +
                ", encendido=" + encendido +
                '}';
    }
    public boolean encender(){
        this.encendido = true;
        return this.encendido;
    }
    public boolean apagar(){
        this.encendido=false;
        return this.encendido;
    }
}
