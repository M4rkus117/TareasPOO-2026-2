package main.java.Ejercicios.mx.unam.fesa.ico.t6;

import main.java.Ejercicios.mx.unam.fesa.ico.t6.biblioteca.Bibliotecario;
import main.java.Ejercicios.mx.unam.fesa.ico.t6.sistemaAnimales.Perro;
import main.java.Ejercicios.mx.unam.fesa.ico.t6.sistemaEscolar.Profesor;
import main.java.Ejercicios.mx.unam.fesa.ico.t6.sistemaTienda.ProductoElectronico;
import main.java.Ejercicios.mx.unam.fesa.ico.t6.sistemaTransporte.Automovil;

public class pruebast6 {
    static void main(String[] args) {
        Persona ponche = new Persona("Ponche", 21);
        ponche.mostrarDatos();
        System.out.println("-----------------------");
        Bibliotecario bib1=new Bibliotecario("Beto", 20, "321324434");
        System.out.println("-----------------------");
        bib1.registrarPrestamo();
        bib1.presentarse();
        System.out.println("-----------------------");
        Profesor p1=new Profesor("Mencho", 37, "Ciencias Naturales");
        p1.presentarse();
        p1.impartirClase();
        System.out.println("-----------------------");
        Automovil a1=new Automovil("Hyundai","2022", 4);
        a1.mostrarInformmacion();
        a1.encenderMotor();
        System.out.println("-----------------------");
        Animal an1 = new Animal("Sech", 4);
        an1.comer();
        Perro Yala = new Perro("Yala", 10, "Husky siberiano");
        Yala.comer();
        Yala.ladrar();
        System.out.println("-----------------------");
        ProductoElectronico pe1 = new ProductoElectronico("Nintendo Switch 2", 10599.99f,"12");
        pe1.mostrarGarantia();
        pe1.mostrarPrecio();
    }

}
