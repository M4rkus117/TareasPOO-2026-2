package main.java.Ejercicios.mx.unam.fesa.ico.t9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class pruebasT9 {
    static void main() {
        CalculadoraIMC calc = new CalculadoraIMC();
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.println("Ingrese su peso: ");
            calc.setPeso(teclado.nextDouble());

            System.out.println("Ingrese su estatura: ");
            calc.setEstatura(teclado.nextDouble());
            calc.calcularIMC();

            Integer i = new Integer(100);
            i = null;
            System.out.println(i.byteValue());
        } catch (InputMismatchException e) {
            System.out.println("Error: revisa tu entrada.");
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e) {
            System.out.println("Error: el valor es nulo.");
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Error desconocido.");
        }
        System.out.println("Su IMC es: "+ calc.getImc());


    }
}
