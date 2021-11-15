
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isaac
 */
public class Evento {
    
    private Date fecha;
    private int precio=0, codigo;
    private String nombre1, direccion;
    

    public Evento() {
    }

    public Evento(Date fecha, int codigo, String nombre1, String direccion) {
        this.fecha = fecha;
        this.codigo = codigo;
        this.nombre1 = nombre1;
        this.direccion = direccion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre) {
        this.nombre1 = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Evento{" + "fecha=" + fecha + ", precio=" + precio + ", codigo=" + codigo + ", nombre=" + nombre1 + ", direccion=" + direccion + '}';
    }

    public void verInformacionEvento(){
        SimpleDateFormat formato  = new SimpleDateFormat("dd-mm-yyyy");
        System.out.println("Nombre del evento: "+ this.nombre1);
        System.out.println("Lugar: "+this.direccion);
        System.out.println("Fecha: "+ formato.format(this.fecha));
        System.out.println("Precio: " + this.precio);
        System.out.println("Codigo de evento:" + this.codigo);
    }
    
    public boolean validarFechaFin(Date fecha){
        Date fecha1 = new Date();
        if (fecha1.compareTo(fecha1) >= 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean validarPrecio(int precio){
        if (precio > 150000) {
            return true;
        } else {
            return false;
        }
    }
    
    public int descontar(int porcentaje){
        if(precio >=1000000){
            return precio;
            }
        int descuento = (this.precio * porcentaje/100);
        return precio;
    }
    
    
    
    
    
    
}
