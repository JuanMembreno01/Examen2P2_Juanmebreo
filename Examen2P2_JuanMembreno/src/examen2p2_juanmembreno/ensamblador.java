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
public class ensamblador {
    private String id;
     private String nombre;
      private String edad;
      private String cantidadesnsamblados;

    public ensamblador() {
    }

    public ensamblador(String id, String nombre, String edad, String cantidadesnsamblados) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.cantidadesnsamblados = cantidadesnsamblados;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCantidadesnsamblados() {
        return cantidadesnsamblados;
    }

    public void setCantidadesnsamblados(String cantidadesnsamblados) {
        this.cantidadesnsamblados = cantidadesnsamblados;
    }

    @Override
    public String toString() {
        return "ensamblador{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", cantidadesnsamblados=" + cantidadesnsamblados + '}';
    }
      
}
