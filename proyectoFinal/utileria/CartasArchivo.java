package main.java.Ejercicios.mx.unam.fesa.ico.proyectoFinal.utileria;

import main.java.Ejercicios.mx.unam.fesa.ico.proyectoFinal.model.CartaYugi;

import java.io.*;
import java.util.ArrayList;

public class CartasArchivo {
    private String ruta;

    public CartasArchivo(String ruta){
        this.ruta = ruta;
    }

    public void escribir(CartaYugi carta){
        try(
                ObjectOutputStream salida = new ObjectOutputStream(
                        new FileOutputStream(this.ruta)
                )
        ){

            salida.writeObject(carta);
            System.out.println("Carta guardada correctamente.");

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }

    }


    public CartaYugi leer(){
        try(
                ObjectInputStream entrada = new ObjectInputStream(
                        new FileInputStream(this.ruta)
                )
        ){

            CartaYugi leido = (CartaYugi) entrada.readObject();
            return leido;

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException ioe){
            System.out.println(ioe.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }


    public void escribirAlumnos(ArrayList<CartaYugi> cartas){
        try(
                ObjectOutputStream salida = new ObjectOutputStream(
                        new FileOutputStream(this.ruta)
                )
        ){

            salida.writeObject(cartas);
            System.out.println("Cartas guardadas correctamente.");

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }

    public ArrayList<CartaYugi> leerAlumnos(){
        try(
                ObjectInputStream entrada = new ObjectInputStream(
                        new FileInputStream(this.ruta)
                )
        ){

            ArrayList<CartaYugi> alumnos = (ArrayList<CartaYugi>) entrada.readObject();
            return alumnos;
            //Alumno leido = (Alumno) entrada.readObject();
            //return leido;

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException ioe){
            System.out.println(ioe.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
