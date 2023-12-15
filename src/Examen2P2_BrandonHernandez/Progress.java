package Examen2P2_BrandonHernandez;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class Progress extends Thread {

    private JProgressBar barra1;
    private boolean seguir;
    private String uso;

    public Progress() {
    }

    public Progress(JProgressBar barra1, String uso) {
        this.barra1 = barra1;
        this.seguir = true;
        this.uso = uso;
    }

    public JProgressBar getBarra1() {
        return barra1;
    }

    public void setBarra1(JProgressBar barra1) {
        this.barra1 = barra1;
    }

    @Override
    public void run() {

        if (uso.equals("C")) {
            int cont = 1;
            while (seguir) {
                barra1.setValue(cont * 20);

                if (cont == 5) {
                    JOptionPane.showMessageDialog(null, "Finalizo");
                    seguir = false;
                    cont = 0;
                    break;
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
                cont++;

            }
            barra1.setValue(0);
            barra1.setStringPainted(true);
            barra1.setString("");
            JOptionPane.showMessageDialog(null, "Carro comprado!");
        }

        if (uso.equals("V")) {
            int cont = 1;
            while (seguir) {
                barra1.setValue(cont * 15);

                if (cont == 7) {
                    seguir = false;
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
                cont++;
            }
            barra1.setValue(0);
            barra1.setStringPainted(true);
            barra1.setString("");
            JOptionPane.showMessageDialog(null, "Carro vendido!");
        }

    }
}
