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
public class sistemade {
     private String cantidaddepantallas;
      private String tienevisor;
       private String anchodepantalla;
         private String tiempoensegundos;

    public sistemade(String cantidaddepantallas, String tienevisor, String anchodepantalla, String tiempoensegundos) {
        this.cantidaddepantallas = cantidaddepantallas;
        this.tienevisor = tienevisor;
        this.anchodepantalla = anchodepantalla;
        this.tiempoensegundos = tiempoensegundos;
    }

    public sistemade() {
    }

    public String getCantidaddepantallas() {
        return cantidaddepantallas;
    }

    public void setCantidaddepantallas(String cantidaddepantallas) {
        this.cantidaddepantallas = cantidaddepantallas;
    }

    public String getTienevisor() {
        return tienevisor;
    }

    public void setTienevisor(String tienevisor) {
        this.tienevisor = tienevisor;
    }

    public String getAnchodepantalla() {
        return anchodepantalla;
    }

    public void setAnchodepantalla(String anchodepantalla) {
        this.anchodepantalla = anchodepantalla;
    }

    public String getTiempoensegundos() {
        return tiempoensegundos;
    }

    public void setTiempoensegundos(String tiempoensegundos) {
        this.tiempoensegundos = tiempoensegundos;
    }

    @Override
    public String toString() {
        return "sistemade{" + "cantidaddepantallas=" + cantidaddepantallas + ", tienevisor=" + tienevisor + ", anchodepantalla=" + anchodepantalla + ", tiempoensegundos=" + tiempoensegundos + '}';
    }
         
}
