/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_edgarmembreno;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edgarmembreno
 */
public class Bitacora {
    private boolean avanzar;
    private boolean vive;
    private String pieza;
    private int tiempo;
    private boolean flag;

    public Bitacora(boolean avanzar, boolean vive, String pieza, int tiempo, boolean flag) {
        this.avanzar = avanzar;
        this.vive = vive;
        this.pieza = pieza;
        this.tiempo = tiempo;
        this.flag = flag;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public String getPieza() {
        return pieza;
    }

    public void setPieza(String pieza) {
        this.pieza = pieza;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    
    public void run() {
        FileWriter salida = null;
        BufferedWriter br = null;
        flag = true;
        while (vive) {
            if (avanzar) {
                try {
                    salida = new FileWriter("./bitacora.txt", true);
                    br = new BufferedWriter(salida);
                    br.write("Pieza:" + pieza + "Tiempo " + "7");
                    br.newLine();
                    br.flush();
                    salida.close();

                } catch (Exception ex) {
                }
            }
            try {
                Thread.sleep(350);
            } catch (InterruptedException ex) {
                Logger.getLogger(Bitacora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
