package tareasPOO.tarea7;

public class EmpleadoTiempoCompleto implements Empleado{
    private String nombre;
    private String numCuenta;
    private float salario;
    private boolean quincenal;

    public EmpleadoTiempoCompleto() {
    }

    public EmpleadoTiempoCompleto(String nombre, String numCuenta, float salario, boolean quincenal) {
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.salario = salario;
        this.quincenal = quincenal;
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

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public boolean isQuincenal() {
        return quincenal;
    }

    public void setQuincenal(boolean quincenal) {
        this.quincenal = quincenal;
    }

    @Override
    public String toString() {
        return "EmpleadoTiempoCompleto{" +
                "nombre='" + nombre + '\'' +
                ", numCuenta='" + numCuenta + '\'' +
                ", salario=" + salario +
                ", quincenal=" + quincenal +
                '}';
    }

    @Override
    public float calcularSalario() {
        float salarioFinal= 0.0f;
        if (quincenal==true){
            salarioFinal=salario*15;
            System.out.println("El salario quincenal del empleado "+nombre+" con número de cuenta "+numCuenta+" es $"+salarioFinal);
        }
        else{
            salarioFinal=salario*30;
            System.out.println("El salario mensual del empleado "+nombre+" con número de cuenta "+numCuenta+" es $"+salarioFinal);
        }

        return salarioFinal;
    }
}
