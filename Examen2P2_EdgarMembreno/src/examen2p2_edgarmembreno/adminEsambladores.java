/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_edgarmembreno;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author edgarmembreno
 */
public class adminEsambladores {

    ArrayList<Esamblador> esamblador = new ArrayList();
    private File archivo = null;

     public adminEsambladores(String path) {
        archivo = new File(path);
    }

    public ArrayList<Esamblador> getEsamblador() {
        return esamblador;
    }

    public void setEsamblador(ArrayList<Esamblador> esamblador) {
        this.esamblador = esamblador;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Esamblador" + esamblador ;
    }
    
    public void setRegis(Esamblador c) {
        this.esamblador.add(c);
    }
     public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Esamblador c : esamblador) {
                bw.write(c.getId()+ ";");
                bw.write(c.getNombre() + ";");
                bw.write(c.getGenero() + ";");
                bw.write(c.getEdad() + ";");
                bw.write(c.getEsamblados() + ";");
               
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
      public void cargarArchivo() {
        Scanner sc = null;
        esamblador = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                 esamblador.add(new Esamblador(sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.nextInt()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
     
     
     
}
