/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isaac
 */
public class Solicitud {
    
    private int numero;
    private String fecha;
    private Cliente cliente;
    private Producto productos;

    public Solicitud() {
    }

    public Solicitud(int numero, String fecha, Cliente cliente, Producto productos) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.productos = productos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProductos() {
        return productos;
    }

    public void setProductos(Producto productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Solicitud{" + "numero=" + numero + ", fecha=" + fecha + ", cliente=" + cliente + ", productos=" + productos + '}';
    }

    
    public int verificarVentas(int ventas){
        int cantidad = 0;
        if(ventas > 0){
            //cantidad = cantidad +1;
            cantidad++;
        }
        return this.numero;
    }
    
    
    public void imprimirSolicitud(){
        
        System.out.println("numero: " + numero);
        System.out.println("fecha: " +fecha );
        cliente.numeroCliente();
        productos.imprimirProducto1();
        
        
    }
}
