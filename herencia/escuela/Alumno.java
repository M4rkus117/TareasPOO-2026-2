package main.java.Ejercicios.mx.unam.fesa.ico.herencia.escuela;

public class Alumno extends Persona{
    private String carrera;
    private String numCuenta;

    public Alumno() {
    }

    public Alumno(String nombre, int edad, String genero, String carrera, String numCuenta) {
        super(nombre, edad, genero);
        this.carrera = carrera;
        this.numCuenta = numCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "carrera='" + carrera + '\'' +
                ", numCuenta='" + numCuenta + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                '}';
    }

    public void estudiar(){
        System.out.println(this.nombre + " esta estudiando temas de " + this.carrera);
    }
    public void hacerTarea(){
        System.out.println(this.nombre + " esta haciendo tarea de " + this.carrera);
    }
    public void comer(){
        System.out.println(this.nombre + " esta comiendo como cerdo.");
    }

}
