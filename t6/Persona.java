package main.java.Ejercicios.mx.unam.fesa.ico.t6;

public class Persona {
    protected String nombre;
    protected int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre + ". Edad: "+ this.edad);
    }
    public void presentarse(){
        System.out.println("Hola, mi nombre es "+this.nombre);
    }
}
