package main.java.Ejercicios.mx.unam.fesa.ico.t3;

public class Aspiradora {
    private String marca;
    private float precio;
    private String modelo;
    private float capacidad;
    private float bateria;

    public Aspiradora(String marca) {
        this.marca = marca;
    }

    public Aspiradora(String marca, float precio, String modelo, float capacidad, float bateria) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.bateria = bateria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    public float getBateria() {
        return bateria;
    }

    public void setBateria(float bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Aspiradora{" +
                "marca=" + marca +
                ", precio=" + precio +
                ", modelo=" + modelo +
                ", capacidad=" + capacidad +
                ", bateria=" + bateria +
                '}';
    }

    public boolean aspirar(boolean a){
        if (a==true){
            System.out.println("Esta aspirando.");
        }
        else{
            System.out.println("No esta aspirando.");
        }
        return a;
    }
    public void encender(){
        System.out.println("Se ha encendido.");
    }
    public void apagar(){
        System.out.println("Se ha apagado.");
    }
    public void cargarBasura(){
        System.out.println("Se esta cargando basura.");
    }
}
