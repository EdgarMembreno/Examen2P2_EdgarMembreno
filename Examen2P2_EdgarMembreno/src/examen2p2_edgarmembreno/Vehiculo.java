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
public class Vehiculo {
    private String vin;
    private String color;
    private String bateria;
    private String carroceria;
    private String interior;
    private String audio;
    private int asientos;

    public Vehiculo() {
    }

    public Vehiculo(String vin, String color, String bateria, String carroceria, String interior, String audio, int asientos) {
        this.vin = vin;
        this.color = color;
        this.bateria = bateria;
        this.carroceria = carroceria;
        this.interior = interior;
        this.audio = audio;
        this.asientos = asientos;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "vin=" + vin + ", color=" + color + ", bateria=" + bateria + ", carroceria=" + carroceria + ", interior=" + interior + ", audio=" + audio + ", asientos=" + asientos + '}';
    }
    

   
    
    
    
    
}
