/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_edgarmembreno;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author edgarmembreno
 */
public class Esamblar extends Thread {

    private JProgressBar progBar;
    private Orden orden;
    private boolean avanzar;
    private boolean vive;

    public Esamblar(JProgressBar progBar, Orden orden, boolean avanzar, boolean vive) {
        this.progBar = progBar;
        this.orden = orden;
        this.avanzar = avanzar;
        this.vive = vive;
    }

    public JProgressBar getProgBar() {
        return progBar;
    }

    public void setProgBar(JProgressBar progBar) {
        this.progBar = progBar;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
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

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                progBar.setString("Segundos");
                if (progBar.getValue() == 10) {
                    adminFallaron av = new adminFallaron("./Fallaron.cbm");
                    av.cargarArchivo();
                    try {
                        av.escribirArchivo();
                    } catch (IOException ex) {
                        Logger.getLogger(Esamblar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    vive = false;
                }
            }
        }

    }

}
