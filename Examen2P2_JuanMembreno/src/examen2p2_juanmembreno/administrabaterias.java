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
public class administrabaterias {
      
    private ArrayList<bateria> bateria = new ArrayList();
    private File archivo = null;

    public administrabaterias() {
    }

    public administrabaterias(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<bateria> getListabateriar() {
        return bateria;
    }

    public void setListabateria(ArrayList<bateria> listabateria) {
        this.bateria = listabateria;
    }

    @Override
    public String toString() {
        return "bateria=" + bateria;
    }

    //extra mutador
    public void setPersona(bateria p) {
        this.bateria.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (bateria t : bateria) {
                bw.write(t.getTiempoensegundos() + ";");
                bw.write(t.getAutonomia() + ";");
                 bw.write(t.getMaterrial()+ ";");
              
                
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        bateria = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    bateria.add(new bateria(sc.next(), sc.next(), sc.next()));

                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
