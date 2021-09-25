/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_juanmembreno;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class administravehiculos {

    private ArrayList<Vehiculo> vehiculos = new ArrayList();
    private File archivo = null;

    public administravehiculos() {
    }

    public administravehiculos(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Vehiculo> getListavehiculos() {
        return vehiculos;
    }

    public void setListacreativos(ArrayList<Vehiculo> listavehiculos) {
        this.vehiculos = listavehiculos;
    }

    @Override
    public String toString() {
        return "vehiculos=" + vehiculos;
    }

    //extra mutador
    public void setPersona(Vehiculo p) {
        this.vehiculos.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Vehiculo t : vehiculos) {
                bw.write(t.getColor() + ";");
                bw.write(t.getBateria() + ";");
                bw.write(t.getInteriro() + ";");
                bw.write(t.getMarcaaudio() + ";");
                bw.write(t.getModelo()+ ";");
                bw.write(t.getAsientos() + ";");
                 bw.write(t.getVin() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        vehiculos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    vehiculos.add(new Vehiculo(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next()));

                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}

