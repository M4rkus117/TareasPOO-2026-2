package main.java.Ejercicios.mx.unam.fesa.ico.t3;

public class Carro {
    private String color;
    private String modelo;
    private float precio;
    private int kilometraje;

    public Carro() {
    }

    public Carro(String color, String modelo, float precio, int kilometraje) {
        this.color = color;
        this.modelo = modelo;
        this.precio = precio;
        this.kilometraje = kilometraje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "color=" + color +
                ", modelo=" + modelo +
                ", precio=" + precio +
                ", kilometraje=" + kilometraje +
                '}';
    }
    public void acelerar(){
        System.out.println("El vehículo está acelerando.");
    }
    public void mover(){
        System.out.println("El vehículo está en movimiento.");
    }
    public void cargarPasajeros(){
        System.out.println("Han abordado pasajeros.");
    }
    public boolean encenderOApagar(boolean o){
        System.out.println("El vehículo se encuentra " + o);
        return o;
    }
}
