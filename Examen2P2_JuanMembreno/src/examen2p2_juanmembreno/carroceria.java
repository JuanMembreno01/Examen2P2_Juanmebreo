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
public class carroceria {
     private String tiempoensegundos;
      private String tipomaletero;
       private String  capacidadmaletero;

    public carroceria(String tiempoensegundos, String tipomaletero, String capacidadmaletero) {
        this.tiempoensegundos = tiempoensegundos;
        this.tipomaletero = tipomaletero;
        this.capacidadmaletero = capacidadmaletero;
    }

    public carroceria() {
    }

    public String getTiempoensegundos() {
        return tiempoensegundos;
    }

    public void setTiempoensegundos(String tiempoensegundos) {
        this.tiempoensegundos = tiempoensegundos;
    }

    public String getTipomaletero() {
        return tipomaletero;
    }

    public void setTipomaletero(String tipomaletero) {
        this.tipomaletero = tipomaletero;
    }

    public String getCapacidadmaletero() {
        return capacidadmaletero;
    }

    public void setCapacidadmaletero(String capacidadmaletero) {
        this.capacidadmaletero = capacidadmaletero;
    }

    @Override
    public String toString() {
        return "carroceria{" + "tiempoensegundos=" + tiempoensegundos + ", tipomaletero=" + tipomaletero + ", capacidadmaletero=" + capacidadmaletero + '}';
    }
    
             
}
