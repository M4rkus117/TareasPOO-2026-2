package main.java.Ejercicios.mx.unam.fesa.ico.t8;

public class Nuez implements Planta{
    private String clase = "DEFENSOR";
    private int costeSoles;
    private int dureza;

    public Nuez() {
        this.costeSoles = 75;
        this.dureza = 100;
    }

    public Nuez(int dureza) {
        this.costeSoles = 75;
        this.dureza = dureza;
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

    @Override
    public String toString() {
        return "Nuez{" +
                "clase='" + clase + '\'' +
                ", costeSoles=" + costeSoles +
                ", dureza=" + dureza +
                '}';
    }
    @Override
    public void plantar(int X, int Y){
        System.out.println("La nuez fue plantada en la posición X "+X+" Y "+ Y);
    }
    @Override
    public void accionEspecial(){
        this.dureza *= 3;
        System.out.println("Habilidad especial activada: Clase defensor. La dureza ha aumentado.");
        System.out.println("Dureza actual: " + this.dureza);
    }
    @Override
    public void usarNutriente(){
        setDureza(1000);
        System.out.println("Nutriente otorgado: La nuez ha recobrado su vitalidad y la dureza ha aumentado en gran medida.");
    }
}
