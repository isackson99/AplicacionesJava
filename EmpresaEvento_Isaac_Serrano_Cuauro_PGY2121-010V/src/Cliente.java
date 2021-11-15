/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isaac
 */
public class Cliente {
    
    private String nombre, mail;
    private int rut;
    private char dv, antiguedad;

    public Cliente() {
    }

    public Cliente(String nombre, String mail, int rut, char dv, char antiguedad) {
        this.nombre = nombre;
        this.mail = mail;
        this.rut = rut;
        this.dv = dv;
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public char getDv() {
        return dv;
    }

    public void setDv(char dv) {
        this.dv = dv;
    }

    public char getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(char antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", mail=" + mail + ", rut=" + rut + ", dv=" + dv + ", antiguedad=" + antiguedad + '}';
    }
    

    public boolean antiguo(){
        if(Character.isLetter('a') && Character.isLetter('n')){
            return true;
        } else {
            return false;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
