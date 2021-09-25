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
public class interior {
     private String materiamasusado;
      private String tipovolante;
       private String  cantidadebotones;
  private String tiempoensegundos;
    public interior() {
    }

    public interior(String materiamasusado, String tipovolante, String cantidadebotones, String tiempoensegundos) {
        this.materiamasusado = materiamasusado;
        this.tipovolante = tipovolante;
        this.cantidadebotones = cantidadebotones;
        this.tiempoensegundos = tiempoensegundos;
    }

  
    public String getMateriamasusado() {
        return materiamasusado;
    }

    public void setMateriamasusado(String materiamasusado) {
        this.materiamasusado = materiamasusado;
    }

    public String getTipovolante() {
        return tipovolante;
    }

    public void setTipovolante(String tipovolante) {
        this.tipovolante = tipovolante;
    }

    public String getCantidadebotones() {
        return cantidadebotones;
    }

    public void setCantidadebotones(String cantidadebotones) {
        this.cantidadebotones = cantidadebotones;
    }

    public String getTiempoensegundos() {
        return tiempoensegundos;
    }

    public void setTiempoensegundos(String tiempoensegundos) {
        this.tiempoensegundos = tiempoensegundos;
    }

    @Override
    public String toString() {
        return "interior{" + "materiamasusado=" + materiamasusado + ", tipovolante=" + tipovolante + ", cantidadebotones=" + cantidadebotones + '}';
    }
       
}
