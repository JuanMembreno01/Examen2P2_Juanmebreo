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
public class ordenarmado {
     private Vehiculo vehiculo;
      private String tecnico;

    public ordenarmado() {
    }

    public ordenarmado(Vehiculo vehiculo, String tecnico) {
        this.vehiculo = vehiculo;
        this.tecnico = tecnico;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public String toString() {
        return "ordenarmado{" + "vehiculo=" + vehiculo + ", tecnico=" + tecnico + '}';
    }
      
}
