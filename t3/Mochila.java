package main.java.Ejercicios.mx.unam.fesa.ico.t3;

public class Mochila {
    private String color;
    private boolean abierto;
    private double costo;
    private String tamanio;
    private int numClientes;

    public Mochila() {
    }

    public Mochila(String color, boolean abierto, double costo, String tamanio, int numClientes) {
        this.color = color;
        this.abierto = abierto;
        this.costo = costo;
        this.tamanio = tamanio;
        this.numClientes = numClientes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAbierto() {
        return abierto;
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public int getNumClientes() {
        return numClientes;
    }

    public void setNumClientes(int numClientes) {
        this.numClientes = numClientes;
    }

    @Override
    public String toString() {
        return "Mochila{" +
                "color=" + color +
                ", abierto=" + abierto +
                ", costo=" + costo +
                ", tamanio=" + tamanio +
                ", numClientes=" + numClientes +
                '}';
    }
    public boolean abrir(){
        System.out.println("Has abierto la mochila.");
        return true;
    }
    public boolean cerrar(){
        System.out.println("Has cerrado la mochila.");
        return true;
    }
    public void guardar(){
        System.out.println("Has guardado objetos.");
    }
    public void mover(){
        System.out.println("Has movido objetos.");
    }
    public void sacar(){
        System.out.println("Has sacado objetos.");
    }

}