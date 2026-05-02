package tareasPOO.tarea7;

public class pruebasT7 {
    static void main() {
        EmpleadoTiempoCompleto ETC = new EmpleadoTiempoCompleto("Hailey", "007", 315.04f, true);
        ETC.calcularSalario();
        EmpleadoTiempoCompleto ETC2 = new EmpleadoTiempoCompleto("Big Mama", "117", 440.87f, false);
        ETC2.calcularSalario();
        System.out.println("-------------------------------");
        EmpleadoPorHoras EPH = new EmpleadoPorHoras("Mikel", "009", 70.1f, 6);
        EPH.calcularSalario();
    }
}
