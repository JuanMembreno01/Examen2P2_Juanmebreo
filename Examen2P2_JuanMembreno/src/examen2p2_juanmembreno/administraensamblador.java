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
public class administraensamblador {
    
    private ArrayList<ensamblador> ensamblador = new ArrayList();
    private File archivo = null;

    public administraensamblador() {
    }

    public administraensamblador(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<ensamblador> getListaensamblador() {
        return ensamblador;
    }

    public void setListaensamblador(ArrayList<ensamblador> listaensamblador) {
        this.ensamblador = listaensamblador;
    }

    @Override
    public String toString() {
        return "ensamblador=" + ensamblador;
    }

    //extra mutador
    public void setPersona(ensamblador p) {
        this.ensamblador.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (ensamblador t : ensamblador) {
                bw.write(t.getId() + ";");
                bw.write(t.getNombre() + ";");
                 bw.write(t.getEdad() + ";");
                bw.write(t.getCantidadesnsamblados() + ";");
                
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        ensamblador = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    ensamblador.add(new ensamblador(sc.next(), sc.next(), sc.next(), sc.next()));

                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
