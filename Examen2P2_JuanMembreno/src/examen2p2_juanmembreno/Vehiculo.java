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
public class Vehiculo {
     private String color;
      private String bateria;
       private String interiro;
    private String marcaaudio;
    private String modelo;
    private String asientos;
    private String vin;

    public Vehiculo() {
    }

    public Vehiculo(String color, String bateria, String interiro, String marcaaudio, String modelo, String asientos, String vin) {
        this.color = color;
        this.bateria = bateria;
        this.interiro = interiro;
        this.marcaaudio = marcaaudio;
        this.modelo = modelo;
        this.asientos = asientos;
        this.vin = vin;
    }

        public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getInteriro() {
        return interiro;
    }

    public void setInteriro(String interiro) {
        this.interiro = interiro;
    }

    public String getMarcaaudio() {
        return marcaaudio;
    }

    public void setMarcaaudio(String marcaaudio) {
        this.marcaaudio = marcaaudio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAsientos() {
        return asientos;
    }

    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    

    @Override
    public String toString() {
        return "Vehiculo{" + "color=" + color + ", bateria=" + bateria + ", interiro=" + interiro + ", marcaaudio=" + marcaaudio + ", modelo=" + modelo + ", asientos=" + asientos + ", vin=" + vin + '}';
    }
    

}
