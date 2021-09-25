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
public class Carroceria extends Partes{
    private String carroceria;
    private int capacidad;

    public Carroceria() {
         super();
    }

    public Carroceria(String carroceria, int capacidad, int tiempo) {
        super(tiempo);
        this.carroceria = carroceria;
        this.capacidad = capacidad;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Carroceria{" + "carroceria=" + carroceria + ", capacidad=" + capacidad + '}';
    }
    
    
    
    
    
}
