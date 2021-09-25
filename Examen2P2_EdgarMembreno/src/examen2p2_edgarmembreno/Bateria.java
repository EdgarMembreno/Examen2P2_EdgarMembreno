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
public class Bateria extends Partes{
    private String autonomia;
    private String material;

    public Bateria() {
         super();
    }

    public Bateria(String autonomia, String material, int tiempo) {
        super(tiempo);
        this.autonomia = autonomia;
        this.material = material;
    }

    

    public String getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(String autonomia) {
        this.autonomia = autonomia;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Bateria{" + "autonomia=" + autonomia + ", material=" + material + '}';
    }
    

        
    
}
