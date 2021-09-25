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
public class administracarroceria {
      
    private ArrayList<carroceria> carroceria = new ArrayList();
    private File archivo = null;

    public administracarroceria() {
    }

    public administracarroceria(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<carroceria> getListacarroceria() {
        return carroceria;
    }

    public void setListacarroceria(ArrayList<carroceria> listacarroceria) {
        this.carroceria = listacarroceria;
    }

    @Override
    public String toString() {
        return "carroceria=" + carroceria;
    }

    //extra mutador
    public void setPersona(carroceria p) {
        this.carroceria.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (carroceria t : carroceria) {
                bw.write(t.getTiempoensegundos() + ";");
                bw.write(t.getTipomaletero() + ";");
                 bw.write(t.getCapacidadmaletero()+ ";");
              
                
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        carroceria = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    carroceria.add(new carroceria(sc.next(), sc.next(), sc.next()));

                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
