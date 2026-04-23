package main.java.Ejercicios.mx.unam.fesa.ico.t6.sistemaTienda;

import main.java.Ejercicios.mx.unam.fesa.ico.t6.Producto;

public class ProductoElectronico extends Producto {
    private String garantiaMeses;

    public ProductoElectronico() {
    }

    public ProductoElectronico(String nombre, float precio, String garantiaMeses) {
        super(nombre, precio);
        this.garantiaMeses = garantiaMeses;
    }

    public String getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(String garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public String toString() {
        return "ProductoElectronico{" +
                "garantiaMeses='" + garantiaMeses + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
    public void mostrarGarantia(){
        System.out.println("El producto " + this.nombre + " tiene " + this.garantiaMeses + " meses de garantia.");
    }
}
