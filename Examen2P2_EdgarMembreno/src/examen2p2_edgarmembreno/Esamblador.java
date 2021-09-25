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
public class Esamblador {
    private int id;
    private String nombre;
    private String genero;
    private int edad;
    private int esamblados;

    public Esamblador() {
    }

    public Esamblador(int id, String nombre, String genero, int edad, int esamblados) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.esamblados = esamblados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEsamblados() {
        return esamblados;
    }

    public void setEsamblados(int esamblados) {
        this.esamblados = esamblados;
    }

    @Override
    public String toString() {
        return "Esamblador{" + "id=" + id + ", nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", esamblados=" + esamblados + '}';
    }
    
    
}
