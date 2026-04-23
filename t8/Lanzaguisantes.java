package main.java.Ejercicios.mx.unam.fesa.ico.t8;

public class Lanzaguisantes implements Planta{
    private String clase = "ATACANTE";
    private int costeSoles;
    private int dureza;
    private int ataque;

    public Lanzaguisantes() {
        this.costeSoles = 100;
        this.dureza = 100;
        this.ataque = 20;
    }

    public Lanzaguisantes(int dureza, int ataque) {
        this.costeSoles = 100;
        this.dureza = dureza;
        this.ataque = ataque;
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

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "Lanzaguisantes{" +
                "clase='" + clase + '\'' +
                ", costeSoles=" + costeSoles +
                ", dureza=" + dureza +
                ", ataque=" + ataque +
                '}';
    }

    @Override
    public void plantar(int X, int Y){
        System.out.println("El lanzaguisantes fue plantado en la posición X "+X+" Y "+ Y);
    }
    @Override
    public void accionEspecial(){
        this.ataque *= 3;
        System.out.println("Habilidad especial activada: Clase atacante. El ataque ha aumentado.");
        System.out.println("Ataque actual: " + this.ataque);
    }
    @Override
    public void usarNutriente(){
        setDureza(100);
        System.out.println("Nutriente otorgado: El lanzaguisantes ha recobrado su vitalidad y lanza una ráfaga de guisantes.");
    }
}
