package Examen2P2_BrandonHernandez;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Hilos extends Thread {

    private DefaultTableModel model;
    private ArrayList<Carro> carros;
    private String uso;

    public Hilos(DefaultTableModel model, ArrayList<Carro> carros, String uso) {
        this.model = model;
        this.carros = carros;
        this.uso = uso;
    }

    public DefaultTableModel getModel() {
        return model;
    }

    public void setModel(DefaultTableModel model) {
        this.model = model;
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }

    public void run() {
        if (uso.equals("G") || uso.equals("C")) {
            if (model != null) {
                model.setRowCount(0);
            }
            for (Carro c : carros) {
                Object[] ob = {c.getMarca(), c.getModelo(), c.getColor(), c.getAñoF(), c.getTipo()};
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                if (model != null) {
                    model.addRow(ob);
                }
            }
        }

        if (uso.equals("V")) {
            if (model != null) {
                model.setRowCount(0);
            }
            for (Carro c : carros) {
                Object[] ob = {c.getMarca(), c.getModelo(), c.getColor(), c.getAñoF(), c.getTipo()};
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
                if (model != null) {
                    model.addRow(ob);
                }
            }
        }
    }

}
