/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_juanmembreno;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author usuario
 */
public class hiloensamblar extends Thread {
      
    private JProgressBar progBar;
   private int tiempototal;
    private boolean avanzar;
    private boolean vive;
    private int carrose;

    public hiloensamblar(JProgressBar progBar,int tiempototal) {
        this.progBar = progBar;
        this.tiempototal=tiempototal;
        avanzar = true;
        vive = true;
    }

    public int getTiempototal() {
        return tiempototal;
    }

    public void setTiempototal(int tiempototal) {
        this.tiempototal = tiempototal;
    }


    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVida(boolean vive) {
        this.vive = vive;
    }

    public int getCarrose() {
        return carrose;
    }

    public void setCarrose(int carrose) {
        this.carrose = carrose;
    }

    public void run() {
        while (vive) {
            if (avanzar) {
                progBar.setString("Tiempo");
                progBar.setMaximum(tiempototal);
                System.out.println("CLASE"+tiempototal);
                while (progBar.getValue() < tiempototal) {
                    progBar.setValue(progBar.getValue() + 1);
                    progBar.setString(progBar.getValue() + " segundos");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }
                }
                if (progBar.getValue() == tiempototal) {
                    vive = false;
                    JOptionPane.showMessageDialog(null, "Se ha agregado exitosamente");
                    progBar.setValue(0);
                    carrose++;
                    
                }
            }
        }

    }

}
