package main.java.Ejercicios.mx.unam.fesa.ico.t8;

public class Girasol implements Planta{
    private String clase = "PRODUCTOR SOLAR";
    private int costeSoles;
    private int dureza;
    private int produccionSolar;

    public Girasol() {
        this.costeSoles = 50;
        this.dureza = 100;
        this.produccionSolar = 25;
    }

    public Girasol(int dureza, int produccionSolar) {
        this.costeSoles = 50;
        this.dureza = dureza;
        this.produccionSolar = produccionSolar;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getCosteSoles() {
        return costeSoles;
    }

    public void setCosteSoles(int costeSoles) {
        this.costeSoles = costeSoles;
    }

    public int getDureza() {
        return dureza;
    }

    public void setDureza(int dureza) {
        this.dureza = dureza;
    }

    public int getProduccionSolar() {
        return produccionSolar;
    }

    public void setProduccionSolar(int produccionSolar) {
        this.produccionSolar = produccionSolar;
    }

    @Override
    public String toString() {
        return "Girasol{" +
                "clase='" + clase + '\'' +
                ", costeSoles=" + costeSoles +
                ", dureza=" + dureza +
                ", produccionSolar=" + produccionSolar +
                '}';
    }
    @Override
    public void plantar(int X, int Y){
        System.out.println("El girasol fue plantado en la posición X "+X+" Y "+ Y);
    }
    @Override
    public void accionEspecial(){
        this.costeSoles /= 2;
        System.out.println("Habilidad especial activada: Clase productor solar. El coste de soles ha disminuido.");
        System.out.println("Coste actual: " + this.costeSoles);
    }
    @Override
    public void usarNutriente(){
        setDureza(100);
        System.out.println("Nutriente otorgado: El girasol ha recobrado su vitalidad y produce un montón de soles.");
    }
}
