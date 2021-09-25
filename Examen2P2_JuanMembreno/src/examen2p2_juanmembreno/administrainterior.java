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
public class administrainterior {
     private ArrayList<interior> interior = new ArrayList();
    private File archivo = null;

    public administrainterior() {
    }

    public administrainterior(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<interior> getListainterior() {
        return interior;
    }

    public void setListainterior(ArrayList<interior> listainterior) {
        this.interior = listainterior;
    }

    @Override
    public String toString() {
        return "interior=" + interior;
    }

    //extra mutador
    public void setPersona(interior p) {
        this.interior.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (interior t : interior) {
                bw.write(t.getMateriamasusado() + ";");
                bw.write(t.getTipovolante()+ ";");
                 bw.write(t.getCantidadebotones()+ ";");
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
        interior = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    interior.add(new interior(sc.next(), sc.next(), sc.next(), sc.next()));

                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    } 
}
