package main.java.Ejercicios.mx.unam.fesa.ico.t3;

public class Bicicleta {
    private String color;
    private float altura;
    private float ancho;
    private int velocidad;
    private String material;

    public Bicicleta() {
    }

    public Bicicleta(String color, float altura, float ancho, int velocidad, String material) {
        this.color = color;
        this.altura = altura;
        this.ancho = ancho;
        this.velocidad = velocidad;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if(altura>=0.4f && altura<=1.0f){
            this.altura = altura;
        }
        else{
            System.out.println("Altura invalida");
        }
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {

        if(ancho>=0.4f && ancho<=1.0f){
            this.ancho = ancho;
        }
        else{
            System.out.println("Altura invalida");
        }
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "color=" + color +
                ", altura=" + altura +
                ", ancho=" + ancho +
                ", velocidad=" + velocidad +
                ", material=" + material +
                '}';
    }
    public boolean moverAdelante(float d){
        System.out.println("Moviendo hacia adelante" + d + "metros.");
        return true;
    }
    public boolean moverIzquierda(int i){
        System.out.println("Moviendo hacia la izquierda" + i + "metros.");
        return true;
    }
    public boolean moverDerecha(int j){
        System.out.println("Moviendo hacia la derecha" + j + "metros.");
        return true;
    }
    public void frenar(){
        System.out.println("Frenando.");
    }
}
