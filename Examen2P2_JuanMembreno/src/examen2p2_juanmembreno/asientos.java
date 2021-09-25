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
public class asientos {
      private String tiempoensegundos;
        private String material;
          private String electricoomanual;
           private String masaje;

    public asientos(String tiempoensegundos, String material, String electricoomanual, String masaje) {
        this.tiempoensegundos = tiempoensegundos;
        this.material = material;
        this.electricoomanual = electricoomanual;
        this.masaje = masaje;
    }

    public String getTiempoensegundos() {
        return tiempoensegundos;
    }

    public void setTiempoensegundos(String tiempoensegundos) {
        this.tiempoensegundos = tiempoensegundos;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getElectricoomanual() {
        return electricoomanual;
    }

    public void setElectricoomanual(String electricoomanual) {
        this.electricoomanual = electricoomanual;
    }

    public String getMasaje() {
        return masaje;
    }

    public void setMasaje(String masaje) {
        this.masaje = masaje;
    }

    @Override
    public String toString() {
        return "asientos{" + "tiempoensegundos=" + tiempoensegundos + ", material=" + material + ", electricoomanual=" + electricoomanual + ", masaje=" + masaje + '}';
    }
           
}
