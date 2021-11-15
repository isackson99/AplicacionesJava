
import java.util.ArrayList;



/**
 *
 * @author Hernan
 */
public class Coleccion {
    
    private ArrayList<Producto> listaSupermercado;
    private int total =0; 

    public Coleccion() {
        
        listaSupermercado = new ArrayList<>();
    }
    
    public void agregar(Producto prod){
        listaSupermercado.add(prod);
    }
    
    public void mostrarLista(){
        for (Producto producto : listaSupermercado) {
            System.out.println(producto);
        }
    }
    
    public void calcularTotal(){
        for (Producto producto : listaSupermercado) {
            total = producto.getCantidad()*producto.getPrecio() + total;
            
        }
        System.out.println("El total de la compra es: " + total);
    } 
}
