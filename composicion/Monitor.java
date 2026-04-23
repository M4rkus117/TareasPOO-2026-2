package main.java.Ejercicios.mx.unam.fesa.ico.composicion;

public class Monitor {
    private String modelo;
    private String marca;
    private int fps;
    private String resolucion;

    public Monitor() {
    }

    public Monitor(String modelo, String marca, int fps, String resolucion) {
        this.modelo = modelo;
        this.marca = marca;
        this.fps = fps;
        this.resolucion = resolucion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getFps() {
        return fps;
    }

    public void setFps(int fps) {
        this.fps = fps;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", fps=" + fps +
                ", resolucion='" + resolucion + '\'' +
                '}';
    }
}
