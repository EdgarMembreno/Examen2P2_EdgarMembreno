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
public class adminCreados {
    ArrayList<Vehiculo> vehiculo = new ArrayList();
    private File archivo = null;
  
    public adminCreados(String path) {
        archivo = new File(path);
    }

    public ArrayList<Vehiculo> getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(ArrayList<Vehiculo> vehiculo) {
        this.vehiculo = vehiculo;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Completado: " + vehiculo;
    }
    public void setRegis(Vehiculo c) {
        this.vehiculo.add(c);
    }
    
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Vehiculo c : vehiculo) {
                bw.write(c.getVin()+ ";");
                bw.write(c.getColor() + ";");
                bw.write(c.getBateria() + ";");
                bw.write(c.getCarroceria() + ";");
                bw.write(c.getInterior() + ";");
                bw.write(c.getAudio() + ";");
                bw.write(c.getAsientos() + ";");    
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
      public void cargarArchivo() {
        Scanner sc = null;
        vehiculo = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                 vehiculo.add(new Vehiculo(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
    
    
    
}
