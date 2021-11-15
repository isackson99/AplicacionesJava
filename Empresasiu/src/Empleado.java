/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isaac
 */
public class Empleado {
    
    private String rut, nombreCompleto;
    private char genero;
    private int aniosServicio, edad;
    private Puesto puesto;

    public Empleado() {
    }

    public Empleado(String rut, String nombreCompleto, char genero, int aniosServicio, int edad, Puesto puesto) {
        this.rut = rut;
        this.nombreCompleto = nombreCompleto;
        this.genero = genero;
        this.aniosServicio = aniosServicio;
        this.edad = edad;
        this.puesto = puesto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getAniosServicio() {
        return aniosServicio;
    }

    public void setAniosServicio(int aniosServicio) {
        this.aniosServicio = aniosServicio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado{" + "rut=" + rut + ", nombreCompleto=" + nombreCompleto + ", genero=" + genero + ", aniosServicio=" + aniosServicio + ", edad=" + edad + ", puesto=" + puesto + '}';
    }
   
    
    
    
}
