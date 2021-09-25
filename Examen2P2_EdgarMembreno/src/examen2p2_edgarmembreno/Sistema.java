/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_edgarmembreno;

/**
 *
 * @author edgarmembreno
 */
public class Sistema extends Partes{
    private int pantallas;
    private String visor;
    private int ancho;

    public Sistema() {
         super();
    }

    public Sistema(int pantallas, String visor, int ancho, int tiempo) {
        super(tiempo);
        this.pantallas = pantallas;
        this.visor = visor;
        this.ancho = ancho;
    }

    public int getPantallas() {
        return pantallas;
    }

    public void setPantallas(int pantallas) {
        this.pantallas = pantallas;
    }

    public String getVisor() {
        return visor;
    }

    public void setVisor(String visor) {
        this.visor = visor;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Sistema{" + "pantallas=" + pantallas + ", visor=" + visor + ", ancho=" + ancho + '}';
    }
    
    
}
