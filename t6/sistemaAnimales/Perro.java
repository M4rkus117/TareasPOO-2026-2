package main.java.Ejercicios.mx.unam.fesa.ico.t6.sistemaAnimales;

import main.java.Ejercicios.mx.unam.fesa.ico.t6.Animal;

public class Perro extends Animal {
    private String raza;

    public Perro() {
    }

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
     public void ladrar(){
         System.out.println(this.nombre + " de la raza " + this.raza + " esta ladrando...");
     }
}
