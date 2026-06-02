package main.java.Ejercicios.mx.unam.fesa.ico.proyectoFinal.model;

import java.io.Serializable;

public class CartaYugi implements Serializable {
    private String nombre;
    private String atributo;
    private int nivel;
    private String tipo;
    private int atk;
    private int def;
    private String clasificacion;

    public CartaYugi() {
    }

    public CartaYugi(String nombre, String atributo, int nivel, String tipo, int atk, int def, String clasificacion) {
        this.nombre = nombre;
        this.atributo = atributo;
        this.nivel = nivel;
        this.tipo = tipo;
        this.atk = atk;
        this.def = def;
        this.clasificacion = clasificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return "CartaYugi{" +
                "nombre='" + nombre + '\'' +
                ", atributo='" + atributo + '\'' +
                ", nivel=" + nivel +
                ", tipo='" + tipo + '\'' +
                ", atk=" + atk +
                ", def=" + def +
                ", clasificacion='" + clasificacion + '\'' +
                '}';
    }
}
