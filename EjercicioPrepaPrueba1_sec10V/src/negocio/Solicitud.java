
package negocio;

import java.text.SimpleDateFormat;
import java.util.Date;
import modelo.Cliente;
import modelo.Producto;

/**
 *
 * @author Hernan
 */
public class Solicitud {
    
    private int numero=0,total=0;
    private Date fecha;
    private Cliente cliente;
    private String productos="";

    public Solicitud() {
    }

    public Solicitud(int numero, int total, Date fecha, Cliente cliente, String productos) {
        this.numero = numero;
        this.total = total;
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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }
    
    //agregar productos a la solicitud
    public void agregarProductos(Producto producto){
        
        String unidadMedida = "";
        if (producto.getMedida() == 'U') {
            unidadMedida = "unidades";
        } else {
            unidadMedida = "gramos";
        }
        
        this.total = this.total + producto.getPrecio();
        this.productos = this.productos + producto.getDescripcion() + " "+ producto.getCantidad()+
                " "+unidadMedida + " $ "+producto.getPrecio()+";\n";
    }
    
    //ver pedido
    public void verSolicitud(){
        SimpleDateFormat formato  = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Solicitud: "+this.numero);
        System.out.println("************************");
        System.out.println("Cliente: " + this.cliente.getNombre());
        System.out.println("Fecha: " + formato.format(fecha));
        System.out.println(this.productos);
        System.out.println("************************");
        System.out.println("Total : " + this.total);
        System.out.println("");
    }
    
    //descontar
    public int descontar(int porcentaje){
        int descuento = (this.total * porcentaje/100);
       // int descuento = (int)(this.total * porcentaje/100); //casting
        return descuento;
    }
    
    //obtener correlativo
    public int obtenerNumeroSolicitud(){
        this.numero = this.numero + 1;
        return this.numero;
    }
    
            
    
    
}
