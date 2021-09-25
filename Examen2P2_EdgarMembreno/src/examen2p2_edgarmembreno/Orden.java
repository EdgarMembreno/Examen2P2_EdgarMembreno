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
public class Orden {
    private String vehiculo;
    private String tecnico;

    public Orden() {
    }

    public Orden(String vehiculo, String tecnico) {
        this.vehiculo = vehiculo;
        this.tecnico = tecnico;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public String toString() {
        return "Orden{" + "vehiculo=" + vehiculo + ", tecnico=" + tecnico + '}';
    }
    
    
}
