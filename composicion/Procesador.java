package main.java.Ejercicios.mx.unam.fesa.ico.composicion;

public class Procesador {
    private int nucleos;
    private float velocidad;
    private String marca;
    private String modelo;

    public Procesador() {
    }

    public Procesador(int nucleos, float velocidad, String marca, String modelo) {
        this.nucleos = nucleos;
        this.velocidad = velocidad;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Procesador{" +
                "nucleos=" + nucleos +
                ", velocidad=" + velocidad +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
