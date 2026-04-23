package main.java.Ejercicios.mx.unam.fesa.ico.herencia.escuela;

public class Persona {
    protected String nombre;
    protected int edad;
    protected String genero;

    public Persona() {
    }

    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                '}';
    }

    public void dormir(){
        System.out.println(this.nombre+ " esta durmiendo.");
    }
    public void comer(){
        System.out.println(this.nombre+ " esta comiendo con modestia.");
    }
    public void hablar(){
        System.out.println(this.nombre+ " esta hablando.");
    }
}
