package main.java.Ejercicios.mx.unam.fesa.ico.t3;

public class Libro {
    private String tituloLibro;
    private String autorLibro;
    private int anhoPublicacion;
    private int cantidadEjemplares;

    public Libro() {
    }

    public Libro(String tituloLibro, String autorLibro, int anhoPublicacion, int cantidadEjemplares) {
        this.tituloLibro = tituloLibro;
        this.autorLibro = autorLibro;
        this.anhoPublicacion = anhoPublicacion;
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    public int getAnhoPublicacion() {
        return anhoPublicacion;
    }

    public void setAnhoPublicacion(int anhoPublicacion) {
        this.anhoPublicacion = anhoPublicacion;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "tituloLibro=" + tituloLibro +
                ", autorLibro=" + autorLibro +
                ", anhoPublicacion=" + anhoPublicacion +
                ", cantidadEjemplares=" + cantidadEjemplares +
                '}';
    }

    public void prestarLibro(){
        System.out.println("Prestando libro.");
    }
    public void regresarLibro(){
        System.out.println("Regresando libro.");
    }
    public String verSeccionLibro(String a){
        System.out.println("La seccion del libro es" + a);
        return a;
    }
}