package main.java.Ejercicios.mx.unam.fesa.ico.composicion;

public class Teclado {
    private String modelo;
    private String marca;
    private int numTeclas;

    public Teclado() {
    }

    public Teclado(String modelo, String marca, int numTeclas) {
        this.modelo = modelo;
        this.marca = marca;
        this.numTeclas = numTeclas;
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

    public int getNumTeclas() {
        return numTeclas;
    }

    public void setNumTeclas(int numTeclas) {
        this.numTeclas = numTeclas;
    }

    @Override
    public String toString() {
        return "Teclado{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", numTeclas=" + numTeclas +
                '}';
    }
}
