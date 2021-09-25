/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_juanmembreno;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;

/**
 *
 * @author usuario
 */
public class bitacora extends Thread {
    
    private boolean avanzar;
    private boolean vive;
    private int segundos;
    private boolean flag;
    private int autosensam;
    private JProgressBar progBar;

    public bitacora( JProgressBar progBar) {
      this.progBar=progBar;
        avanzar = true;
        vive = true;
        flag = false;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVida(boolean vive) {
        this.vive = vive;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getAutosensam() {
        return autosensam;
    }

    public void setAutosensam(int autosensam) {
        this.autosensam = autosensam;
    }

    public void run() {
        FileWriter salida = null;
        BufferedWriter br = null;
        flag = true;
        while (vive) {
            if (avanzar) {
                try {
                    salida = new FileWriter("./bitacora.txt", true);
                    br = new BufferedWriter(salida);
                    br.write(" Tiempo transcurrido:" + Integer.toString(progBar.getValue())
                            + " Pieza:Orden segun la seleccion"+ "Total de autos ensamblados>>"+autosensam);
                    br.newLine();
                    br.flush();
                    salida.close();

                } catch (Exception ex) {
                }
            }
            try {
                Thread.sleep(350);
            } catch (InterruptedException ex) {
                Logger.getLogger(bitacora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
