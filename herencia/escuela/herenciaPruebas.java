package main.java.Ejercicios.mx.unam.fesa.ico.herencia.escuela;
import main.java.Ejercicios.mx.unam.fesa.ico.herencia.escuela.Persona;

public class herenciaPruebas {
    public static void main(String[] args) {
        Persona per1 = new Persona("Pancho", 20, "Masculino");
        System.out.println(per1);
        per1.hablar();
        per1.comer();
        Alumno alumno1 = new Alumno("Carlos", 19,"Masculino", "ICO", "321324434");
        System.out.println(alumno1);
        alumno1.hablar();
        alumno1.hacerTarea();
        alumno1.dormir();
        alumno1.comer();
    }

}
