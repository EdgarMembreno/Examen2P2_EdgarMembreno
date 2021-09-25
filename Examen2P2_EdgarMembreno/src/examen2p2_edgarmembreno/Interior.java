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
public class Interior extends Partes{
    private String  material;
    private String volante;
    private int botones;

    public Interior() {
         super();
    }


    public Interior(String material, String volante, int botones, int tiempo) {
        super(tiempo);
        this.material = material;
        this.volante = volante;
        this.botones = botones;
    }
    

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getVolante() {
        return volante;
    }

    public void setVolante(String volante) {
        this.volante = volante;
    }

    public int getBotones() {
        return botones;
    }

    public void setBotones(int botones) {
        this.botones = botones;
    }

    @Override
    public String toString() {
        return "Interior{" + "material=" + material + ", volante=" + volante + ", botones=" + botones + '}';
    }
    
    
    
    
    
}
