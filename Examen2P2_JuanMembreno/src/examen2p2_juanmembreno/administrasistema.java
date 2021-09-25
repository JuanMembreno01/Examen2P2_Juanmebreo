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
public class administrasistema {
        private ArrayList<sistemade> sistemade = new ArrayList();
    private File archivo = null;

    public administrasistema() {
    }

    public administrasistema(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<sistemade> getListasistemade() {
        return sistemade;
    }

    public void setListainterior(ArrayList<sistemade> listasistemade) {
        this.sistemade = listasistemade;
    }

    @Override
    public String toString() {
        return "sistemade=" + sistemade;
    }

    //extra mutador
    public void setPersona(sistemade p) {
        this.sistemade.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (sistemade t : sistemade) {
                bw.write(t.getCantidaddepantallas() + ";");
                bw.write(t.getTienevisor()+ ";");
                 bw.write(t.getAnchodepantalla()+ ";");
               bw.write(t.getTiempoensegundos()+ ";");
                
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        sistemade = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    sistemade.add(new sistemade(sc.next(), sc.next(), sc.next(), sc.next()));

                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    } 
}
