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
public class Asientos extends Partes{
    private String material;
    private String caja;
    private String maje; 

    public Asientos() {
         super();
    }

    public Asientos(String material, String caja, String maje, int tiempo) {
        super(tiempo);
        this.material = material;
        this.caja = caja;
        this.maje = maje;
    }
    

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    public String getMaje() {
        return maje;
    }

    public void setMaje(String maje) {
        this.maje = maje;
    }

    @Override
    public String toString() {
        return "Asientos{" + "material=" + material + ", caja=" + caja + ", maje=" + maje + '}';
    }
    
    
    
}
