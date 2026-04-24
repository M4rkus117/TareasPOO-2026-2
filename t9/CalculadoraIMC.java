package main.java.Ejercicios.mx.unam.fesa.ico.t9;

public class CalculadoraIMC {
    private double peso;
    private double estatura;
    private double imc;

    public CalculadoraIMC() {
    }

    public CalculadoraIMC(double peso, double estatura, double imc) {
        this.peso = peso;
        this.estatura = estatura;
        this.imc = imc;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "CalculadoraIMC{" +
                "peso=" + peso +
                ", estatura=" + estatura +
                ", imc=" + imc +
                '}';
    }

    public void calcularIMC(){
        this.imc = this.peso/(this.estatura*this.estatura);
    }
}
