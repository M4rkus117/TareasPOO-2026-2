package tareasPOO.tarea7;

public class EmpleadoPorHoras implements Empleado {
    private String nombre;
    private String numCuenta;
    private float salarioHora;
    private int horasJornada;

    public EmpleadoPorHoras() {
    }

    public EmpleadoPorHoras(String nombre, String numCuenta, float salarioHora, int horasJornada) {
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.salarioHora = salarioHora;
        this.horasJornada = horasJornada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public float getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(float salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasJornada() {
        return horasJornada;
    }

    public void setHorasJornada(int horasJornada) {
        this.horasJornada = horasJornada;
    }

    @Override
    public String toString() {
        return "EmpleadoPorHoras{" +
                "nombre='" + nombre + '\'' +
                ", numCuenta='" + numCuenta + '\'' +
                ", salarioHora=" + salarioHora +
                ", horasJornada=" + horasJornada +
                '}';
    }

    public float calcularSalario(){
        float salario = 0.0f;
        salario= salarioHora*horasJornada;
        System.out.println("El salario por jornada del empleado "+nombre+" con número de cuenta "+numCuenta+" es $"+salario);
        return salario;
    }
}
