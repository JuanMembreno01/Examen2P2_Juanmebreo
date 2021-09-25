/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_juanmembreno;

/**
 *
 * @author usuario
 */
public class bateria {
     private String tiempoensegundos;
      private String autonomia;
       private String materrial;

    public bateria() {
    }

    public bateria(String tiempoensegundos, String autonomia, String materrial) {
        this.tiempoensegundos = tiempoensegundos;
        this.autonomia = autonomia;
        this.materrial = materrial;
    }

    public String getTiempoensegundos() {
        return tiempoensegundos;
    }

    public void setTiempoensegundos(String tiempoensegundos) {
        this.tiempoensegundos = tiempoensegundos;
    }

    public String getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(String autonomia) {
        this.autonomia = autonomia;
    }

    public String getMaterrial() {
        return materrial;
    }

    public void setMaterrial(String materrial) {
        this.materrial = materrial;
    }

    @Override
    public String toString() {
        return "bateria{" + "tiempoensegundos=" + tiempoensegundos + ", autonomia=" + autonomia + ", materrial=" + materrial + '}';
    }
       
}
