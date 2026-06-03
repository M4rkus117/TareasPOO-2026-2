package main.java.Ejercicios.mx.unam.fesa.ico.proyectoFinal.model;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class ModeloTablaYugi implements TableModel {
    private ArrayList<CartaYugi> cartas;

    public ModeloTablaYugi() {
        this.cartas = new ArrayList<>();
    }
    public ModeloTablaYugi(ArrayList<CartaYugi> cartas) {
        this.cartas = cartas;
    }
    public ArrayList<CartaYugi> getCartas() {
        return cartas;
    }
    public void setCartas(ArrayList<CartaYugi> cartas) {
        this.cartas = cartas;
    }
    public void addCarta(CartaYugi c) {
        this.cartas.add(c);
    }
    public CartaYugi getCarta(int index) {
        return this.cartas.get(index);
    }

    @Override
    public int getRowCount() {
        return this.cartas.size();
    }

    @Override
    public int getColumnCount() {
        return CartaYugi.class.getDeclaredFields().length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return CartaYugi.class.getDeclaredFields()[columnIndex].getName();
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex) {
            case 0 -> String.class;
            case 1 -> String.class;
            case 2 -> Integer.class;
            case 3 -> String.class;
            case 4 -> Integer.class;
            case 5 -> Integer.class;
            case 6 -> String.class;
            default -> String.class;
        };
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    //Completar despues de la vista
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        CartaYugi cartaYugi = this.getCarta(rowIndex);
        return switch (columnIndex) {
            case 0 -> cartaYugi.getNombre();
            case 1 -> cartaYugi.getAtributo();
            case 2 -> cartaYugi.getNivel();
            case 3 -> cartaYugi.getTipo();
            case 4 -> cartaYugi.getAtk();
            case 5 -> cartaYugi.getDef();
            case 6 -> cartaYugi.getClasificacion();
            default -> null;
        };
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void removeCarta(int index) {
        this.cartas.remove(index);
    }
}
