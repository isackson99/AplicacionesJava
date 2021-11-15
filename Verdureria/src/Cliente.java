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
    
    private String nombre, mail, direccion;
    private char dv;
    private int rut, telefono;

    public Cliente() {
    }

    public Cliente(String nombre, String mail, String direccion, char dv, int rut, int telefono) {
        this.nombre = nombre;
        this.mail = mail;
        this.direccion = direccion;
        this.dv = dv;
        this.rut = rut;
        this.telefono = telefono;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public char getDv() {
        return dv;
    }

    public void setDv(char dv) {
        this.dv = dv;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        if (rut >4999999 && rut <99999999) {
           this.rut = rut; 
        }
        else{
            System.out.println("Numero no válido!");
        }
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        if (telefono >9999999 && telefono <100000000){
            this.telefono = telefono;
        }    
        else{
            System.out.println("Numero de telefono esta mal escrito.");
        }
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", mail=" + mail + ", direccion=" + direccion + ", dv=" + dv + ", rut=" + rut + ", telefono=" + telefono + '}';
    }
    
    
    public void numeroCliente(){
        System.out.println("Rut: " + rut);
    }
    
    
    
    
    
}
