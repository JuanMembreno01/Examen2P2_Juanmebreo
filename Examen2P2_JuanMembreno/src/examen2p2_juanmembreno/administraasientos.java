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
public class administraasientos {
           private ArrayList<asientos> asientos = new ArrayList();
    private File archivo = null;

    public administraasientos() {
    }

    public administraasientos(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<asientos> getListaasientos() {
        return asientos;
    }

    public void setListaasientos(ArrayList<asientos> listaasientos) {
        this.asientos = listaasientos;
    }

    @Override
    public String toString() {
        return "asientos=" + asientos;
    }

    //extra mutador
    public void setPersona(asientos p) {
        this.asientos.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (asientos t : asientos) {
                bw.write(t.getTiempoensegundos() + ";");
                bw.write(t.getMaterial()+ ";");
                 bw.write(t.getElectricoomanual()+ ";");
               bw.write(t.getMasaje()+ ";");
                
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        asientos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    asientos.add(new asientos(sc.next(), sc.next(), sc.next(), sc.next()));

                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    } 
}
