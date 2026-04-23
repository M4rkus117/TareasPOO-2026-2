package main.java.Ejercicios.mx.unam.fesa.ico.t8;

public class pruebasT8 {
    static void main() {
        Nuez nuez = new Nuez();
        Lanzaguisantes lanzaguisantes = new  Lanzaguisantes();
        Girasol girasol = new Girasol();

        lanzaguisantes.plantar(2,5);
        nuez.plantar(3,5);
        girasol.plantar(1,5);
        System.out.println("----------------------------------------");


        System.out.println(nuez);
        System.out.println(lanzaguisantes);
        System.out.println(girasol);
        System.out.println("----------------------------------------");

        nuez.accionEspecial();
        lanzaguisantes.accionEspecial();
        girasol.accionEspecial();
        System.out.println("----------------------------------------");

        nuez.usarNutriente();
        lanzaguisantes.usarNutriente();
        girasol.usarNutriente();
    }
}
