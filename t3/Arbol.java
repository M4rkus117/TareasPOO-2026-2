package main.java.Ejercicios.mx.unam.fesa.ico.t3;

public class Arbol {
    private String especieArbol;
    private String corteza;
    private float altura;
    private int numRamas;
    private int numRaices;
    private int numHojas;

    public Arbol() {
    }

    public Arbol(String especieArbol, String corteza, float altura, int numRamas, int numRaices, int numHojas) {
        this.especieArbol = especieArbol;
        this.corteza = corteza;
        this.altura = altura;
        this.numRamas = numRamas;
        this.numRaices = numRaices;
        this.numHojas = numHojas;
    }

    public String getEspecieArbol() {
        return especieArbol;
    }

    public void setEspecieArbol(String especieArbol) {
        this.especieArbol = especieArbol;
    }

    public String getCorteza() {
        return corteza;
    }

    public void setCorteza(String corteza) {
        this.corteza = corteza;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getNumRamas() {
        return numRamas;
    }

    public void setNumRamas(int numRamas) {
        this.numRamas = numRamas;
    }

    public int getNumRaices() {
        return numRaices;
    }

    public void setNumRaices(int numRaices) {
        this.numRaices = numRaices;
    }

    public int getNumHojas() {
        return numHojas;
    }

    public void setNumHojas(int numHojas) {
        this.numHojas = numHojas;
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "especieArbol=" + especieArbol +
                ", corteza=" + corteza +
                ", altura=" + altura +
                ", numRamas=" + numRamas +
                ", numRaices=" + numRaices +
                ", numHojas=" + numHojas +
                '}';
    }
    public float aumentarAltura(float a){
        System.out.println("Altura aumentada en " + a + "metros.");
        return a;
    }
    public float aumentarGrosor(float b){
        System.out.println("Grosor aumentado en " + b + "metros.");
        return b;
    }
    public void derribar(){
        System.out.println("El arbol ha sido derribado.");
    }
    public void crearFrutas(){
        System.out.println("Creando frutas.");
    }
}
