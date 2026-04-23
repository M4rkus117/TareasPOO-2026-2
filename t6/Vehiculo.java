package main.java.Ejercicios.mx.unam.fesa.ico.t6;

public class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
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
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
    public void mostrarInformmacion(){
        System.out.println("Marca: " + this.marca + ". Modelo: " + this.modelo);
    }
}
